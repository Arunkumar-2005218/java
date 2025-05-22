package day;
import java.io.*;
public class file {

	public static void main(String[] args)  throws IOException{
		 File f1=new File("C:\\Users\\arunk\\Desktop\\Sem.txt");
		 if(f1.createNewFile()) {
			 System.out.println("file created success");
		 }else {
			 System.out.println("file not created");
		 }
		 
	}

}
