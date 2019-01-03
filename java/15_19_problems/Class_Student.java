/**
 * 
 */
package java_prac;

/**
 * @author hemanth
 *
 */

//Declaring a class_student a outer class
public class Class_Student {
	
	//intializing student vairables.
	String id;
	String name;

	//creating method diff which will called from main 
	public int diff(int i, int j, int k) {
		
		//instansiation and object creation for DOb 
		// inner class
		Dob dob = new Dob();
		
		//creating ariable to stoe returned values from diff method
		int calculatediff = dob.diff(i,j,k);
		
		//return to main mainmethod
		return calculatediff;
	}

	//Declaring a inner class.
	public class Dob {
		
		//intializing properties
		int dd, mm, year;
		//method for calculting days  and retunr days 
		public int diff(int i, int j, int k) {
			// TODO Auto-generated method stub
			//logic.
			if ((k%4==0) || (k%400==0) && (k%100!=0)) {
				int days = 366+j*30-i;
				return days;
			}else {
				int days = 365+j*30-i;
				return days;
			}
			
		}
				
	}

}
