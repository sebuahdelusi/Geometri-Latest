package geometri.Benda3D;

import geometri.Benda2D.BelahKetupat;

public class PrismaBelahKetupat extends BelahKetupat {

    private double tinggiPrisma;
    protected double volume;
    protected double luasPermukaanPrismaBK;

    public PrismaBelahKetupat(double diagonal1Alas, double diagonal2Alas, double sisi, double tinggiPrisma) {
        super(diagonal1Alas, diagonal2Alas, sisi);
        if (tinggiPrisma <= 0) {
            throw new IllegalArgumentException("Tinggi prisma harus bernilai positif.");
        }
        this.tinggiPrisma = tinggiPrisma;
    }

    public double hitungVolume() {
        volume = super.hitungLuas() * tinggiPrisma;
        return volume;
    }

    public double hitungVolume(double diagonal1Alas, double diagonal2Alas,double tinggiPrisma) {
        if (diagonal1Alas <= 0 || diagonal2Alas <= 0 || tinggiPrisma <= 0) {
            throw new IllegalArgumentException("Diagonal alas, dan tinggi prisma harus bernilai positif.");
        }
        volume = super.hitungLuas(diagonal1Alas, diagonal2Alas) * tinggiPrisma;
        return volume;
    }

    public double hitungLuasPermukaan() {
        luasPermukaanPrismaBK = (2 * super.hitungLuas()) + (super.hitungKeliling() * tinggiPrisma);
        return luasPermukaanPrismaBK;
    }

    public double getTinggiPrisma() {
        return tinggiPrisma;
    }
}