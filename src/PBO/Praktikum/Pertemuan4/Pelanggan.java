package PBO.Praktikum.Pertemuan4;

public class Pelanggan {
    
    private int nopel;
    private String nama;
    private String alamat;
    private int jml;
    private int harga;
    private int totalBeli;
    
    
    public void setNopel(int nopel) {
        this.nopel = nopel;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    public void setJml(int jml) {
        this.jml = jml;
    }
    public void setHarga(int harga) {
        this.harga = harga;
    }
    public void setTotalBeli(int totalBeli) {
        this.totalBeli = totalBeli;
    }
    
    
    public int getNopel(){
        return this.nopel;
    }
    public String getNama(){
        return this.nama;
    }
    public String getAlamat(){
        return this.alamat;
    }
    public int getJml(){
        return this.jml;
    }
    public int getHarga(){
        return this.harga;
    }
    public int getTotalBeli(){
        return this.totalBeli;
    }
    
    public int perhitungan() {
        return this.totalBeli = getHarga() * getJml();
    }
    
    void show() {
        System.out.println("Nomor Pelanggan: " + getNopel());
        System.out.println("Nama: " + getNama());
        System.out.println("Alamat: " + getAlamat());
        System.out.println("Jumlah Barang: " + getJml());
        System.out.println("Harga: Rp" + getHarga());
        System.out.println("Total Beli: Rp" + getTotalBeli());
        
    }
}
