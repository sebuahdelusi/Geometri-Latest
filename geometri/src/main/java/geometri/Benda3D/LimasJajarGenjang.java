package geometri.Benda3D;

import geometri.Benda2D.JajarGenjang;

/**
 * Merepresentasikan bangun ruang Limas dengan alas Jajar Genjang.
 */
public class LimasJajarGenjang extends JajarGenjang {

    // Dimensi dan hasil kalkulasi dibuat public agar konsisten
    private double tinggiLimas;
    private double tinggiSisiTegakAlas;     // Tinggi sisi tegak pada alas
    private double tinggiSisiTegakMiring;  // Tinggi sisi tegak pada sisi miring

    private double volume;
    private double luasSelubung;
    private double luasPermukaan;

    /**
     * Konstruktor lengkap untuk kalkulasi volume dan luas permukaan.
     */
    public LimasJajarGenjang(double alasAlas, double tinggiAlas, double sisiMiringAlas,
                             double tinggiLimas, double tinggiSisiTegakAlas, double tinggiSisiTegakMiring) {
        super(alasAlas, tinggiAlas, sisiMiringAlas);
        if (tinggiLimas <= 0 || tinggiSisiTegakAlas <= 0 || tinggiSisiTegakMiring <= 0) {
            throw new IllegalArgumentException("Tinggi limas dan tinggi sisi tegak harus bernilai positif.");
        }
        this.tinggiLimas = tinggiLimas;
        this.tinggiSisiTegakAlas = tinggiSisiTegakAlas;
        this.tinggiSisiTegakMiring = tinggiSisiTegakMiring;
    }

    /**
     * Menghitung volume limas berdasarkan state objek.
     */
    public double hitungVolume() {
        // Memanggil hitungLuas() dari superclass untuk mendapatkan luas alas
        this.volume = (1.0 / 3.0) * super.hitungLuas() * this.tinggiLimas;
        return this.volume;
    }

    /**
     * Menghitung luas selubung limas berdasarkan state objek.
     */
    public double hitungLuasSelubung() {
        double luasTegakPadaAlas = 2 * (0.5 * this.alas * this.tinggiSisiTegakAlas);
        double luasTegakPadaSisiMiring = 2 * (0.5 * this.sisiMiring * this.tinggiSisiTegakMiring);
        this.luasSelubung = luasTegakPadaAlas + luasTegakPadaSisiMiring;
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

    public double hitungVolume(double alasAlas, double tinggiAlas, double tinggiLimas) {
        double luasAlas = alasAlas * tinggiAlas;
        this.volume = (1.0 / 3.0) * luasAlas * tinggiLimas;
        return this.volume;
    }

    public double hitungLuasPermukaan(double alasAlas, double tinggiAlas, double sisiMiringAlas,
                                      double tinggiSisiTegakAlas, double tinggiSisiTegakMiring) {
        double luasAlas = alasAlas * tinggiAlas;
        double luasTegakPadaAlas = alasAlas * tinggiSisiTegakAlas; // 2 * (0.5 * alas * tsAlas)
        double luasTegakPadaSisiMiring = sisiMiringAlas * tinggiSisiTegakMiring; // 2 * (0.5 * sisiMiring * tsSisiMiring)

        this.luasPermukaan = luasAlas + luasTegakPadaAlas + luasTegakPadaSisiMiring;
        return this.luasPermukaan;
    }

    public double getTinggiLimas() {
        return tinggiLimas;
    }
    public double getVolume() {
        return volume;
    }
    public double getLuasPermukaan(){
        return luasPermukaan;
    }
}