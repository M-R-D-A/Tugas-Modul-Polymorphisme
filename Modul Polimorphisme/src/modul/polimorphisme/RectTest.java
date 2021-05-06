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
public class RectTest {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        Rect BalokA = new Rect (2, 3, 5, 6);
        Rect BalokB = new Rect (1, 1, 4, 4);
        
        Rect intersection = BalokA.intersection(BalokB);
        Rect Union = BalokA.Union(BalokB);
        
        String koordinatbalokA = String.format("[%d, %d ; %d,%d]", BalokA.x1, BalokA.y1, BalokA.x2, BalokA.y2);
        String koordinatbalokB = String.format("[%d, %d ; %d,%d]", BalokB.x1, BalokB.y1, BalokB.x2, BalokB.y2);
        String koordinatunion = String.format("[%d, %d ; %d,%d]", Union.x1, Union.y1, Union.x2, Union.y2);
        String koordinatintersection = String.format("[%d, %d ; %d,%d]", intersection.x1, intersection.y1, intersection.x2, intersection.y2);
        
        System.out.println("<" + BalokA.x1 + BalokA.y1 + "> is inside the unions");
        System.out.println(koordinatbalokB + "union"+koordinatbalokA + " = " + koordinatunion);
        System.out.println(koordinatbalokB + "intersection" + koordinatbalokA + " = " + koordinatintersection);
    }
    
}
