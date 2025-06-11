package geometri.Benda3D;

import geometri.Benda3D.Kerucut;

public class KerucutTerpancung extends Kerucut {

    private double jariJariAtas;
    private double tinggiFrustum;

    protected double garisPelukisFrustumKT;
    protected double volumeKT; // KT untuk KerucutTerpancung, menghindari konflik dengan 'volume' superclass
    protected double luasPermukaanKT;

    public KerucutTerpancung(double jariJariBawah, double jariJariAtas, double tinggiFrustum) {
        super(jariJariBawah, tinggiFrustum); // jariJariBawah menjadi super.jariJari, super.tinggi di-set ke tinggiFrustum (akan di-shadow)
        if (jariJariAtas <= 0 || tinggiFrustum <= 0) { // jariJariBawah sudah divalidasi di superclass Lingkaran
            throw new IllegalArgumentException("Jari-jari atas dan tinggi frustum harus bernilai positif.");
        }
        if (jariJariAtas >= jariJariBawah) { // jariJariBawah diakses via super.getJariJari() atau this.jariJari (karena protected)
            throw new IllegalArgumentException("Jari-jari atas harus lebih kecil dari jari-jari bawah.");
        }
        this.jariJariAtas = jariJariAtas;
        this.tinggiFrustum = tinggiFrustum;
    }

    public double getGarisPelukisFrustum() {
        double selisihJariJari = getJariJari() - jariJariAtas; // getJariJari() adalah jariJariBawah dari superclass
        garisPelukisFrustumKT = Math.sqrt(Math.pow(tinggiFrustum, 2) + Math.pow(selisihJariJari, 2));
        return garisPelukisFrustumKT;
    }

    @Override
    public double hitungVolume() {
        double R = getJariJari();
        double r = jariJariAtas;
        volumeKT = (1.0 / 3.0) * Math.PI * tinggiFrustum * (R*R + R*r + r*r);
        return volumeKT;
    }

    @Override
    public double hitungLuasPermukaan() {
        double R = getJariJari();
        double r = jariJariAtas;

        double luasAlasBawah = Math.PI * R * R;
        double luasAlasAtas = Math.PI * r * r;

        // Memastikan garisPelukisFrustumKT sudah dihitung
        if (garisPelukisFrustumKT == 0) getGarisPelukisFrustum();
        double luasSelimutFrustum = Math.PI * (R + r) * garisPelukisFrustumKT;

        luasPermukaanKT = luasAlasBawah + luasAlasAtas + luasSelimutFrustum;
        return luasPermukaanKT;
    }

    public double getJariJariAtas() {
        return jariJariAtas;
    }

    public double getTinggiFrustum() {
        return tinggiFrustum;
    }
}