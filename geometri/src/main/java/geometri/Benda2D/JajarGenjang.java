package geometri.Benda2D;

import geometri.AbstractGeometriDasar;

public class JajarGenjang extends AbstractGeometriDasar {

    public double alas; // Dimensi dasar tetap private
    public double tinggi;
    public double sisiMiring;
    public double luas;
    public double keliling;

    public JajarGenjang(double alas, double tinggi, double sisiMiring) throws IllegalArgumentException {
        super("Jajar Genjang");
        if (alas <= 0 || tinggi <= 0 || sisiMiring <= 0) {
            throw new IllegalArgumentException("Semua dimensi harus bernilai positif.");
        }
        this.alas = alas;         // 'this' diperlukan
        this.tinggi = tinggi;     // 'this' diperlukan
        this.sisiMiring = sisiMiring; // 'this' diperlukan
    }

    @Override
    public double hitungLuas() {
        luas = alas * tinggi;
        return luas;
    }

    public double hitungLuas(double alas, double tinggi) {
        luas = alas * tinggi;
        return luas;
    }

    @Override
    public double hitungKeliling() {
        keliling = 2 * (alas + sisiMiring);
        return keliling;
    }

    public double hitungKeliling(double alas, double sisiMiring) {
        keliling = 2 * (alas + sisiMiring);
        return keliling;
    }

}