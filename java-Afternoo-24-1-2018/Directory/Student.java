/**
 * 
 */
package Directory;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author hemanth
 * 
 * 1.
Write a program for following functionalities
1.Create a class Student having properties id, name and percentage
2. Creating a Directory named Students in that directory create a file.
3. Add students data into the file. Add at least 4 students
4. Read the file and display student data.
5. Add one more student into the file.
6. Delete the student data of id 2.
 *
 */
public class Student implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * @param args
	 */
	
	String name;
	int id,age;
	
	Student(){}
	
	public Student(String name, int id, int age) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.id = id;
		this.age = age;
	}
	
	public void write(Scanner in) throws IOException {
		Student stu = new Student("hemanth", 89, 24);
		Student st = new Student("nidamanuri", 13, 25);
		Student s = new Student("hemanthnidamanuri", 2, 24);
		Student ss = new Student("nidamanurihemanth", 31, 24);
		
		File file  = new File("/home/hemanth/Documents/studentdetails");
		if (!file.exists()) {
			file.mkdirs();
		}else {
			System.out.println("File Exist");
		}
		
		Path path = Paths.get("/home/hemanth/Documents/studentdetails/students.txt");
		if (!Files.exists(path)) {
			Files.createFile(path);
		}
		
		if (Files.exists(path)) {
			OutputStream op = Files.newOutputStream(path);
			ObjectOutputStream oo = new ObjectOutputStream(op);
			oo.writeObject(stu);
			oo.writeObject(st);
			oo.writeObject(s);
			oo.writeObject(ss);
			op.flush();
			op.close();
			oo.flush();
			oo.close();
			System.out.println("students data enter into file");
		}
	}
	
	public void Display() throws IOException, ClassNotFoundException {
		Path path = Paths.get("/home/hemanth/Documents/studentdetails/students.txt");
		
		if (Files.exists(path)) {
			InputStream is = Files.newInputStream(path);
			ObjectInputStream ois = new ObjectInputStream(is);
			Object o  = null;
			
			System.out.println("DisplayingSTudent Details");
			try {
				while ((o=ois.readObject()) != null) {
					if (o instanceof Student) {
						Student stu = (Student) o;
						System.out.println("name"+stu.name+","+"age"+stu.age+","+"rollnum"+stu.id);
					}
				}
			} catch (EOFException e) {
				// TODO: handle exception
			}
		}
	}
	
	public void delete() throws IOException, ClassNotFoundException {
		Path path = Paths.get("/home/hemanth/Documents/studentdetails/students.txt");
		ArrayList<Student> list = new ArrayList<>();
		if (Files.exists(path)) {
			InputStream is = Files.newInputStream(path);
			ObjectInputStream ois = new ObjectInputStream(is);
			Object o  = null;
			try {
				while ((o=ois.readObject()) != null) {
					if (o instanceof Student) {
						list.add((Student) o);
					}
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
			for (int i = 0; i < list.size(); i++) {
				Student oo = (Student) list.get(i);
				if (oo.id==2) {
					list.remove(i);
				}
			}
			OutputStream op = Files.newOutputStream(path);
			ObjectOutputStream oo = new ObjectOutputStream(op);
			for (Student student : list) {
				oo.writeObject(student);
			}
		}
		
	}
	public void AddOneMore() throws IOException {
		Student ts = new Student("acharya", 100, 1000);
		Path path = Paths.get("/home/hemanth/Documents/studentdetails/students.txt");
		if (Files.exists(path)) {
			OutputStream op = Files.newOutputStream(path);
			ObjectOutputStream oo = new ObjectOutputStream(op);
			oo.writeObject(ts);
			op.flush();
			op.close();
			oo.flush();
			oo.close();
			System.out.println("student data appended");
		}
		
	}
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		Student st = new Student();
		Scanner in = new Scanner(System.in);
		st.write(in);
		st.Display();
		st.delete();
		st.AddOneMore();
	}

}
