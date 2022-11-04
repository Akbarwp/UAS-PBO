package PBO.Matkul.Pertemuan2.Tugas;

// Nama: Akbar Wibowo Putra
// NIM: 20410100057

import java.io.*;

class Rekening{
    
    BufferedReader inp = new BufferedReader(new InputStreamReader(System.in));
    
    private String nomorRekening;
    private String namaPemilik;
    private int jmlSaldo;
    
    public void setNomorRekening(String nomorRekening) {
        this.nomorRekening = nomorRekening;
    }
    
    public void setNamaPemilik(String namaPemilik) {
        this.namaPemilik = namaPemilik;
    }
    
    public void setJmlSaldo(int jmlSaldo) {
        this.jmlSaldo = jmlSaldo;
    }
    
    public String getNomorRekening() {
        return this.namaPemilik;
    }
    
    public String getNamaPemilik() {
        return this.nomorRekening;
    }
    
    public int getJmlSaldo() {
        return this.jmlSaldo;
    }
    
    void menabung() throws IOException {
        
        System.out.print("Input Nominal : Rp");
        int saldo = Integer.parseInt(inp.readLine());
        setJmlSaldo(getJmlSaldo() + saldo);
    }
    
    void menarikUang() throws IOException {
        
            System.out.print("Input Nominal : Rp");
            int saldo = Integer.parseInt(inp.readLine());
            setJmlSaldo(getJmlSaldo() - saldo);
    }
    
    void memeriksaSaldo() throws IOException {
        
        System.out.println("Jumlah Saldo Anda: Rp" + getJmlSaldo());
    }
}


public class Tugas1 {

    public static BufferedReader inp = new BufferedReader(new InputStreamReader(System.in));
    
    static int pilih;
    
    public static void main(String[] args) throws IOException {
        
        Rekening rek = new Rekening();
        
        userInput(rek);
        
        while(true) {
            
            int saldo;
            
            menu(rek);
            
            switch(pilih) {
                
                case 1:
                    rek.menabung();
                break;
                
                case 2:
                    rek.menarikUang();
                break;
                
                case 3:
                    rek.memeriksaSaldo();
                break;
                
                case 4:
                    System.exit(0);
                break;
            }
        }
        
    }
    
    private static void userInput(Rekening rek) throws IOException {
        
        System.out.print("Inputkan Nomor Rekening: ");
        String nomorRekening = inp.readLine();
        rek.setNomorRekening(nomorRekening);
        
        System.out.print("Inputkan Nama: ");
        String nama = inp.readLine();
        rek.setNamaPemilik(nama);
        
        System.out.print("Inputkan Jumlah Saldo: Rp");
        int saldo = Integer.parseInt(inp.readLine());
        rek.setJmlSaldo(saldo);
        
    }
    
    private static void menu(Rekening rek) throws IOException {
        
        System.out.println("\nSaldo: Rp" + rek.getJmlSaldo());
        System.out.println("1. Menabung");
        System.out.println("2. Tarik Uang");
        System.out.println("3. Cek Saldo");
        System.out.println("4. Exit");
        System.out.print("Silakan memilih: ");
        pilih = Integer.parseInt(inp.readLine());
    }
    
}
