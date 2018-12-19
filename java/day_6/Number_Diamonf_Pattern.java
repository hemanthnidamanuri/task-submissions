/**
 * 
 */
package java_prac;

import java.util.Scanner;

/**
 * @author hemanth
 * 
 * write program to print following pattern
 * Example:
 * input no of rows: 7
 * 
 * output:
 * 			 1                                                  
            212                                                 
           32123                                                
          4321234                                               
         543212345                                              
        65432123456                                             
       7654321234567                                            
        65432123456                                             
         543212345                                              
          4321234                                               
           32123                                                
            212                                                 
             1   
 *
 *
 */
public class Number_Diamonf_Pattern {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		//dynamically taking values.
		System.out.println("Enter no of Rows:");
		int rows = in.nextInt();
		
		//declaring an array for memoization
		String[] lookup_table = new String[rows];
		
		//intializing first index with one
		lookup_table[0] = "1";
		
		//declaring spaces 
		int spaces = rows;
		
		/*
		 * we pre-intiloze value one in below logic
		 * we get value one and we will append newly calulated value on 
		 * both left and right side.unyil rows completed
		 * we will able to tored all pettern nubers
		 * i array
		 */
		for (int i = 1; i < rows; i++) {
			String num = String.valueOf(i+1);
			lookup_table[i] = num+String.valueOf(lookup_table[i-1])+num;
		}
		
		/*
		 * get value in array and print 
		 * in upper half diamond
		 */
		
		for (int i = 0; i < lookup_table.length; i++) {
			for (int j = 0; j <spaces; j++) {
				System.out.print(" ");
			}
			spaces--;
			System.out.print(lookup_table[i]);
			System.out.println(" ");
		}
		spaces = 1;
		
		/*
		 * get athe array index -2 values fro array 
		 * print the array values which alrdy calcuilated 
		 * print lowerdiamong pettern
		 */
		for (int i = lookup_table.length-2; i >=0; i--) {
			for (int j = 0; j <=spaces; j++) {
				System.out.print(" ");
			}
			spaces++;
			System.out.print(lookup_table[i]);
			System.out.println(" ");
		}
		//closing scanner class
		in.close();
	}

}
