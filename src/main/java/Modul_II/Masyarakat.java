package Modul_II;

/**
 *
 * @author G.Kristha
 * Program by : Gerardus Kristha_215314004
 */
public class Masyarakat extends Penduduk implements Peserta{
    private String nomor;

    public Masyarakat() {
    }

    public Masyarakat(String nomor) {
        this.nomor = nomor;
    }

    public String getNomor() {
        return nomor;
    }

    public void setNomor(String nomor) {
        this.nomor = nomor;
    }
    
    @Override
     public double hitungIuran(){
        return Integer.parseInt(nomor)*100;
    }
    
    @Override
    public String getKonsumsi(){
        return " \n - snack \n - makan siang";
    };
    
    @Override
    public String getFasilitas(){
        return " \n - block note \n - alat tulis \n - modul pelatihan";
    };
    
    @Override
    public String jenisSertifikat(){
        return "Sertifikat Peserta";
    };
}
