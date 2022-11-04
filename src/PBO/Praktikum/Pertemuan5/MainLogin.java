package PBO.Praktikum.Pertemuan5;

import java.io.*;

public class MainLogin {

    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // Object
        Login user1 = new Login(); // Admin
        Login user2 = new Login("", ""); // User Baru
        
        // Menu
        while(true) {
            System.out.println("\n=====MENU=====");
            System.out.println("1. Login Admin");
            System.out.println("2. Buat User");
            System.out.println("3. Ubah Password");
            System.out.println("4. Lihat Data User");
            System.out.println("5. Keluar");
            System.out.print("Masukkan pilihan Menu: ");
            int pilih = Integer.parseInt(br.readLine());
            
            // Switch Case
            switch(pilih) {
                case 1:
                    System.out.println("\n=====Login Admin=====");
                    System.out.print("Masukkan Username: ");
                    String user = br.readLine();
                    System.out.print("Masukkan Password: ");
                    String pass = br.readLine();
                    
                    // Pengecekan
                    if(user.equalsIgnoreCase(user1.getUsername()) && pass.equals(user1.getPassword())) {
                        System.out.println("\nLOGIN SUKSES");
                    } else {
                        System.out.println("\nGAGAL LOGIN");
                    }
                break;
                
                case 2:
                    System.out.println("\n=====Buat User=====");
                    System.out.print("Input Username: ");
                    String newUser = br.readLine();
                    System.out.print("Input Password: ");
                    String newPass = br.readLine();
                    
                    // Panggil Constructor
                    user2 = new Login(newUser, newPass);
                    System.out.println("\nUSER BERHASIL DIBUAT");
                break;
                
                case 3:
                    System.out.println("\n=====Ubah Password=====");
                    System.out.print("Input Password Lama: ");
                    String passLama = br.readLine();
                    System.out.print("Input Password Baru: ");
                    String passBaru = br.readLine();
                    
                    // Pengubahan
                    if(passLama.equals(user1.getPassword())) {
                        user1.setPassword(passBaru);
                        System.out.println("\nPASSWORD BERHASIL DIUBAH");
                    } else {
                        System.out.println("\nSALAH INPUT PASSWORD LAMA");
                    }
                break;
                
                case 4:
                    System.out.println("\n=====Lihat Data User=====");
                    System.out.println("USER PERTAMA");
                    System.out.println("Username: " + user1.getUsername());
                    System.out.println("Password: " + user1.getPassword());
                    System.out.println("\nUSER KEDUA");
                    System.out.println("Username: " + user2.getUsername());
                    System.out.println("Password: " + user2.getPassword());
                break;
                
                case 5:
                    System.out.println("\n=====Terima Kasih=====");
                    System.exit(0);
                break;
            }
        }
    }
    
}
