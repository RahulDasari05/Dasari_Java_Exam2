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
public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

                System.out.println("Answer for question 5 by Dasari Rahul");
		Person p = new Person("Stark","1789 S ",
                        "95761264712","stark@gmail.com");
		Student stu = new Student("Captain Marvel","1215 W ",
                        "9856714364","captainmarvel@gmail.com","+A+");
		Date date = new Date(1998,11,21);
		Date dateHired = new Date(2010,05,11);
		Employee e = new Employee("Arrow","2393 N  "
                        ,"8355736488","arrow@gmail.com","Avengers",
                        2300000,date);
		Faculty f = new Faculty("Hulk",
                        "1213 W ","88855551212","Hulk@gmail.com","Avengers",
                        5000000,dateHired,10,2);
		Staff s = new Staff("Spider man ","1-2-23/11 carolina",
                     "9996661254","spiderman@gmail.com","Avengers",200000,date,
                        "Help");
		System.out.println(p);
		System.out.println(stu);
		System.out.println(e);
		System.out.println(f);
		System.out.println(s);
                
	}

}
