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
public class murid_SMP extends murid {
    murid_SMP(String nama, int umur, int kelas){
        super(nama,umur,kelas);
    }
    public void belajar(String mapel)
    {
        System.out.println("siswa SMP Bernama "+ nama + " sedang belajar "+ mapel);
    }
    public void jam_sekolah()
    {
        System.out.println("siswa SMP "+ nama + " masuk kelas jam 6:45 dan pulang jam 13:00");
    }
    public void ujian()
    {
        System.out.println("siswa SMP "+ nama + " melakukan ujian UN");
    }
}
