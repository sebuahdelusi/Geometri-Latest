package geometri.Benda3D;

import geometri.Benda2D.BelahKetupat;

public class LimasBelahKetupat extends BelahKetupat {

    private double tinggiLimas;
    protected double volume;
    protected double tinggiSisiTegakLimasBK;
    protected double luasSelubungLimasBK;
    protected double luasPermukaanLimasBK;

    public LimasBelahKetupat(double diagonal1Alas, double diagonal2Alas, double sisiAlas, double tinggiLimas) {
        super(diagonal1Alas, diagonal2Alas, sisiAlas);
        if (tinggiLimas <= 0) {
            throw new IllegalArgumentException("Tinggi limas harus bernilai positif.");
        }
        this.tinggiLimas = tinggiLimas;
    }

    public double hitungVolume() {
        volume = (1.0 / 3.0) * super.hitungLuas() * tinggiLimas;
        return volume;
    }

    public double hitungTinggiSisiTegak() {
        double d1 = getDiagonal1();
        double d2 = getDiagonal2();
        double s = getSisi();
        double apotemaAlas = (d1 * d2) / (4 * s); // r_alas
        tinggiSisiTegakLimasBK = Math.sqrt(Math.pow(tinggiLimas, 2) + Math.pow(apotemaAlas, 2));
        return tinggiSisiTegakLimasBK;
    }

    public double hitungLuasSelubung() {
        if (tinggiSisiTegakLimasBK == 0) hitungTinggiSisiTegak(); // Pastikan sudah dihitung
        double luasSatuSisiTegak = 0.5 * getSisi() * tinggiSisiTegakLimasBK;
        luasSelubungLimasBK = 4 * luasSatuSisiTegak;
        return luasSelubungLimasBK;
    }

    public double hitungLuasPermukaan() {
        if (luasSelubungLimasBK == 0) hitungLuasSelubung(); // Pastikan sudah dihitung
        luasPermukaanLimasBK = super.hitungLuas() + luasSelubungLimasBK;
        return luasPermukaanLimasBK;
    }

    public double getTinggiLimas() {
        return tinggiLimas;
    }
}