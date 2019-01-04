/**
 * 
 */
package day_7;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author hemanth
 *
 */
public class Occurences {

	/**
	 * @param args
	 * 
	 * write a program to print occurences in string
	 *  given value k
   		return first element that occurs in this array k times
   		k=2 return b
   		k=3 return anything
   		k=1 return a

	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		//declaring hashmap
		HashMap<Character, Integer> map = new HashMap<>();
		
//		declaring charlength
		System.out.println("Enter the length of charlength");
		int charlength  = in.nextInt();
		
		//entering k value
		System.out.println("Enter the k value");
		int k  = in.nextInt();
		
		//declaring character array 
		char[] ar = new char[charlength];
		
		//inserting elements into char array.
		System.out.println("Insert elements into to char array:");
		for (int i = 0; i < ar.length; i++) {
			ar[i] = in.next().charAt(0);
		}
		
		// it will find frequncy of character in array 
		for (int i = 0; i < ar.length; i++) {
			Integer frequency  = map.get(ar[i]);
			if (frequency==null) {
				map.put(ar[i], 1);
			} else {
				map.put(ar[i], frequency+1);
			}
		}
		System.out.println(map);
		//logic we compare the k value with map values and print the required  key
		for(Map.Entry<Character, Integer> mp : map.entrySet()) {
			if (k==mp.getValue()){
				System.out.println(" occurences of a character is = "+mp.getKey());
				break;
			}else {
				System.out.println("not found given input relared key");
			}
			
		}
		
//		closing scanner class
		in.close();
	}

}
