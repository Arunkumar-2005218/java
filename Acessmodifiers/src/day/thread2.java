package day;
public class thread1  implements Runnable{
	public void run() {
		System.out.println("hi");
	}

	public static void main(String[] args) {
		thread1 t1=new thread1();
		thread1 t2=new thread1();
		              
		 
		System.out.println("hello");
		t1.run();
		t2.run();
	}
}
