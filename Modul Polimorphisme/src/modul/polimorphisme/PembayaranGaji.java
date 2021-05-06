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
public class PembayaranGaji {

    /**
     * @param peg
     * @param args the command line arguments
     */
    public int hitungGaji(Pegawai peg){
        
        int Uang = peg.gaji();{
        if(peg instanceof Direktur)
            Uang +=((Direktur)peg).tunjangan();
        if(peg instanceof Staf)
            Uang +=((Staf)peg).Bonus();
        return Uang;
    }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        PembayaranGaji pg=new PembayaranGaji();
        Staf ali=new Staf();
        Direktur tony = new Direktur();
        System.out.println("Gaji yang dibayarakan untuk Staf ="+pg.hitungGaji(ali));
        System.out.println("Gaji yang dibayarkan kepada Direktur+"+pg.hitungGaji(tony));
    }
    
}
