package geometri.Benda3D;

import geometri.Benda2D.Persegi;

public class LimasPersegi extends Persegi {

    private double tinggiLimas;
    protected double volume;
    protected double luasPermukaanLimasPersegi;
    protected double tinggiSisiTegakLimasPersegi;
    protected double luasSelubungLimasPersegi;


    public LimasPersegi(double sisiAlas, double tinggiLimas) {
        super(sisiAlas);
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
        double setengahSisiAlas = getSisi() / 2.0; // getSisi() dari superclass Persegi
        tinggiSisiTegakLimasPersegi = Math.sqrt(Math.pow(tinggiLimas, 2) + Math.pow(setengahSisiAlas, 2));
        return tinggiSisiTegakLimasPersegi;
    }

    public double hitungLuasSatuSisiTegak() {
        // Memastikan tinggiSisiTegakLimasPersegi sudah dihitung
        if (tinggiSisiTegakLimasPersegi == 0) hitungTinggiSisiTegak();
        return 0.5 * getSisi() * tinggiSisiTegakLimasPersegi;
    }

    public double hitungLuasSelubung() {
        // Memastikan hitungLuasSatuSisiTegak akan menghitung tinggiSisiTegak jika belum
        luasSelubungLimasPersegi = 4 * hitungLuasSatuSisiTegak();
        return luasSelubungLimasPersegi;
    }

    public double hitungLuasPermukaan() {
        double luasAlasLimas = super.hitungLuas();
        // Memastikan luasSelubungLimasPersegi sudah dihitung
        if (luasSelubungLimasPersegi == 0) hitungLuasSelubung();
        luasPermukaanLimasPersegi = luasAlasLimas + luasSelubungLimasPersegi;
        return luasPermukaanLimasPersegi;
    }

    public double getTinggiLimas() {
        return tinggiLimas;
    }
}