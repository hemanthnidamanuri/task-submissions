/**
 * 
 */
package polymorphism;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author hemanth
 *
 */
public class Challenge {

	/**
	 * @param args
	 */
	
	public void display(ArrayList<Fiction> list, ArrayList<NonFiction> lst) {
		System.out.println("Title-"+list.get(0).title+" "+"cost-$"+list.get(0).price);
		System.out.println("Title-"+lst.get(0).title+" "+"cost-$"+lst.get(0).price);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner in = new Scanner(System.in);
	
			ArrayList<Fiction> list  = new ArrayList<>();
			
			ArrayList<NonFiction> lst = new ArrayList<>();
			
			System.out.println("Title of fiction book");
			String title  = in.nextLine();
			
			list.add( new Fiction(title, 24.99));
			
			System.out.println("Title of non-fiction book");
			String nontittle = in.nextLine();
			lst.add( new NonFiction(nontittle, 37.99));	
			
			Challenge ch = new Challenge();
			ch.display(list,lst);
			
			in.close();
	}

}
