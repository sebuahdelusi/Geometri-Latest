package geometri.Benda3D;

import geometri.Benda2D.Lingkaran;

public class Tabung extends Lingkaran {

    private double tinggi; // Dimensi dasar tabung, tetap private
    protected double volume;
    protected double luasPermukaanTabung;

    public Tabung(double jariJari, double tinggi) {
        super(jariJari, "Tabung (berbasis Lingkaran)");
        if (tinggi <= 0) {
            throw new IllegalArgumentException("Tinggi tabung harus bernilai positif.");
        }
        this.tinggi = tinggi;
    }

    public double hitungVolume() {
        volume = super.hitungLuas() * tinggi;
        return volume;
    }

    public double hitungLuasPermukaan() {
        double luasAlasTabung = super.hitungLuas();
        double kelilingAlasTabung = super.hitungKeliling();
        double luasSelimut = kelilingAlasTabung * tinggi;
        luasPermukaanTabung = (2 * luasAlasTabung) + luasSelimut;
        return luasPermukaanTabung;
    }

    public double getTinggi() {
        return tinggi;
    }
}