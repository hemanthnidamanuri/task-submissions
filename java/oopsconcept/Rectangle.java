/**
 * 
 */
package java_prac;

import java.util.Scanner;

/**
 * @author hemanth
 *
 */

public class Rectangle {
	
	public void printarea(int length,int height) {
		
		System.out.println(length*height);
	}
	
	public void printarea(int height) {
		Scanner in  = new Scanner(System.in);
		int length = in.nextInt();
		System.out.println(height*length);
		in.close();
	}
	
	public void printarea() {
		Scanner in = new Scanner(System.in);
		int length  = in.nextInt();
		int height = in.nextInt();
		System.out.println(length*height);
		in.close();
	}
	
	public long printarea(long length, long height) {
		
		return length*height;
	}
	
	public int printarea(long length,int height) {
		
		return (int) (length*height);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rec = new Rectangle();
		rec.printarea(2, 3);
		rec.printarea(2);
		rec.printarea();
		rec.printarea(100000000l, 23);
		rec.printarea(9555555555555l, 9555555555555l);
	}

}
