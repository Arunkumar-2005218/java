package day;

public class thread8 implements Runnable {
	public void run() {
		System.out.println("hi");
	}

	public static void main(String[] args) {
		Thread t1=new Thread(new thread8());
	 t1.start();
	}

}
