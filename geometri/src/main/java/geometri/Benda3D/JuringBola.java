package geometri.Benda3D;

/**
 * Merepresentasikan Juring Bola (Sektor Bola).
 * Juring Bola dibentuk oleh sebuah tembereng bola dan kerucut yang puncaknya
 * berada di pusat bola dan alasnya berimpit dengan alas tembereng.
 */
public class JuringBola extends Bola {

    public double tinggiTemberengDasar;

    // Field untuk menyimpan hasil perhitungan jari-jari alas dari tembereng
    protected double jariJariAlasTembereng;

    // Field 'volume' dan 'luasPermukaanBola' diwarisi dari kelas Bola

    public JuringBola(double jariJariBola, double tinggiTemberengDasar) {
        super(jariJariBola);
        if (tinggiTemberengDasar <= 0 || tinggiTemberengDasar > (2 * jariJariBola)) {
            throw new IllegalArgumentException("Tinggi tembereng dasar harus positif dan tidak melebihi diameter bola.");
        }
        this.tinggiTemberengDasar = tinggiTemberengDasar;
    }

    /**
     * Menghitung dan mengembalikan jari-jari alas tembereng yang membentuk juring.
     * Metode ini memiliki efek samping, yaitu menyimpan hasilnya ke field.
     */
    public double hitungJariJariAlasTembereng() {
        this.jariJariAlasTembereng = Math.sqrt(this.tinggiTemberengDasar * (2 * this.jariJari - this.tinggiTemberengDasar));
        return this.jariJariAlasTembereng;
    }

    /**
     * Menghitung volume juring bola berdasarkan state objek.
     * V = (2/3) * pi * R^2 * h
     */
    @Override
    public double hitungVolume() {
        this.volume = (2.0 / 3.0) * Math.PI * Math.pow(this.jariJari, 2) * this.tinggiTemberengDasar;
        return this.volume;
    }

    /**
     * Menghitung luas permukaan juring bola berdasarkan state objek.
     * L = Luas Tembereng + Luas Selimut Kerucut
     */
    @Override
    public double hitungLuasPermukaan() {
        double luasLengkungTembereng = 2 * Math.PI * this.jariJari * this.tinggiTemberengDasar;

        // Hitung luas selimut kerucut di dalamnya
        double luasSelimutKerucut = 0;
        if (this.tinggiTemberengDasar < (2 * this.jariJari)) { // Hanya ada kerucut jika bukan bola utuh
            // Pastikan jari-jari alas sudah dihitung
            if(this.jariJariAlasTembereng == 0) {
                this.hitungJariJariAlasTembereng();
            }
            luasSelimutKerucut = Math.PI * this.jariJariAlasTembereng * this.jariJari;
        }

        this.luasPermukaanBola = luasLengkungTembereng + luasSelimutKerucut;
        return this.luasPermukaanBola;
    }

    // --- METODE OVERLOAD BARU (SESUAI KONSEP BOLA) ---

    public double hitungVolume(double jariJariBola, double tinggiTemberengDasar) {
        if (jariJariBola <= 0 || tinggiTemberengDasar <= 0) {
            throw new IllegalArgumentException("Input untuk volume tidak valid.");
        }
        this.volume = (2.0 / 3.0) * Math.PI * Math.pow(jariJariBola, 2) * tinggiTemberengDasar;
        return this.volume;
    }

    public double hitungLuasPermukaan(double jariJariBola, double tinggiTemberengDasar) {
        if (jariJariBola <= 0 || tinggiTemberengDasar <= 0) {
            throw new IllegalArgumentException("Input untuk luas permukaan tidak valid.");
        }

        double luasLengkungTembereng = 2 * Math.PI * jariJariBola * tinggiTemberengDasar;

        double luasSelimutKerucut = 0;
        if (tinggiTemberengDasar < (2 * jariJariBola)) {
            double jariJariAlas = Math.sqrt(tinggiTemberengDasar * (2 * jariJariBola - tinggiTemberengDasar));
            luasSelimutKerucut = Math.PI * jariJariAlas * jariJariBola;
        }

        this.luasPermukaanBola = luasLengkungTembereng + luasSelimutKerucut;
        return this.luasPermukaanBola;
    }
}