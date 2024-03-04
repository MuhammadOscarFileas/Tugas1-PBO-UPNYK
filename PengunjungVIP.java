/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class PengunjungVIP extends Pengunjung implements BehaviorPengunjung {
    private String membershipType;
    
    public PengunjungVIP(String nama, int umur, String membership){
        super(nama, umur);
        this.membershipType = membershipType;
    }
    
    public void masukkeTamanHiburan(){
        System.out.println(getNama() + " dengan umur : " + getUmur() + " masuk ke taman hiburan(VIP)");
        System.out.println("Mendapat Akses Eksklusif");
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
    
    public String getMembership(){
        return membershipType;
    }
    
}
