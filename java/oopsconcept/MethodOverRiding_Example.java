/**
 * 
 */
package java_prac;

/**
 * @author hemanth
 *
 */

class Bank {
	int account_balance() {
		return 0;
	}
}

class SBI extends Bank{
	int account_balance() {
		return 10000;
	}
}

class AXIS extends Bank{
	int account_balance() {
		return 20000;
	}
}

class ICICI extends Bank{
	int account_balance() {
		return 30000;
	}
}
public class MethodOverRiding_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SBI  sbi = new SBI();
		AXIS axis = new AXIS();
		ICICI icici = new ICICI();
		System.out.println("sbi account balance is:"+sbi.account_balance());
		System.out.println("axis account balance is:"+axis.account_balance());
		System.out.println("icici account balance is:"+icici.account_balance());

	}

}
