package geometri.Benda2D;

import geometri.AbstractGeometriDasar;

public class Persegi extends AbstractGeometriDasar {

    public double sisi; // Tetap private untuk enkapsulasi dimensi dasar
    public double luas;
    public double keliling;

    public Persegi(double sisi) throws IllegalArgumentException {
        super("Persegi");
        if (sisi <= 0) {
            throw new IllegalArgumentException("Sisi harus lebih besar dari nol.");
        }

        this.sisi = sisi; // 'this' diperlukan di sini karena parameter sama dengan nama field
    }

    @Override
    public double hitungLuas() {
        luas = sisi * sisi;
        return luas;
    }

    public double hitungLuas(double sisi) {
        luas = sisi * sisi;
        return luas;
    }

    @Override
    public double hitungKeliling() {
        keliling = 4 * sisi;
        return keliling;
    }

    public double hitungKeliling(double sisi) {
        keliling = 4 * sisi;
        return keliling;
    }

    public double getSisi() {
        return sisi;
    }
}