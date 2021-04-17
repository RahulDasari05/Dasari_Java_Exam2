/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question5;

/**
 *
 * @author Dasari Rahul
 */
public class Person {
	
	private String name;
	private String address;
	private String phoneNumber;
	private String email;
	
	public Person(String name, String address, String phoneNumber,
                String email) {
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Person Class :- name=" + getName();
	}
	
	
	
	

}

