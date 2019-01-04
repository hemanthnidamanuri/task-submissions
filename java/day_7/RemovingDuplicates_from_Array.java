/**
 * 
 */
package day_7;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author hemanth
 *
 */
public class RemovingDuplicates_from_Array {

	/**
	 * @param args
	 * 
	 * write a program to remove duplicates from array 
	 * 
	 * example:
	 * 
	 * input:
	 *  1 1 2 3 4
	 * output:
	 *  1 2 3 4
	 *  
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		//declaring arraylist 
		ArrayList<Integer> list = new ArrayList<>();
		
		//defing length for array
		int length  = in.nextInt();
		int[] arr = new int[length];
		
		//inserting elements into array.
		for (int i = 0; i < arr.length; i++) {
			arr[i] = in.nextInt();
		}
		
		//logic we assume a empty list an insert first elemntt we compare and insert all
		// all elements into list with out duplicates.
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (i!=j) {
					if (!list.contains(arr[i])) {
						list.add(arr[i]);
					}
				}
			}
		}
		
		//converting list into array.
		Object[] each  = list.toArray();
		
		//printing elemnts after removal duplicates.
		for (Object object : each) {
			System.out.println(object);
		}
		
		//scanner class.
		in.close();
	}

}
