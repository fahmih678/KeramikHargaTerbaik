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
public class KeramikHargaTerbaik {

    /**
     * @param args the command line arguments
     */
            
    public static void main(String[] args) {
        // KeramikHargaTerbaik v.2
        
        /* New feature update
        - input nilai mudah
        - inisiasi lebih ringkas
        - 2 cara input nilai
        1. jika diketahui kedua sisi keramik
        cara nya dengan memasukkan 4 argument:
        Perhitungan ... = new Perhitungan(sisi1(cm), sisi2(cm), harga keramik /box, jumlah keramik /box);
        2. jika diketahui luas keramik
        cara nya dengan memasukkan 3 argument:
        Perhitungan ... = new Perhitungan(luas keramik, harga keramik /box, jumlah keramik /box);
        */
        
        // menggunakan cara 1        
        Perhitungan keramikA = new Perhitungan(30,30,54000,10);
        keramikA.namaKeramik = "Keramik A";
        keramikA.hasil();   
        
        System.out.println("\n");
        // menggunakan cara 2        
        Perhitungan keramikB = new Perhitungan(1600, 65000, 5);
        keramikB.namaKeramik = "Keramik B";
        keramikB.hasil();
        
        System.out.println("\n");
        
        Perhitungan keramikC = new Perhitungan(1200, 60000, 8);
        keramikC.namaKeramik = "Keramik C";
        keramikC.hasil();
     
    }
    
}
