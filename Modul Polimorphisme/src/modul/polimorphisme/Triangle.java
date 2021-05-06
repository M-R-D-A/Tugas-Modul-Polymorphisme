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
public class Triangle extends Shape {
    public int base;
    public int height;

    public Triangle(String color, int length, int width) {
        super(color);
        this.base = base;
        this.height = height;
    }
    
    @Override
    public String toString(){
        return "Triangle[base="+base+",height="+height+","+super.toString()+"]";
    }
    @Override
    public double getArea(){
        return 0.5*base*height;
    }
    
}
