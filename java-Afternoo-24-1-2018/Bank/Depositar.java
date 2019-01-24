/**
 * 
 */
package Bank;

/**
 * @author hemanth
 * 
 * 2. Create a class BankTransaction which containing money as property and methods
	withdrawMoney and, depositMoney.
	Create the classes Depositer and Withdrawer which implements runnable interface, constructor
	to initialize BankTransaction property of the class. Implement the run method with while loop
	calling withdraw and depositeMoney methods from each thread.
	Ex: run() {
	int i=0 ;
	while(i<10)
	{
	// call the respective method from the class
	}
	}
	And also print thread name and priority
 *
 */
public class Depositar implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		BankTransaction bt = new BankTransaction();
		int i = 0;
		while (i<10) {
			bt.depositar(100);
			i++;
		}
	}
	public static void main(String[] args) {
		Depositar dp = new Depositar();
		Thread th = new Thread(dp);
		th.start();
		System.out.println("Threa name"+th.getName()+","+"Thread priority"+th.getPriority());
	}
}
