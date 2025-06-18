package geometri.Benda3D;

import geometri.Benda2D.Lingkaran;
import geometri.TolakNilaiException;

public class Bola extends Lingkaran {

    public double volume;
    public double luasPermukaanBola;

    public Bola(double jariJari){
        super(jariJari);

    }
    public double hitungVolume() throws TolakNilaiException {
        volume = (4.0 / 3.0) * Math.PI * Math.pow(jariJari, 3);
        return volume;
    }

    public double hitungVolume(double jariJari) throws  TolakNilaiException {
        if (jariJari <= 0) {
            throw new TolakNilaiException("Jari-jari harus bernilai positif.");
        }
        volume = (4.0 / 3.0) * Math.PI * Math.pow(jariJari, 3);
        return volume;
    }

    public double hitungLuasPermukaan() throws TolakNilaiException {
        if (super.jariJari <= 0) {
            throw new TolakNilaiException("Jari-jari harus bernilai positif.");
        }
        luasPermukaanBola = 4 * Math.PI * Math.pow(super.jariJari, 2);
        return luasPermukaanBola;
    }

    public double hitungLuasPermukaan(double jariJari) throws TolakNilaiException {
        if (jariJari <= 0) {
            throw new TolakNilaiException("Jari-jari harus bernilai positif.");
        }
        luasPermukaanBola = 4 * Math.PI * Math.pow(jariJari, 2);
        return luasPermukaanBola;
    }

}