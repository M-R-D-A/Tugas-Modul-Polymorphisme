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
public class laptop1 extends komputer implements MouseBaru, Keyboard{
    
    public void jenis(){
        System.out.println("Jenis Mouse Laptop : " +jenis);
    }
    public void klik_kanan(){
        System.out.println("Mouse laptop : klik kanan....");
    }
    public void klik_kiri(){
        System.out.println("Mouse laptop : klik kiri....");
    }
    public void double_klik(){
        System.out.println("mouse laptop : Double Klik....");
    }
    public void tekan_enter(){
        System.out.println("Keyboard Laptop : Tekan Enter...");
    }
}
