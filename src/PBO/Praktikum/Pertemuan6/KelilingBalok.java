package PBO.Praktikum.Pertemuan6;

public class KelilingBalok extends RumusBalok {
    
    public KelilingBalok(double p, double l, double t) {
        super(p, l, t);
    }
    
    @Override
    public double hitungBalok() {
        return 4 * (getPanjang() + getLebar() + getTinggi());
    }
}
