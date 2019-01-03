/**
 * 
 */
package java_prac;

/**
 * @author hemanth
 * 
 * write a program to satisfy the follow conditions.
 * 
 * --> create an abstract class parent with property details and an 
 *     abstract method calculate().
 * --> Now derive son class from parent class and calculate sons
 *     property by implementing the calculate method.
 *
 */

	// Declaring an abstract class parent.
abstract class Parent_Property {
	
	//declaring properties fro parent class.
	String palace = "mysorepalace";
	int hardcash = 1000000000;
	int bankamount = 20000000;
	String vehicles  = "BMW";
	
	//abstract method fro calculate.
	abstract void calculate();
	
}

	// creating a child class inherited from parent class
public class Property_of_Father_Son extends Parent_Property {

	/**
	 * @param args
	 */
	
	//implementing and overrideing the calculate method
	@Override
	void calculate() {
		
		//operations
		// TODO Auto-generated method stub
		System.out.println("son inherited palace vehicles completly but got with half handcah and bankbalance");
		System.out.println(palace+" inherited palace");
		System.out.println((hardcash/2)+" inherited half amount harcash");
		System.out.println((bankamount/2)+" inherited half bank amount");
		System.out.println(vehicles+" inherited vehicle");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//instanstiatiion and object creation for parent and son class.
		Parent_Property son = new Property_of_Father_Son();
		
		//calling the calculate method from son object.
		son.calculate();
	}

}
