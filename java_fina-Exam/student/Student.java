/**
 * 
 */
package student;

import java.io.Serializable;

/**
 * @author hemanth
 *
 */
public class Student implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */
	String name;
	int id;
	
	Student(){}
	
	public Student(String name,int id) {
		// TODO Auto-generated constructor stu

		this.name = name;
		this.id = id;
		
	}
}
