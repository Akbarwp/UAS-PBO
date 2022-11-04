package PBO.Praktikum.Pertemuan5.Tugas;

public class Sepatu {
    
    private String nama, merk;
    private double harga;
    static int no;
    
    Sepatu(String nama, String merk, double harga) {
        this.nama = nama;
        this.merk = merk;
        this.harga = harga;
    }
    
    String getNama() {
        return this.nama;
    }
    String getMerk() {
        return this.merk;
    }
    double getHarga() {
        return this.harga;
    }
    
    void setNama(String nama) {
        this.nama = nama;
    }
    void setMerk(String merk) {
        this.merk = merk;
    }
    void setHarga(double harga) {
        this.harga = harga;
    }
    
    void display() {
        Sepatu.no++;
        System.out.println("\n=====Sepatu " + no + "=====");
        System.out.println("Nama\t: " + this.getNama());
        System.out.println("Merk\t: " + this.getMerk());
        System.out.println("Harga\t: Rp" + this.getHarga());
    }
    
    void display(int item, int ukuran) {
        System.out.println("\nNama\t: " + this.getNama());
        System.out.println("Merk\t: " + this.getMerk());
        System.out.println("Ukuran\t: " + ukuran);
        System.out.println("Jumlah\t: " + item);
        System.out.println("Harga\t: Rp" + totalHarga(item));
    }
    
    double totalHarga(double item) {
        double jml;
        return jml = getHarga() * item;
    }
}
