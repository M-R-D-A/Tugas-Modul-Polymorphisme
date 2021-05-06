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
public abstract class Laptop{
        // abstract class
        protected String merk,pemilik;
        //attribut class
        
        protected abstract void setMerk(String merk);
        protected abstract String getMerk();
        protected abstract void setPemilik(String pemilik);
        protected abstract String getPemilik();
        protected abstract void tampil();
        protected abstract void hapus();
        //abstract method
        
        protected void hidupkanLaptop(){
            System.out.println("hidupkan laptop");
            //method biasa
        }
    
}
