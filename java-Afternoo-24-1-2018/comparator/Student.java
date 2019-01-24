/**
 * 
 */
package comparator;

import java.util.Comparator;

/**
 * @author hemanth
 *
 */
public class Student{

	/**
	 * 
	 */
	String name,address;
	int id;
	double marks;
	
	public Student(String name,String address,int id,double marks) {
		// TODO Auto-generated constructor stu
		this.name = name;
		this.address = address;
		this.id = id;
		this.marks = marks;
		this.address();
	}
	
	public void address() {
		Address add = new Address("street12", "hyd", 12);
	}

}
