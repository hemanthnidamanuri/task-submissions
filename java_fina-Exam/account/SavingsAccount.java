/**
 * 
 */
package account;

/**
 * @author hemanth
 *
 */
public class SavingsAccount extends AccountClass {

	public SavingsAccount() {
		// TODO Auto-generated constructor stub
	}
	
	public SavingsAccount(String accountnumber, String name, String address, double balance) {
		super(accountnumber, name, address, balance);
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 */
	
		public void addBalance(double amount) {
			double bal = this.getBalance();
			bal +=amount;
			this.setBalance(bal);
		}
		
		public void displayBalance() {
			double balance = this.getBalance();
			System.out.println("Money in your account is ="+
			balance);
		}
		
		public void withdraw(double amount) throws Exception {
			double bal = this.getBalance();
			if (amount>bal) {
				throw new Exception("Insufficent Balance");
			} else {
				bal -=amount;
				this.setBalance(bal);
				System.out.println("Withdrawm amount ="+bal);
			}
		}
}
