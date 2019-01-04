package day_7;

import java.util.Arrays;
import java.util.Scanner;

/*
 * @author hemanth
 * 
 * write a  program for Given a sorted array and a target value, 
 * return the index if the target is found. If not, return 
 * the index where it would be if it were inserted in order.
	example
	 input : 2
	 output : 3
	 
	 incase not found ! where wou;d be inserted.
	 
	 input : 5
	 output  = -6
	 
 */
public class TargetIndex_TargetNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		//reading length 
		System.out.println("enter array length");
		int length  = in.nextInt();
		//declaring array
		int[] arr = new int[length];
		
		//inserting elemnts into array
		System.out.println("insert elemnts into array");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = in.nextInt();
		}
		
		System.out.println("Enter key");
		//getting targated value
		int key  = in.nextInt();
		//method for ascending value
		int as_value = asdnforder(arr,key);
		//method for descending value.
		int ds_value = dsdngorder(arr,key);
		
		//closing scanner classe
		System.out.println("for ascending order = "+as_value);
		
		System.out.println("for descending value = "+ds_value);
		
		//closing scanner class.
		in.close();
	}
	
	//method for descending order.
	private static int dsdngorder(int[] arr, int key) {
		// TODO Auto-generated method stub
		//sorting array in descedning order

		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i]<arr[j]) {
					int temp = arr[i];
					arr[i]  = arr[j];
					arr[j]  = temp;
				}
			}
		}
		
//		returning value
		return Arrays.binarySearch(arr, key);
	}
 
	//method for ascending order.
	private static int asdnforder(int[] arr, int key) {
		// TODO Auto-generated method stub
		//sort the array in descending array.
		Arrays.sort(arr);
		return Arrays.binarySearch(arr, key);
	}
}
