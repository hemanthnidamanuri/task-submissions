/**
 * 
 */
package files;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author hemanth
 *
 */
public class Read_Paragraph_LinebyLine {

	/**
	 * @param args
	 */
	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		
		Path path = Paths.get("/home/hemanth/Documents/hemanth_file/paragraph.txt");
		if (Files.exists(path)) {
				InputStream fr = Files.newInputStream(path);
				int strline;
				while ((strline=fr.read())!=-1) {
					System.out.print((char)strline);
				}
				System.out.println();
				
		} else {
			System.out.println("File not exist");
		}
	}

}
