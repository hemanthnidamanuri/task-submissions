/**
 * 
 */
package day_7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * @author hemanth
 * 
 *         write a program to find a missing numbers in array of length n-1 and
 *         range of 1 to n.
 *         example:
 *         input : 2 5 8 10 
 *         output : 1 3 4 6 7 9sss
 */
public class MissingNumber_in_Array {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		//declaring arraylist
		ArrayList<Integer> list = new ArrayList<>();
		
		//range of array length
		int length  = in.nextInt();
		
		//declaration of array 
		int[] arr = new int[length];
		System.out.println("insert elemnts into array:");
		//inserting elements into array.
		for (int i = 0; i < length; i++) {
			arr[i] = in.nextInt();
		}
		//sorting array
		Arrays.sort(arr);
		
		//finding range of n
		int end = arr[length-1];
		
		//inserting 1 to range elements into a list
		for (int i = 1; i < end; i++) {
			list.add(i);
		}
		
		//logic: if we find common elements to array and list we romve it fromlist
		// so remianing numbers are missed numbers from  list
		for (int i = 0; i < list.size(); i++) {
			for (int j = 0; j < arr.length; j++) {
				if (list.get(i)==arr[j]) {
					list.remove(i);
				}
			}
		}
		
		//converting list to array
		Object[] object = list.toArray();
		
		//printing missinig numbers in array.
		System.out.println("Missed elemnts in array are:");
		for (Object x : object) {
			System.out.print(x+" ");
		}
		
		//closing scanner class
		in.close();
	}
}
