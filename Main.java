/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class Main {
    public static void main(String[] args){
        PengunjungReguler visitor[] = new PengunjungReguler[2];
        PengunjungVIP visitorvip[] = new PengunjungVIP[2];
        PengunjungFastTrack visitorfasttrack[] = new PengunjungFastTrack[2];
        
        visitor[0] = new PengunjungReguler("Arji", 25);
        visitor[1] = new PengunjungReguler("Yon", 20);
        
        visitorvip[0] = new PengunjungVIP("Nathaleon", 19, "Silver");
        visitorvip[1] = new PengunjungVIP("Jovano", 19, "Gold");
        
        visitorfasttrack[0] = new PengunjungFastTrack("Raihan", 20);
        visitorfasttrack[1] = new PengunjungFastTrack("Bagas", 20);
        
        //MASUK TAMAN HIBURAN
        for (int i = 0; i < 2; i++){
            System.out.println("Sistem Mendeteksi Orang Bernama " + visitor[i].getNama() + " dengan umur " + visitor[i].getUmur() + " melalui jalur reguler");
            System.out.println("Sistem Mendeteksi Orang Bernama " + visitorfasttrack[i].getNama() + " dengan umur " + visitorfasttrack[i].getUmur() + " melalui jalur fast track");
            System.out.println("Sistem Mendeteksi Orang Bernama " + visitorvip[i].getNama() + " dengan umur " + visitorvip[i].getUmur() + " menggunakan membership " + visitorvip[i].getMembership());
        }
        //MASUK
        for (int i = 0; i < 2; i++){
            visitor[i].masuk();
            visitorfasttrack[i].masuk();
            visitorvip[i].masuk();
        }
        
    }
}
