package geometri.Benda3D;

import geometri.Benda2D.JajarGenjang;

public class LimasJajarGenjang extends JajarGenjang {

    private double tinggiLimas;
    protected double volume;
    // Untuk metode dengan parameter, kita bisa menyimpan hasil pemanggilan terakhir
    protected double luasSelubungDenganParameter;
    protected double luasPermukaanDenganParameter;

    public LimasJajarGenjang(double alasJajarGenjangAlas, double tinggiJajarGenjangAlas,
                             double sisiMiringJajarGenjangAlas, double tinggiLimas) {
        super(alasJajarGenjangAlas, tinggiJajarGenjangAlas, sisiMiringJajarGenjangAlas);
        if (tinggiLimas <= 0) {
            throw new IllegalArgumentException("Tinggi limas harus bernilai positif.");
        }
        this.tinggiLimas = tinggiLimas;
    }

    public double hitungVolume() {
        volume = (1.0 / 3.0) * super.hitungLuas() * tinggiLimas;
        return volume;
    }

    public double hitungLuasSelubung(double tsAlas, double tsSisiMiring) {
        if (tsAlas <=0 || tsSisiMiring <=0) {
            throw new IllegalArgumentException("Tinggi sisi tegak harus positif.");
        }
        double luasTegak1 = 2 * (0.5 * getAlas() * tsAlas);
        double luasTegak2 = 2 * (0.5 * getSisiMiring() * tsSisiMiring);
        luasSelubungDenganParameter = luasTegak1 + luasTegak2;
        return luasSelubungDenganParameter;
    }

    public double hitungLuasPermukaan(double tsAlas, double tsSisiMiring) {
        double luasAlasLimas = super.hitungLuas();
        // hitungLuasSelubung akan menyimpan hasilnya ke luasSelubungDenganParameter
        double luasSelubungHitung = hitungLuasSelubung(tsAlas, tsSisiMiring);
        luasPermukaanDenganParameter = luasAlasLimas + luasSelubungHitung;
        return luasPermukaanDenganParameter;
    }

    public double hitungLuasPermukaan() {
        System.err.println("PERINGATAN: hitungLuasPermukaan() untuk LimasJajarGenjang umum dipanggil tanpa parameter tinggi sisi tegak. " +
                "Hasil mungkin tidak akurat (hanya luas alas).");
        return super.hitungLuas();
    }

    public double getTinggiLimas() {
        return tinggiLimas;
    }
}