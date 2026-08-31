package filehandling;

//Java provides file-handling APIs mainly through java.io and the newer java.nio.file package.
//Older java.io package provides classes such as File, FileInputStream, FileOutputStream, FileReader, FileWriter, and buffered streams
//new Java NIO introduced Path, Files, and related APIs, which are generally more convenient for modern file operations

import java.io.File;
import java.io.IOException;

public class CreateFile {
	
	public static void main(String[] args) throws IOException {
		
		File fileObj = new File("data.txt");  
		
		if (fileObj.exists()) {
			System.out.println("File exists");
			System.out.println("Is it a file : " + fileObj.isFile());
		    System.out.println("Can read file: " + fileObj.canRead());
		    
		}
		
		if (fileObj.createNewFile()) {   // create at Root directory returns boolean
			System.out.println("Created");
		} else {
			System.out.println("File Name: " + fileObj.getName());
			System.out.println("Location: " + fileObj.getPath());  // relative to root location
			System.out.println("Absoulute Location: " + fileObj.getAbsolutePath());
		}
		
//		You can distinguish files and directories:
		File directory = new File("");
		File[] files = directory.listFiles();
		
		for (File file : files) {

		    if (file.isFile()) {
		        System.out.println("File: " + file.getName());
		    } else if (file.isDirectory()) {
		        System.out.println("Directory: " + file.getName());
		    }
		}
	
	}
}

// A directory can also be represented using File.
// mkdir()	Creates one directory
// mkdirs()	Creates directory hierarchy
