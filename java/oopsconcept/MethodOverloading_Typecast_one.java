/**
 * 
 */
package java_prac;

/**
 * @author hemanth
 * 
 * program to demostrate methodoverloading typecast [upcast]
 *
 */
public class MethodOverloading_Typecast_one {
	
	//this method will called and passed floating point will be upcast to double.
	public void one(int a,double b) {
		
		System.out.println("Method one");
	}
	
	public void one(int a, double b, double c) {
		
		System.out.println("Method two");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodOverloading_Typecast_one mome = new MethodOverloading_Typecast_one();
		
		mome.one(500, 500.00f);

	}

}
