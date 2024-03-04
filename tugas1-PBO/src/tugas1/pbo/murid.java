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
public abstract class murid {
    protected String nama;
    protected int kelas;

    /**
     *
     */
    protected int umur;
    
    public murid(String nama, int umur,int kelas){
        this.nama = nama;
        this.kelas = kelas;
        this.umur = umur;
        
    }
    abstract void belajar(String mapel);
    abstract void jam_sekolah();
    abstract void ujian();
    
    public void identitas(){
        System.out.println("nama  : "+nama);
        System.out.println("umur  : "+umur);
        System.out.println("kelas : "+kelas);
        
    }
}
