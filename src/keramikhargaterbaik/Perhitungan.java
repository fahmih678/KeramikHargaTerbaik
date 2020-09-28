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
    int luasKeramik;
    
    // Constructor1, 4 argument 
    Perhitungan(int sisi1, int sisi2 , int harga, int jumlah1box){
        this.sisi1 = sisi1;
        this.sisi2 = sisi2;
        // menghitung luas keramik
        this.luasKeramik = sisi1 * sisi2;
        this.hargaPerBox = harga;
        this.jumlahPerBox = jumlah1box;
    }
    //Constructor2, 3 argument 
    Perhitungan(int luaskeramik, int harga, int jumlah1box){
        this.luasKeramik = luaskeramik;
        this.hargaPerBox = harga;
        this.jumlahPerBox = jumlah1box;
    }

    int pcsDibutuhkan(){
        int pcs;
        double pcs2;
        pcs2 = 1000000 / (double) this.luasKeramik;
        pcs = 1000000 / this.luasKeramik;
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
        System.out.println("Luas 1 keramik : " + this.luasKeramik + " cm persegi");
        System.out.println("Keramik yang dibutuhkan untuk luas 100 m persegi sekitar " + pcsDibutuhkan() + " pcs atau sekitar " + boxDibutuhkan()+ " box keramik");
        System.out.println("Harga "+ boxDibutuhkan()+ " box keramik adalah " + hargaTotal() + " rupiah");
    }
    
}
