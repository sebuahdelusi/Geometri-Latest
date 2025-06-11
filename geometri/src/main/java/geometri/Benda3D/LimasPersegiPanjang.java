package geometri.Benda3D;

import geometri.Benda2D.PersegiPanjang;

public class LimasPersegiPanjang extends PersegiPanjang {

    private double tinggiLimas;
    protected double volume;
    protected double luasPermukaanLimasPP;
    protected double luasSelubungLimasPP;
    // Tinggi sisi tegak bisa berbeda, jadi tidak disimpan sebagai satu field sederhana

    public LimasPersegiPanjang(double panjangAlas, double lebarAlas, double tinggiLimas) {
        super(panjangAlas, lebarAlas);
        if (tinggiLimas <= 0) {
            throw new IllegalArgumentException("Tinggi limas harus bernilai positif.");
        }
        this.tinggiLimas = tinggiLimas;
    }

    public double hitungVolume() {
        volume = (1.0 / 3.0) * super.hitungLuas() * tinggiLimas;
        return volume;
    }

    public double hitungLuasSelubung() {
        double panjang = getPanjang();
        double lebar = getLebar();

        double ts1 = Math.sqrt(Math.pow(tinggiLimas, 2) + Math.pow(lebar / 2.0, 2));
        double luasSisiTegak1 = 2 * (0.5 * panjang * ts1);

        double ts2 = Math.sqrt(Math.pow(tinggiLimas, 2) + Math.pow(panjang / 2.0, 2));
        double luasSisiTegak2 = 2 * (0.5 * lebar * ts2);

        luasSelubungLimasPP = luasSisiTegak1 + luasSisiTegak2;
        return luasSelubungLimasPP;
    }

    public double hitungLuasPermukaan() {
        double luasAlasLimas = super.hitungLuas();
        // Memastikan luasSelubungLimasPP sudah dihitung
        if (luasSelubungLimasPP == 0) hitungLuasSelubung();
        luasPermukaanLimasPP = luasAlasLimas + luasSelubungLimasPP;
        return luasPermukaanLimasPP;
    }

    public double getTinggiLimas() {
        return tinggiLimas;
    }
}