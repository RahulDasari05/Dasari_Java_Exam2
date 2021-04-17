/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question8.example2;

/**
 *
 * @author Dasari Rahul
 */
public abstract class Dog {
    
    public void eat()
    {
        System.out.println("This is eat from Dog class");
    }
    
    public void sleep()
    {
        System.out.println("This is sleep from Dog class");
    }
    
    public abstract void bark();
    public abstract void bite();
}
