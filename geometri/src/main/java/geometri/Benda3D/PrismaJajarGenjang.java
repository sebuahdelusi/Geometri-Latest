package geometri.Benda3D;

import geometri.Benda2D.JajarGenjang;

public class PrismaJajarGenjang extends JajarGenjang {

    private double tinggiPrisma;
    protected double volume;
    protected double luasPermukaanPrismaJG;

    public PrismaJajarGenjang(double alasJajarGenjang, double tinggiJajarGenjangAlas,
                              double sisiMiringJajarGenjang, double tinggiPrisma) {
        super(alasJajarGenjang, tinggiJajarGenjangAlas, sisiMiringJajarGenjang);
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
        double luasAlasJG = super.hitungLuas();
        double kelilingAlasJG = super.hitungKeliling();
        double luasSelubung = kelilingAlasJG * tinggiPrisma;
        luasPermukaanPrismaJG = (2 * luasAlasJG) + luasSelubung;
        return luasPermukaanPrismaJG;
    }

    public double getTinggiPrisma() {
        return tinggiPrisma;
    }
}