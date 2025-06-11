package geometri.Benda3D;

import geometri.Benda2D.Trapesium;

public class LimasTrapesium extends Trapesium {

    private double tinggiLimas;
    protected double volume;
    protected double luasSelubungDenganParameter;
    protected double luasPermukaanDenganParameter;

    public LimasTrapesium(double sisiAtasAlas, double sisiBawahAlas, double tinggiAlasTrapesium,
                          double sisiKiriAlas, double sisiKananAlas, double tinggiLimas) {
        super(sisiAtasAlas, sisiBawahAlas, tinggiAlasTrapesium, sisiKiriAlas, sisiKananAlas);
        if (tinggiLimas <= 0) {
            throw new IllegalArgumentException("Tinggi limas harus bernilai positif.");
        }
        this.tinggiLimas = tinggiLimas;
    }

    public double hitungVolume() {
        volume = (1.0 / 3.0) * super.hitungLuas() * tinggiLimas;
        return volume;
    }

    public double hitungLuasSelubung(double tsSisiAtas, double tsSisiBawah, double tsSisiKiri, double tsSisiKanan) {
        if (tsSisiAtas <=0 || tsSisiBawah <=0 || tsSisiKiri <=0 || tsSisiKanan <=0) {
            throw new IllegalArgumentException("Tinggi sisi tegak harus positif.");
        }
        double luasTegakAtas = 0.5 * getSisiAtas() * tsSisiAtas;
        double luasTegakBawah = 0.5 * getSisiBawah() * tsSisiBawah;
        double luasTegakKiri = 0.5 * getSisiKiri() * tsSisiKiri;
        double luasTegakKanan = 0.5 * getSisiKanan() * tsSisiKanan;
        luasSelubungDenganParameter = luasTegakAtas + luasTegakBawah + luasTegakKiri + luasTegakKanan;
        return luasSelubungDenganParameter;
    }

    public double hitungLuasPermukaan(double tsSisiAtas, double tsSisiBawah, double tsSisiKiri, double tsSisiKanan) {
        double luasAlasLimas = super.hitungLuas();
        double luasSelubungHitung = hitungLuasSelubung(tsSisiAtas, tsSisiBawah, tsSisiKiri, tsSisiKanan);
        luasPermukaanDenganParameter = luasAlasLimas + luasSelubungHitung;
        return luasPermukaanDenganParameter;
    }

    public double hitungLuasPermukaan() {
        System.err.println("PERINGATAN: hitungLuasPermukaan() untuk LimasTrapesium umum dipanggil tanpa parameter tinggi sisi tegak. " +
                "Hasil mungkin tidak akurat (hanya luas alas).");
        return super.hitungLuas();
    }

    public double getTinggiLimas() {
        return tinggiLimas;
    }
}