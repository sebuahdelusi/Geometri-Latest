package geometri.Benda3D;

import geometri.Benda2D.LayangLayang;

/**
 * Merepresentasikan bangun ruang Prisma dengan alas Layang-Layang.
 */
public class PrismaLayangLayang extends LayangLayang {

    // Dimensi dan hasil kalkulasi dibuat public agar konsisten
    private double tinggiPrisma;
    private double volume;
    private double luasPermukaan;

    public PrismaLayangLayang(double diagonal1Alas, double diagonal2Alas, double sisiPendekAlas,
                              double sisiPanjangAlas, double tinggiPrisma) {
        super(diagonal1Alas, diagonal2Alas, sisiPendekAlas, sisiPanjangAlas);
        this.tinggiPrisma = tinggiPrisma;
    }

    public double hitungVolume() {
        this.volume = super.hitungLuas() * this.tinggiPrisma;
        return this.volume;
    }

    public double hitungLuasPermukaan() {
        double luasAlasLL = super.hitungLuas();
        double kelilingAlasLL = super.hitungKeliling();
        double luasSelubung = kelilingAlasLL * this.tinggiPrisma;
        this.luasPermukaan = (2 * luasAlasLL) + luasSelubung;
        return this.luasPermukaan;
    }

    public double hitungVolume(double diagonal1Alas, double diagonal2Alas, double tinggiPrisma) {
        double luasAlas = 0.5 * diagonal1Alas * diagonal2Alas;
        this.volume = luasAlas * tinggiPrisma;
        return this.volume;
    }

    public double hitungLuasPermukaan(double diagonal1Alas, double diagonal2Alas, double sisiPendekAlas,
                                      double sisiPanjangAlas, double tinggiPrisma) {
        double luasAlas = 0.5 * diagonal1Alas * diagonal2Alas;
        double kelilingAlas = 2 * (sisiPendekAlas + sisiPanjangAlas);
        double luasSelubung = kelilingAlas * tinggiPrisma;
        this.luasPermukaan = (2 * luasAlas) + luasSelubung;
        return this.luasPermukaan;
    }

    public double getTinggiPrisma() {
        return tinggiPrisma;
    }
    public double getVolume() {
        return volume;
    }
    public double getLuasPermukaan() {
        return luasPermukaan;
    }
}