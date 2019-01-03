package java_prac;

/**
 * 
 */

/**
 * @author hemanth
 * 
 * write a program to execute follow insturctions.
 * Create a student class with id and name
 * In that class, create an inner class 'Dob' with dd,mm,yy properties
 * Create 2 objects and store 2 students date of birth details
 * Find number of days difference in the date of birth of students
 *
 */
public class DateofBirth {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//instanstiation and object creation for student 
		Class_Student cs = new Class_Student();
		// second instanstiation and object creation for student 
		Class_Student cs1 = new Class_Student();
		//calling a diiff method for student one it should return a value.
		int student1 = cs.diff(30,12,1993);
		//calling a diff method for student two it should a return a value.
		int student2  =cs1.diff(31,12,1993);
		
		//finding a diiference between two students age difference.
		System.out.println("Difference Between Two dates are="+(Math.abs(student1-student2)));
	}

}
