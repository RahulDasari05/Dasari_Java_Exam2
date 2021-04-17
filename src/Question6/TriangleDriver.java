/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question6;

import java.util.Scanner;

/**
 *
 * @author Dasari Rahul
 */
public class TriangleDriver {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        System.out.println("Answer for question 6 by Dasari Rahul");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter sides of a triangle :");
        double side1 = scan.nextDouble();
        double side2 = scan.nextDouble();
        double side3 = scan.nextDouble();


        Triangle obj = new Triangle("Red", true, side1, side2, side3);
        System.out.println("Perimeter :" + obj.calcPerimeter());
        System.out.println("Area :" + obj.calcArea());
        System.out.println("Color : " + obj.getColor());
        System.out.println("Color Filled : " + obj.isFilled());

    }

}