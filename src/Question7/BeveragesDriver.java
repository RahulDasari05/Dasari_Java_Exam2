/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question7;

import java.util.Scanner;

/**
 *
 * @author Dasari Rahul
 */
public class BeveragesDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Answer for question 7 by Dasari Rahul");
        			Scanner sc = new Scanner(System.in);
		System.out.println("Select a product number to display "
                        + "the price \n 1.Pepsi \n 2.Coke \n"
                        + " 3.Mountain Dew  \n ");
		String temp = sc.nextLine();
		
                
                if(temp.equals("pepsi")||temp.equals("coke")
                        ||temp.equals("mountain dew"))
                {
                    System.out.println("Price of "+temp+" is: "+
                         Beverages.valueOf(temp.toUpperCase()).getPrice()+"$");
                }

	}
    
}
