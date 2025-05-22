package day;
import java.io.*;
import java.util.Scanner;
public class file2 {

	public static void main(String[] args) {
	 try {
		 File obj=new File ("C:\\Users\\arunk\\Desktop\\Sample.txt\\");
		 	Scanner R=new Scanner(obj);
		 	while(R.hasNextLine()) {
		 		String data =R.nextLine();
		 		System.out.println(data);
		 	}
	 R.close();
	
	 }catch(FileNotFoundException e) {
		 System.out.println("An error has occured");
		 e.printStackTrace();
	 }
	}

}
