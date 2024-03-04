/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public abstract class Pengunjung {
    private String nama;
    private int umur;
    private String membershipType;
    
    public Pengunjung(String nama, int umur){
        this.nama = nama;
        this.umur = umur;
    }
    
    public abstract void masukkeTamanHiburan();
    
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }
    
}
