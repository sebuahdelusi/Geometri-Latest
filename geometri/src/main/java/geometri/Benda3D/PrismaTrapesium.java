package geometri.Benda3D;

import geometri.Benda2D.Trapesium;

public class PrismaTrapesium extends Trapesium {

    private double tinggiPrisma;
    protected double volume;
    protected double luasPermukaanPrismaTrapesium;

    public PrismaTrapesium(double sisiAtasAlas, double sisiBawahAlas, double tinggiAlasTrapesium,
                           double sisiKiriAlas, double sisiKananAlas, double tinggiPrisma) {
        super(sisiAtasAlas, sisiBawahAlas, tinggiAlasTrapesium, sisiKiriAlas, sisiKananAlas);
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
        double luasAlasTrapesium = super.hitungLuas();
        double kelilingAlasTrapesium = super.hitungKeliling();
        double luasSelubung = kelilingAlasTrapesium * tinggiPrisma;
        luasPermukaanPrismaTrapesium = (2 * luasAlasTrapesium) + luasSelubung;
        return luasPermukaanPrismaTrapesium;
    }

    public double getTinggiPrisma() {
        return tinggiPrisma;
    }
}