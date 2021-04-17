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
public class Student extends Person{

		private String grade;
		private String status = "Graduate";
	
		public Student(String name, String address, String phone, 
                        String email, String grade) {
			super(name, address, phone, email);
			this.grade = grade;
		}

		@Override
		public String toString() {
			return "Student Class name = " + getName();
		}
}
