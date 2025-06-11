package geometri.Benda3D;

import geometri.Benda3D.Bola;

public class CincinBola extends Bola {

    private double tinggiCincin;
    private double jariJariAlas1;
    private double jariJariAlas2;

    protected double volumeCB; // CB untuk CincinBola
    protected double luasPermukaanLengkungCB;
    protected double luasPermukaanTotalCB;

    public CincinBola(double jariJariBola, double tinggiCincin, double jariJariAlas1, double jariJariAlas2) {
        super(jariJariBola);
        if (tinggiCincin <= 0 || jariJariAlas1 < 0 || jariJariAlas2 < 0) {
            throw new IllegalArgumentException("Tinggi cincin harus positif, dan jari-jari alas tidak boleh negatif.");
        }
        if (tinggiCincin > 2 * jariJariBola) {
            throw new IllegalArgumentException("Tinggi cincin tidak boleh melebihi diameter bola.");
        }
        if (jariJariAlas1 > jariJariBola || jariJariAlas2 > jariJariBola) {
            throw new IllegalArgumentException("Jari-jari alas tidak boleh melebihi jari-jari bola.");
        }
        this.tinggiCincin = tinggiCincin;
        this.jariJariAlas1 = jariJariAlas1;
        this.jariJariAlas2 = jariJariAlas2;
    }

    @Override
    public double hitungVolume() {
        volumeCB = (1.0 / 6.0) * Math.PI * tinggiCincin * (3 * Math.pow(jariJariAlas1, 2) +
                3 * Math.pow(jariJariAlas2, 2) +
                Math.pow(tinggiCincin, 2));
        return volumeCB;
    }

    public double hitungLuasPermukaanLengkung() {
        luasPermukaanLengkungCB = 2 * Math.PI * getJariJari() * tinggiCincin;
        return luasPermukaanLengkungCB;
    }

    @Override
    public double hitungLuasPermukaan() {

        if (luasPermukaanLengkungCB == 0) hitungLuasPermukaanLengkung();

        double luasAlas1Hitung = Math.PI * Math.pow(jariJariAlas1, 2);
        double luasAlas2Hitung = Math.PI * Math.pow(jariJariAlas2, 2);
        luasPermukaanTotalCB = luasPermukaanLengkungCB + luasAlas1Hitung + luasAlas2Hitung;
        return luasPermukaanTotalCB;
    }

    public double getTinggiCincin() {
        return tinggiCincin;
    }

    public double getJariJariAlas1() {
        return jariJariAlas1;
    }

    public double getJariJariAlas2() {
        return jariJariAlas2;
    }
}