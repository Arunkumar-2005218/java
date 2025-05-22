package day;

 

	class sample1  extends Thread{
		public void  run() {
			System.out.println("hi");
		}
	}
	class sample2 extends sample1{
		public void run() {
			System.out.println("good evening");
		}
	}
	class sample3  implements Runnable{
		public void  run() {
			System.out.println("good morning");
		}
	}
	class sample4 extends sample3{
		public void run() {
			System.out.println("hello");
		}
	}
	  class thread5{
		  
		public static void main(String[] args) {
			sample1 t1=new sample1();
			sample2 t2=new sample2();
			sample3 t3=new sample3();
			Test4 t4=new Test4();
			 t1.start();
			 t2.start();
			 Thread l3=new Thread(t3);
				l3.start();	 
			 Thread l4=new Thread(t4);
					 l4.start();
			  

		}

	}


