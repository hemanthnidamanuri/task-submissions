/**
 * 
 */
package java_prac;

/**
 * @author hemanth
 * 
 * program to demostrate MethodOverloadinf types where upcast wont work
 *
 */
public class MethodOverloading_Typecast_Two {

	//declaring a method with int and double
	public void one(int a , double b) {
		System.out.println("Method one");
	}
	
	//declaring a method with int,double and double.
	public void one(int a, double b, double c) {
		System.out.println("Method two");
	}
	
	//declaring a method with int and float
	public void one(int a, float b) {
		System.out.println("Method three");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//class initlization
		MethodOverloading_Typecast_Two mltt = new MethodOverloading_Typecast_Two();
		//calling method with passing paramerers int and float
		mltt.one(1, 1.1f);
	}

}
