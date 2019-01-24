/**
 * 
 */
package comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * @author hemanth
 *
 */
public class MainClass {

	/**
	 * 3. Create a class Student having properties id, name, address and marks.
		Create a class Address with properties doorNo, streetName and city.
		Create an association between Student and Address.
		Add 5 students to a collection.
		Sort the students based on marks in Ascending Order - using comparator
		Retrive the student based on id.
		Delete the student with a given id. (Scan id of student)
		Rename the student with a given id. (Scan the id of student)
	 */
	public MainClass() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Student> lst = new ArrayList<>();
		Scanner in = new Scanner(System.in);
		lst.add(new Student("hemanth", "hyderabad", 2, 100.00));
		lst.add(new Student("hems", "ongole", 22, 200.00));
		lst.add(new Student("hemanthnidamanuri", "kakinda", 23, 300.00));
		lst.add(new Student("hema", "chennai", 24, 400.00));
		lst.add(new Student("nidamanuri", "hyderabad", 25, 500.00));

		System.out.println("Sorting by marks:");
		Collections.sort(lst, new MarksSorted());
		for (Student student : lst) {
			System.out.println(student.name + "," + student.marks + "," + student.id + "," + student.address);
		}
		System.out.println("retriveing student based on id:");
		for (Student student : lst) {
			if (student.id == 2) {
				System.out.println(student.name + "," + student.marks + "," + student.id + "," + student.address);
			}
		}
		System.out.println("deleting student based on id,Enter id");
		int id = in.nextInt();
		for (Student student : lst) {
			if (student.id == id) {
				lst.remove(student);
			}else {
				System.out.println("no student representating with given id");
			}
		}
		System.out.println("rename the student  based on id,Enter id");
		int idi = in.nextInt();
		for (Student student : lst) {
			if (student.id==idi) {
				student.name = "raju";
			}
		}
	}
}
