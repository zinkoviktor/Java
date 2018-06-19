package Files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;

public class WriteFile {
	WriteFile(){		
	}
	public static void writeFile(String text, String address) throws Exception {
		
		File file = new File(address);
		//Read file
		try {
			FileInputStream readFile = new FileInputStream(file);
			byte [] firstText = new byte[readFile.available()];
			readFile.read(firstText);
			readFile.close();	
		
		//Adds text to file
		FileOutputStream writeFile = new FileOutputStream(file);		
		byte [] writeIn = text.getBytes();
		writeFile.write(firstText);
		writeFile.write(writeIn);
		writeFile.close();
		}
		catch (Exception e) {			
			throw new FileNotFoundException(); 
		}
		
	}
	public static void main(String [] args) {
		try {
		Scanner file = new Scanner(System.in);
		System.out.println("Please enter file address (.../...):");
		String fileAddress  = file.nextLine();
		System.out.println("Please enter your text:");	
		String outputText = file.nextLine();
		file.close();
		writeFile(outputText, fileAddress);		
		System.out.println("Text have been added to file ");		
		} catch (FileNotFoundException e) {
			System.out.println("Wrong file");			
		} 
		catch (Exception e) {
			System.out.println("Sorry system error");			
		}
	}
}
