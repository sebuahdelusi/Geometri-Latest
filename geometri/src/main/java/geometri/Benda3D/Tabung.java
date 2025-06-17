package geometri.Benda3D;

import geometri.Benda2D.Lingkaran;

public class Tabung extends Lingkaran {

    private double tinggi; // Dimensi dasar tabung, tetap private
    protected double volume;
    protected double luasPermukaanTabung;

    public Tabung(double jariJari, double tinggi) {
        super(jariJari);
        this.tinggi = tinggi;
    }

    public double hitungVolume() {
        volume = super.hitungLuas() * tinggi;
        return volume;
    }

    public double hitungVolume(double jariJari, double tinggi) {
        volume = super.hitungLuas(jariJari) * tinggi;
        return volume;
    }

    public double hitungLuasPermukaan() {
        double luasAlasTabung = super.hitungLuas();
        double kelilingAlasTabung = super.hitungKeliling();
        double luasSelimut = kelilingAlasTabung * tinggi;
        luasPermukaanTabung = (2 * luasAlasTabung) + luasSelimut;
        return luasPermukaanTabung;
    }

    public double hitungLuasPermukaan(double jariJari, double tinggi) {
        double luasAlasTabung = super.hitungLuas(jariJari);
        double kelilingAlasTabung = super.hitungKeliling(jariJari);
        double luasSelimut = kelilingAlasTabung * tinggi;
        luasPermukaanTabung = (2 * luasAlasTabung) + luasSelimut;
        return luasPermukaanTabung;
    }

    public double getTinggi() {
        return tinggi;
    }
    public double getVolume() {
        return volume;
    }
    public double getLuasPermukaanTabung() {
        return luasPermukaanTabung;
    }
}