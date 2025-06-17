package geometri.Benda3D;

import geometri.Benda2D.JajarGenjang;

/**
 * Merepresentasikan bangun ruang Prisma dengan alas Jajar Genjang.
 */
public class PrismaJajarGenjang extends JajarGenjang {

    // Dimensi dan hasil kalkulasi dibuat public agar konsisten
    public double tinggiPrisma;
    public double volume;
    public double luasPermukaan;

    public PrismaJajarGenjang(double alasAlas, double tinggiAlas, double sisiMiringAlas, double tinggiPrisma) {
        super(alasAlas, tinggiAlas, sisiMiringAlas);
        if (tinggiPrisma <= 0) {
            throw new IllegalArgumentException("Tinggi prisma harus bernilai positif.");
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
        double luasAlasJG = super.hitungLuas();
        double kelilingAlasJG = super.hitungKeliling();
        double luasSelubung = kelilingAlasJG * this.tinggiPrisma;
        this.luasPermukaan = (2 * luasAlasJG) + luasSelubung;
        return this.luasPermukaan;
    }

    // --- METODE OVERLOAD BARU (SESUAI KONSEP KELAS INDUK) ---

    public double hitungVolume(double alasAlas, double tinggiAlas, double tinggiPrisma) {
        if (alasAlas <= 0 || tinggiAlas <= 0 || tinggiPrisma <= 0) {
            throw new IllegalArgumentException("Dimensi untuk volume harus positif.");
        }
        double luasAlas = alasAlas * tinggiAlas;
        this.volume = luasAlas * tinggiPrisma;
        return this.volume;
    }

    public double hitungLuasPermukaan(double alasAlas, double tinggiAlas, double sisiMiringAlas, double tinggiPrisma) {
        if (alasAlas <= 0 || tinggiAlas <= 0 || sisiMiringAlas <= 0 || tinggiPrisma <= 0) {
            throw new IllegalArgumentException("Dimensi untuk luas permukaan harus positif.");
        }
        double luasAlas = alasAlas * tinggiAlas;
        double kelilingAlas = 2 * (alasAlas + sisiMiringAlas);
        double luasSelubung = kelilingAlas * tinggiPrisma;
        this.luasPermukaan = (2 * luasAlas) + luasSelubung;
        return this.luasPermukaan;
    }
}