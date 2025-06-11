package geometri.Benda3D;

import geometri.Benda2D.Segitiga;

public class LimasSegitiga extends Segitiga {

    private double tinggiLimas;
    protected double volume;
    // luasPermukaanLimasSegitiga dan luasSelubungLimasSegitiga akan terkait dengan versi parameter
    protected double luasPermukaanLimasSegitigaDenganParameter;
    protected double luasSelubungLimasSegitigaDenganParameter;


    public LimasSegitiga(double alasSegitigaAlas, double tinggiSegitigaAlas,
                         double sisiA_alas, double sisiB_alas, double sisiC_alas,
                         double tinggiLimas) {
        super(alasSegitigaAlas, tinggiSegitigaAlas, sisiA_alas, sisiB_alas, sisiC_alas);
        if (tinggiLimas <= 0) {
            throw new IllegalArgumentException("Tinggi limas harus bernilai positif.");
        }
        this.tinggiLimas = tinggiLimas;
    }

    public double hitungVolume() {
        volume = (1.0 / 3.0) * super.hitungLuas() * tinggiLimas;
        return volume;
    }

    // Metode ini bergantung pada parameter, jadi hasil disimpan dengan nama spesifik
    public double hitungLuasSelubung(double tinggiSisiTegakA, double tinggiSisiTegakB, double tinggiSisiTegakC) {
        if (tinggiSisiTegakA <= 0 || tinggiSisiTegakB <= 0 || tinggiSisiTegakC <= 0) {
            throw new IllegalArgumentException("Tinggi sisi tegak harus positif.");
        }
        double luasTegakA = 0.5 * getSisiA() * tinggiSisiTegakA;
        double luasTegakB = 0.5 * getSisiB() * tinggiSisiTegakB;
        double luasTegakC = 0.5 * getSisiC() * tinggiSisiTegakC;
        luasSelubungLimasSegitigaDenganParameter = luasTegakA + luasTegakB + luasTegakC;
        return luasSelubungLimasSegitigaDenganParameter;
    }

    public double hitungLuasPermukaan(double tinggiSisiTegakA, double tinggiSisiTegakB, double tinggiSisiTegakC) {
        double luasAlasLimas = super.hitungLuas();
        // hitungLuasSelubung akan menyimpan hasilnya ke luasSelubungLimasSegitigaDenganParameter
        double luasSelubungHitung = hitungLuasSelubung(tinggiSisiTegakA, tinggiSisiTegakB, tinggiSisiTegakC);
        luasPermukaanLimasSegitigaDenganParameter = luasAlasLimas + luasSelubungHitung;
        return luasPermukaanLimasSegitigaDenganParameter;
    }

    // Versi tanpa parameter, tidak ideal untuk limas umum
    public double hitungLuasPermukaan() {
        System.err.println("PERINGATAN: hitungLuasPermukaan() untuk LimasSegitiga umum dipanggil tanpa parameter tinggi sisi tegak. " +
                "Hasil mungkin tidak akurat (hanya luas alas).");
        // Tidak ada field luasPermukaanLimasSegitiga yang umum tanpa parameter
        return super.hitungLuas();
    }

    public double getTinggiLimas() {
        return tinggiLimas;
    }
}