package PBO.Matkul.Pertemuan2;

class Pembeli{
    
    private String nama;
    private String nik;
    private int harga;
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public void setNIK(String nik) {
        this.nik = nik;
    }
    
    public void setHarga(int harga) {
        this.harga = harga;
    }
    
    public String getNama() {
        return this.nama;
    }
    
    public String getNIK() {
        return this.nik;
    }
    
    public int getHarga() {
        return this.harga;
    }
    
    void vaksin() {
        System.out.println("Saya sudah vaksin");
        int diskon = getHarga()* 15 / 100;
        setHarga(getHarga() - diskon);
    }

}

public class Pembelianku {

    public static void main(String[] args) {
        
        Pembeli mhs = new Pembeli();
        
        mhs.setNama("Akbar");
        mhs.setNIK("351518");
        mhs.setHarga(10000);
        
        
        System.out.println("Nama: " + mhs.getNama());
        System.out.println("NIK: " + mhs.getNIK());
        System.out.println("Harga: Rp" + mhs.getHarga());
        
        System.out.println("");
        mhs.vaksin();
        
        System.out.println("Nama: " + mhs.getNama());
        System.out.println("NIK: " + mhs.getNIK());
        System.out.println("Harga: Rp" + mhs.getHarga());
        
    }
    
}
