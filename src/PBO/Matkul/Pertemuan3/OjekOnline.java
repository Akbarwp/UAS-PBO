package PBO.Matkul.Pertemuan3;

class Ojek {
    
    String nama;
    String CEO;
    int rating;
    
    int tahun;
    String asal;
    
    Ojek(String inputNama, String inputCEO, int inputRating) {
        nama = inputNama;
        CEO = inputCEO;
        rating = inputRating;
    }
    
    Ojek(String inputNama, String inputCEO, int inputRating, int inputTahun, String inputAsal) {
        this(inputNama, inputCEO, inputRating);
        tahun = inputTahun;
        asal = inputAsal;
    }

}

public class OjekOnline {

    public static void main(String[] args) {
        
        Ojek ojol1 = new Ojek("Gojek", "Nadiem Makarim", 10);
        
        System.out.println("Nama Ojol: " + ojol1.nama);
        System.out.println("Nama CEO: " + ojol1.CEO);
        System.out.println("Rating Aplikasi: " + ojol1.rating);
        
        System.out.println("");
        
        Ojek ojol2 = new Ojek("Grab", "Anthony Tan", 9, 2012, "Singapura");
        
        System.out.println("Nama Ojol: " + ojol2.nama);
        System.out.println("Nama CEO: " + ojol2.CEO);
        System.out.println("Rating Aplikasi: " + ojol2.rating);
        System.out.println("Tahun Berdiri: " + ojol2.tahun);
        System.out.println("Asal Perusahaan: " + ojol2.asal);
        
    }
    
}
