package PBO.Praktikum.Pertemuan7.Tugas2;

import java.io.*;

public class MainRumus {

    static BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
    static Rumus rm = new Rumus();

    public static void main(String[] args) throws IOException {

        while (true) {
            menu();
            int pilih = Integer.parseInt(sc.readLine());
            switch (pilih) {

                case 1:
                    case1();
                    break;

                case 2:
                    case2();
                    break;

                case 3:
                    System.exit(0);
                    break;
            }

        }

    }

    private static void menu() throws IOException {
        System.out.println("\n=====Menu=====");
        System.out.println("1. Input data Bangun Ruang dan Bangun Datar");
        System.out.println("2. Lihat data Bangun Ruang dan Bangun Datar");
        System.out.println("3. Keluar");
        System.out.print("Masukkan pilihan: ");
    }

    private static void case1() throws IOException {
        System.out.println("\n=====Input Data Bangun Ruang dan Bangun Datar");
        System.out.print("Input Jari-jari: ");
        double r = Double.parseDouble(sc.readLine());
        System.out.print("Input Tinggi: ");
        double t = Double.parseDouble(sc.readLine());
        System.out.print("Input Alas: ");
        double a = Double.parseDouble(sc.readLine());

        rm = new Rumus(r, t, a);
    }

    private static void case2() {
        System.out.println("\n=====Lihat Data Bangun Ruang dan Bangun Datar");
        System.out.println("***Bangun Ruang***");
        System.out.println("Volume Kerucut: " + rm.VolumeKerucut());
        System.out.println("Volume Bola: " + rm.VolumeBola());
        System.out.println("Volume Tabung: " + rm.VolumeTabung());

        System.out.println("\n***Bangun Data***");
        System.out.println("Luas Lingkaran: " + rm.LuasLingkaran());
        System.out.println("Luas Segitiga: " + rm.LuasSegitiga());
    }
}
