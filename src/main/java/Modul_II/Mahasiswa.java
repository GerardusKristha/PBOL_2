package Modul_II;

/**
 *
 * @author G.Kristha
 * Program by : Gerardus Kristha_215314004
 */
public class Mahasiswa extends Penduduk implements Peserta {
    private String nim;

    public Mahasiswa(){
    }
    
    public Mahasiswa(String nim) {
        this.nim = nim;
    }
    
    public String getNim(){
        return nim;
    }
    
    public void setNim(String nim){
        this.nim=nim;
    }
    @Override
    public double hitungIuran(){
        return Integer.parseInt(nim)/10000;
    }
    
    @Override
    public String getKonsumsi(){
        return " \n - snack \n - makan siang \n - makan malam";
    };
    
    @Override
    public String getFasilitas(){
        return " \n - block note \n - alat tulis \n - laptop";
    };
    
    public String jenisSertifikat(){
        return "Sertifikat Panitia";
    };
}
