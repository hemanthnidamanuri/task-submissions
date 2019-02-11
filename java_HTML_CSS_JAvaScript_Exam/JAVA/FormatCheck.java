/**
 * Problem : Verify JSON Object validity
   Example 1:
   Input
   {:[{},{}]}
   Outputput
   1

   Example 2:
   Input
   {:{[]},{}}
   Outputput
   -1

 */

import java.util.Scanner;
import java.util.Stack;

/**
 * @author hemanth
 *
 */
public class FormatCheck {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner in = new Scanner(System.in);
			System.out.println("Enter format:");
			String input = in.nextLine();
			boolean match = check(input);
			
			if (match) {
				System.out.println("1");
			} else {
				System.out.println("-1");
			}
			
			in.close();
			
	}

	private static boolean check(String input) {
		// TODO Auto-generated method stub
		Stack<Character> st = new Stack<>();
		boolean subwatch = false;
		boolean watch = false;
		String wrng = "{[]}";
		char[] arr = input.toCharArray();
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]=='{' || arr[i]=='[') {
				st.push(arr[i]);
			}else if (arr[i]=='}' || arr[i] == ']') {
				if (st.isEmpty()) {
					watch = true;
				}else if ((arr[i]==']' && st.peek()=='[') || (arr[i]=='}' && st.peek()=='{')) {
					st.pop();
				}
				
			}
		}
		
		if ((st.isEmpty()) && (!input.contains(wrng))) {
			subwatch = true;
		}else if((st.isEmpty()) && (input.contains(wrng))){
			subwatch = false;
		} 
		
		if (subwatch) {
			return true;
		} else {
			return false;
		}
	}

}
