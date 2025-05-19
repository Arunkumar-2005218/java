package day;

 
	interface empname{
		void name();	
		}
	interface empid{
		void  id();
	}
	 interface empadd extends empname,empid{
		 void add();
	 }
 public class sample6 implements empadd{
		 public void show() {
			System.out.println("All details"); 
		 }
		 public void name() {
			 System.out.println("rahul");
		 }
		 public void  id() {
			 System.out.println("12345");
		 }
		 public void add() {
			 System.out.println("hyderabad");
		 }	 
		 
		   
		 public static void main(String[] args) {
			 sample6 s1=new sample6();
			 s1.show();
			 s1.name();
			 s1.id();
			 s1.add();
	 
	    
		 }
	 }	 

	
