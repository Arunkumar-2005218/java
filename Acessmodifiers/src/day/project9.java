package day;
import java.io.*;
import java.util.Scanner;
public class project9 {

	public static void main(String[] args) throws FileNotFoundException {
	File f1=new File("C:\\Users\\arunk\\Desktop\\Sample.txt");
			
		try {
			
			Scanner Reader = new Scanner(obj);
			while (Reader.hasNext()) {
				String data = Reader.nextLine();
				System.out.println(data);
				throw new FileNotException("file not found")
			}
	Reader.close();
			
		}
 

