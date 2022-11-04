package PBO.Matkul.Pertemuan5;

import java.util.*;

class OjekOnline {

    private double total;
    protected String nama;

    OjekOnline(double total) {
        this.total = total;
    }

    double getTotal() {
        return this.total;
    }

    double pembayaran() {
        return 0.0;
    }
}

class Gojek extends OjekOnline {

    Gojek(double total) {
        super(total);
        nama = "Gojek";
    }

    @Override
    double pembayaran() {
        return super.getTotal() - (super.getTotal() * 0.05);
    }
}

class Grab extends OjekOnline {

    Grab(double total) {
        super(total);
        nama = "Grab";
    }

    @Override
    double pembayaran() {
        return super.getTotal() - (super.getTotal() * 0.1);
    }
}

class Uber extends OjekOnline {

    Uber(double total) {
        super(total);
        nama = "Uber";
    }

    @Override
    double pembayaran() {
        return super.getTotal() - (super.getTotal() * 0.15);
    }
}

public class Ojek {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        OjekOnline[] oj = new OjekOnline[3];
        System.out.print("Masukkan total: Rp");
        double total = sc.nextDouble();

        oj[0] = new Gojek(total);
        oj[1] = new Grab(total);
        oj[2] = new Uber(total);

        for (int i = 0; i < oj.length; i++) {
            System.out.println("Pembayaran " + oj[i].nama + " : Rp" + oj[i].pembayaran());
        }
    }

}
