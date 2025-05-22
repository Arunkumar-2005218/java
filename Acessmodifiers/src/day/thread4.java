package day;
class Test1  extends Thread{
	public void  run() {
		System.out.println("hi");
	}
}
class Test21 extends Test1{
	public void run() {
		System.out.println("good evening");
	}
}
class Test3  implements Runnable{
	public void  run() {
		System.out.println("good morning");
	}
}
class Test4 extends Test3{
	public void run() {
		System.out.println("hello");
	}
}
  class thread4{
	  
	public static void main(String[] args) {
		Test1 t1=new Test1();
		Test21 t2=new Test21();
		Test3 t3=new Test3();
		Test4 t4=new Test4();
		 t1.start();
		 t2.start();
		 Thread l3=new Thread(t3);
			l3.start();	 
		 Thread l4=new Thread(t4);
				 l4.start();
		  

	}

}
