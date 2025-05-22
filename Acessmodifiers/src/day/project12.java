package day;
import java.util.*;
public class project12 {

	public static void main(String[] args) {
		 Scanner s1=new Scanner(System.in);
try {
	System.out.println("enter the classname:");
	String className=s1.next();
	Class.forName( className);
	System.out.println("the class was found.");

}catch(ClassNotFoundException e) {
	System.out.println("the class not  found:+ e");
}finally {
	s1.close();
}
}
}