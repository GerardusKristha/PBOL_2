package Modul_II;

/**
 *
 * @author G.Kristha
 * Program by : Gerardus Kristha_215314004
 */
public class TesClass {
    public static void main(String[] args) {
        UKM ukm = new UKM("Pelatihan Design Aplikasi");
        Mahasiswa ketua = new Mahasiswa("215314004");
        ketua.setNama("Kristha");
        ukm.setKetua(ketua);
        
        Mahasiswa sekretaris = new Mahasiswa("2153141144");
        sekretaris.setNama("Endra");
        ukm.setSekretaris(sekretaris);
        
        Masyarakat msy1 = new Masyarakat("211");
        msy1.setNama("Gerard");
        msy1.setTempatLahir("Yogyakarta");
        msy1.setTanggalLahir("3 Maret 2002");

        Masyarakat msy2 = new Masyarakat("212");
        msy2.setNama("Bayu");
        msy2.setTempatLahir("Sleman");
        msy2.setTanggalLahir("10 November 2000");
        
        Masyarakat msy3 = new Masyarakat("203");
        msy3.setNama("Indra");
        msy3.setTempatLahir("Jakarta");
        msy3.setTanggalLahir("10 Mei 2001");
        
        Masyarakat msy4 = new Masyarakat("221");
        msy4.setNama("Putra");
        msy4.setTempatLahir("Solo");
        msy4.setTanggalLahir("13 April 2003");
        
        Masyarakat []anggota = new Masyarakat[4];
        anggota[0] = msy1;
        anggota[1] = msy2;
        anggota[2] = msy3;
        anggota[3] = msy4;
        
        ukm.setAnggota(anggota);
        System.out.println("----------- UKM "+ ukm.getNamaUnit()+" -----------");
        System.out.println("Daftar Anggota : ");
        int iuran_total = 0;
        for(int i = 0 ; i<anggota.length;i++){
            Masyarakat agt = ukm.getAnggota()[i];
            iuran_total+=agt.hitungIuran();
            System.out.println((i+1)+"."+
                    "   Nama                 : "+agt.getNama()+
                    "\n     Tempat,tanggal lahir : "+agt.getTempatLahir()+
                    " , "+agt.getTanggalLahir()+
                    "\n     Iuran                : "+agt.hitungIuran()+"\n");
        }
        System.out.println("");
        System.out.println("Iuran total seluruh anggota : "+ iuran_total+"\n");
        System.out.println("Fasilitas ketua UKM      : "+ketua.getFasilitas());
        System.out.println("Fasilitas sekretaris UKM : "+sekretaris.getFasilitas());
        System.out.println("Fasilitas anggota UKM    : "+msy1.getFasilitas());
        System.out.println("");
        
        System.out.println("Jenis sertifikat ketua UKM      : "+ ketua.jenisSertifikat());
        System.out.println("Jenis sertifikat sekretaris UKM : "+ sekretaris.jenisSertifikat());
        System.out.println("Jenis sertifikat anggota UKM    : "+msy1.jenisSertifikat());
        System.out.println("");
        
        System.out.println("Konsumsi ketua UKM : "+ ketua.getKonsumsi());
        System.out.println("Konsumsi sekretaris UKM : "+ sekretaris.getKonsumsi());
        System.out.println("Konsumsi anggota UKM : "+ msy1.getKonsumsi());
        
        
    }
}
