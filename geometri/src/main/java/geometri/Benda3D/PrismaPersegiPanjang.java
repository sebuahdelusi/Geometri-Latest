package geometri.Benda3D;

import geometri.Benda2D.PersegiPanjang;

public class PrismaPersegiPanjang extends PersegiPanjang {

    private double tinggiPrisma;
    protected double volume;
    protected double luasPermukaanPrismaPP; // Nama spesifik untuk menghindari konflik

    public PrismaPersegiPanjang(double panjangAlas, double lebarAlas, double tinggiPrisma) {
        super(panjangAlas, lebarAlas);
        if (tinggiPrisma <= 0) {
            throw new IllegalArgumentException("Tinggi prisma harus bernilai positif.");
        }
        this.tinggiPrisma = tinggiPrisma;
    }

    public double hitungVolume() {
        volume = super.hitungLuas() * tinggiPrisma;
        return volume;
    }

    public double hitungLuasPermukaan() {
        double luasAlasBalok = super.hitungLuas();
        double kelilingAlasBalok = super.hitungKeliling();
        double luasSelubung = kelilingAlasBalok * tinggiPrisma;
        luasPermukaanPrismaPP = (2 * luasAlasBalok) + luasSelubung;
        return luasPermukaanPrismaPP;
    }

    public double getTinggiPrisma() {
        return tinggiPrisma;
    }
}