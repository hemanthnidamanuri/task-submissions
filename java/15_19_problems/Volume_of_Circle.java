/**
 * 
 */
package java_prac;

import java.util.Scanner;

/**
 * @author hemanth
 * 
 * after implementing the interface and its methods
 * calculate the voume of sphere.
 */

 //Declaring a class circle and implementing shape.
public class Volume_of_Circle implements Shape_Sphere_Circle{

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//instamtiation and creation of object of circle
		Volume_of_Circle voc = new Volume_of_Circle();
		//calling a method.
		voc.volume(pi);
	}

	@Override
	//calculating volume of a cicrcle 
	public void volume(float pi) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter radius :");
		//dynamically reading radius values.
		double radius   = in.nextDouble();
		//calculating and showing the volume of circle.
		System.out.println("volume of a circle is = "+pi*radius*radius);
		in.close();
	}

}
