package PBO.Praktikum.Pertemuan5.Tugas;

import java.io.*;

public class Main {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int pilih;

    public static void main(String[] args) throws IOException {
        Sepatu sp1 = new Sepatu("Sang Sekerta", "Ventela", 500000);
        Sepatu sp2 = new Sepatu("Lite Collection", "Ventela", 145000);
        Sport st1 = new Sport("Barricada", "Specs", 300000);
        Sport st2 = new Sport("Losari 03", "Flypower", 375000);
        Pantofel pan1 = new Pantofel("Kojo Black", "Buccheri", 730000);
        Pantofel pan2 = new Pantofel("Malvin Black", "Buccheri", 490000);
        
        Login admin = new Login();
        
        double jml = 0;
        
        masukLogin(admin);
        
        while(true) {
            
            Menu();
            
            switch(pilih) {
                
                case 1:
                    System.out.println("\n=====Rak Sepatu=====");
                    sp1.display();
                    sp2.display();
                    st1.display();
                    st2.display();
                    pan1.display();
                    pan2.display();
                break;
                
                case 2:
                    System.out.println("\n=====Pembelian=====\n");
                    System.out.print("Pilih Sepatu (1-6): ");
                    int pil = Integer.parseInt(br.readLine());
                    System.out.print("Ingin ukuran berapa: ");
                    int ukuran = Integer.parseInt(br.readLine());
                    System.out.print("Ingin beli berapa: ");
                    int item = Integer.parseInt(br.readLine());
                    
                    switch(pil) {
                        case 1:
                            sp1.display(item, ukuran);
                            jml = sp1.getHarga() * item;
                        break;
                        
                        case 2:
                            sp2.display(item, ukuran);
                            jml = sp2.getHarga() * item;
                        break;
                        
                        case 3:
                            st1.display(item, ukuran);
                            jml = st1.getHarga() * item;
                        break;
                        
                        case 4:
                            st2.display(item, ukuran);
                            jml = st2.getHarga() * item;
                        break;
                        
                        case 5:
                            pan1.display(item, ukuran);
                            jml = pan1.getHarga() * item;
                        break;
                        
                        case 6:
                            pan2.display(item, ukuran);
                            jml = pan2.getHarga() * item;
                        break;
                    }
                break;
                
                case 3:
                    pembayaran(jml);
                break;
                
                case 4:
                    System.out.println("\n=====Terima Kasih=====");
                    System.exit(0);
                break;

            }
        }
    }
    
    private static void masukLogin(Login admin) throws IOException { 
        String user, pass;
        do {
            System.out.println("\n=====LOGIN=====");
            System.out.print("Masukkan Username: ");
            user = br.readLine();
            System.out.print("Masukkan Password: ");
            pass = br.readLine();
        
            if(user.equalsIgnoreCase(admin.getUsername()) && pass.equals(admin.getPassword())) {
                System.out.println("\nLOGIN SUKSES");
            } else {
                System.out.println("\nLOGIN GAGAL");
            }
        } while(!user.equalsIgnoreCase(admin.getUsername()) || !pass.equals(admin.getPassword()));
    }
    
    private static void Menu() throws IOException{
        System.out.println("\n=====MENU=====");
        System.out.println("1. List Barang");
        System.out.println("2. Pembelian");
        System.out.println("3. Pembayaran");
        System.out.println("4. Exit");
        System.out.print("Pilih Menu: ");
        pilih = Integer.parseInt(br.readLine());
    }
    
    private static void pembayaran(double jml) throws IOException{
        double bayar, kembalian;
        System.out.println("\n=====Pembayaran=====");
            do{
                System.out.print("\nMasukkan uang: Rp");
                bayar = Integer.parseInt(br.readLine());

                if(bayar > jml) {
                    kembalian = bayar - jml;
                    System.out.print("Kembalian: Rp" + kembalian);
                } else if(bayar == jml) {
                    System.out.println("Uang pas");
                } else {
                    System.out.println("Uang tidak cukup");
                }
            } while(bayar < jml);
    }
}
