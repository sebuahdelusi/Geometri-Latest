package geometri.Benda3D;

import geometri.Benda2D.Persegi;

public class PrismaPersegi extends Persegi {


    private double volume;
    private double luasPermukaanPrisma;

    public PrismaPersegi(double sisiAlas) throws IllegalArgumentException {
        super(sisiAlas);
        if (sisiAlas <= 0) {
            throw new IllegalArgumentException("Sisi alas harus lebih besar dari nol.");
        }
    }

    public double hitungVolume() {
        // super.hitungLuas() akan menghitung dan menyimpan luas alas di objek Persegi
        // dan mengembalikannya
        volume = super.hitungLuas() * super.sisi; // Menggunakan sisi sebagai tinggi prisma
        return volume;
    }

    public double hitungVolume(double sisiPersegi) {
        volume = super.hitungLuas(sisiPersegi) * sisiPersegi;
        return volume;
    }

    public double hitungLuasPermukaan() {
        luasPermukaanPrisma = 6 * Math.sqrt(super.hitungLuas());
        return luasPermukaanPrisma;
    }

    public double hitungLuasPermukaan(double sisiPersegi) {
        luasPermukaanPrisma = 6 * Math.sqrt(super.hitungLuas(sisiPersegi));
        return luasPermukaanPrisma;
    }

    public double getVolume() {
        return volume;
    }
    public double getLuasPermukaanPrisma() {
        return luasPermukaanPrisma;
    }
}