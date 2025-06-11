package geometri.Benda2D;

import geometri.AbstractGeometriDasar;

public class Persegi extends AbstractGeometriDasar {

    private double sisi; // Tetap private untuk enkapsulasi dimensi dasar
    protected double luas;
    protected double keliling;

    public Persegi(double sisi) {
        super("Persegi");
        if (sisi <= 0) {
            throw new IllegalArgumentException("Sisi harus bernilai positif.");
        }
        this.sisi = sisi; // 'this' diperlukan di sini karena parameter sama dengan nama field
    }

    @Override
    public double hitungLuas() {
        luas = sisi * sisi;
        return luas;
    }

    @Override
    public double hitungKeliling() {
        keliling = 4 * sisi;
        return keliling;
    }

    public double getSisi() {
        return sisi;
    }
}