/**
 * 
 */
package files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author hemanth
 *
 */
public class Check_File_Directory_ExistorNot {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Path path = Paths.get("/home/hemanth/Documents/hemanth_file/text.txt");
		if (!Files.exists(path)) {
			Files.createDirectories(path);
			Files.createFile(path);
		}else {
			System.out.println("FIles and Directory exist");
		}
	}

}
