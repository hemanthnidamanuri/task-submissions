/**
 * 
 */
package java_prac;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;


/**
 * @author hemanth
 * 
 * Write a program to perform below operations
 * a.The positions of substring
 * b.repated count of string
 * c.Remove the occurances of substring in main string 
 *   and print it.
 *  input : 
 *  main_string = "this is my palace";
 *  sub_string = "is";
 *  output:
 *  indexes : 2,5
 * 	repated count : 2
 *  main_string after remova; 
 *     th my palace.
 *
 */

public class Operation_on_String {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter Main String = ");
		
		//Reading main String
		String main_string = in.nextLine();
		System.out.println("Enter Sub String = ");
		
		//Reading substring
		String sub_string = in.nextLine();
		
		//position of substring.
		//Method for finding indexes it returns with a list of indexes
		List<Integer> positions = indexesOfString(main_string,sub_string);
		System.out.print("Indexes are = ");
		for (int i = 0; i < positions.size(); i++) {
			//printing indexes
			System.out.print(positions.get(i)+",");
		}
		
		System.out.println();
		//Method for delete substrings occrences in main string.
		
		String final_String = deleteSubString(main_string,sub_string);
		//printing the mainstring after removing substring occurences
		
		System.out.println("main string after removal ="+final_String);
		//Method for finding substring occurences 
		
		int count = repeatedSubStrings(main_string,sub_string);
		System.out.println("repatedcount is ="+count);
		
		//Closing Scanner class
		in.close();
	}

	private static int repeatedSubStrings(String main_string, String sub_string) {
		// TODO Auto-generated method stub
		
		/*
		 * indexof(str) will find index number number of string
		 * indexof(str,number) will find indexnumber of string from
		 * given number index,from this we will write logic
		 * for loop of where intilize i with starting index number
		 * loop through end of line
		 * increment with indexof(str,start index with length)
		 * it loop through all line listing indexes if we count it is the repected 
		 * occurences of string.
		 */
		
		int repeated_count=0;
		for(int i = main_string.indexOf(sub_string);i!=-1;i=main_string.indexOf(sub_string,i+sub_string.length())) {
			repeated_count++;
		}
		return repeated_count;
	}

	private static List<Integer> indexesOfString(String main_string, String sub_string) {
		// TODO Auto-generated method stub
		
		/*
		 * indexof(str) will find index number number of string
		 * indexof(str,number) will find indexnumber of string from
		 * given number index,from this we will write logic
		 * for loop of where intilize i with starting index number
		 * loop through end of line
		 * increment with indexof(str,start index with length)
		 * it loop through all line listing indexes.return indexes
		 */
		 
		
		ArrayList<Integer> lst = new ArrayList<>();
		for(int i = main_string.indexOf(sub_string);i!=-1;i=main_string.indexOf(sub_string,i+sub_string.length())) {
			lst.add(i);
		}
		
		return lst;
	}
	
	private static String  deleteSubString(String main_string, String sub_string) {
		 
		/*
		 * replaceAll method will replce the substring with given
		 * string, we replace substing with empty.
		 */
		 
		main_string = main_string.replaceAll(sub_string, "");
		return main_string;
	}

}
