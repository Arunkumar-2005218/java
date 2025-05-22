package day;
class Test2 extends Thread{
	public void  run() {
		System.out.println("hi");
	}
}
	class Test3  implements Runnable{
		public void  run() {
			System.out.println("good morning");
		}
	}
  class thread3 {
			public void run() {
				System.out.println("hi");
			}
  
			public static void main(String[] args) {
				 Test2 t1=new Test2();
				 Test3 t2=new Test3();
				 t1.start();
				 Thread t3=new Thread(t2);
				 t3.start();
			}

	}
	


