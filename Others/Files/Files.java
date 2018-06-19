package Files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileOutputStream;

public class Files {

	public static void main(String[] args) throws FileNotFoundException, IOException{
			File dir = new File(".");
			
			String [] files = dir.list();
			for(String name: files) {
				System.out.println(name);
			}
			
			File classpath = new File (".classpath");
//			System.out.println(classpath.length());
//			System.out.println();
			
			FileInputStream input = new FileInputStream(classpath);
			int length = input.available();
//			System.out.println(length);
			
			byte [] data = new byte[length];
			input.read(data);
			
//			for (byte b : data) {
//				System.out.println(data[b]+"next");
//			}			
			String text = new String(data);
			System.out.println(text);
			input.close();
			
			File emptyfile = new File("Files/text2");
			FileInputStream inputempty = new FileInputStream(emptyfile);
			int newlength = inputempty.available();
			System.out.println(newlength);
			inputempty.close();	
			
			FileOutputStream writefile = new FileOutputStream(emptyfile);
			String writetext = "Hello file 2";
			byte [] writeIn = writetext.getBytes();
			writefile.write(data);
			writefile.write(writeIn);
			writefile.close();
			
			FileOutputStream addwritefile = new FileOutputStream(emptyfile, true);
			String addwritetext = "      ! add text new text";
			byte [] addwriteIn = addwritetext.getBytes();
			addwritefile.write(addwriteIn);
			addwritefile.close();
			
//			FileOutputStream clearwritefile = new FileOutputStream(emptyfile);
//			String clearwritetext = "fffff";
//			byte [] clearwriteIn = clearwritetext.getBytes();
//			clearwritefile.write(clearwriteIn);
//			clearwritefile.close();
//					
	}
}
