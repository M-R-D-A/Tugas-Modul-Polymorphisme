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
public class Main01 {
    
    public static void main (String[] args){
        Line Budi  = new Line (81,13,-5,7);
        Line Siti = new Line (12,78,-6,8);
        
        System.out.println("tinggi badan Budi : "+ Budi.getLength());
        System.out.println("tinggi badan Siti : "+ Siti.getLength());
        
        if(Budi.isGreater(Budi,Siti)){
            System.out.println("Tinggi badan Budi lebih tinggi daripada Siti");
        }else if(Budi.isLess(Budi,Siti)){
            System.out.println("Tinggi badan Budi lebih pendek daripada Siti");
        }else if(Budi.isEqual(Budi, Siti)){
            System.out.println("Tinggi badan Budi sama dengan tinggi Siti");
        }
    }
}
