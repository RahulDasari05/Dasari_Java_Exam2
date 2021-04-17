/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question2;

import java.util.Scanner;

/**
 *
 * @author Dasari Rahul
 */
public class TwoDArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        		int m1[][]=new int[3][3];
		int m2[][]=new int[3][3];
		System.out.println("Answer for question 2 by Dasari Rahul");
		Scanner sc =new Scanner(System.in);	
		System.out.println("Enter list1: ");
		for(int i=0;i<m1.length;i++)
		{
			for(int j=0;j<m1[i].length;j++)
				m1[i][j]=sc.nextInt();
		}
		System.out.println("Enter list2: ");
		for(int i=0;i<m2.length;i++)
		{
			for(int j=0;j<m2[i].length;j++)
			m2[i][j]=sc.nextInt();	
		}
		boolean temp = equals(m1,m2);
		if(temp == true)
                    System.out.println("The two arrays are strictly identical");
		else 
                System.out.println("The two arrays are not strictly identical");
		

    }

    public static boolean equals(int[][] m1, int[][] m2) {
		int temp=0;
		
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
               if(m1[i][j]==m2[i][j]) 
               temp++;

            }
        }
        return (temp==9)?true:false;
    }
    
}
