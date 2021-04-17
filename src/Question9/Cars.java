/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question9;

/**
 *
 * @author Dasari Rahul
 */
public interface Cars {
    
    public default void drive()
    {
        System.out.println("This is drive method in Cars interface");
    }
    
    public abstract void cruise();
    public abstract void sunRoof();
    
}
