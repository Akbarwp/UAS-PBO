package PBO.Praktikum.Pertemuan4;

import java.io.*;

public class Utama {

    public static void main(String[] args) throws IOException {
        
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        
        Pelanggan pel1 = new Pelanggan();
        
        System.out.print("Masukkan Nomor Pelanggan: ");
        pel1.setNopel(Integer.parseInt(scan.readLine()));
        System.out.print("Masukkan Nama: ");
        pel1.setNama(scan.readLine());
        System.out.print("Masukkan Alamat: ");
        pel1.setAlamat(scan.readLine());
        System.out.print("Masukkan Jumlah Barang: ");
        pel1.setJml(Integer.parseInt(scan.readLine()));
        System.out.print("Masukkan Harga: Rp");
        pel1.setHarga(Integer.parseInt(scan.readLine()));
        pel1.perhitungan();
        
        System.out.println("\n=====Nota=====");
        pel1.show();
        
    }
    
}
