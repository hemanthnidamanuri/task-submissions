package student;

import java.io.Serializable;

public class Address implements Serializable {
	
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String streetname;
	 String city;
	 int doorno;
	 
	 public Address(String streetname,String city,int doorno) {
		// TODO Auto-generated constructor stub
		 this.streetname = streetname;
		 this.doorno = doorno;
		 this.city = city;
	}
}
