package day;//multithreading
 
public class project11 extends Thread {

	public static void main(String[] args) throws InterruptedException {
		project11 p1 =new project11();
		 
		 Thread t1=new Thread(p1);
		 t1.start();
		 System.out.println("hi");
	    t1.sleep(20000);
		 System.out.println("hello");
		 
	}	 

}
