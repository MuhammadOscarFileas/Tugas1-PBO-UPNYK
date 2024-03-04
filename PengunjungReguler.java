/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class PengunjungReguler extends Pengunjung implements BehaviorPengunjung{
    public PengunjungReguler(String nama, int umur){
        super(nama, umur);
    }
    
    public void masukkeTamanHiburan(){
        System.out.println(getNama() + " dengan umur : " + getUmur() + " masuk ke taman hiburan(Reguler)");
    }
    
    public void masuk(){
        System.out.println(getNama() + " masuk ke taman hiburan");
    }
    
    public void mengantri(){
        System.out.println(getNama() + " sedang mengantri ");
    }
    
    public void menggunakanfasilitas(String fasilitas){
        System.out.println(getNama() + " Menggunakan Fasilitas " + fasilitas);
    }
    
}
