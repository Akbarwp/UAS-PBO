package PBO.Matkul.Pertemuan2.Tugas;

// Nama: Akbar Wibowo Putra
// NIM: 20410100057

class KenaikanGaji {
    
    private String id;
    private String nama;
    private String jabatan;
    private int gajiPokok;
    private int lembur;
    
    public void setID(String id) {
        this.id = id;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }
    
    public void setGajiPokok(int gajiPokok) {
        this.gajiPokok = gajiPokok;
    }
    
    public void setLembur(int lembur) {
        this.lembur = lembur;
    }
    
    public String getID() {
        return this.id;
    }
    
    public String getNama() {
        return this.nama;
    }
    
    public String getJabatan() {
        return this.jabatan;
    }
    
    public int getGajiPokok() {
        return this.gajiPokok;
    }
    
    public int getLembur() {
        return this.lembur;
    }
    
    void hitungGaji() {
        
        int gajiTotal;
        
        if (this.jabatan.equalsIgnoreCase("Direktur")) {
            
            gajiTotal = getGajiPokok() + this.getLembur() * 150000;
            System.out.println("Gaji Total: Rp" + gajiTotal);
            
        } else if (this.jabatan.equalsIgnoreCase("Manager")) {
            
            gajiTotal = getGajiPokok() + this.getLembur() * 100000;
            System.out.println("Gaji Total: Rp" + gajiTotal);
            
        } else if (this.jabatan.equalsIgnoreCase("Staff")) {
            
            gajiTotal = getGajiPokok() + this.getLembur() * 50000;
            System.out.println("Gaji Total: Rp" + gajiTotal);
        }
    }
    
    void tampil() {
        
        System.out.println("ID: " + getID());
        System.out.println("Nama: " + getNama());
        System.out.println("Jabatan: " + getJabatan());
        System.out.println("Gaji Pokok: Rp" + getGajiPokok());
        System.out.println("Lembur: " + getLembur() + " jam");
        hitungGaji();
        System.out.println("");
    }
}

public class Tugas2 {

    public static void main(String[] args) {
        
        KenaikanGaji pgw1 = new KenaikanGaji();
        KenaikanGaji pgw2 = new KenaikanGaji();
        KenaikanGaji pgw3 = new KenaikanGaji();
        
        pgw1.setID("2041");
        pgw1.setNama("Ucup");
        pgw1.setJabatan("Direktur");
        pgw1.setGajiPokok(15000000);
        pgw1.setLembur(5);
        
        pgw2.setID("1942");
        pgw2.setNama("Budi");
        pgw2.setJabatan("Manager");
        pgw2.setGajiPokok(10000000);
        pgw2.setLembur(6);
        
        pgw3.setID("2053");
        pgw3.setNama("Wati");
        pgw3.setJabatan("Staff");
        pgw3.setGajiPokok(5000000);
        pgw3.setLembur(4);
        
        pgw1.tampil();
        pgw2.tampil();
        pgw3.tampil();
        
    }
    
}
