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
public class Elips extends Bentuk {
    @Override
    protected void gambar(){
        System.out.println("subclass -> Menggambar Elips");
    }
    @Override
    protected void hapus(){
        System.out.println("subclass -> Menghapus Gambar Elips");
    }
}
