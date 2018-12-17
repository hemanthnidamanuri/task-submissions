package java_prac;

import java.util.Scanner;

/*Write a program to print odd numbers
 * up to given range or number.
 * Example :
 * Input : 100
 * Output : 1,3,5,...99
 */

public class PrintOddNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter The Range of Integer to print Odd Numbers :=");
		int range = in.nextInt();
		
		System.out.println("Odd numbers up to range are =");
		// loop the number from 0 to range.
		for (int i = 0; i < range; i++) {
			//even numbers divide by to it will give reminder 0.
			//if number modulus 2 cant give 0 it will be an odd number.
			if (i%2!=0) {
				System.out.print(i+",");
				//Output : 1,3,5,...99
			}
		}
		
		//Closing Scanner class.
		in.close();
	}

}
