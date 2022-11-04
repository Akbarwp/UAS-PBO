package PBO.Praktikum.Pertemuan5;

import java.io.*;

public class MainInheritance {

    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // Object
        Kendaraan kn = new Kendaraan("", "", 0.0); // Induk class
        Motor mt = new Motor("", "", 0.0, "", ""); // Anak class
        
        String merk, warna;
        double harga;
        int pilih;
        
        // Menu
        do{
            System.out.println("\n=====MENU=====");
            System.out.println("1. Input Data");
            System.out.println("2. Tampil Data");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu: ");
            pilih = Integer.parseInt(br.readLine());
            
            // Switch Case
            switch(pilih) {
                case 1:
                    System.out.println("\n=====Input Data=====");
                    System.out.print("Masukkan Merk: ");
                    merk = br.readLine();
                    System.out.print("Masukkan Warna: ");
                    warna = br.readLine();
                    System.out.print("Masukkan Harga: ");
                    harga = Double.parseDouble(br.readLine());
                    System.out.print("Masukkan Tipe: ");
                    String tipe = br.readLine();
                    System.out.print("Masukkan Aksesoris: ");
                    String akse = br.readLine();
                    
                    mt = new Motor(merk, warna, harga, tipe, akse);
                break;
                
                case 2:
                    System.out.println("\n=====Tampil Data=====");
                    System.out.println("Merk: " + mt.getMerk());
                    System.out.println("Warna: " + mt.getWarna());
                    System.out.println("Harga: " + mt.getHarga());
                    System.out.println("Tipe: " + mt.getTipe());
                    System.out.println("Aksesoris: " + mt.getAksesosris());
                break;
                
                case 3:
                    System.out.println("\nTerima Kasih");
                    System.exit(0);
                break;
            }
            
        } while(pilih < 3);
    }
    
}
