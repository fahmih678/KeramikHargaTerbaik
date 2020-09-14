/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package keramikhargaterbaik;

/**
 *
 * @author Fahmi Habibi
 */
public class Perhitungan {
    
    String namaKeramik;
    int sisi1;
    int sisi2;
    int hargaPerBox;
    int jumlahPerBox;
    
    int hitungLuasKeramik(){
        int luas;
        luas = this.sisi1 * this.sisi2;
        
        return luas;
    }
    
    int pcsDibutuhkan(){
        int pcs;
        double pcs2;
        int luasKeramik = this.sisi1 * this.sisi2;
        pcs2 = 1000000 / (double) luasKeramik;
        pcs = 1000000 / luasKeramik;
        if( pcs2 != pcs){
            pcs = pcs+1;
            return pcs;
        } else {
            return pcs; 
        }
    }
    
    int boxDibutuhkan(){
        double box;
        int box2;
        box = (double) pcsDibutuhkan()/this.jumlahPerBox;
        box2 = pcsDibutuhkan()/this.jumlahPerBox;
        if( box2 != box){
            box2 = box2+1;
            return box2;
        } else {
            return box2; 
        }
        
    }
    
    int hargaTotal(){
        int hargaTotal;
        hargaTotal = boxDibutuhkan() * this.hargaPerBox;
        return hargaTotal;
    }
    
    void hasil(){
        System.out.println("Nama Keramik: " + this.namaKeramik);
        /*System.out.println("Luas area yang akan dipasang keramik adalah 100 meter persegi / 1000000 cm persegi");*/
        System.out.println("Luas 1 keramik : " + hitungLuasKeramik() + " cm persegi");
        System.out.println("Keramik yang dibutuhkan untuk luas 100 m persegi sekitar " + pcsDibutuhkan() + " pcs atau sekitar " + boxDibutuhkan()+ " box keramik");
        System.out.println("Harga "+ boxDibutuhkan()+ " box keramik adalah " + hargaTotal() + " rupiah");
    }
    
}
