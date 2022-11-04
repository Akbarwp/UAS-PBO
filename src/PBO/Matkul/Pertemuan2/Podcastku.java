package PBO.Matkul.Pertemuan2;

class Podcast {
    
    private String MC;
    private String acara;
    
    public void setMC (String MC) {
        this.MC = MC;
    }
    
    public void setAcara (String acara) {
        this.acara = acara;
    }
    
    public String getMC() {
        return this.MC;
    }
    
    public String getAcara() {
        return this.acara;
    }
}

public class Podcastku {

    public static void main(String[] args) {
        
        Podcast pod = new Podcast();
        
        pod.setMC("Deddy Corbuzier");
        pod.setAcara("Close the Door");
        
        System.out.println("Nama Pembawa Acara: " + pod.getMC());
        System.out.println("Nama Acara: " + pod.getAcara());
    }
    
}
