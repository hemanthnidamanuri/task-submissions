/**
 * 
 */
package java_exam;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author hemanth Java program to create a matrix and fill it with prime
 *         numbers In this java program, we are creating a matrix and filling
 *         the matrix elements with prime numbers starting from 1. Submitted by
 *         IncludeHelp, on December 30, 2017 Given number of rows and cols of a
 *         matrix and we have to fill it with the prime numbers using java
 *         program. Example: Input: Rows: 3 Cols: 3 Output: Matrix: 2 3 5 7 11
 *         13 17 19 23
 *
 * 
 */
public class Matrix_PrimeNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter no of rows:");
		int rows = in.nextInt();
		System.out.println("Enter no of columns:");
		int cols = in.nextInt();
		int[][] prime_matrix = new int[rows][cols];
		int required_numbers = rows * cols;
		Object[] prime_number = primenumberlogic(required_numbers);
		int[] required = new int[required_numbers];
		for (int i = 0; i < required_numbers; i++) {
			required[i] = (int) prime_number[i];
		}
		int count = 0;
			for (int i1 = 0; i1 < rows; i1++) {
				for (int j = 0; j < cols; j++) {
					prime_matrix[i1][j] = required[count];
					count++;
				}
			}
		
		System.out.println("prime numbers in matrix are:");
		for (int i1 = 0; i1 < rows; i1++) {
			for (int j = 0; j < cols; j++) {
				System.out.print(prime_matrix[i1][j]+" ");
			}
			System.out.println(" ");
		}
		in.close();
	}

	private static Object[] primenumberlogic(int required_numbers) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<>();
		int count = 0;
		for (int i = 2; i <= 1000; i++) {
			count = 0;
			for (int j = required_numbers; j >= 1; j--) {
				if (i % j == 0) {
					count++;

				}
			}
			if (count == 2) {
				list.add(i);
			}
		}
		Object[] obj = list.toArray();
		return obj;
	}

}
