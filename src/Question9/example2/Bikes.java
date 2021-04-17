/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question9.example2;

/**
 *
 * @author Dasari Rahul
 */
public interface Bikes {
    
    public default void drive()
    {
        System.out.println("This is driving in Bikes class");
    }
    
    public abstract void gears();
    public abstract void engine();
    
}
