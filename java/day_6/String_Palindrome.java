/**
 * 
 */
package java_prac;

import java.util.Scanner;

/**
 * @author hemanth
 * 
 * write a program to test a given string is palidrome
 * or not.
 * Example : 
 * input : madam
 * output : given String is not a palindrome.
 * input : hemanth
 * output : given string is not a palindrome.
 *
 */

public class String_Palindrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		//Declaring an empty string
		String second ="";
		
		System.out.println("Enter String to check its a palindrome or not:");
		//Reading value dynamically
		String str = in.nextLine();
		//length of String
		int length = str.length();
		//reversing a  string and concatinatio to second
		for (int i = length-1; i >=0 ; i--) {
			second=second.concat(String.valueOf(str.charAt(i)));
		}
		
		//compare with equal ignorcase where it doesnt
		// consider uppercase or lowercase, it check in 
		// string from first to last anf in second from last
		//  to last if its same it is palidrome or not
		
		if (str.equalsIgnoreCase(second)) {
			System.out.println((str)+"is a palindrome");
		} else {
			System.out.println((str)+" is not a palindrome");
		}
		
		//closing Scanner class
		in.close();
	}
}
