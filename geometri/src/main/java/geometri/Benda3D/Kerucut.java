package geometri.Benda3D;

import geometri.Benda2D.Lingkaran;

public class Kerucut extends Lingkaran {

    private double tinggi; // Dimensi dasar kerucut
    protected double garisPelukisKerucut; // Menyimpan hasil perhitungan
    protected double volume;
    protected double luasPermukaanKerucut;

    public Kerucut(double jariJari, double tinggi) {
        super(jariJari);
        if (tinggi <= 0) {
            throw new IllegalArgumentException("Tinggi kerucut harus bernilai positif.");
        }
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
        if (jariJari <= 0 || tinggi <= 0) {
            throw new IllegalArgumentException("Jari-jari dan tinggi kerucut harus bernilai positif.");
        }
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