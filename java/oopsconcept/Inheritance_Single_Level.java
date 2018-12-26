/**
 * 
 */
package java_prac;

/**
 * @author hemanth
 * 
 * Write a program to perform single level inheritance
 *
 */

class Parallelogram{
	
	//Declaring values of base and height
	int base=10;
	int height=10;
	
	//method for calculating area of parallelogram
	void area(){
		
		//formule
		int _area = base*height;
		
		System.out.println("area of parallelogram is="+ _area);
	}
}
public class Inheritance_Single_Level extends Parallelogram{
	
	//calculating volume for rectangular prism.
	
	//Declaring values fof length and width we inherited height 
	//from parent class.
	int length = 10;
	int width = 10;
	
	//getting height from parent class.
	
	//method to calculate rectangularprism
	void volumeofRectangularPrism() {
		//formule
		int volume = length*width*height;
		System.out.println("volume of rectanglarprism is="+volume);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//class instanstiation.
		Inheritance_Single_Level isl = new Inheritance_Single_Level();
		isl.area();
		isl.volumeofRectangularPrism();
	}

}
