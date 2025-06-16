package geometri;

/**
 * Kelas abstrak dasar untuk bangun geometri.
 * Menyediakan atribut nama dan implementasi dasar.
 * Semua bangun datar konkret akan mewarisi dari kelas ini.
 */
public abstract class AbstractGeometriDasar implements BangunGeometri {
    protected String namaBangun;
    public AbstractGeometriDasar(String namaBangun) {
        this.namaBangun = namaBangun;
    }
    public String getNamaBangun() {
        return namaBangun;
    }

}