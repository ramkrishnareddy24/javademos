package FileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandling {
	public static void main(String[] args) {
//		fileInputStream();
		fileWriter();
	}
	
	static void fileInputStream(){
		File myfile = new File("C:\\Users\\rkannari\\myfile.txt");
		int i;
		
		try {
			FileInputStream fis = new FileInputStream(myfile);
			System.out.println("File Opened");
			
			while((i=fis.read())!=-1) {
				System.out.print((char)i);
			}
			
			fis.close();
		}
		
		catch(FileNotFoundException fn) {
			fn.printStackTrace();
		}
		
		catch(IOException e) {
			e.printStackTrace();
		}
		
		
	}
	
	static void fileOutputStream() {
		File myfile = new File("C:\\Users\\rkannari\\myfile.txt");
		int i;
		
		try {
			FileOutputStream fos = new FileOutputStream(myfile);
			System.out.println("File Opened");
			
			String data = "from the program";
			byte[] dataByteArray = data.getBytes();
			fos.write(dataByteArray);
			
			fos.close();
		}
		
		catch(FileNotFoundException fn) {
			fn.printStackTrace();
		}
		
		catch(IOException e) {
			e.printStackTrace();
		}
	}
	

	static void fileWriter() {
		File myfile = new File("C:\\Users\\rkannari\\myfile.txt");
		int i;
		
		try {
			FileWriter fw = new FileWriter(myfile);
			System.out.println("File Opened");
			
			
			fw.write("Using File Writer");
			
			fw.close();
		}
		
		catch(FileNotFoundException fn) {
			fn.printStackTrace();
		}
		
		catch(IOException e) {
			e.printStackTrace();
		}
	}
}
