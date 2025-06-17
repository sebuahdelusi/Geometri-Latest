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
        this.jariJari = jariJari;
    }

    @Override
    public double hitungLuas() {
        luas =  Math.PI * jariJari * jariJari; // 
        return luas;
    }

    public double hitungLuas(double jariJari) {
        luas = Math.PI * jariJari * jariJari; //
        return luas;
    }

    @Override
    public double hitungKeliling() {
        keliling =  2 * Math.PI * jariJari; // 
        return keliling;
    }

    public double hitungKeliling(double jariJari) {
        keliling = 2 * Math.PI * jariJari; //
        return keliling;
    }

}