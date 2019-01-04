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
public class DuplicateCharacter {

	/**
	 * @param args
	 * 
	 * write a program to find a duplicate charcaters in agiven string.
	 * 
	 * input :
	 *    aabbccdeeff
	 * output : 
	 *    a b c e f
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		//declaring array =list
		ArrayList<Character> list = new ArrayList<>();
		
		//reading string dynamically
		System.out.println("enter a string;");
		String input  = in.nextLine();
		
		//converting string to character array.
		char[] arr = input.toCharArray();
		
		//logic: we adding repeated elements or duplicated elemnts into list only once.
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i]==arr[j] && i!=j) {
					if (!list.contains(arr[i])) {
						list.add(arr[i]);
					}
				}
			}
		}
		
		
		//converting list to array printing duplicated elemnts.
		Object[] obj = list.toArray();
		for (Object object : obj) {
			System.out.print(object+" ");
		}
		
		//closing scanner class.
		in.close();
	}

}
