package geometri.Benda2D;

import java.lang.Math;

/**
 * Kelas yang merepresentasikan bangun datar Tembereng Lingkaran.
 * Kelas ini mewarisi sifat-sifat dari Lingkaran.
 */
public class TemberengLingkaran extends Lingkaran {

    private double sudutPusatDerajat;
    // Field 'luas' dan 'keliling' sudah diwarisi (inherited) dari kelas Lingkaran.

    public TemberengLingkaran(double jariJari, double sudutPusatDerajat) {

        super(jariJari);
        this.sudutPusatDerajat = sudutPusatDerajat;
    }

    private double getSudutPusatRadian() {
        return Math.toRadians(this.sudutPusatDerajat);
    }

    @Override
    public double hitungLuas() {
        double sudutRadian = getSudutPusatRadian();
        double luasJuring = 0.5 * this.jariJari * this.jariJari * sudutRadian;
        double luasSegitiga = 0.5 * this.jariJari * this.jariJari * Math.sin(sudutRadian);
        this.luas = luasJuring - luasSegitiga; // Menyimpan hasil ke field 'luas'
        return this.luas;
    }

    @Override
    public double hitungKeliling() {
        double sudutRadian = getSudutPusatRadian();
        double panjangBusur = this.jariJari * sudutRadian;
        double panjangTaliBusur = 2 * this.jariJari * Math.sin(sudutRadian / 2.0);
        this.keliling = panjangBusur + panjangTaliBusur; // Menyimpan hasil ke field 'keliling'
        return this.keliling;
    }

    public double hitungLuas(double jariJari, double sudutPusatDerajat) {
        double sudutRadian = Math.toRadians(sudutPusatDerajat);
        double luasJuring = 0.5 * jariJari * jariJari * sudutRadian;
        double luasSegitiga = 0.5 * jariJari * jariJari * Math.sin(sudutRadian);
        this.luas = luasJuring - luasSegitiga; // Mengupdate field 'luas'
        return this.luas;
    }
    public double hitungKeliling(double jariJari, double sudutPusatDerajat) {
        if (sudutPusatDerajat <= 0 || sudutPusatDerajat >= 360) {
            throw new IllegalArgumentException("Sudut pusat harus lebih dari 0 dan kurang dari 360 derajat.");
        }
        double sudutRadian = Math.toRadians(sudutPusatDerajat);
        double panjangBusur = jariJari * sudutRadian;
        double panjangTaliBusur = 2 * jariJari * Math.sin(sudutRadian / 2.0);
        this.keliling = panjangBusur + panjangTaliBusur; // Mengupdate field 'keliling'
        return this.keliling;
    }

    public double getSudutPusatDerajat() {
        return this.sudutPusatDerajat;
    }

}