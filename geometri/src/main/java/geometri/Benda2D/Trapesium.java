package geometri.Benda2D;

import geometri.AbstractGeometriDasar;

public class Trapesium extends AbstractGeometriDasar {

    private double sisiAtas; // Dimensi dasar tetap private
    private double sisiBawah;
    private double tinggi;
    private double sisiKiri;
    private double sisiKanan;
    protected double luas;
    protected double keliling;

    public Trapesium(double sisiAtas, double sisiBawah, double tinggi, double sisiKiri, double sisiKanan) {
        super("Trapesium");
        if (sisiAtas <= 0 || sisiBawah <= 0 || tinggi <= 0 || sisiKiri <= 0 || sisiKanan <= 0) {
            throw new IllegalArgumentException("Semua dimensi trapesium harus bernilai positif.");
        }
        this.sisiAtas = sisiAtas;     // 'this' diperlukan
        this.sisiBawah = sisiBawah;   // 'this' diperlukan
        this.tinggi = tinggi;         // 'this' diperlukan
        this.sisiKiri = sisiKiri;     // 'this' diperlukan
        this.sisiKanan = sisiKanan;   // 'this' diperlukan
    }

    @Override
    public double hitungLuas() {
        luas = 0.5 * (sisiAtas + sisiBawah) * tinggi;
        return luas;
    }

    @Override
    public double hitungKeliling() {
        keliling = sisiAtas + sisiBawah + sisiKiri + sisiKanan;
        return keliling;
    }

    public double getSisiAtas() { return sisiAtas; }
    public double getSisiBawah() { return sisiBawah; }
    public double getTinggi() { return tinggi; }
    public double getSisiKiri() { return sisiKiri; }
    public double getSisiKanan() { return sisiKanan; }
}