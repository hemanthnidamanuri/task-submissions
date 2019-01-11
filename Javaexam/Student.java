/**
 * 
 */
package java_exam;

import java.util.Scanner;

/**
 * @author hemanth.
 * 
 *  Create a student class with name, roll number, marks as properties and create a students array with the students. 
 *   Override toString method to display student details. And read input from 
 *   user to display student detials of at given position.
 *   Ex: If user enters 1 display the details at position one in the array. 
 *
 *
 */

public class Student {
	
	String name;
	String rollnumber;
	double marks;

	public Student(String name, String rollnumber, double marks) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.rollnumber = rollnumber;
		this.marks = marks;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name + "," + rollnumber + "," + marks;
	}

	private static void Result(Student[] arr, Scanner in) {
		// TODO Auto-generated method stub
		System.out.println("enter input");
		
		int input = in.nextInt();
		
		for (int i = 0; i < arr.length; i++) {
			int k = input - 1;
			System.out.println("Student Details:");
			System.out.println(arr[k]);
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter how many students do you want to insert:");
		
		int studentsList = in.nextInt();
		Student[] arr = new Student[studentsList];
		
		for (int i = 0; i < studentsList; i++) {
			System.out.println("Enter Name");
			String name = in.next();
			System.out.println("Enter rollnum:");
			String rollnum = in.next();
			System.out.println("Enter marks");
			double marks = in.nextDouble();
			
			arr[i] = new Student(name, rollnum, marks);

			Result(arr, in);
		}
	}

}
