package geometri.Benda2D;

public class TemberengLingkaran extends Lingkaran {

    private double sudutPusatDerajat; // Dimensi spesifik tembereng

    public TemberengLingkaran(double jariJari, double sudutPusatDerajat) {
        super(jariJari, "Tembereng Lingkaran");
        if (sudutPusatDerajat <= 0 || sudutPusatDerajat >= 360) {
            throw new IllegalArgumentException("Sudut pusat harus antara 0 (eksklusif) dan 360 (eksklusif) derajat untuk tembereng yang valid.");
        }
        this.sudutPusatDerajat = sudutPusatDerajat; // 'this' diperlukan
    }

    private double getSudutPusatRadian() {
        return Math.toRadians(sudutPusatDerajat);
    }

    @Override
    public double hitungLuas() {
        double sudutRadian = getSudutPusatRadian();
        double luasJuringBagian = 0.5 * jariJari * jariJari * sudutRadian;
        double luasSegitigaDalamJuring = 0.5 * jariJari * jariJari * Math.sin(sudutRadian);
        // Menyimpan hasil ke field 'luas' yang diwarisi, tapi dengan nilai Tembereng
        luas = luasJuringBagian - luasSegitigaDalamJuring;
        return luas;
    }

    @Override
    public double hitungKeliling() {
        double sudutRadian = getSudutPusatRadian();
        double panjangBusur = jariJari * sudutRadian;
        double panjangTaliBusur = 2 * jariJari * Math.sin(sudutRadian / 2.0);
        // Menyimpan hasil ke field 'keliling' yang diwarisi, tapi dengan nilai Tembereng
        keliling = panjangBusur + panjangTaliBusur;
        return keliling;
    }

    public double getSudutPusatDerajat() {
        return sudutPusatDerajat;
    }
}