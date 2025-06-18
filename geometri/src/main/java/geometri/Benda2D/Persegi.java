package geometri.Benda2D;

import geometri.AbstractGeometriDasar;
import geometri.TolakNilaiException;

public class Persegi extends AbstractGeometriDasar {

    public double sisi; // Tetap private untuk enkapsulasi dimensi dasar
    public double luas;
    public double keliling;

    public Persegi(double sisi) {
        super("Persegi");
        this.sisi = sisi; // 'this' diperlukan di sini karena parameter sama dengan nama field
    }

    @Override
    public double hitungLuas() throws TolakNilaiException {
        if (sisi <= 0) {
            throw new TolakNilaiException("Sisi harus bernilai positif.");
        }
        luas = sisi * sisi;
        return luas;
    }

    public double hitungLuas(double sisi) throws TolakNilaiException {
        if (sisi <= 0) {
            throw new TolakNilaiException("Sisi harus bernilai positif.");
        }
        luas = sisi * sisi;
        return luas;
    }

    @Override
    public double hitungKeliling() throws TolakNilaiException {
        if (sisi <= 0) {
            throw new TolakNilaiException("Sisi harus bernilai positif.");
        }
        keliling = 4 * sisi;
        return keliling;
    }

    public double hitungKeliling(double sisi) throws TolakNilaiException {
        if (sisi <= 0) {
            throw new TolakNilaiException("Sisi harus bernilai positif.");
        }
        keliling = 4 * sisi;
        return keliling;
    }

}