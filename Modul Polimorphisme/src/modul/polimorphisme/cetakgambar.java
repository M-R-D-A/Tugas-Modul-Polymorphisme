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
public class cetakgambar extends Bentuk {
    
    private void tampil(Bentuk[] obj){
        //polimorfisme
        //memanggil method yang sama yaitu method gambar() dan hapus()
        // pada masing masing class
        for (int i=0; i<obj.length;i++)
        {
            obj[i].gambar();
            obj[i].hapus();
            System.out.println("=============");
        }
    }
    
    public static void main (String []args){
        Bentuk[] obj = { new lingkaran(),
            new Elips(),
            new segitiga()
        };
        cetakgambar cetak = new cetakgambar();
        
        //menampilkan method gambar() & hapus() pada class bentuk(superclass)
        cetak.gambar();
        cetak.hapus();
        System.out.println("==============");
        //overriding
        //menumpuk method gambar()&hapus()pada class bentuk (superclass)
        //dengan method gamabr()&hapus()pada subclass-nya
        //yaitu class lingkaran, elips dan segitiga
        cetak.tampil(obj);
        } 
    }
