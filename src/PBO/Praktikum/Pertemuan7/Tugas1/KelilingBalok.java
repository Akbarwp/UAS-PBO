package PBO.Praktikum.Pertemuan7.Tugas1;

final class KelilingBalok extends RumusBalok {
    
    public KelilingBalok(double p, double l, double t) {
        super(p, l, t);
    }
    
    @Override
    final double hitungBalok() {
        return 4 * (super.getPanjang() + super.getLebar() + super.getTinggi());
    }
}
