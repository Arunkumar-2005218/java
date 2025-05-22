package day;
 import java.io.*;
public class file1 {

	public static void main(String[] args)  throws IOException{
		FileWriter f1 =new FileWriter("C:\\Users\\arunk\\Desktop\\Sem2.txt");
		f1.write("hi hello welcome");
        f1.close();
        System.out.println("success");
}
}

 