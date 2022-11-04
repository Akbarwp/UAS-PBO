package PBO.Matkul.Pertemuan2;

class Mahasiswa {
    String nama;
    String nim;
    String alamat;
    
    void isiData(String nama, String nim, String alamat) {
        this.nama = nama;
        this.nim = nim;
        this.alamat = alamat;
        
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Alamat: " + alamat);
        System.out.println("");
    }
    
    void matakuliah(String mk) {
        System.out.println("Matakuliah yang diambil yaitu : " + mk);
    }
    
    void perwalian(int sks) {
        System.out.println("Jumlah SKS yang dapat diambil yaitu " + sks + " sks");
    }
    
}

public class Mahasiswaku {

    public static void main(String[] args) {
        
        Mahasiswa mhs = new Mahasiswa();
        mhs.nama = "Akbar";
        mhs.nim = "20410100057";
        mhs.alamat = "DSI";
        
        mhs.isiData("Akbar", "20410100057", "DSI");
        
        mhs.perwalian(20);
        System.out.println("Nama: " + mhs.nama);
        System.out.println("NIM: " + mhs.nim);
        System.out.println("Alamat: " + mhs.alamat);
        mhs.matakuliah("PBO");
        mhs.matakuliah("PBD");
        mhs.matakuliah("IMK");
        
    }
    
}
