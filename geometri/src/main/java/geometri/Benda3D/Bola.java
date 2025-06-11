package geometri.Benda3D;

import geometri.Benda2D.Lingkaran;

public class Bola extends Lingkaran {

    protected double volume;
    protected double luasPermukaanBola;

    public Bola(double jariJari) {
        super(jariJari, "Bola (berbasis Lingkaran)");
    }

    public double hitungVolume() {
        volume = (4.0 / 3.0) * Math.PI * Math.pow(jariJari, 3);
        return volume;
    }

    public double hitungLuasPermukaan() {
        luasPermukaanBola = 4 * Math.PI * Math.pow(jariJari, 2);
        return luasPermukaanBola;
    }

    public double hitungLuasPenampangTengah() {
        
        return super.hitungLuas();
    }

    public double hitungKelilingLingkaranBesar() {
        return super.hitungKeliling();
    }
}