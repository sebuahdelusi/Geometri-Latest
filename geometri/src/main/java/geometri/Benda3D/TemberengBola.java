package geometri.Benda3D;

import geometri.Benda3D.Bola;

public class TemberengBola extends Bola {

    private double tinggiTembereng;
    protected double jariJariAlasTemberengBola;
    protected double volumeTB; // TB untuk TemberengBola
    protected double luasPermukaanLengkungTB;
    protected double luasPermukaanTotalTB;


    public TemberengBola(double jariJariBola, double tinggiTembereng) {
        super(jariJariBola);
        if (tinggiTembereng <= 0 || tinggiTembereng > (2 * jariJariBola) ) {
            throw new IllegalArgumentException("Tinggi tembereng harus positif dan tidak melebihi diameter bola.");
        }
        this.tinggiTembereng = tinggiTembereng;
    }

    public double getJariJariAlasTembereng() {
        jariJariAlasTemberengBola = Math.sqrt(tinggiTembereng * (2 * getJariJari() - tinggiTembereng));
        return jariJariAlasTemberengBola;
    }

    @Override
    public double hitungVolume() {
        volumeTB = (1.0 / 3.0) * Math.PI * Math.pow(tinggiTembereng, 2) * (3 * getJariJari() - tinggiTembereng);
        return volumeTB;
    }

    public double hitungLuasPermukaanLengkung() {
        luasPermukaanLengkungTB = 2 * Math.PI * getJariJari() * tinggiTembereng;
        return luasPermukaanLengkungTB;
    }

    @Override
    public double hitungLuasPermukaan() {
        if (luasPermukaanLengkungTB == 0) hitungLuasPermukaanLengkung();
        if (jariJariAlasTemberengBola == 0 && tinggiTembereng < (2 * getJariJari()) ) getJariJariAlasTembereng();

        double luasAlasActual = 0;
        if (tinggiTembereng < (2* getJariJari())) {
            luasAlasActual = Math.PI * Math.pow(jariJariAlasTemberengBola, 2);
        }

        luasPermukaanTotalTB = luasPermukaanLengkungTB + luasAlasActual;
        return luasPermukaanTotalTB;
    }

    public double getTinggiTembereng() {
        return tinggiTembereng;
    }
}