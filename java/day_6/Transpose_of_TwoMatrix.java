/**
 * 
 */
package java_prac;

import java.util.Scanner;

/**
 * @author hemanth
 *
 */
public class Transpose_of_TwoMatrix {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.println("First Matrix:");
		System.out.println("Enter the row size of first matrix");
		int row1 = in.nextInt();
		
		System.out.println("Enter the column size of first matrix:");
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
		int row2 = in.nextInt();
		
		System.out.println("Enter the column size of second matrix:");
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
		
		// Transpose of Two matrix.
		for (int i = 0; i < col1; i++) {
			for (int j = 0; j < row1; j++) {
				mat1[j][i]+=mat2[j][i];
			}
		}

		System.out.println("Transpose of Two matrix is :");
		for (int i = 0; i <col1; i++) {
			for (int j = 0; j <row1; j++) {
				System.out.print(mat1[j][i]+" ");
			}
			System.out.println();
		}
		
		//Closing Scanner class.
		in.close();
	}
}
