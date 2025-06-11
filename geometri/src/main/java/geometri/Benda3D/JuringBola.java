package geometri.Benda3D;

import geometri.Benda3D.Bola;

public class JuringBola extends Bola {

    private double tinggiTemberengDasar;
    protected double jariJariAlasTemberengDasarJB; // JB untuk JuringBola
    protected double volumeJB;
    protected double luasPermukaanJB;

    public JuringBola(double jariJariBola, double tinggiTemberengDasar) {
        super(jariJariBola);
        if (tinggiTemberengDasar <= 0 || tinggiTemberengDasar > (2 * jariJariBola)) {
            throw new IllegalArgumentException("Tinggi tembereng dasar harus positif dan tidak melebihi diameter bola.");
        }
        this.tinggiTemberengDasar = tinggiTemberengDasar;
    }

    public double getJariJariAlasTembereng() {
        jariJariAlasTemberengDasarJB = Math.sqrt(tinggiTemberengDasar * (2 * getJariJari() - tinggiTemberengDasar));
        return jariJariAlasTemberengDasarJB;
    }

    @Override
    public double hitungVolume() {
        volumeJB = (2.0 / 3.0) * Math.PI * Math.pow(getJariJari(), 2) * tinggiTemberengDasar;
        return volumeJB;
    }

    @Override
    public double hitungLuasPermukaan() {
        double R_bola = getJariJari();
        if (jariJariAlasTemberengDasarJB == 0 && tinggiTemberengDasar < (2 * R_bola)) getJariJariAlasTembereng();

        double luasLengkungTembereng = 2 * Math.PI * R_bola * tinggiTemberengDasar;
        double luasSelimutKerucutDalam = 0;
        if (tinggiTemberengDasar < (2 * R_bola)) { // Hanya ada selimut kerucut jika bukan bola utuh
            luasSelimutKerucutDalam = Math.PI * jariJariAlasTemberengDasarJB * R_bola;
        }

        luasPermukaanJB = luasLengkungTembereng + luasSelimutKerucutDalam;
        return luasPermukaanJB;
    }

    public double getTinggiTemberengDasar() {
        return tinggiTemberengDasar;
    }
}