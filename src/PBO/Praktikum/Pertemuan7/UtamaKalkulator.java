package PBO.Praktikum.Pertemuan7;

import java.io.*;

interface Operasi{
    void penjumlahan();
    void pengurangan();
    
    double perkalian();
    double pembagian();
}

class Kalkulator implements Operasi{
    private double angka1;
    private double angka2;
    
    Kalkulator(){
        
    }
    Kalkulator(double angka1, double angka2){
        this.angka1 = angka1;
        this.angka2 = angka2;
    }
    
    double getAngka1() {
        return this.angka1;
    }
    double getAngka2() {
        return this.angka2;
    }
    
    @Override
    public void penjumlahan() {
        double hasil = getAngka1() + getAngka2();
        System.out.println("Hasil Penjumlahan: " + hasil);
    }
    @Override
    public void pengurangan() {
        double hasil = getAngka1() - getAngka2();
        System.out.println("Hasil Pengurangan: " + hasil);
    }
    
    @Override
    public double perkalian() {
        return getAngka1() * getAngka2();
    }
    @Override
    public double pembagian() {
        return getAngka1() / getAngka2();
    }
}

public class UtamaKalkulator {

    public static void main(String[] args) throws IOException {
        
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        
        Kalkulator kal = new Kalkulator();
        
        System.out.print("Masukkan angka1: ");
        double angka1 = Double.parseDouble(sc.readLine());
        System.out.print("Masukkan angka2: ");
        double angka2 = Double.parseDouble(sc.readLine());
        kal = new Kalkulator(angka1, angka2);
        
        System.out.println("\n====Hasil=====");
        kal.penjumlahan();
        kal.pengurangan();    
        System.out.println("Hasil Perkalian: " + kal.perkalian());
        System.out.println("Hasil Pembagian: " + kal.pembagian());
    }
    
}
