/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
public class murid_SMA extends murid implements Ujian_Mandiri
{
    murid_SMA(String nama, int umur, int kelas){
        super(nama,umur,kelas);
    }
    public void belajar(String mapel)
    {
        System.out.println("siswa SMA Bernama "+ nama + " sedang belajar "+mapel);
    }
    public void jam_sekolah()
    {
        System.out.println("siswa SMA "+ nama + " masuk kelas jam 7:00 dan pulang jam 14:00");
    }
    public void ujian()
    {
        System.out.println("siswa SMA "+ nama + " melakukan ujian UTBK");
    }
    public void Ujian_Mandiri()
    {
        System.out.println("siswa SMA "+ nama + " melakukan ujian mandiri ke salah satu universitas");
    }
}
   

