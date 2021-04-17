/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question7.example2;

import java.util.Scanner;

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
        System.out.println("Answer for question 7 by Dasari Rahul");
        Scanner sc = new Scanner(System.in);
		System.out.println("Select a product number to display the"
                        + " Price \n 1.Hyundai Venue \n 2.Tesla \n "
                        + "3.Nissan Sunny \n ");
		int num = sc.nextInt();
		String temp = "";
		if(num == 1)
                  temp = "HYUNDAI_VENUE";
                else if(num == 2)
                    temp = "TESLA";
		else
                    temp= "NISSAN_SUNNY";
					
		if(num == 1 || num == 2 || num == 3)
		{
			System.out.println("Price of "+temp+" is: "+
                               Cars.valueOf(temp.toUpperCase()).getPrice()+"$");
		}

    }
    
}
