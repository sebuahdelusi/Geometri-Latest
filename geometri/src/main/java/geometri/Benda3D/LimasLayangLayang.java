package geometri.Benda3D;

import geometri.Benda2D.LayangLayang;

public class LimasLayangLayang extends LayangLayang {

    private double tinggiLimas;
    protected double volume;
    protected double luasSelubungDenganParameter;
    protected double luasPermukaanDenganParameter;

    public LimasLayangLayang(double d1Alas, double d2Alas, double sisiPendekAlas,
                             double sisiPanjangAlas, double tinggiLimas) {
        super(d1Alas, d2Alas, sisiPendekAlas, sisiPanjangAlas);
        if (tinggiLimas <= 0) {
            throw new IllegalArgumentException("Tinggi limas harus bernilai positif.");
        }
        this.tinggiLimas = tinggiLimas;
    }

    public double hitungVolume() {
        volume = (1.0 / 3.0) * super.hitungLuas() * tinggiLimas;
        return volume;
    }

    public double hitungLuasSelubung(double tsSisiPendek, double tsSisiPanjang) {
        if (tsSisiPendek <=0 || tsSisiPanjang <=0) {
            throw new IllegalArgumentException("Tinggi sisi tegak harus positif.");
        }
        double luasTegakPendek = 2 * (0.5 * getSisiPendek() * tsSisiPendek);
        double luasTegakPanjang = 2 * (0.5 * getSisiPanjang() * tsSisiPanjang);
        luasSelubungDenganParameter = luasTegakPendek + luasTegakPanjang;
        return luasSelubungDenganParameter;
    }

    public double hitungLuasPermukaan(double tsSisiPendek, double tsSisiPanjang) {
        double luasAlasLimas = super.hitungLuas();
        double luasSelubungHitung = hitungLuasSelubung(tsSisiPendek, tsSisiPanjang);
        luasPermukaanDenganParameter = luasAlasLimas + luasSelubungHitung;
        return luasPermukaanDenganParameter;
    }

    public double hitungLuasPermukaan() {
        System.err.println("PERINGATAN: hitungLuasPermukaan() untuk LimasLayangLayang umum dipanggil tanpa parameter tinggi sisi tegak. " +
                "Hasil mungkin tidak akurat (hanya luas alas).");
        return super.hitungLuas();
    }

    public double getTinggiLimas() {
        return tinggiLimas;
    }
}