/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question3;

/**
 *
 * @author Dasari Rahul
 */
public class Circle {
    
    private double radius;
	
	
	public Circle(double radius) {
		this.radius = radius;
	}
	public double getRadius() {
		return radius;
	}

	@Override
	public String toString() {
		return "Circle class  The radius is  " + radius ;
	}
	
}
