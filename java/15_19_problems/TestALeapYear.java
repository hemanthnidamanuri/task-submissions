/**
 * 
 */
package java_prac;

import java.util.Scanner;

/**
 * @author hemanth
 * 
 * write a program to accept and test 
 * the given year weather its a leap year not
 * 
 * example : 
 *   input : 1984.
 *   output : given yeart is a leap year.
 *
 */
public class TestALeapYear {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter a year to test leap year or not");
		//reading year 
		int year  = in.nextInt();
		//method to find a leap year with year as parameter
		leapyearornot(year);
		//closing scanner class.
		in.close();
	}

	private static void leapyearornot(int year) {
		// TODO Auto-generated method stub
		
		//logic to find a given year is leap or not 
		if ((year%4==0) || (year%400==0) && (year%100!=0)) {
			//printing a leap year
			System.out.println(year+" is a leap year");
		}else {
			//print not a leap year.
			System.out.println(year+" is not a leap year");
		}
	}

}
