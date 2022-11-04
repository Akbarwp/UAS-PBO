package PBO.Praktikum.Pertemuan5.Tugas;

public class Sport extends Sepatu {
    
    String tipe = "Sepatu Olahraga";
    
    Sport(String nama, String merk, double harga) {
        super(nama, merk, harga);
    }
    
    @Override
    void display() {
        super.display();
        System.out.println("Tipe\t: " + tipe);
    }
    
    @Override
    void display(int item, int ukuran) {
        System.out.println("\nNama\t: " + this.getNama());
        System.out.println("Merk\t: " + this.getMerk());
        System.out.println("Ukuran\t: " + ukuran);
        System.out.println("Jumlah\t: " + item);
        System.out.println("Harga\t: Rp" + totalHarga(item));
    }
}
