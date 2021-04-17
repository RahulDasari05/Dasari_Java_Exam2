/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question4;

/**
 *
 * @author Dasari Rahul
 */
public class CarsDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Answer for question 4 by Dasari Rahul");
        
        Cars c = new Benz(); //Late binding polymorphism
        
        c.drive(); 
        c.steering(); // we dont have steering method in Benz class
        //so this will get from parent class this process is called 
        //polymorphic substituion and the process is called inheritance
        
        System.out.println();
        
        Cars c1 = new BMW();
        c1.drive();
        c1.steering();
             
    }
    
}
