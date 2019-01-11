/**
 * 
 */
package java_exam;



/**
 * @author hemanth
 *
 */
public class Execution {

	/**
	 * @param args
	 * 
	 * Create a student class with name, roll number, marks as properties and create a students array with the students. 
	 *   Override toString method to display student details. And read input from 
	 *   user to display student detials of at given position.
	 *   Ex: If user enters 1 display the details at position one in the array. 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ElectricGuitar eg = new ElectricGuitar();
		ElectricBassGuitar ebg = new ElectricBassGuitar();
		System.out.println("Electirc giutar");
		System.out.println(eg.name+","+eg.numberOfStrings);
		eg.play();
		System.out.println("Electric bass guitar:");
		System.out.println(ebg.name+","+ebg.numberOfStrings);
		ebg.play();
	}

}
