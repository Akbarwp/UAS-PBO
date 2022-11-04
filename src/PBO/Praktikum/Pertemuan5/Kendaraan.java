package PBO.Praktikum.Pertemuan5;

public class Kendaraan {
    // Variable
    private String merk, warna;
    private double harga;
    
    // Constructor
    Kendaraan() {
        
    }
    
    Kendaraan(String merk, String wrn, double hrg) {
        this.merk = merk;
        warna = wrn;
        harga = hrg;
    }
    
    // Getter
    String getMerk() {
        return this.merk;
    }
    String getWarna() {
        return this.warna;
    }
    double getHarga() {
        return this.harga;
    }
    
    // Setter
    void setMerk(String merk) {
        this.merk = merk;
    }
    void setWarna(String warna) {
        this.warna = warna;
    }
    void setHarga(double harga) {
        this.harga = harga;
    }
}

class Motor extends Kendaraan{
    // Variable
    private String tipe, aksesosris;
    
    // Construktor  
    Motor(String merk, String warna, double harga) {
        super(merk, warna, harga);
    }
    
    Motor(String merk, String warna, double harga, String tipe, String aksesosris) {
        super.setMerk(merk);
        super.setWarna(warna);
        super.setHarga(harga);
        
        this.tipe = tipe;
        this.aksesosris = aksesosris;
    }
    
    // Getter
    String getTipe() {
        return this.tipe;
    }
    String getAksesosris() {
        return this.aksesosris;
    }
    
    @Override
    String getMerk() {
        return super.getMerk();
    }
    @Override
    String getWarna() {
        return super.getWarna();
    }
    @Override
    double getHarga() {
        return super.getHarga();
    }
    
    // Setter
    void setTipe(String tipe) {
        this.tipe = tipe;
    }
    void setAksesosris(String aksesosris) {
        this.aksesosris = aksesosris;
    }
}
