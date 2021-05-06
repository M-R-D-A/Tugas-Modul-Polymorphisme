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
public class Rectangle extends Shape{
    public int length;
    public int width;
    
    public Rectangle(String color, int length, int width){
        super(color);
        this.length = length;
        this. width = width;
    }
    @Override
    public String toString(){
        return "Rectangle[length="+length +",width="+"," +super.toString()+"]";
    }
    @Override
    public double getArea(){
        return length+width;
    }
}
