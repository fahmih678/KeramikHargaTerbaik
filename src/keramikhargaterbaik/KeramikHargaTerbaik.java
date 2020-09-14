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
        // TODO code application logic here
        Perhitungan keramikA = new Perhitungan();
        keramikA.namaKeramik = "Keramik A";
        keramikA.sisi1 = 30;
        keramikA.sisi2 = 30;
        keramikA.hargaPerBox = 54000;
        keramikA.jumlahPerBox = 10;
        keramikA.hasil();
        
        System.out.println("\n");
        Perhitungan keramikB = new Perhitungan();
        keramikB.namaKeramik = "Keramik B";
        keramikB.sisi1 = 40;
        keramikB.sisi2 = 40;
        keramikB.hargaPerBox = 65000;
        keramikB.jumlahPerBox = 5;
        keramikB.hasil();
        
        System.out.println("\n");
        Perhitungan keramikC = new Perhitungan();
        keramikC.namaKeramik = "Keramik C";
        keramikC.sisi1 = 30;
        keramikC.sisi2 = 40;
        keramikC.hargaPerBox = 60000;
        keramikC.jumlahPerBox = 8;
        keramikC.hasil();
        
        
        
    }
    
}
