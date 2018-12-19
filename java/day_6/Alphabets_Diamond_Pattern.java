/**
 * 
 */
package java_prac;

import java.util.Scanner;

/**
 * @author hemanth
 * 
 * write a program to print below pattern
 * example:
 * input no of rows : 7
 * output :
 *       
 *     A 
      ABA 
     ABCBA 
    ABCDCBA 
   ABCDEDCBA 
  ABCDEFEDCBA 
 ABCDEFGFEDCBA 
  ABCDEFEDCBA 
   ABCDEDCBA 
    ABCDCBA 
     ABCBA 
      ABA 
       A 

 * 
 *  
 *
 */
public class Alphabets_Diamond_Pattern {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		//Dynamically taking input fromo user
		System.out.println("Enter no of rows:");
		int rows  = in.nextInt();
		
		//Declaring spaces
		int spaces = rows;
		
		//Upper Half Diamond 
		for (int i = 1; i <=rows; i++) {
			//print spaces
			for (int j = 0; j < spaces; j++) {
				System.out.printf(" ");
			}
			spaces--;
			
			//In upper half diamond alphabets sequence in ascending
			for (int j = 1; j <=i; j++) {
				System.out.print((char)(j+64));
			}
			
			//In upper half diamond alphabets sequence in descending
			for (int j = i-1; j >=1; j--) {
				System.out.print((char)(j+64));
			}
			System.out.println(" ");
		}
		
		//making spaces one for lower diamond
		spaces = 1;
		//lower half diamond
		//printing alphbets from  higher order to lower order
		for (int i = rows-1; i>0; i--) {
			
			//print spaces.
			for (int j = 0; j <=spaces; j++) {
				System.out.printf(" ");
			}
			spaces++;
			
			//ascending order of printing
			for (int j = 1; j <=i; j++) {
				System.out.print((char)(j+64));
			}
			
			//descendinf order of printing
			for (int j = i-1; j >=1; j--) {
				System.out.print((char)(j+64));
			}
			System.out.println(" ");
		}
		
		//closing scanner class
		in.close();
	}
}
