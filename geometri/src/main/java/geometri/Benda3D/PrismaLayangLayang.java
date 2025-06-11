package geometri.Benda3D;

import geometri.Benda2D.LayangLayang;

public class PrismaLayangLayang extends LayangLayang {

    private double tinggiPrisma;
    protected double volume;
    protected double luasPermukaanPrismaLL;

    public PrismaLayangLayang(double diagonal1Alas, double diagonal2Alas,
                              double sisiPendekAlas, double sisiPanjangAlas,
                              double tinggiPrisma) {
        super(diagonal1Alas, diagonal2Alas, sisiPendekAlas, sisiPanjangAlas);
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
        double luasAlasLL = super.hitungLuas();
        double kelilingAlasLL = super.hitungKeliling();
        double luasSelubung = kelilingAlasLL * tinggiPrisma;
        luasPermukaanPrismaLL = (2 * luasAlasLL) + luasSelubung;
        return luasPermukaanPrismaLL;
    }

    public double getTinggiPrisma() {
        return tinggiPrisma;
    }
}