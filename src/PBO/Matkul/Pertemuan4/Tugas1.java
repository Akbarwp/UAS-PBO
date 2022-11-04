package PBO.Matkul.Pertemuan4;

import java.util.*;

class Matematika{
    
    public int pertambahan(int a, int b) {
        return a + b;
    }
    
    public int perkalian(int a, int b) {
        return a * b;
    }
}

class MatematikaCanggih extends Matematika{
    
    public int modulus(int a, int b) {
        return a % b;
    }
}

class MatematikaCanggihBeraksi extends MatematikaCanggih{
    
    Scanner scan = new Scanner(System.in);
    
    public void show() {
        System.out.print("Nilai a: ");
        int a = scan.nextInt();
        System.out.print("Nilai b: ");
        int b = scan.nextInt();
        System.out.println("---------------------");
        System.out.println("Hasil Operasi");
        System.out.println("---------------------");
        System.out.println(a + " + " + b + " = " + this.pertambahan(a, b));
        System.out.println(a + " * " + b + " = " + this.perkalian(a, b));
        System.out.println(a + " % " + b + " = " + this.modulus(a, b));
    }
}

public class Tugas1 {

    public static void main(String[] args) {
        
        MatematikaCanggihBeraksi ca = new MatematikaCanggihBeraksi();
        
        ca.show();
    }
    
}
