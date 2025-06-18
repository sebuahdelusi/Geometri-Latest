package geometri.Benda2D;

import geometri.AbstractGeometriDasar;

/**
 * Kelas yang merepresentasikan bangun datar Lingkaran.
 */
public class Lingkaran extends AbstractGeometriDasar implements Runnable{

    public double jariJari;
    public double luas;
    public double keliling;

    public Lingkaran(double jariJari) throws IllegalArgumentException {
        super("Lingkaran");
        if (jariJari <= 0) {
            throw new IllegalArgumentException("Jari-jari harus lebih besar dari nol.");
        }
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

    @Override
    public void run() {
        System.out.println("Hitung luas dan keliling lingkaran dengan jari-jari: " + jariJari);
        System.out.println("Luas: " + hitungLuas());
        System.out.println("Keliling: " + hitungKeliling());

    }
}