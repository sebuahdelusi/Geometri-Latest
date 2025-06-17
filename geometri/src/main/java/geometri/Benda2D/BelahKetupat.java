package geometri.Benda2D;

import geometri.AbstractGeometriDasar;

public class BelahKetupat extends AbstractGeometriDasar {

    public double diagonal1; // Dimensi dasar tetap private
    public double diagonal2;
    public double sisi;
    public double luas;
    public double keliling;

    public BelahKetupat(double diagonal1, double diagonal2, double sisi) {
        super("Belah Ketupat");
        this.diagonal1 = diagonal1; // 'this' diperlukan
        this.diagonal2 = diagonal2; // 'this' diperlukan
        this.sisi = sisi;           // 'this' diperlukan
    }

    @Override
    public double hitungLuas() {
        luas = (diagonal1 * diagonal2) / 2.0;
        return luas;
    }

    public double hitungLuas(double diagonal1, double diagonal2) {
        luas = (diagonal1 * diagonal2) / 2.0;
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
}