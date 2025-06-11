package geometri.Benda3D;

import geometri.Benda2D.Persegi;

public class PrismaPersegi extends Persegi {

    private double tinggiPrisma;
    protected double volume;
    protected double luasPermukaanPrisma;

    public PrismaPersegi(double sisiAlas, double tinggiPrisma) {
        super(sisiAlas);
        if (tinggiPrisma <= 0) {
            throw new IllegalArgumentException("Tinggi prisma harus bernilai positif.");
        }
        this.tinggiPrisma = tinggiPrisma;
    }

    public double hitungVolume() {
        // super.hitungLuas() akan menghitung dan menyimpan luas alas di objek Persegi
        // dan mengembalikannya
        volume = super.hitungLuas() * tinggiPrisma;
        return volume;
    }

    public double hitungLuasPermukaan() {
        double luasAlasPrisma = super.hitungLuas();
        double kelilingAlasPrisma = super.hitungKeliling();
        double luasSelubung = kelilingAlasPrisma * tinggiPrisma;
        luasPermukaanPrisma = (2 * luasAlasPrisma) + luasSelubung;
        return luasPermukaanPrisma;
    }

    public double getTinggiPrisma() {
        return tinggiPrisma;
    }
}