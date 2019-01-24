/**
 * 
 */
package comparator;

import java.util.Comparator;

/**
 * @author hemanth
 *
 */
public class MarksSorted implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		if (o1.marks==o2.marks) {
			return 0;
		}else if (o1.marks<o2.marks) {
			return -1;
		}else {
			return 1;
		}
	}

	
	
}
