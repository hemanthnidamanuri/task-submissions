/**
 * 
 */
package cipher;

import java.util.Scanner;

/**
 * @author hemanth
 * 
 * 1. Ceasar Cipher
The Ceasar cipher is a basic encryption technique used by Julius Ceasar to securely 
communicate with his generals. Each letter is replaced by another 
letter N positions down the english alphabet. For example, for a rotation of 5, 
the letter 'c' would be replaced by an 'h'. In case of a 'z', the alphabet rotates and it is transformed into a 'd'.
Implement a decoder for the Ceasar cipher where N = 5.
TIP: Use code.toCharArray() to get an array of characters.

Input(code)  Actual	Expected
xvm	     car	              car
evqv	    java	              java
diozmqdzr   interview	interview
 *
 */
public class CeaserCipher {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		//string
		System.out.println("Enter String input");
		String input = in.nextLine();
		//key
		System.out.println("enter key");
		int decipher = in.nextInt();
		//method for decriptying
		cipher(input, decipher);
		
		in.close();
	}

	private static void cipher(String input, int key) {
		//
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < input.length(); i++) {
			char ch = (char) (((int) input.charAt(i) + key - 97) % 26 + 97);
			sb.append(ch);
		}
		System.out.println(sb);
	}

}
