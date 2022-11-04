package PBO.Praktikum.Pertemuan7.Tugas1;

public class LuasBalok extends RumusBalok {
    
    public LuasBalok(double p, double l, double t) {
        super(p, l, t);
    }
    
    @Override
    public double hitungBalok() {
        return (2 * (super.getPanjang() * super.getLebar())) + (2 * (super.getPanjang() * super.getTinggi())) + (2 * (super.getTinggi() * super.getLebar()));
    }
}
