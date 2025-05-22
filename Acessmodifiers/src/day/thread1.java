package day;//Runnable interface

public class thread1  implements Runnable{
	public void run() {
		System.out.println("hi");
	}

	public static void main(String[] args) {
		thread1 t1=new thread1();
		thread1 t2=new thread1();
		              
		Thread p1 =new Thread(t1);
		Thread p2 =new Thread(t1);
		System.out.println("hello");
		p1.start();
		p2.start();
	}

}
