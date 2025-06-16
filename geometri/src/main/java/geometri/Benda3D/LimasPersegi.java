package geometri.Benda3D;

import geometri.Benda2D.Persegi;

public class LimasPersegi extends Persegi {

    public double tinggiLimas;
    public double volume;
    public double luasPermukaanLimas;


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

    public double hitungVolume(double sisiPersegi, double tinggiLimas) {
        if (sisiPersegi <= 0 || tinggiLimas <= 0) {
            throw new IllegalArgumentException("Sisi alas dan tinggi limas harus bernilai positif.");
        }
        volume = (1.0 / 3.0) * super.hitungLuas(sisiPersegi) * tinggiLimas;
        return volume;
    }

    public double hitungLuasPermukaan(){

        luasPermukaanLimas = super.hitungLuas() + (2 * super.sisi * tinggiLimas);
        return luasPermukaanLimas;
    }

    public double hitungLuasPermukaan(double sisiPersegi, double tinggiLimas) {
        if (sisiPersegi <= 0 || tinggiLimas <= 0) {
            throw new IllegalArgumentException("Sisi alas dan tinggi limas harus bernilai positif.");
        }
        luasPermukaanLimas = super.hitungLuas(sisiPersegi) + (2 * super.sisi * tinggiLimas);
        return luasPermukaanLimas;
    }

}