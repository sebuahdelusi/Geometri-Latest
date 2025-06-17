package geometri.Benda3D;

import geometri.Benda2D.Persegi;

public class PrismaPersegi extends Persegi {


    private double volume;
    private double luasPermukaanPrisma;

    public PrismaPersegi(double sisiAlas) {
        super(sisiAlas);
    }

    public double hitungVolume() {
        // super.hitungLuas() akan menghitung dan menyimpan luas alas di objek Persegi
        // dan mengembalikannya
        volume = Math.pow(super.hitungLuas(), 2);
        return volume;
    }

    public double hitungVolume(double sisiPersegi, double tinggiPrisma) {
        volume = super.hitungLuas(sisiPersegi) * tinggiPrisma;
        return volume;
    }

    public double hitungLuasPermukaan() {
        luasPermukaanPrisma = 6 * Math.sqrt(super.hitungLuas());
        return luasPermukaanPrisma;
    }

    public double hitungLuasPermukaan(double sisiPersegi) {
        luasPermukaanPrisma = 6 * Math.sqrt(super.hitungLuas(sisiPersegi));
        return luasPermukaanPrisma;
    }

    public double getVolume() {
        return volume;
    }
    public double getLuasPermukaanPrisma() {
        return luasPermukaanPrisma;
    }
}