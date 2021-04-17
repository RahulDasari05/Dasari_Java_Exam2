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
public class Ninja implements Bikes{

    @Override
    public void gears() {
        System.out.println("This is Gears in Ninja class");
    }

    @Override
    public void engine() {
        System.out.println("This is upgraded in Ninja Class");
    }
    
}
