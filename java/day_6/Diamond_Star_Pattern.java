/**
 * 
 */
package java_prac;

import java.util.Scanner;

/**
 * @author hemanth
 * write a program to  print Diamond Star pattern
 * if a given input 
 * Example :
 * input  = 3
 * output  :
 *      * 
	   * * 
	  * * * 
	 * * * * 
	  * * *
	   * *
	    *
 *
 */

public class Diamond_Star_Pattern {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter Input number to prit Diamond pattern:");
		//Dynamically input value.
		int input = in.nextInt();
		
		//Declaring spaces for upper-half-diamond
		int space = input+1;
		
		for (int i = 0; i < input+1; i++) {
			
			//Calculating anf declaring how many stars to be printed in upper hald
			int stars = i*1;
			
			for (int j = 1; j <=space; j++) {
				//printing spaces 
				System.out.print(" ");
			}
			
			//redeucing space to one.
			space--;
			
			for (int k = 0; k <=stars; k++) {
				//printing stars
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		
		//Declaring space as one for second lower diamond
		space = 1;
		
		for (int i = input; i > 0; i--) {
			//Calculating anf declaration of stars.
			int stars = i*1;
			for (int j = 1; j <=space; j++) {
				//printing spaces
				System.out.print(" ");
			}
			//incrementing spaces from 1 to 4
			space++;
			
			for (int j = stars; j>0; j--) {
				//printing stars.
				System.out.print(" "+"*");
			}
			System.out.println();
		}
		//Closing Scanner class
		in.close();
	}
}
