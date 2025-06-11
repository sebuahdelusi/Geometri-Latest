package geometri.Benda2D;

public class JuringLingkaran extends Lingkaran {

    private double sudutBusurDerajat; // Dimensi spesifik juring

    public JuringLingkaran(double jariJari, double sudutBusurDerajat) {
        super(jariJari, "Juring Lingkaran");
        if (sudutBusurDerajat <= 0 || sudutBusurDerajat > 360) {
            throw new IllegalArgumentException("Sudut busur harus antara 0 (eksklusif) dan 360 (inklusif) derajat.");
        }
        this.sudutBusurDerajat = sudutBusurDerajat; // 'this' diperlukan
    }

    private double getSudutBusurRadian() {
        return Math.toRadians(sudutBusurDerajat);
    }

    @Override
    public double hitungLuas() {
        // Menggunakan super.jariJari (atau cukup jariJari karena protected)
        // Menyimpan hasil ke field 'luas' yang diwarisi dari Lingkaran, tapi dengan nilai Juring
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

    public double getSudutBusurDerajat() {
        return sudutBusurDerajat;
    }
}