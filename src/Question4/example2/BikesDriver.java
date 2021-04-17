/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question4.example2;

/**
 *
 * @author Dasari Rahul
 */
public class BikesDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Answer for question 4 by Dasari Rahul");
        Bikes b = new Bullet();
        
        b.drive();
        b.gears();
        
        System.out.println();
        
        Bikes b1 = new Ninja();
        
                b1.drive();
                b1.gears();
    }
    
}
