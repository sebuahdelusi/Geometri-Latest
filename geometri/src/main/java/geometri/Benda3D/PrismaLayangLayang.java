package geometri.Benda3D;

import geometri.Benda2D.LayangLayang;

public class PrismaLayangLayang extends LayangLayang {

    // Dimensi dan hasil kalkulasi dibuat public agar konsisten
    private double tinggiPrisma;
    private double volume;
    private double luasPermukaan;

    public PrismaLayangLayang(double diagonal1Alas, double diagonal2Alas, double sisiPendekAlas,
                              double sisiPanjangAlas, double tinggiPrisma) throws IllegalArgumentException {
        super(diagonal1Alas, diagonal2Alas, sisiPendekAlas, sisiPanjangAlas);
        if (tinggiPrisma <= 0 || diagonal1Alas <= 0 || diagonal2Alas <= 0 || sisiPendekAlas <= 0 || sisiPanjangAlas <= 0) {
            throw new IllegalArgumentException("Tinggi prisma harus bernilai positif.");
        }
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