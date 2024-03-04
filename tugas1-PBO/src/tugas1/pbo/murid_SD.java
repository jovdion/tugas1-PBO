package tugas1.pbo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jovan
 */
public class murid_SD extends murid {
    murid_SD(String nama, int umur, int kelas){
        super(nama,umur,kelas);
    }
    public void belajar(String mapel)
    {
        System.out.println("siswa SD Bernama "+ nama + " sedang belajar "+ mapel );
    }
    public void jam_sekolah()
    {
        System.out.println("siswa SD "+ nama + " masuk kelas jam 7:00 dan pulang jam 12:00");
    }
    public void ujian()
    {
        System.out.println("siswa SD "+ nama + " melakukan ujian USBN");
    }
}
