package geometri.Benda2D;

import geometri.AbstractGeometriDasar;

/**
 * Kelas yang merepresentasikan bangun datar Lingkaran.
 */
public class Lingkaran extends AbstractGeometriDasar {

    public double jariJari;
    public double luas;
    public double keliling;

    public Lingkaran(double jariJari) {
        super("Lingkaran");
        if (jariJari <= 0) {
            throw new IllegalArgumentException("Jari-jari harus bernilai positif.");
        }
        this.jariJari = jariJari;
    }

    @Override
    public double hitungLuas() {
        luas =  Math.PI * jariJari * jariJari; // 
        return luas;
    }

    public double hitungLuas(double jariJari) {
        if (jariJari <= 0) {
            throw new IllegalArgumentException("Jari-jari harus bernilai positif.");
        }
        luas = Math.PI * jariJari * jariJari; //
        return luas;
    }

    @Override
    public double hitungKeliling() {
        keliling =  2 * Math.PI * jariJari; // 
        return keliling;
    }

    public double hitungKeliling(double jariJari) {
        if (jariJari <= 0) {
            throw new IllegalArgumentException("Jari-jari harus bernilai positif.");
        }
        keliling = 2 * Math.PI * jariJari; //
        return keliling;
    }

}