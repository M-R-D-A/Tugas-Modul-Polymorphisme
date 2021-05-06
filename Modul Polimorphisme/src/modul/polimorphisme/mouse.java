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
public interface mouse {
    String jenis = "laser mouse";
    //method interface harus public 
    public void klik_kanan();
    public void klik_kiri();
    // tidak boleh ada method normal/biasa
    //yang terdapat isi method nya
}
