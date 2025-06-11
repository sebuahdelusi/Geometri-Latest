package geometri.Benda2D;

import geometri.AbstractGeometriDasar;

/**
 * Kelas yang merepresentasikan bangun datar Lingkaran.
 */
public class Lingkaran extends AbstractGeometriDasar {

    protected double jariJari;
    protected double luas;
    protected double keliling;
    protected double diameterLingkaran;

    public Lingkaran(double jariJari) {
        super("Lingkaran");
        if (jariJari <= 0) {
            throw new IllegalArgumentException("Jari-jari harus bernilai positif.");
        }
        this.jariJari = jariJari;
    }

    public Lingkaran(double diameterInput, boolean isDiameter) {
        super("Lingkaran (dari Diameter)");
        if (!isDiameter) {
            throw new IllegalArgumentException("Gunakan konstruktor Lingkaran(jariJari) untuk input jari-jari.");
        }
        if (diameterInput <= 0) {
            throw new IllegalArgumentException("Diameter harus bernilai positif.");
        }
        this.jariJari = diameterInput / 2.0;
    }

    protected Lingkaran(double jariJari, String namaBangun) {
        super(namaBangun);
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

    @Override
    public double hitungKeliling() {
        keliling =  2 * Math.PI * jariJari; // 
        return keliling;
    }

    public double getJariJari() {
        return jariJari; 
    }

    public double getDiameter() {
        diameterLingkaran = 2 * jariJari; // 
        return diameterLingkaran;
    }
}