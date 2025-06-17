package geometri.Benda3D;

import geometri.Benda2D.LayangLayang;

/**
 * Merepresentasikan bangun ruang Prisma dengan alas Layang-Layang.
 */
public class PrismaLayangLayang extends LayangLayang {

    // Dimensi dan hasil kalkulasi dibuat public agar konsisten
    public double tinggiPrisma;
    public double volume;
    public double luasPermukaan;

    public PrismaLayangLayang(double diagonal1Alas, double diagonal2Alas, double sisiPendekAlas,
                              double sisiPanjangAlas, double tinggiPrisma) {
        super(diagonal1Alas, diagonal2Alas, sisiPendekAlas, sisiPanjangAlas);
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
        double luasAlasLL = super.hitungLuas();
        double kelilingAlasLL = super.hitungKeliling();
        double luasSelubung = kelilingAlasLL * this.tinggiPrisma;
        this.luasPermukaan = (2 * luasAlasLL) + luasSelubung;
        return this.luasPermukaan;
    }

    // --- METODE OVERLOAD BARU (SESUAI KONSEP KELAS INDUK) ---

    public double hitungVolume(double diagonal1Alas, double diagonal2Alas, double tinggiPrisma) {
        if (diagonal1Alas <= 0 || diagonal2Alas <= 0 || tinggiPrisma <= 0) {
            throw new IllegalArgumentException("Dimensi untuk volume harus positif.");
        }
        double luasAlas = 0.5 * diagonal1Alas * diagonal2Alas;
        this.volume = luasAlas * tinggiPrisma;
        return this.volume;
    }

    public double hitungLuasPermukaan(double diagonal1Alas, double diagonal2Alas, double sisiPendekAlas,
                                      double sisiPanjangAlas, double tinggiPrisma) {
        if (diagonal1Alas <= 0 || diagonal2Alas <= 0 || sisiPendekAlas <= 0 || sisiPanjangAlas <= 0 || tinggiPrisma <= 0) {
            throw new IllegalArgumentException("Dimensi untuk luas permukaan harus positif.");
        }
        double luasAlas = 0.5 * diagonal1Alas * diagonal2Alas;
        double kelilingAlas = 2 * (sisiPendekAlas + sisiPanjangAlas);
        double luasSelubung = kelilingAlas * tinggiPrisma;
        this.luasPermukaan = (2 * luasAlas) + luasSelubung;
        return this.luasPermukaan;
    }
}