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
public class TestShape1 {
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        Shape s1 = new Rectangle("red", 4, 5);
        System.out.println(s1);
        System.out.println("Area is " + s1.getArea());
        
        Shape s2 = new Triangle("blue", 4, 5);
        System.out.println(s2);
        System.out.println("Area is "+ s2.getArea());
        
        
        System.out.println("       <<             >>");
        System.out.println("       <<             >>");
        System.out.println("Shape s1 = new Rectangle red, 4, 5");
        System.out.println("Shape = nama dari kerangka, kerangka digunakan sebagai cetak biru di kelas lain");
        System.out.println("s1 digunakan untuk memanggil variable variable yang ada di Rectangle");
        System.out.println("Rectangle digunakan untuk memanggil/mewarisi properti class Rectangle");
        System.out.println("(red,4,5) red mengisi String color, 4 mengisi int base, 5 mengisi int height");
        System.out.println("System.out.println(s1); digunakan untuk mencetak (String color, int length, int width) yang sudah terisi");
        System.out.println("System.out.println(\"Area is \" + s1.getArea()); digunakan untuk mencetak dan memanggil getArea yang fungsinya menghitung variable yang diinput");
        System.out.println("s2 digunakan untuk memanggil variable variable yang ada di triangle");
        System.out.println("triangle digunakan untuk memanggil/mewarisi properti class triangle");
        System.out.println("(\"blue\", 4, 5) blue mengisi String color, 4 mengisi int base, 5 mengisi int height");
        System.out.println("System.out.println(s2); digunakan untuk mencetak (String color, int length, int width) yang sudah terisi");
        System.out.println("System.out.println(\"Area is \"+ s2.getArea()); digunakan untuk memanggil getArea yang fungsinya menghitung variable yang diinput");
    }
}
