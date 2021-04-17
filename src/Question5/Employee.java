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
public class Employee extends Person{

	private String office;
	private double salary;
	private Date dateHired;
	
	
	public Employee(String name, String address, String phone, String email,
                String office, double salary,
			Date dateHired) {
		super(name, address, phone, email);
		this.office = office;
		this.salary = salary;
		this.dateHired = dateHired;
	}


	@Override
	public String toString() {
		return "Employee Class :- name=" + getName();
	}
}
