package geometri.Benda3D;

import geometri.Benda2D.Lingkaran;

public class Kerucut extends Lingkaran {

    public double tinggi; // Dimensi dasar kerucut
    public double garisPelukisKerucut; // Menyimpan hasil perhitungan
    public double volume;
    public double luasPermukaanKerucut;

    public Kerucut(double jariJari, double tinggi) {
        super(jariJari);
        this.tinggi = tinggi;
    }

    public double getGarisPelukis() {
        garisPelukisKerucut = Math.sqrt(Math.pow(super.jariJari, 2) + Math.pow(tinggi, 2));
        return garisPelukisKerucut;
    }

    public double hitungVolume() {
        volume = (1.0 / 3.0) * super.hitungLuas() * tinggi;
        return volume;
    }

    public double hitungVolume(double jariJariKerucut, double tinggiKerucut) {

        volume = (1.0 / 3.0) * super.hitungLuas(jariJariKerucut) * tinggiKerucut;
        return volume;
    }

    public double hitungLuasPermukaan() {
        double luasAlasKerucut = super.hitungLuas();
        double s = getGarisPelukis();
        double luasSelimut = Math.PI * jariJari * s;
        luasPermukaanKerucut = luasAlasKerucut + luasSelimut;
        return luasPermukaanKerucut;
    }

    public double getTinggi() {
        return tinggi;
    }
}