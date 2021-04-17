/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question7;

/**
 *
 * @author Dasari Rahul
 */
public enum Beverages {
    
    PEPSI(2.3),COKE(2.0),MOUNTAIN_DEW(1.5);

    private double price;
    private Beverages(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    } 
}
