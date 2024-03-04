/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas1.pbo;

/**
 *
 * @author jovan
 */
public class Tugas1PBO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        murid_SD MSD = new murid_SD("Tirto",8,2);
        MSD.identitas();
        MSD.belajar("tematik");
        MSD.jam_sekolah();
        MSD.ujian();
        
        murid_SMP MSMP = new murid_SMP("Ridwan",14,8);
        MSMP.identitas();
        MSMP.belajar("prakarya");
        MSMP.jam_sekolah();
        MSMP.ujian();
        
        murid_SMA MSMA = new murid_SMA("Adit",18,12);
        MSMA.identitas();
        MSMA.belajar("Sosiologi");
        MSMA.jam_sekolah();
        MSMA.ujian();
        MSMA.Ujian_Mandiri();
        
    }
    
}
