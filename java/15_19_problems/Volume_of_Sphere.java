/**
 * 
 */
package java_prac;

import java.util.Scanner;

/**
 * @author hemanth
 * 
 * after implementing the interface and its methods 
 * calculate the volume of sphere.
 */

 //declaring the class sphere which implements shape interface.
public class Volume_of_Sphere implements Shape_Sphere_Circle{

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//creating and intsanstiatinig sphere class object.
		Volume_of_Sphere vos = new Volume_of_Sphere();
		//calling a volume metjods from main object 
		vos.volume(pi);
	}

	 // method for calculating the volume for sphere
	@Override
	public void volume(float pi) {
		// TODO Auto-generated method stub
		Scanner in  = new Scanner(System.in);
		System.out.println("Enter radius to formulate:");
		//dynamically reading the radius value 
		double radius  = in.nextDouble();
		//logic 
		float value = (float) (4*pi*radius*radius*radius/3);
		System.out.println("volume of a circle is = "+value);
		//closing the scanner class.
		in.close();
	}

}
