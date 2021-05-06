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
public class PC extends komputer implements Keyboard {
    
    public void tekan_enter(){
        System.out.println("Keyboard PC : Tekan Enter....");
    }
}
