package PBO.Matkul.Pertemuan5;

public class SAR {
    private String penularan, asal;
    
    SAR(String penularan, String asal){
        this.penularan = penularan;
        this.asal = asal;
    }
    
    public void keterangan() {
        System.out.println("Penularan: " + this.penularan);
        System.out.println("Asal: " + this.asal);
    }
}
