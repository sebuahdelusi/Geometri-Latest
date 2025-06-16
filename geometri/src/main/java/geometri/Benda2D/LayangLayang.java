package geometri.Benda2D;

import geometri.AbstractGeometriDasar;

public class LayangLayang extends AbstractGeometriDasar {

    public double diagonal1; // Dimensi dasar tetap private
    public double diagonal2;
    public double sisiPendek;
    public double sisiPanjang;
    public double luas;
    public double keliling;

    public LayangLayang(double diagonal1, double diagonal2, double sisiPendek, double sisiPanjang) {
        super("Layang-Layang");
        if (diagonal1 <= 0 || diagonal2 <= 0 || sisiPendek <= 0 || sisiPanjang <= 0) {
            throw new IllegalArgumentException("Diagonal dan sisi harus bernilai positif.");
        }
        this.diagonal1 = diagonal1;     // 'this' diperlukan
        this.diagonal2 = diagonal2;     // 'this' diperlukan
        this.sisiPendek = sisiPendek;   // 'this' diperlukan
        this.sisiPanjang = sisiPanjang; // 'this' diperlukan
    }

    @Override
    public double hitungLuas() {
        luas = 0.5 * diagonal1 * diagonal2;
        return luas;
    }

    public double hitungLuas(double diagonal1, double diagonal2) {
        if (diagonal1 <= 0 || diagonal2 <= 0) {
            throw new IllegalArgumentException("Diagonal harus bernilai positif.");
        }
        luas = 0.5 * diagonal1 * diagonal2;
        return luas;
    }

    @Override
    public double hitungKeliling() {
        keliling = 2 * (sisiPendek + sisiPanjang);
        return keliling;
    }

    public double hitungKeliling(double sisiPendek, double sisiPanjang) {
        if (sisiPendek <= 0 || sisiPanjang <= 0) {
            throw new IllegalArgumentException("Sisi pendek dan panjang harus bernilai positif.");
        }
        keliling = 2 * (sisiPendek + sisiPanjang);
        return keliling;
    }


}