package PBO.Praktikum.Pertemuan6;

import java.io.*;

public class MainBalok {

    public static void main(String[] args) throws IOException {
        
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        
        RumusBalok[] bk = new RumusBalok[2];
        
        for(int i = 0; i < bk.length; i++) {
            
            System.out.println("User " + (i+1));
            System.out.print("Masukkan Panjang: ");
            double p = Double.parseDouble(sc.readLine());
            System.out.print("Masukkan Lebar: ");
            double l = Double.parseDouble(sc.readLine());
            System.out.print("Masukkan Tinggi: ");
            double t = Double.parseDouble(sc.readLine());
            System.out.print("Pilih Luas atau Keliling Balok (K/L): ");
            String pilih = sc.readLine();
            
            if(pilih.equalsIgnoreCase("L")) {
                bk[i] = new LuasBalok(p, l, t);
                System.out.println("Luas Permukaan Balok adalah " + bk[i].hitungBalok() + " cm2\n");
            } else if(pilih.equalsIgnoreCase("K")) {
                bk[i] = new KelilingBalok(p, l, t);
                System.out.println("Keliling Balok adalah " + bk[i].hitungBalok() + " cm\n");
            }
        }
    }
    
}
