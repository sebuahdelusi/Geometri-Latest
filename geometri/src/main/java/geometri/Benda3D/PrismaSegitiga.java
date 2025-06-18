package geometri.Benda3D;

import geometri.Benda2D.Segitiga;

/**
 * Merepresentasikan bangun ruang Prisma dengan alas berbentuk Segitiga.
 */
public class PrismaSegitiga extends Segitiga {

    // Dimensi dan hasil kalkulasi dibuat public agar konsisten
    private double tinggiPrisma;
    private double volume;
    private double luasPermukaan;

    public PrismaSegitiga(double alasSegitiga, double tinggiSegitigaAlas,
                          double sisiA_alas, double sisiB_alas, double sisiC_alas,
                          double tinggiPrisma) throws IllegalArgumentException {
        super(alasSegitiga, tinggiSegitigaAlas, sisiA_alas, sisiB_alas, sisiC_alas);
        if (tinggiPrisma <= 0) {
            throw new IllegalArgumentException("Tinggi prisma harus lebih besar dari nol.");
        }
        this.tinggiPrisma = tinggiPrisma;
    }

    /**
     * Menghitung volume prisma berdasarkan state objek.
     * V = Luas Alas * Tinggi Prisma
     */
    public double hitungVolume() {
        this.volume = super.hitungLuas() * this.tinggiPrisma;
        return this.volume;
    }

    /**
     * Menghitung luas permukaan prisma berdasarkan state objek.
     * L = (2 * Luas Alas) + (Keliling Alas * Tinggi Prisma)
     */
    public double hitungLuasPermukaan() {
        double luasAlasSegitiga = super.hitungLuas();
        double kelilingAlasSegitiga = super.hitungKeliling();
        double luasSelubung = kelilingAlasSegitiga * this.tinggiPrisma;
        this.luasPermukaan = (2 * luasAlasSegitiga) + luasSelubung;
        return this.luasPermukaan;
    }

    // --- METODE OVERLOAD BARU (SESUAI KONSEP KELAS INDUK) ---

    public double hitungVolume(double alasAlas, double tinggiAlas, double tinggiPrisma) {
        double luasAlas = 0.5 * alasAlas * tinggiAlas;
        this.volume = luasAlas * tinggiPrisma;
        return this.volume;
    }

    public double hitungLuasPermukaan(double alasAlas, double tinggiAlas, double sisiA,
                                      double sisiB, double sisiC, double tinggiPrisma) {
        double luasAlas = 0.5 * alasAlas * tinggiAlas;
        double kelilingAlas = sisiA + sisiB + sisiC;
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