package geometri.Benda2D;

import geometri.AbstractGeometriDasar;

public class Segitiga extends AbstractGeometriDasar {

    public double alasUntukLuas; // Dimensi dasar tetap private
    public double tinggiUntukLuas;
    public double sisiA;
    public double sisiB;
    public double sisiC;
    public double luas;
    public double keliling;

    public Segitiga(double alas, double tinggi, double sisiA, double sisiB, double sisiC) {
        super("Segitiga");
        this.alasUntukLuas = alas; // 'this' diperlukan
        this.tinggiUntukLuas = tinggi; // 'this' diperlukan
        this.sisiA = sisiA; // 'this' diperlukan
        this.sisiB = sisiB; // 'this' diperlukan
        this.sisiC = sisiC; // 'this' diperlukan
    }

    @Override
    public double hitungLuas() {
        luas = 0.5 * alasUntukLuas * tinggiUntukLuas;
        return luas;
    }

    public double hitungLuas(double alas, double tinggi) {
        luas = 0.5 * alas * tinggi;
        return luas;
    }

    @Override
    public double hitungKeliling() {
        keliling = sisiA + sisiB + sisiC;
        return keliling;
    }

    public double hitungKeliling(double sisiA, double sisiB, double sisiC) {
        keliling = sisiA + sisiB + sisiC;
        return keliling;
    }


}