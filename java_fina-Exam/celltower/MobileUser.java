/**
 * 
 */
package celltower;

import java.util.Scanner;

/**
 * @author hemanth
 *
 */
public class MobileUser implements Sim {

	
	public void insertSim() {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Selectio options");
		System.out.println("1.Airtel, 2.bsnl , 3.vodofone");
		int choice   = in.nextInt();
		if (choice==1) {
			Airtel airtel = new Airtel();
		}else if(choice==2) {
			Bsnl bsnl = new Bsnl();
		}else if (choice==3) {
			Vodafone vof = new Vodafone();
		}else {
			System.out.println("Invalid Choice");
		}
		
	}
	@Override
	public void sendSMS(String message, String mobilenumber) {
		// TODO Auto-generated method stub
		System.out.println("Sending msg to "+mobilenumber);
		
	}

	@Override
	public void dialACall(String mobilenumber) {
		// TODO Auto-generated method stub
		System.out.println("calling to"+mobilenumber);
	}

}
