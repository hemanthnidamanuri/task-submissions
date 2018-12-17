/**
 * 
 */
package java_prac;

import java.util.Scanner;

/**
 * @author hemanth
 * 
 * Write a program to test weather given integer is orr od even.
 * Example:
 * input = 2
 * output = "given integer is even.
 * input  = 3
 * output = "given integer is odd.
 */

public class Test_OddorEven {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner in  =new Scanner(System.in);
		System.out.println("Enter a number to Test it is even or odd :");
		int number  = in.nextInt();
		/* logic to solve the problem
		 * Every even number will be divide by 2 gives reminder
		 * 0 or elese it will be odd nunumber
		 */
		
		if (number%2==0) {
			//Output of EvenNumber
			System.out.println("given Number is EvenNumber:"+number);
		}else {
			//output of Odd number
			System.out.println("given number is OddNumber:"+number);
		}
		
		//Closing Scanner class.
		in.close();
	}

}
