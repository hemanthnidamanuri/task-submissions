/**
 * 
 */
package java_prac;

import java.util.Scanner;

/**
 * @author hemanth
 * 
 * Write a Program to Test weather given Natural numbe
 * is prime or not.
 * Example :
 * input : 3
 * output : given numbe isa prime number.
 * input : 4
 * output : given number is not a prime number.
 */

public class Test_Prime_or_Not {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in  = new Scanner(System.in);
		
		System.out.println("Enter a number to test weather its prime or not:");
		//Dynamically entering value from console.
		int number  = in.nextInt();
		//Declaring a oolean condition.
		
		boolean flag = false;
		/*
		 * if the input is 1 return a  statement nor prime nor composite
		 * else: enter else condition
		 * prime is factors are 1 or  itself 
		 * in give logic if mre than one factor acheived 
		 * boolean flag condition will made true 
		 */
		
		if (number==1) {
			System.out.println(number+"is neither a prime nor a composite number:");
		} else {
			for (int i = 2; i < number/2; i++) {
				if (number%i==0) {
					flag = true;
					break;
				}
			}
		}
		
		/*
		 * if the boolean condition is true then the
		 * given number is not a prime
		 * else it is prime number.
		 */
		if (!flag) {
			System.out.println(number +" is given number is a prime");
		} else {
			System.out.println(number + " is given number is not a prime ");

		}
		in.close();
	}

}
