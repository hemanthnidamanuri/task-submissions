/**
 * 
 */
package celltower;

import java.util.Scanner;

/**
 * @author hemanth
 * 
 * 3. Create an interface Sim that contains method sendSMS() parameters message and mobileNumber, dialACall() with parameter mobile number. Create classes Airtel, BSNL and Vodafone which implement Sim.

	Create a Class Mobile contains insertSim() along with sendSms() and dialACall()
	
	Now Create MobileUser where he can insert sim and the functionality sendSms or dialACall.  


 *
 */
public class MainClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		Mobile jio = new Mobile();
		
		System.out.println("Enter your option");
		System.out.println("1.to make calls");
		System.out.println("2.to send message");
		System.out.println("Enter your option");
		int choice = in.nextInt();
		if (choice==1) {
			jio.dialACall("96037");
		}else if (choice==2) {
			jio.sendSMS("hie", "99489");
		}
		in.close();
	}

}
