package geometri.Benda3D;

import geometri.Benda2D.Persegi;

public class PrismaPersegi extends Persegi {


    protected double volume;
    protected double luasPermukaanPrisma;

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
        if (sisiPersegi <= 0 || tinggiPrisma <= 0) {
            throw new IllegalArgumentException("Sisi alas dan tinggi prisma harus bernilai positif.");
        }
        volume = super.hitungLuas(sisiPersegi) * tinggiPrisma;
        return volume;
    }

    public double hitungLuasPermukaan() {
        luasPermukaanPrisma = 6 * Math.sqrt(super.hitungLuas());
        return luasPermukaanPrisma;
    }

    public double hitungLuasPermukaan(double sisiPersegi) {
        if (sisiPersegi <= 0) {
            throw new IllegalArgumentException("Sisi alas dan tinggi prisma harus bernilai positif.");
        }
        luasPermukaanPrisma = 6 * Math.sqrt(super.hitungLuas(sisiPersegi));
        return luasPermukaanPrisma;
    }

}