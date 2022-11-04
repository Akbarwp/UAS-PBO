package PBO.Praktikum.Pertemuan7.Tugas2;

public class Rumus implements BangunRuang, BangunDatar{
    private double r, t, a;
    
    Rumus(){
        
    }
    Rumus(double r, double t, double a){
        this.r = r;
        this.t = t;
        this.a = a;
    }
    
    double getR() {
        return this.r;
    }
    double getT() {
        return this.t;
    }
    double getA() {
        return this.a;
    }
    
    @Override
    public double VolumeKerucut() {
        return (LuasLingkaran() * getT()) / 3;
    }
    @Override
    public double VolumeBola() {
        return (22 * 4 * Math.pow(getR(), 3) / 3 / 7);
    }
    @Override
    public double VolumeTabung() {
        return LuasLingkaran() * getT();
    }
    
    @Override
    public double LuasLingkaran() {
        return (22 * Math.pow(getR(), 2)) / 7;
    }
    @Override
    public double LuasSegitiga() {
        return (getA() * getT()) / 2;
    }
}
