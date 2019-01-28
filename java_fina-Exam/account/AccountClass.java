/**
 * 
 */
package account;

/**
 * @author hemanth
 *
 */
public class AccountClass {

	/**
	 * 
	 */

	private String accountnumber;
	private String name;
	private String address;
	private double balance;

	public AccountClass() {
	}

	public AccountClass(String accountnumber, String name, String address, double balance) {
		// TODO Auto-generated constructor stub
		this.accountnumber = accountnumber;
		this.name = name;
		this.address = address;
		this.balance = balance;
	}

	/**
	 * @return the accountnumber
	 */
	public String getAccountnumber() {
		return accountnumber;
	}

	/**
	 * @param accountnumber the accountnumber to set
	 */
	public void setAccountnumber(String accountnumber) {
		this.accountnumber = accountnumber;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the balance
	 */
	public double getBalance() {
		return balance;
	}

	/**
	 * @param balance the balance to set
	 */
	public void setBalance(double balance) {

		this.balance = balance;
	}

}
