package PBO.Matkul.Pertemuan5;

public class COVID extends SAR {
    protected String jenis, kecepatan;

    public COVID(String penularan, String asal, String jenis, String kecepatan) {
        super(penularan, asal);
        this.jenis = jenis;
        this.kecepatan = kecepatan;
    }
    
    public void keterangan() {
        super.keterangan();
        System.out.println("Jenis: " + this.jenis);
        System.out.println("Kecepatan: " + this.kecepatan);
    }
}
