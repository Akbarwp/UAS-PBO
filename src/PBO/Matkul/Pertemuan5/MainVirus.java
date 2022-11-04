package PBO.Matkul.Pertemuan5;

public class MainVirus {

    public static void main(String[] args) {
        
        SAR sar = new SAR("Droplet", "Cina");
        COVID covid = new COVID("Droplet", "India", "Delta", "Sangat cepat");
        
        sar.keterangan();
        covid.keterangan();
    }
    
}
