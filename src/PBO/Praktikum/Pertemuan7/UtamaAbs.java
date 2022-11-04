package PBO.Praktikum.Pertemuan7;

import java.io.*;

abstract class ManusiaAbs{
    private double tb;
    
    ManusiaAbs(double tb) {
        this.tb = tb;
    }
    
    double getTb() {
        return this.tb;
    }
    
    abstract double Hitung();
}

class Laki extends ManusiaAbs{
    Laki(double tb) {
        super(tb);
    }
    
    @Override
    double Hitung() {
        return (super.getTb() - 100) * 0.9;
    }
}

final class Perempuan extends ManusiaAbs {
    
    Perempuan(double tb) {
        super(tb);
    }
    
    @Override
    final double Hitung() {
        return (super.getTb() - 100) * 0.8;
    }
}

public class UtamaAbs {

    public static void main(String[] args) throws IOException {
        
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        
        ManusiaAbs[] m = new ManusiaAbs[2];
        
        int x = 0;
        
        do{
            // Input
            System.out.println("User: " + (x + 1));
            System.out.print("Masukkan tinggi badan: ");
            double tb = Double.parseDouble(sc.readLine());
            System.out.print("Masukkan jenis kelamin(L/P): ");
            String jk = sc.readLine();
            
            // Proses
            if (jk.equalsIgnoreCase("L")) {
                m[x] = new Laki(tb);
                System.out.println("Berat badan ideal: " + m[x].Hitung() + "\n");
            } else if (jk.equalsIgnoreCase("P")) {
                m[x] = new Perempuan(tb);
                System.out.println("Berat badan ideal: " + m[x].Hitung() + "\n");
            } x++;
        } while(x < 2);
        
    }
    
}
