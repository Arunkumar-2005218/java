package day;//thread class

public class thread extends Thread {
 public  void run() {
		System.out.println("hi"); 
	}

	public static void main(String[] args) {
		 thread t1=new thread();
		 System.out.println("hello"); 
		 t1.start();
	}

}
