package geometri;

/**
 * Interface untuk semua bangun geometri.
 * Menyediakan kontrak untuk menghitung luas dan keliling.
 */
public interface BangunGeometri {
    double hitungLuas() throws TolakNilaiException;
    double hitungKeliling() throws TolakNilaiException;
}