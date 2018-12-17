/**
 * 
 */
package java_prac;

import java.util.Scanner;

/**
 * @author hemanth
 * 
 * Write a program to find sum of 
 * two matrix.
 * 
 * Example:
 * input :
 * matrix_1= [1 2 3 4 5 6 7 8 9]
 * matrix_2 = [9 8 7 6 5 4 3 2 1]
 * output:
 * [10 10 10 10 10 10 10 10 10 10]
 */

public class Sum_of_Two_Matrix {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.println("First Matrix:");
		
		System.out.println("Enter the row size of first matrix");
		//row size for matrox one
		int row1 = in.nextInt();
		
		System.out.println("Enter the column size of first matrix:");
		//column size for matrix one
		int col1  = in.nextInt();
		
		//Declaring First matrix.
		int[][] mat1 = new int[row1][col1];
		System.out.println("insert elements into first matrix:");
		//inserting elements into first matrix
		for (int i = 0; i < row1; i++) {
			for (int j = 0; j <col1; j++) {
				mat1[i][j] = in.nextInt();
			}
		}
		
		
		System.out.println("Second Matrix:");
		
		System.out.println("Enter the row size of second matrix:");
		//row size for matrix 2
		int row2 = in.nextInt();
		
		System.out.println("Enter the column size of second matrix:");
		//column size for matrix 2
		int col2 = in.nextInt();
		
		//Declaring Second matrix
		int[][] mat2 = new int[row2][col2];
		
		System.out.println("insert elements into second matrix:");
		//inserting elements into second matrix
		for (int i = 0; i < row2; i++) {
			for (int j = 0; j <col2; j++) {
				mat2[i][j] = in.nextInt(); 
			}
		}
		
		//adding two matrices..
		for (int i = 0; i < row1; i++) {
			for (int j = 0; j < col1; j++) {
				//Adding second matrix value to first matirx.
				mat1[i][j]+=mat2[i][j];
			}
		}
		
		//Printingfinal added matrix values ina matrix shape.
		System.out.println("Sum of the two matrix is : ");
		for (int i = 0; i < row1; i++) {
			for (int j = 0; j <col1; j++) {
				System.out.print(mat1[i][j]+" ");
			}
			System.out.println();
		}
		
		//Closing Scanner class
		in.close();
	}
}
