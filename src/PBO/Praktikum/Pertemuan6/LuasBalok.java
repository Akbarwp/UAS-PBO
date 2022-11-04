package PBO.Praktikum.Pertemuan6;

public class LuasBalok extends RumusBalok {
    
    public LuasBalok(double p, double l, double t) {
        super(p, l, t);
    }
    
    @Override
    public double hitungBalok() {
        return (2 * (getPanjang() * getLebar())) + (2 * (getPanjang() * getTinggi())) + (2 * (getTinggi() * getLebar()));
    }
}
