/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question5;

import java.util.Date;

/**
 *
 * @author Dasari Rahul
 */
public class Staff extends Employee{
	
	private String title;
	public Staff(String name, String address, String phone, String email, 
                String office, double salary, Date date,
			String title) {
		super(name, address, phone, email, office, salary, date);
		this.title = title;
	}
	@Override
	public String toString() {
		return "Staff Class name = " + getName();
	}

}