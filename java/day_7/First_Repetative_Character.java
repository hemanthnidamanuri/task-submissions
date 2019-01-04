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
public class First_Repetative_Character {

	/**
	 * @param args
	 * 
	 * write a program to find first repetative character in string.
	 * input :
	 *  abcddeff
	 * output:
	 *  d
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in  = new Scanner(System.in);
		//declaring array list
		ArrayList<Character> list = new ArrayList<>();
//		reading string
		System.out.println("enter a string;");
		String input  = in.nextLine();
		
//		converting string into character array 
		char[] arr = input.toCharArray();
		
		//logic duplated elemnts that to only single character enter into the list
		//it will be linear .
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i]==arr[j] && i!=j) {
					if (!list.contains(arr[i])) {
						list.add(arr[i]);
					}
				}
			}
		}
		
		//printing the first repattive element in the string.
		System.out.println("first repatative element in string is= "+ list.get(0));
		
		//closing scanner class.
		in.close();
	}

}
