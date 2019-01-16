/**
 * 
 */
package files;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author hemanth
 *
 */
public class BankUser{

	/**
	 * @param args
	 * @throws IOException
	 * @throws ClassNotFoundException
	 */
	public void readBankDetails() throws IOException, ClassNotFoundException {

		Path path = Paths.get("/home/hemanth/Documents/hemanth_file/BankDetails.txt");

		InputStream is = Files.newInputStream(path);
		ObjectInputStream ois = new ObjectInputStream(is);
		Object o = null;
		try {
			while ((o=ois.readObject()) != null) {
				if (o instanceof Bank) {
					Bank b = (Bank) o;
					System.out.println(b.getAccount_name() + "," + b.getAccount_number() + "," + b.getBalance() + ","
							+ b.getUsername() + "," + b.getPassword());
				}
			}
		} catch (EOFException e) {
			// TODO: handle exception
			
		}finally {
			is.close();
			ois.close();
		}

	}
}
