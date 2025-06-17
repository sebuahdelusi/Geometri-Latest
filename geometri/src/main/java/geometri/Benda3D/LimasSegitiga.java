package geometri.Benda3D;

import geometri.Benda2D.Segitiga;

/**
 * Merepresentasikan bangun ruang Limas dengan alas berbentuk Segitiga.
 */
public class LimasSegitiga extends Segitiga {

    // Dimensi dan hasil kalkulasi dibuat public agar konsisten
    private double tinggiLimas;
    private double tinggiSisiTegakA; // Tinggi sisi tegak pada sisiA
    private double tinggiSisiTegakB; // Tinggi sisi tegak pada sisiB
    private double tinggiSisiTegakC; // Tinggi sisi tegak pada sisiC

    private double volume;
    private double luasSelubung;
    private double luasPermukaan;

    /**
     * Konstruktor lengkap untuk kalkulasi volume dan luas permukaan.
     */
    public LimasSegitiga(double alasSegitigaAlas, double tinggiSegitigaAlas, double sisiA_alas,
                         double sisiB_alas, double sisiC_alas, double tinggiLimas,
                         double tinggiSisiTegakA, double tinggiSisiTegakB, double tinggiSisiTegakC) {
        super(alasSegitigaAlas, tinggiSegitigaAlas, sisiA_alas, sisiB_alas, sisiC_alas);
        this.tinggiLimas = tinggiLimas;
        this.tinggiSisiTegakA = tinggiSisiTegakA;
        this.tinggiSisiTegakB = tinggiSisiTegakB;
        this.tinggiSisiTegakC = tinggiSisiTegakC;
    }

    /**
     * Menghitung volume limas berdasarkan state objek.
     */
    public double hitungVolume() {
        this.volume = (1.0 / 3.0) * super.hitungLuas() * this.tinggiLimas;
        return this.volume;
    }

    /**
     * Menghitung luas selubung limas berdasarkan state objek.
     */
    public double hitungLuasSelubung() {
        // Menggunakan field public secara langsung
        double luasTegakA = 0.5 * this.sisiA * this.tinggiSisiTegakA;
        double luasTegakB = 0.5 * this.sisiB * this.tinggiSisiTegakB;
        double luasTegakC = 0.5 * this.sisiC * this.tinggiSisiTegakC;
        this.luasSelubung = luasTegakA + luasTegakB + luasTegakC;
        return this.luasSelubung;
    }

    /**
     * Menghitung luas permukaan total limas berdasarkan state objek.
     */
    public double hitungLuasPermukaan() {
        double luasAlasLimas = super.hitungLuas();
        double luasSelubungLimas = this.hitungLuasSelubung();
        this.luasPermukaan = luasAlasLimas + luasSelubungLimas;
        return this.luasPermukaan;
    }

    // --- METODE OVERLOAD BARU (SESUAI KONSEP KELAS INDUK) ---

    public double hitungVolume(double alasSegitigaAlas, double tinggiSegitigaAlas, double tinggiLimas) {
        double luasAlas = 0.5 * alasSegitigaAlas * tinggiSegitigaAlas;
        this.volume = (1.0 / 3.0) * luasAlas * tinggiLimas;
        return this.volume;
    }

    public double hitungLuasPermukaan(double alasSegitigaAlas, double tinggiSegitigaAlas, double sisiA_alas,
                                      double sisiB_alas, double sisiC_alas, double tinggiSisiTegakA,
                                      double tinggiSisiTegakB, double tinggiSisiTegakC) {
        // Validasi bisa ditambahkan di sini sesuai kebutuhan
        double luasAlas = 0.5 * alasSegitigaAlas * tinggiSegitigaAlas;
        double luasTegakA = 0.5 * sisiA_alas * tinggiSisiTegakA;
        double luasTegakB = 0.5 * sisiB_alas * tinggiSisiTegakB;
        double luasTegakC = 0.5 * sisiC_alas * tinggiSisiTegakC;

        this.luasPermukaan = luasAlas + luasTegakA + luasTegakB + luasTegakC;
        return this.luasPermukaan;
    }

    public double getTinggiLimas() {
        return tinggiLimas;
    }
    public double getVolume() {
        return volume;
    }
    public double getLuasPermukaan() {
        return luasPermukaan;
    }
}