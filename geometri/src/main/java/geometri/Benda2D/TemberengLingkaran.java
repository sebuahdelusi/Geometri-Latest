package geometri.Benda2D;

import java.lang.Math;

/**
 * Kelas yang merepresentasikan bangun datar Tembereng Lingkaran.
 * Kelas ini mewarisi sifat-sifat dari Lingkaran.
 */
public class TemberengLingkaran extends Lingkaran {

    public double sudutPusatDerajat;
    // Field 'luas' dan 'keliling' sudah diwarisi (inherited) dari kelas Lingkaran.

    public TemberengLingkaran(double jariJari, double sudutPusatDerajat) {
        // 1. Memanggil konstruktor superclass (Lingkaran) yang valid.
        super(jariJari);

        // 2. Validasi input spesifik untuk Tembereng
        if (sudutPusatDerajat <= 0 || sudutPusatDerajat >= 360) {
            throw new IllegalArgumentException("Sudut pusat harus lebih dari 0 dan kurang dari 360 derajat.");
        }
        this.sudutPusatDerajat = sudutPusatDerajat;
    }

    private double getSudutPusatRadian() {
        return Math.toRadians(this.sudutPusatDerajat);
    }

    /**
     * Menghitung luas tembereng berdasarkan jari-jari dan sudut pusat dari state objek.
     * Rumus: Luas Juring - Luas Segitiga
     * L = (sudut/360) * pi * r^2 - 0.5 * r^2 * sin(sudut)
     */
    @Override
    public double hitungLuas() {
        double sudutRadian = getSudutPusatRadian();
        double luasJuring = 0.5 * this.jariJari * this.jariJari * sudutRadian;
        double luasSegitiga = 0.5 * this.jariJari * this.jariJari * Math.sin(sudutRadian);
        this.luas = luasJuring - luasSegitiga; // Menyimpan hasil ke field 'luas'
        return this.luas;
    }

    /**
     * Menghitung keliling tembereng berdasarkan jari-jari dan sudut pusat dari state objek.
     * Rumus: Panjang Busur + Panjang Tali Busur
     * K = (r * sudut_radian) + (2 * r * sin(sudut_radian / 2))
     */
    @Override
    public double hitungKeliling() {
        double sudutRadian = getSudutPusatRadian();
        double panjangBusur = this.jariJari * sudutRadian;
        double panjangTaliBusur = 2 * this.jariJari * Math.sin(sudutRadian / 2.0);
        this.keliling = panjangBusur + panjangTaliBusur; // Menyimpan hasil ke field 'keliling'
        return this.keliling;
    }

    // --- METODE OVERLOAD BARU (SESUAI KONSEP LINGKARAN) ---

    /**
     * Menghitung luas tembereng berdasarkan parameter yang diberikan.
     * Metode ini meng-update state 'luas' pada objek.
     */
    public double hitungLuas(double jariJari, double sudutPusatDerajat) {
        if (jariJari <= 0) {
            throw new IllegalArgumentException("Jari-jari harus bernilai positif.");
        }
        if (sudutPusatDerajat <= 0 || sudutPusatDerajat >= 360) {
            throw new IllegalArgumentException("Sudut pusat harus lebih dari 0 dan kurang dari 360 derajat.");
        }
        double sudutRadian = Math.toRadians(sudutPusatDerajat);
        double luasJuring = 0.5 * jariJari * jariJari * sudutRadian;
        double luasSegitiga = 0.5 * jariJari * jariJari * Math.sin(sudutRadian);
        this.luas = luasJuring - luasSegitiga; // Mengupdate field 'luas'
        return this.luas;
    }

    /**
     * Menghitung keliling tembereng berdasarkan parameter yang diberikan.
     * Metode ini meng-update state 'keliling' pada objek.
     */
    public double hitungKeliling(double jariJari, double sudutPusatDerajat) {
        if (jariJari <= 0) {
            throw new IllegalArgumentException("Jari-jari harus bernilai positif.");
        }
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