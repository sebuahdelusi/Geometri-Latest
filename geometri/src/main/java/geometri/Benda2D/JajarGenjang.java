package geometri.Benda2D;

import geometri.AbstractGeometriDasar;

public class JajarGenjang extends AbstractGeometriDasar {

    private double alas; // Dimensi dasar tetap private
    private double tinggi;
    private double sisiMiring;
    protected double luas;
    protected double keliling;

    public JajarGenjang(double alas, double tinggi, double sisiMiring) {
        super("Jajar Genjang");
        if (alas <= 0 || tinggi <= 0 || sisiMiring <= 0) {
            throw new IllegalArgumentException("Alas, tinggi, dan sisi miring harus bernilai positif.");
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

    @Override
    public double hitungKeliling() {
        keliling = 2 * (alas + sisiMiring);
        return keliling;
    }

    public double getAlas() { return alas; }
    public double getTinggi() { return tinggi; }
    public double getSisiMiring() { return sisiMiring; }
}