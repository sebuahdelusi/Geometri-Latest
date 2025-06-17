package geometri.Benda3D;

import geometri.Benda2D.Persegi;

public class LimasPersegi extends Persegi {

    private double tinggiLimas;
    private double volume;
    private double luasPermukaanLimas;


    public LimasPersegi(double sisiAlas, double tinggiLimas) {
        super(sisiAlas);
        this.tinggiLimas = tinggiLimas;
    }

    public double hitungVolume() {
        volume = (1.0 / 3.0) * super.hitungLuas() * tinggiLimas;
        return volume;
    }

    public double hitungVolume(double sisiPersegi, double tinggiLimas) {
        volume = (1.0 / 3.0) * super.hitungLuas(sisiPersegi) * tinggiLimas;
        return volume;
    }

    public double hitungLuasPermukaan(){

        luasPermukaanLimas = super.hitungLuas() + (2 * super.sisi * tinggiLimas);
        return luasPermukaanLimas;
    }

    public double hitungLuasPermukaan(double sisiPersegi, double tinggiLimas) {
        luasPermukaanLimas = super.hitungLuas(sisiPersegi) + (2 * super.sisi * tinggiLimas);
        return luasPermukaanLimas;
    }

    public double getTinggiLimas() {
        return tinggiLimas;
    }
    public double getVolume() {
        return volume;
    }
    public double getLuasPermukaanLimas() {
        return luasPermukaanLimas;
    }

}