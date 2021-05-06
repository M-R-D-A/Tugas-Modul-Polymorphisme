/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul.polimorphisme;

/**
 *
 * @author M. RAFI DUTA ATTALA
 */
public class cetak {
    public static void main (String []args){
        System.out.println("Komputer : ");
        komputer komputer_baru = new komputer();
        komputer_baru.klik_kanan();
        komputer_baru.klik_kiri();
        komputer_baru.double_klik();
        System.out.println("====================");
        
        System.out.println("PC : ");
        PC pc_baru = new PC();
        pc_baru.tekan_enter();
        System.out.println("====================");
        
        System.out.println("Laptop : ROG GL502VD");
        laptop1 laptop_baru = new laptop1();
        laptop_baru.jenis();
        laptop_baru.klik_kanan();
        laptop_baru.klik_kiri();
        laptop_baru.double_klik();
        //laptop_baru.tekan_enter();
    }
}
