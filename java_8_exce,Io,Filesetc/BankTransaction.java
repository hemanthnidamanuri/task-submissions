/**
 * 
 */
package files;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author hemanth
 *
 */
public class BankTransaction {

	void inserting() throws IOException {
		
		Bank bank = new Bank();
		bank.setAccount_number("20171");
		bank.setAccount_name("hemanth");
		bank.setBalance(1000000000.000);
		bank.setUsername("hems_93");
		bank.setPassword("hjhekwjhewjh");

		Bank bnk = new Bank();
		bnk.setAccount_number("17102");
		bnk.setAccount_name("hems");
		bnk.setBalance(20000000000.00);
		bnk.setUsername("hemanth_93");
		bnk.setPassword("hehehe");

		Bank bn = new Bank();
		bn.setAccount_number("96037");
		bn.setAccount_name("nidamanuri");
		bn.setBalance(30000000000.00);
		bn.setUsername("hemanthnidamanuri");
		bn.setPassword("nidanida");

		Path path = Paths.get("/home/hemanth/Documents/hemanth_file/BankDetails.txt");

		if (!Files.exists(path)) {
			Files.createFile(path);
			if (Files.exists(path)) {
				OutputStream out = Files.newOutputStream(path);
				ObjectOutputStream oout = new ObjectOutputStream(out);
				oout.writeObject(bank);
				oout.writeObject(bnk);
				oout.writeObject(bn);
				oout.flush();
				oout.close();
				System.out.println("Object serialization is done");

			}
		}

	}
}
