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
public class Faculty extends Employee{

	
	private int subjects;
        private double hours;
	public Faculty(String name, String address, String phone, String email,
                String office, double salary, Date dateHired,
			double hours, int subjects) {
		super(name, address, phone, email, office, salary, dateHired);
		this.hours = hours;
		this.subjects = subjects;
	}

	@Override
	public String toString() {
		return "Faculty class :- name=" + getName();
	}
}
