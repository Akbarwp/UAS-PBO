package PBO.Praktikum.Pertemuan7.Tugas1;

abstract public class RumusBalok {
    
    private double panjang, lebar, tinggi;
    
    public RumusBalok(double p, double l, double t) {
        panjang = p;
        lebar = l;
        tinggi = t;
    }
    
    double getPanjang() {
        return this.panjang;
    }
    double getLebar() {
        return this.lebar;
    }
    double getTinggi() {
        return this.tinggi;
    }
    
    abstract double hitungBalok();
}
