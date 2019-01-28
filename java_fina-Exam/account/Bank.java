/**
 * 
 */
package account;

import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author hemanth
 * 
 * 
 * 1. Write a class Account having properties Account Number, Account Holder Name, Account Holder Address, Account Holder Balance.

	Create a SavingsAccount subclass having methods to addBalance, displayBalance and withDraw amount.
	
	Now create a main class Bank
	
	In the main class
	
	Create list of accounts.
	
	Perform operations on any account from the list, add balance, displayBalance, withDraw.
	
	Create user defined exception “Insufficient Balance”, if the Withdrawal amount is greater than balance Amount. It should throw exception “Insufficient Balance”.
	
	Write the objects into a file.
 *
 */
public class Bank {

	/**
	 * @param args
	 * @throws Exception 
	 * 
	 * 
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		SavingsAccount account = new SavingsAccount();
		
		List<AccountClass> list = new ArrayList<>();
		
		AccountClass ac1 = new AccountClass();
		ac1.setAccountnumber("20171");
		ac1.setAddress("hyderabad");
		ac1.setName("hemanth");
		ac1.setBalance(20000.000);

		AccountClass ac2 = new AccountClass();
		ac2.setAccountnumber("20181");
		ac2.setName("nidamanuri");
		ac2.setAddress("ongole");
		ac2.setBalance(30000.00);

		AccountClass ac3 = new AccountClass();
		ac3.setAccountnumber("20191");
		ac3.setName("hemanthNidamanuri");
		ac3.setAddress("ameerpet");
		ac3.setBalance(4000000.00);
		
		list.add(ac1);
		list.add(ac2);
		list.add(ac3);
		
		
		for (int i = 0; i < list.size(); i++) {
			Object o = list.get(i);
			if (o instanceof AccountClass) {
				AccountClass holder = (AccountClass) o;
				System.out.println("Enter account number to to do operations");
				String number  = in.nextLine();
				if (number.equalsIgnoreCase(holder.getAccountnumber())) {
					//DeposiMoney
					System.out.println("Enter amount to deposit");
					double money  = in.nextDouble();
					account.addBalance(money);
					//addamount
					System.out.println("Enter amount to withdraw");
					double amt  = in.nextDouble();
					account.withdraw(amt);
					//DisplayBalance
					account.displayBalance();
					break;
				}else {
					System.out.println("Account number doesnt exist");
				}
			}
		}
		
		//writing object inyo file
		Path path = Paths.get("/home/hemanth/Documents/bankfolder/BankDetails.txt");

		if (!Files.exists(path)) {
			Files.createFile(path);
		}else if (Files.exists(path)) {
			OutputStream out = Files.newOutputStream(path);
			ObjectOutputStream oout = new ObjectOutputStream(out);
			oout.writeObject(ac1);
			oout.writeObject(ac2);
			oout.writeObject(ac3);
			oout.flush();
			oout.close();
			System.out.println("Object serialization is done");

		}
		in.close();
	}

}
