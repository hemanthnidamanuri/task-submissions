/**
 * 
 */
package csv;

import java.io.IOException;

/**
 * @author hemanth
 * 
 * 4. Do following operations

	Create a class StudentMarks
	
	Read the file studentsCsv.csv
	
	Calculate average and percentage of each student
	
	Add 2 more columns average and percentage in Student.csv
	
	Add each student average and percentage in Student.csv 
	
	Display the details of each student.
 *
 */
public class MainCSV {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		StudentMarks sm = new StudentMarks();
		sm.readFile();
		sm.display();
	}

}
