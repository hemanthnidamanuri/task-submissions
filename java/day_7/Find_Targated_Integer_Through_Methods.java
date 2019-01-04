/**
 * 
 */
package day_7;

import java.util.Scanner;

/**
 * @author hemanth
 * 
 * write a program to find targated integer through methods
 * 
 * input : 2
 * 
 * output : required parameter find 
 *
 */


public class Find_Targated_Integer_Through_Methods {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
//		read array length 
		System.out.println("Enter the length of array");
		int length =  in.nextInt();
		
		//declaring array
		int[] arr = new int[length];
		
//		reading integers into array
		for (int i = 0; i < arr.length; i++) {
			arr[i] = in.nextInt();
		}
		
		//targated integer to find 
		System.out.println("Enter parameter to find");
		int tg = in.nextInt();
		
		//declaring boolean 
		boolean flag  = false;
		
		//method to find and get the value
		boolean ase = findinteger(arr,tg,flag);
		
		//concluding final statement
		if (ase==true) {
			System.out.println("required parameter found in array ");
		} else {
			System.out.println("required parameter does not found in array");
		}
		
		//closing scanner class 
		in.close();
	}

//	methods to find the the targated integer
	private static boolean findinteger(int[] arr, int tg, boolean flag) {
		// TODO Auto-generated method stub
		
		//logic if equals it will change boolean to true
		for (int i = 0; i < arr.length; i++) {
			if (tg==arr[i]) {
				flag = true;
			}
		}
		
		//return the value.
		if (flag) {
			return true;
		} else {
			return false;
		}
	}
}
