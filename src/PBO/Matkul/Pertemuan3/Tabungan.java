package PBO.Matkul.Pertemuan3;

class Tabung {
    int saldo;
    
    Tabung(int inputSaldo) {
        saldo = inputSaldo;
    }
    
    void ambilUang(int jumlah) {
        saldo = saldo - jumlah;
        System.out.println("Jumlah uang yang diambil: Rp" + jumlah);
    }
}

public class Tabungan {

    public static void main(String[] args) {
        
        Tabung tb = new Tabung(50000);
        
        System.out.println("Saldo Awal: Rp" + tb.saldo);
        tb.ambilUang(20000);
        System.out.println("Saldo Akhir: Rp" + tb.saldo);
        
    }
    
}
