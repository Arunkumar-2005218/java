package day;

public class thread9 extends Thread {
	String s;
	public thread9(String name) {
		s=name;
	}
public void run() {
	if(Thread.currentThread().isDaemon())
	{
		System.out.println("s + ");
	}
	else
	{
		System.out.println(s + " is user Thread);
	}
}
	public static void main(String[] args) {
		 Thread9 thread1 = new Thread9("thread1");
		 Thread9 thread2 = new Thread9("thread2");
		 Thread9 thread3 = new Thread9("thread3");
		 thread.setDaemon(true);
		 thread1.start();
		 thread2.start();
		 thread3.setDaemon(false);
		 thread3.start();
	}

}
