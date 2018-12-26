/**
 * 
 */
package java_prac;

import java.util.Scanner;

/**
 * @author hemanth
 * write a program to print multiplication table
 * Example : 
 * input = 5 ;
 * output :
 * 5 * 1 = 5
 * 5 * 2 = 10
 *  ..
 *  5 * 10 = 50
 */
public class MultiplicationTable {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter a number to print its multiplication table:");
		//Reading value dynamically.
		int number = in.nextInt();
		
		for (byte i = 0; i <=20; i++) {
			//Logic to print Multiplication Table.
			System.out.println(number+"*"+i+"="+(number*i));
		}
		
		//Closing Scanner class.
		in.close();
	}

}
