/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question3;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Dasari Rahul
 */
public class Driver {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Object> list = new ArrayList<>();
		System.out.println("Answer for question 3 by Dasari Rahul");
		Loan l = new Loan(10000,10.5,24);
		String s = "Rahul";
		Circle c = new Circle(5);
                Date d = new Date();
                list.add(c);
		list.add(l);
		list.add(s);
		list.add(d);

		for(Object i : list)
		{
			System.out.println(i);
		}
		
	}

    
}