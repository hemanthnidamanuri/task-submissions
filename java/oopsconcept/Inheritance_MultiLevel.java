/**
 * 
 */
package java_prac;

/**
 * @author hemanth
 * 
 * write a program for Multi level Inheritance.
 *
 */

/*
 * Declaring a five classes A,B,C,D and Inheritance_MultiLevel
 */

class A{
	//intiaized a firntname
	String _first_name = "hemanth";
}

// class B extends A it inhertis all properties
//so class B contains _first_name.

class B extends A{
	
	//_last_name intilized
	String _last_name = "nidamanuri";
}

// class C extends from class B now class C contains both 
// class A and class B properties.
class C extends B{
	
	//Intialized role
	String role = "softwareEngineer";
}
//class D extends from class C now class D contains both 
//class A ,class B and class C properties.
class D extends C{
	
	//method for appending all inherited properties.
	void _display() {
		String _name_desig = _first_name+_last_name+role;
		System.out.println(_name_desig);
	}
}

//Inheritanc_Multilevel extends class D where it contains 
//will be inherited to Present class 
public class Inheritance_MultiLevel extends D{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//class d object creation
		D d = new D();
		
		//invokinig a method
		d._display();
		
		/*
		 * class A(parent) intilixation with class b(child class) object now this object 
		 * only contains class a properties not class be 
		 */
		
		A a = new B();
		
		//intializing class b it contains both class A and B properties
		B b = new B();
		
		/*
		 * we cannot create parent class object from child class 
		 * compiler ask to cast if we cast , at runtime it throws
		 * ClassCastException
		 */
		
//		B bb  = (B)new A();
		
		System.out.println(b._last_name);
		System.out.println(a._first_name);
		Inheritance_MultiLevel iml = new Inheritance_MultiLevel();
		iml._display();
		
	}
}
