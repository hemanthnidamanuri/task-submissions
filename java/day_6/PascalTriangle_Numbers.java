/**
 * 
 */
package java_prac;

import java.util.Scanner;

/**
 * @author hemanth
 * 
 * Write a program to print  pascal triangle
 * example ;
 * input number of rows : 3
 * output:
 * 			1
 * 	  	1   	1
 *  1   	2   	1 	
 *
 */
public class PascalTriangle_Numbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		//Declaring number of rows dynamically.
		System.out.println("Enter No of rows :");
		int rows = in.nextInt();
		
		//Declaring no spaces.
		int spaces = rows;
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < spaces; j++) {
				//print spaces
				System.out.print(" ");
			}
			spaces--;
			
			/*Declared long beacuse when user given inout more tha2
			 * 12 it bypass int ange so we declare long
			 */
			
			long number = (long)Math.pow(11, i);
			 String make = String.valueOf(number);
			 for (int j = 0; j < make.length(); j++) {
				 //printing pascal triangle.
				System.out.print(make.charAt(j)+" ");
			}
			 System.out.println(" ");
		}
		//Closing scanner class.
		in.close();
	}

}
