package Modul_II;

/**
 *
 * @author G.Kristha
 * Program by : Gerardus Kristha_215314004
 */
public class UKM {
    private String namaUnit;
    private Mahasiswa ketua;
    private Mahasiswa sekretaris;
    private Masyarakat[] anggota;
    
    public UKM(){
    
    }
    
    public UKM(String namaUnit){
        this.namaUnit = namaUnit;
    }

    public String getNamaUnit() {
        return namaUnit;
    }

    public void setNamaUnit(String namaUnit) {
        this.namaUnit = namaUnit;
    }

    public Mahasiswa getKetua() {
        return ketua;
    }

    public void setKetua(Mahasiswa ketua) {
        this.ketua = ketua;
    }

    public Mahasiswa getSekretaris() {
        return sekretaris;
    }

    public void setSekretaris(Mahasiswa sekretaris) {
        this.sekretaris = sekretaris;
    }

    public Masyarakat[] getAnggota() {
        return anggota;
    }

    public void setAnggota(Masyarakat[] anggota) {
        this.anggota = anggota;
    }
    
    
}
