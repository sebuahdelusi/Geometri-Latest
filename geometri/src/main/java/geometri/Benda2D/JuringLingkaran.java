package geometri.Benda2D;

import geometri.TolakNilaiException;

public class JuringLingkaran extends Lingkaran {

    public double sudutBusurDerajat; // Dimensi spesifik juring

    public JuringLingkaran(double jariJari){
        super(jariJari);
        this.sudutBusurDerajat = sudutBusurDerajat; // 'this' diperlukan
    }

    @Override
    public double hitungLuas() throws TolakNilaiException {
        // Menggunakan super.jariJari (atau cukup jariJari karena protected)
        // Menyimpan hasil ke field 'luas' yang diwarisi dari Lingkaran, tapi dengan nilai Juring
        if (sudutBusurDerajat <= 0 || sudutBusurDerajat > 360) {
            throw new TolakNilaiException("Sudut busur harus bernilai positif dan tidak lebih dari 360 derajat.");
        }
        luas = (sudutBusurDerajat / 360.0) * (Math.PI * jariJari * jariJari);
        return luas;
    }

    public double hitungLuas(double sudutBusurDerajat) throws TolakNilaiException {
        if (sudutBusurDerajat <= 0 || sudutBusurDerajat > 360) {
            throw new TolakNilaiException("Sudut busur harus bernilai positif dan tidak lebih dari 360 derajat.");
        }
        // Menggunakan super.jariJari (atau cukup jariJari karena protected)
        luas = (sudutBusurDerajat / 360.0) * (Math.PI * jariJari * jariJari);
        return luas;
    }

    @Override
    public double hitungKeliling() {
        double panjangBusur = (sudutBusurDerajat / 360.0) * (2 * Math.PI * jariJari);
        // Menyimpan hasil ke field 'keliling' yang diwarisi, tapi dengan nilai Juring
        keliling = panjangBusur + (2 * jariJari);
        return keliling;
    }

    public double hitungKeliling(double sudutBusurDerajat) {
        double panjangBusur = (sudutBusurDerajat / 360.0) * (2 * Math.PI * jariJari);
        keliling = panjangBusur + (2 * jariJari);
        return keliling;
    }

    public double getSudutBusurDerajat() {
        return sudutBusurDerajat;
    }
}