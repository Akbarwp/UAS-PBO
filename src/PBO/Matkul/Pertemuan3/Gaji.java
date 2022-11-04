package PBO.Matkul.Pertemuan3;

class KenaikanGaji {
    
    private double gajiPokok;
    private double persen;
    private String jabatan;
    private String ID;
    
    KenaikanGaji(String inputID, String inputJabatan, double inputGajiPokok, double inputPersen) {
        this.ID = inputID;
        this.jabatan = inputJabatan;
        this.gajiPokok = inputGajiPokok;
        this.persen = inputPersen;
    }
    
    public double getGajiPokok() {
        double gajiBaru = this.gajiPokok + (this.persen/100 * this.gajiPokok);
        return gajiBaru;
    }
    public String getID() {
        return this.ID;
    }
    public String getJabatan() {
        return this.jabatan;
    }
    
}

public class Gaji {

    public static void main(String[] args) {
        
        KenaikanGaji kg1 = new KenaikanGaji("SBY001", "Manager", 4000000, 10);
        System.out.println("Nama: Santi");
        System.out.println("No.Pegawai: " + kg1.getID());
        System.out.println("Jabatan: " + kg1.getJabatan());
        System.out.println("Gaji Baru: Rp" + kg1.getGajiPokok());
        
        System.out.println("");
        
        KenaikanGaji kg2 = new KenaikanGaji("BDG0317", "Staff", 2000000, 5);
        System.out.println("Nama: Ronny");
        System.out.println("No.Pegawai: " + kg2.getID());
        System.out.println("Jabatan: " + kg2.getJabatan());
        System.out.println("Gaji Baru: Rp" + kg2.getGajiPokok());
        
        System.out.println("");
        
        KenaikanGaji kg3 = new KenaikanGaji("JKT0189", "Direktur", 8000000, 15);
        System.out.println("Nama: Indra");
        System.out.println("No.Pegawai: " + kg3.getID());
        System.out.println("Jabatan: " + kg3.getJabatan());
        System.out.println("Gaji Baru: Rp" + kg3.getGajiPokok());
        
    }
    
}
