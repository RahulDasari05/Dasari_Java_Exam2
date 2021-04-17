/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question7.example2;

/**
 *
 * @author Dasari Rahul
 */
public enum Cars {
    
    HYUNDAI_VENUE(20000),TESLA(30000),NISSAN_SUNNY(17500);
    
    private double price;

    private Cars(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
    
    
}
