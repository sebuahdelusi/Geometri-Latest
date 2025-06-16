package geometri.Benda2D;

public class JuringLingkaran extends Lingkaran {

    public double sudutBusurDerajat; // Dimensi spesifik juring

    public JuringLingkaran(double jariJari) {
        super(jariJari);
        if (sudutBusurDerajat <= 0 || sudutBusurDerajat > 360) {
            throw new IllegalArgumentException("Sudut busur harus antara 0 (eksklusif) dan 360 (inklusif) derajat.");
        }
        this.sudutBusurDerajat = sudutBusurDerajat; // 'this' diperlukan
    }

    @Override
    public double hitungLuas() {
        // Menggunakan super.jariJari (atau cukup jariJari karena protected)
        // Menyimpan hasil ke field 'luas' yang diwarisi dari Lingkaran, tapi dengan nilai Juring
        luas = (sudutBusurDerajat / 360.0) * (Math.PI * jariJari * jariJari);
        return luas;
    }

    public double hitungLuas(double sudutBusurDerajat) {
        if (sudutBusurDerajat <= 0 || sudutBusurDerajat > 360) {
            throw new IllegalArgumentException("Sudut busur harus antara 0 (eksklusif) dan 360 (inklusif) derajat.");
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
        if (sudutBusurDerajat <= 0 || sudutBusurDerajat > 360) {
            throw new IllegalArgumentException("Sudut busur harus antara 0 (eksklusif) dan 360 (inklusif) derajat.");
        }
        double panjangBusur = (sudutBusurDerajat / 360.0) * (2 * Math.PI * jariJari);
        keliling = panjangBusur + (2 * jariJari);
        return keliling;
    }

    public double getSudutBusurDerajat() {
        return sudutBusurDerajat;
    }
}