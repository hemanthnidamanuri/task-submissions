/**
 * 
 */
package student;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.io.StreamCorruptedException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.HashMap;
import Directory.Student;

/**
 * @author hemanth
 * 
 * 2. Create a Student class having the properties of id and name. And Create a Address class having the properties of door no, street, city and state.

	Now create a College class adding to the map with Student Object as key and Address Object as value.
	
	Add this data into the file.
	
	Read the data from file and display the data.
 *
 */
public class CollegeClass implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * @param args
	 * @throws IOException
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub

		// creating student opbject

		student.Student student1 = new student.Student("hemanth", 12);
		student.Student student2 = new student.Student("nidamanuri", 89);

		// creating address object class

		Address address1 = new Address("street-13", "Hyderabad", 663);
		Address address2 = new Address("streetname-31", "ongole", 553);
		HashMap<student.Student, Address> map1 = new HashMap<>();
		HashMap<student.Student, Address> map2 = new HashMap<>();
		map1.put(student1, address1);
		map2.put(student2, address2);
		addingDatatoFile(student1, address1);
		displayingData(student2, address2);
	}


	private static void displayingData(student.Student student2, Address address2)
			throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		Path path = Paths.get("/home/hemanth/Documents/bankfolder/CollegeDetails.txt");

		if (Files.exists(path)) {
			InputStream is = Files.newInputStream(path, StandardOpenOption.READ);
			ObjectInputStream ois = new ObjectInputStream(is);

			System.out.println("DisplayingSTudent Details");
			try {
				while (is.available() > 0) {
					Object readObject =  ois.readObject();
					if (readObject instanceof Student) {
						student.Student stu = (student.Student) readObject;
						System.out.println(stu.name+","+stu.id);
						
					}if (readObject instanceof Address) {
						Address add = (Address) readObject;
						System.out.println(add.city+","+add.doorno+","+add.streetname);
					}
				}
			} catch (EOFException e) {
				// TODO: handle exception
			} catch (StreamCorruptedException se) {

			} finally {
				is.close();
				ois.close();
			}
		}

	}

	private static void addingDatatoFile(student.Student student1, Address address1) throws IOException {
		// TODO Auto-generated method stub
		Path path = Paths.get("/home/hemanth/Documents/bankfolder/CollegeDetails.txt");

		if (!Files.exists(path)) {
			Files.createFile(path);
		} else if (Files.exists(path)) {
			OutputStream out = Files.newOutputStream(path);
			ObjectOutputStream oout = new ObjectOutputStream(out);
			oout.writeObject(student1);
			oout.writeObject(address1);
			oout.flush();
			oout.close();
			System.out.println("Object serialization is done");

		}

	}

}
