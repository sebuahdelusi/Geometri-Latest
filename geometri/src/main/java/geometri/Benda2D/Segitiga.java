package geometri.Benda2D;

import geometri.AbstractGeometriDasar;

public class Segitiga extends AbstractGeometriDasar {

    private double alasUntukLuas; // Dimensi dasar tetap private
    private double tinggiUntukLuas;
    private double sisiA;
    private double sisiB;
    private double sisiC;
    protected double luas;
    protected double keliling;

    public Segitiga(double alas, double tinggi, double sisiA, double sisiB, double sisiC) {
        super("Segitiga");
        if (alas <= 0 || tinggi <= 0 || sisiA <= 0 || sisiB <= 0 || sisiC <= 0) {
            throw new IllegalArgumentException("Semua dimensi segitiga (alas, tinggi, sisi) harus bernilai positif.");
        }
        if (sisiA + sisiB <= sisiC || sisiA + sisiC <= sisiB || sisiB + sisiC <= sisiA) {
            throw new IllegalArgumentException("Dimensi sisi-sisi tidak membentuk segitiga yang valid.");
        }
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

    @Override
    public double hitungKeliling() {
        keliling = sisiA + sisiB + sisiC;
        return keliling;
    }

    public double getAlasUntukLuas() { return alasUntukLuas; } // Getter untuk field yang diganti namanya
    public double getTinggiUntukLuas() { return tinggiUntukLuas; } // Getter untuk field yang diganti namanya
    public double getSisiA() { return sisiA; }
    public double getSisiB() { return sisiB; }
    public double getSisiC() { return sisiC; }
}