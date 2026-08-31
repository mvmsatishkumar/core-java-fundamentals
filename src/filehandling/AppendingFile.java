package filehandling;

import java.io.FileWriter;
import java.io.IOException;

public class AppendingFile {
	
	public static void main(String[] args) throws IOException {
		
//		Writer writer = new FileWriter("data.txt");  change the file content
		
		
		try (FileWriter writer =
		         new FileWriter("data.txt", true)) {  // append

		    writer.write("\nNew entry");

		} catch (IOException e) {
		    e.printStackTrace();
		}
	}
}
