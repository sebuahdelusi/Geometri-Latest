package geometri.Benda3D;

import geometri.Benda2D.PersegiPanjang;

/**
 * Merepresentasikan bangun ruang Prisma dengan alas Persegi Panjang (Balok).
 */
public class PrismaPersegiPanjang extends PersegiPanjang {

    // Dimensi dan hasil kalkulasi dibuat public agar konsisten
    public double tinggiPrisma;
    public double volume;
    public double luasPermukaan;

    public PrismaPersegiPanjang(double panjangAlas, double lebarAlas, double tinggiPrisma) {
        super(panjangAlas, lebarAlas);
        if (tinggiPrisma <= 0) {
            throw new IllegalArgumentException("Tinggi prisma harus bernilai positif.");
        }
        this.tinggiPrisma = tinggiPrisma;
    }

    /**
     * Menghitung volume prisma (balok) berdasarkan state objek.
     * V = Panjang * Lebar * Tinggi
     */
    public double hitungVolume() {
        this.volume = super.hitungLuas() * this.tinggiPrisma;
        return this.volume;
    }

    /**
     * Menghitung luas permukaan prisma (balok) berdasarkan state objek.
     * L = 2 * (pl + pt + lt)
     */
    public double hitungLuasPermukaan() {
        double luasAlasBalok = super.hitungLuas();
        double kelilingAlasBalok = super.hitungKeliling();
        double luasSelubung = kelilingAlasBalok * this.tinggiPrisma;
        this.luasPermukaan = (2 * luasAlasBalok) + luasSelubung;
        return this.luasPermukaan;
    }

    // --- METODE OVERLOAD BARU (SESUAI KONSEP KELAS INDUK) ---

    public double hitungVolume(double panjang, double lebar, double tinggiPrisma) {
        if (panjang <= 0 || lebar <= 0 || tinggiPrisma <= 0) {
            throw new IllegalArgumentException("Dimensi untuk volume harus positif.");
        }
        this.volume = panjang * lebar * tinggiPrisma;
        return this.volume;
    }

    public double hitungLuasPermukaan(double panjang, double lebar, double tinggiPrisma) {
        if (panjang <= 0 || lebar <= 0 || tinggiPrisma <= 0) {
            throw new IllegalArgumentException("Dimensi untuk luas permukaan harus positif.");
        }
        this.luasPermukaan = 2 * ((panjang * lebar) + (panjang * tinggiPrisma) + (lebar * tinggiPrisma));
        return this.luasPermukaan;
    }
}