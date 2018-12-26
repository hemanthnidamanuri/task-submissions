/**
 * 
 */
package java_prac;

/**
 * @author hemanth
 * 
 * program to demonstrate Method overloading
 *
 */
public class MethodOverloading_MethodOverriding_Example {

	public void match(String name,int k) {
		String naam = "hem";
		if (naam==name) {
			System.out.println("true");
		}
		
	}
	public void match(int k,String name,String nam) {
		String naam = "hem";
		
		if (naam == name && naam == nam) {
			System.out.println("double true");
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading_MethodOverriding_Example mlmo  = new MethodOverloading_MethodOverriding_Example();
		mlmo.match("hem",1);
		mlmo.match(1,"hem","hem");
	}

}
