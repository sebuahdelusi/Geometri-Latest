package geometri.Benda3D;

/**
 * Merepresentasikan bangun ruang Tembereng Bola (Segmen Bola).
 * Tembereng Bola adalah bagian dari Bola yang dipotong oleh sebuah bidang datar.
 */
public class TemberengBola extends Bola {

    // Dimensi dibuat public agar konsisten dengan superclass
    public double tinggiTembereng;

    // Field untuk menyimpan hasil perhitungan perantara
    protected double jariJariAlas;
    protected double luasPermukaanLengkung;

    // Field 'volume' dan 'luasPermukaanBola' diwarisi dari kelas Bola

    public TemberengBola(double jariJariBola, double tinggiTembereng) {
        super(jariJariBola);
        if (tinggiTembereng <= 0 || tinggiTembereng > (2 * jariJariBola) ) {
            throw new IllegalArgumentException("Tinggi tembereng harus positif dan tidak melebihi diameter bola.");
        }
        this.tinggiTembereng = tinggiTembereng;
    }

    /**
     * Menghitung dan mengembalikan jari-jari alas tembereng.
     * Metode ini diubah namanya dari get... menjadi hitung... untuk kejelasan.
     */
    public double hitungJariJariAlas() {
        // Menggunakan field public secara langsung
        this.jariJariAlas = Math.sqrt(this.tinggiTembereng * (2 * this.jariJari - this.tinggiTembereng));
        return this.jariJariAlas;
    }

    /**
     * Menghitung volume tembereng bola berdasarkan state objek.
     * V = (1/3) * pi * h^2 * (3R - h)
     */
    @Override
    public double hitungVolume() {
        // Menggunakan field 'volume' yang diwarisi
        this.volume = (1.0 / 3.0) * Math.PI * Math.pow(this.tinggiTembereng, 2) * (3 * this.jariJari - this.tinggiTembereng);
        return this.volume;
    }

    /**
     * Menghitung luas permukaan lengkung (selimut) tembereng berdasarkan state objek.
     */
    public double hitungLuasPermukaanLengkung() {
        this.luasPermukaanLengkung = 2 * Math.PI * this.jariJari * this.tinggiTembereng;
        return this.luasPermukaanLengkung;
    }

    /**
     * Menghitung luas permukaan total tembereng bola berdasarkan state objek.
     * L = Luas Selimut Lengkung + Luas Alas
     */
    @Override
    public double hitungLuasPermukaan() {
        double luasLengkung = this.hitungLuasPermukaanLengkung();

        double luasAlasTembereng = 0;
        // Tembereng adalah bola utuh jika tingginya sama dengan diameter
        if (this.tinggiTembereng < (2 * this.jariJari)) {
            // Memanggil metode hitung untuk mendapatkan jari-jari alas
            double rAlas = this.hitungJariJariAlas();
            luasAlasTembereng = Math.PI * Math.pow(rAlas, 2);
        }

        // Menggunakan field 'luasPermukaanBola' yang diwarisi
        this.luasPermukaanBola = luasLengkung + luasAlasTembereng;
        return this.luasPermukaanBola;
    }

    // --- METODE OVERLOAD BARU (SESUAI KONSEP BOLA) ---

    public double hitungVolume(double jariJariBola, double tinggiTembereng) {
        if (jariJariBola <= 0 || tinggiTembereng <= 0 || tinggiTembereng > (2 * jariJariBola)) {
            throw new IllegalArgumentException("Dimensi untuk volume tidak valid.");
        }
        this.volume = (1.0 / 3.0) * Math.PI * Math.pow(tinggiTembereng, 2) * (3 * jariJariBola - tinggiTembereng);
        return this.volume;
    }

    public double hitungLuasPermukaan(double jariJariBola, double tinggiTembereng) {
        if (jariJariBola <= 0 || tinggiTembereng <= 0 || tinggiTembereng > (2 * jariJariBola)) {
            throw new IllegalArgumentException("Dimensi untuk luas permukaan tidak valid.");
        }
        double luasLengkung = 2 * Math.PI * jariJariBola * tinggiTembereng;

        double luasAlasTembereng = 0;
        if (tinggiTembereng < (2 * jariJariBola)) {
            double rAlas = Math.sqrt(tinggiTembereng * (2 * jariJariBola - tinggiTembereng));
            luasAlasTembereng = Math.PI * Math.pow(rAlas, 2);
        }

        this.luasPermukaanBola = luasLengkung + luasAlasTembereng;
        return this.luasPermukaanBola;
    }
}