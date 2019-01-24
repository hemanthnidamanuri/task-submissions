/**
 * 
 */
package fizzbuzz;

import java.util.Scanner;

/**
 * @author hemanth
 * 
 * Write a method that returns 'Fizz' for multiples of three and 'Buzz' for the multiples of five.

For numbers which are multiples of both three and five return 'FizzBuzz'.

For numbers that are neither, return the input number.


Input(i)  Actual	Expected

1	    1	           1

5	    Buzz          Buzz

15	  FizzBuzz     FizzBuzz

3	    Fizz	            Fizz

121	     121	              121

125	     Buzz	Buzz
  
 *
 */
public class FizzBuzz {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int totalrange = in.nextInt();
		fizzBuzz(totalrange);

	}

	private static void fizzBuzz(int totalrange) {
		// TODO Auto-generated method stub
		for (int i = 0; i < totalrange; i++) {
			if (i % 3 == 0) {
				 System.out.println("Fizz");
			}
			if (i % 5 == 0) {
				System.out.println("Buzz");
			}
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("FizzBuzz");
			} else {
				System.out.println(i);
			}
		}

	}

}
