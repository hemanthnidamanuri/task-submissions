/**
 * 
 */
package Bank;

/**
 * @author hemanth
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
public class BankTransaction {

		double money = 200000;
		
		public synchronized void withdrawal(double money) {
			this.money =this.money-money;
			System.out.println("withdrawalmoney="+this.money);
		}
		
		public void depositar(double money) {
			this.money += money;
			System.out.println("deposited money"+this.money);
		}
}
