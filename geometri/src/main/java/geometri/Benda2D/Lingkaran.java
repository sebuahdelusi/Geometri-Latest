package geometri.Benda2D;

import geometri.AbstractGeometriDasar;
import geometri.TolakNilaiException;

/**
 * Kelas yang merepresentasikan bangun datar Lingkaran.
 */
public class Lingkaran extends AbstractGeometriDasar implements Runnable{

    public double jariJari;
    public double luas;
    public double keliling;

    public Lingkaran(double jariJari) {
        super("Lingkaran");
        this.jariJari = jariJari;
    }

    @Override
    public double hitungLuas() throws TolakNilaiException {
        luas =  Math.PI * jariJari * jariJari; // 
        return luas;
    }

    public double hitungLuas(double jariJari) throws TolakNilaiException {
        if (jariJari <= 0) {
            throw new TolakNilaiException("Jari-jari harus bernilai positif.");
        }
        luas = Math.PI * jariJari * jariJari; //
        return luas;
    }

    @Override
    public double hitungKeliling() throws TolakNilaiException {
        if (jariJari <= 0) {
            throw new TolakNilaiException("Jari-jari harus bernilai positif.");
        }
        keliling =  2 * Math.PI * jariJari; // 
        return keliling;
    }

    public double hitungKeliling(double jariJari) throws TolakNilaiException {
        if (jariJari <= 0) {
            throw new TolakNilaiException("Jari-jari harus bernilai positif.");
        }
        keliling = 2 * Math.PI * jariJari; //
        return keliling;
    }

    @Override
    public void run() {
        System.out.println("Hitung luas dan keliling lingkaran dengan jari-jari: " + jariJari);
        try {
            System.out.println("Luas: " + hitungLuas());
        } catch (TolakNilaiException e) {
            throw new RuntimeException(e);
        }
        try {
            System.out.println("Keliling: " + hitungKeliling());
        } catch (TolakNilaiException e) {
            throw new RuntimeException(e);
        }

    }


}