package geometri.Benda3D;

import geometri.Benda2D.Segitiga;

public class PrismaSegitiga extends Segitiga {

    private double tinggiPrisma;
    protected double volume;
    protected double luasPermukaanPrismaSegitiga;

    public PrismaSegitiga(double alasSegitiga, double tinggiSegitigaAlas,
                          double sisiA_alas, double sisiB_alas, double sisiC_alas,
                          double tinggiPrisma) {
        super(alasSegitiga, tinggiSegitigaAlas, sisiA_alas, sisiB_alas, sisiC_alas);
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
        double luasAlasSegitiga = super.hitungLuas();
        double kelilingAlasSegitiga = super.hitungKeliling();
        double luasSelubung = kelilingAlasSegitiga * tinggiPrisma;
        luasPermukaanPrismaSegitiga = (2 * luasAlasSegitiga) + luasSelubung;
        return luasPermukaanPrismaSegitiga;
    }

    public double getTinggiPrisma() {
        return tinggiPrisma;
    }
}