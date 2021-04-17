/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Dasari Rahul
 */
public class RemoveDuplicates {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        		ArrayList<Integer> list = new ArrayList<>();
		Scanner sc =new Scanner(System.in);
                System.out.println("Answer for question 1 by Dasari Rahul");
		System.out.println("Enter ten integers: ");
		for(int i=0;i<10;i++)
		{
			list.add(sc.nextInt());
		}
		removeDuplicate(list);
	}

    public static void removeDuplicate(ArrayList<Integer> list) {
        
        ArrayList<Integer> temp = new ArrayList<>();
        int count =0;
        
        for(int i=0;i<list.size();i++)
        {
            for(int j=i;j<list.size();j++)
            {
                if(list.get(i)==list.get(j))
                {
                    count++;
                }
            }
            if(count<=1)
            {
                temp.add(list.get(i));
            }
            count=0;
        }
        
        System.out.println("Removed duplicates");
        for(Integer i : temp)
        {
            System.out.println(i);
        }
       
    }
        
}
  
