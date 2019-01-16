/**
 * 
 */
package files;

import java.io.IOException;

/**
 * @author hemanth
 *
 */
public class BankMain {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException,ClassNotFoundException {
		// TODO Auto-generated method stub
		BankTransaction bt = new BankTransaction();
		bt.inserting();
		BankUser bu = new BankUser();
		bu.readBankDetails();
	}
}
