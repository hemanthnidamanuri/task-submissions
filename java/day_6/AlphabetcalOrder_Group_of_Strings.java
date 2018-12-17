/**
 * 
 */
package java_prac;

import java.util.Scanner;

/**
 * @author hemanth
 * 
 * Write a program to sorth the group os Strings into
 * alphabetical order using [bubble Sort]
 * Example:
 * input = cat ,ball,apple
 * output = apple,ball,cat
 *
 */
public class AlphabetcalOrder_Group_of_Strings {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.println("how many Strings do you want to enter = ");
		//Taking the Count for strings.
		int count = in.nextInt();
		
		//Declaration of StringArray
		String[] names = new String[count];
		
		//Enter Strings into array
		System.out.println("Enter your Strings=");
		//dynamically taking input from console
		for (int i = 0; i < names.length; i++) {
			names[i] = in.next();
		}
		
		//Implementation of bubble sort.
		for (int i = 0; i < names.length; i++) {
			for (int j = i+1; j < names.length; j++) {
				
				/*
				 * .compareto is string method where it compares strings 
				 * lexicograhphically, it gives positiv,negativeand 0
				 * if string is lowerthan the other it will given negative
				 * else if string greater than other string it will given 
				 * positive valiue greater than 0
				 * if two strings are equal it will print 0
				 * here in below program if string is greater than the
				 * other it produces postive value ans swaps tha strings
				 * making bubble soryt work.
				 */
				
				if (names[i].compareTo(names[j])>0) {
					//Swap logic
					String temp = names[i];
					names[i] = names[j];
					names[j] = temp;
				}
			}
		}
		
		System.out.println("Strings in sorted alphabetical order:=");
		for (int i = 0; i < names.length; i++) {
			//printing the final values
			System.out.println(names[i]+",");
		}
		
		//Closing Scanner class
		in.close();
	}

}
