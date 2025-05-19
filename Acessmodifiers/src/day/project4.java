package day;//static inner classes
class sample26{
	private static void show() {
		System.out.println("hi");
	}
	static class test25{
	 static   void print() {
			System.out.println("hello");
			show();
		}
	}
}
public class project4 {
	public static void main(String[] args) {
		 sample26.test25.print();
	}

}
