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
public final class LaptopCetak {
    
    private final String barang = "laptop";
    
    private final void cetak(Laptop[] ob, String pemilik){
        System.out.println("Nama Barang : " +barang);
        System.out.println("");
        
        for (int i=0; i<ob.length; i++)
        { ob[i].getMerk();
          ob[i].setPemilik(pemilik);
          ob[i].getPemilik();
          ob[i].tampil();
          ob[i].hapus();
            System.out.println("######################");
        }
        ob = null;
        pemilik = null;
    }
    
    public static void main (String []args){
        String pemilik = "ahmad";
        Laptop[] ob = { new LaptopAsus("Asus"), 
                        new LaptopDeLL("Dell"),
                        new LaptopToshiba("Toshiba")
                      };
        LaptopCetak abc = new LaptopCetak();
        abc.cetak(ob,pemilik);
        
        pemilik = null;
        ob = null;
        abc = null;
        
    }
}
