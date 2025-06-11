package geometri.Benda2D;

import geometri.AbstractGeometriDasar;

public class PersegiPanjang extends AbstractGeometriDasar {

    private double panjang; // Tetap private
    private double lebar;   // Tetap private
    protected double luas;
    protected double keliling;

    public PersegiPanjang(double panjang, double lebar) {
        super("Persegi Panjang");
        if (panjang <= 0 || lebar <= 0) {
            throw new IllegalArgumentException("Panjang dan lebar harus bernilai positif.");
        }
        this.panjang = panjang; // 'this' diperlukan
        this.lebar = lebar;     // 'this' diperlukan
    }

    @Override
    public double hitungLuas() {
        luas = panjang * lebar;
        return luas;
    }

    @Override
    public double hitungKeliling() {
        keliling = 2 * (panjang + lebar);
        return keliling;
    }

    public double getPanjang() {
        return panjang;
    }

    public double getLebar() {
        return lebar;
    }
}