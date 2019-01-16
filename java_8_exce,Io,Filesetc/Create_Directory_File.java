/**
 * 
 */
package files;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author hemanth
 *
 */
public class Create_Directory_File {

	/**
	 * @param args
	 */
	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		File file = new File("/home/hemanth/Documents/hemanth_file");
		if (!file.exists()) {
			file.mkdir();
			System.out.println("Dircetory created sucessfully");
		}else {
			System.out.println("directory exist");
		}
		
		Path path = Paths.get("/home/hemanth/Documents/hemanth_file/text.txt");
		
		if (!Files.exists(path)) {
			Files.createFile(path);
			if (Files.exists(path)) {
				String line  = "This is a demo file";
				FileOutputStream out  =   new FileOutputStream("/home/hemanth/Documents/hemanth_file/text.txt");
				BufferedOutputStream bout  = new BufferedOutputStream(out);
				byte[] arr = line.getBytes();
				bout.write(arr);
				bout.flush();
				bout.close();
				out.close();
				System.out.println("data written to file");
			}
		} else { 
			System.out.println("file exist");
		}
	}

}
