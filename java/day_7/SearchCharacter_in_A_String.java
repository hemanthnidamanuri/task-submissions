/**
 * 
 */
package day_7;

import java.util.Scanner;

/**
 * @author hemanth
 *
 */
public class SearchCharacter_in_A_String {

	/**
	 * @param args
	 * 
	 * write a program to search particular character in string.
	 * example
	 *   EX : String = "Manjusha"
  
       Our Target Value  = "u" then returns Test Passed
       Our Target Value  = "K" then returns Test Failed

	 */
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		//reading string
		System.out.println("enter a string");
		String string = in.nextLine();
		//targated character
		System.out.println("Enter target character:");
		String tg = in.nextLine();
		
		//logic using contains methods.
		if (string.contains(tg)) {
			System.out.println("Test Passed");
		}else {
			System.out.println("Test Failed");
		}
		
		//closing scanner class.
		in.close();
	}

}
