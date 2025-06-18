package geometri.Benda3D;

import geometri.Benda2D.Lingkaran;

public class Bola extends Lingkaran {

    public double volume;
    public double luasPermukaanBola;

    public Bola(double jariJari) throws IllegalArgumentException {
        super(jariJari);
        if (jariJari <= 0) {
            throw new IllegalArgumentException("Jari-jari harus lebih besar dari nol.");
        }
    }

    public double hitungVolume() {
        volume = (4.0 / 3.0) * Math.PI * Math.pow(jariJari, 3);
        return volume;
    }

    public double hitungVolume(double jariJari) {
        volume = (4.0 / 3.0) * Math.PI * Math.pow(jariJari, 3);
        return volume;
    }

    public double hitungLuasPermukaan() {
        luasPermukaanBola = 4 * Math.PI * Math.pow(super.jariJari, 2);
        return luasPermukaanBola;
    }

    public double hitungLuasPermukaan(double jariJari) {
        luasPermukaanBola = 4 * Math.PI * Math.pow(jariJari, 2);
        return luasPermukaanBola;
    }

}