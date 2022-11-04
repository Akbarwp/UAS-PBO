package PBO.Praktikum.Pertemuan7;

interface Manusia{
    void aktivitas();
}

interface Pekerjaan{
    void mengajar();
}

class Dosen implements Manusia, Pekerjaan{
    @Override
    public void aktivitas() {
        System.out.println("Mengajar");
    }
    
    @Override
    public void mengajar() {
        System.out.println("Pemrograman Berorientasi Objek");
    }
}

public class UtamaManusia {

    public static void main(String[] args) {
        
        Dosen dos = new Dosen();
        dos.aktivitas();
        dos.mengajar();
    }
    
}
