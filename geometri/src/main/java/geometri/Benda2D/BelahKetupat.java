package geometri.Benda2D;

import geometri.AbstractGeometriDasar;

public class BelahKetupat extends AbstractGeometriDasar {

    private double diagonal1; // Dimensi dasar tetap private
    private double diagonal2;
    private double sisi;
    protected double luas;
    protected double keliling;

    public BelahKetupat(double diagonal1, double diagonal2, double sisi) {
        super("Belah Ketupat");
        if (diagonal1 <= 0 || diagonal2 <= 0 || sisi <= 0) {
            throw new IllegalArgumentException("Diagonal dan sisi harus bernilai positif.");
        }
        this.diagonal1 = diagonal1; // 'this' diperlukan
        this.diagonal2 = diagonal2; // 'this' diperlukan
        this.sisi = sisi;           // 'this' diperlukan
    }

    @Override
    public double hitungLuas() {
        luas = (diagonal1 * diagonal2) / 2.0;
        return luas;
    }

    @Override
    public double hitungKeliling() {
        keliling = 4 * sisi;
        return keliling;
    }

    public double getDiagonal1() { return diagonal1; }
    public double getDiagonal2() { return diagonal2; }
    public double getSisi() { return sisi; }
}