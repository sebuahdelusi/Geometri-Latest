package geometri.Benda3D;

import geometri.Benda2D.BelahKetupat;

public class PrismaBelahKetupat extends BelahKetupat {

    private double tinggiPrisma;
    protected double volume;
    protected double luasPermukaanPrismaBK;

    public PrismaBelahKetupat(double diagonal1Alas, double diagonal2Alas, double sisiAlas, double tinggiPrisma) {
        super(diagonal1Alas, diagonal2Alas, sisiAlas);
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
        double luasAlasBK = super.hitungLuas();
        double kelilingAlasBK = super.hitungKeliling();
        double luasSelubung = kelilingAlasBK * tinggiPrisma;
        luasPermukaanPrismaBK = (2 * luasAlasBK) + luasSelubung;
        return luasPermukaanPrismaBK;
    }

    public double getTinggiPrisma() {
        return tinggiPrisma;
    }
}