package geometri.Benda3D;

import geometri.Benda2D.BelahKetupat;

public class PrismaBelahKetupat extends BelahKetupat {

    private double tinggiPrisma;
    private double volume;
    private double luasPermukaanPrismaBK;

    public PrismaBelahKetupat(double diagonal1Alas, double diagonal2Alas, double sisi, double tinggiPrisma) {
        super(diagonal1Alas, diagonal2Alas, sisi);
        this.tinggiPrisma = tinggiPrisma;
    }

    public double hitungVolume() {
        volume = super.hitungLuas() * tinggiPrisma;
        return volume;
    }

    public double hitungVolume(double diagonal1Alas, double diagonal2Alas,double tinggiPrisma) {
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

    public double getVolume() {
        return volume;
    }
    public double getLuasPermukaanPrismaBK(){

        return luasPermukaanPrismaBK;
    }
}