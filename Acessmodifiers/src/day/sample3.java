package day;//method overriding
class test34{
  void add() {
	  System.out.println("hi");
  }
}
	public class sample3 extends test34{
	 void add() {
		 
			System.out.println("hellooooooo");
		}
	

	public static void main(String[] args) {
		 
		 sample3 d1=new sample3();
		 d1.add();
	}

}
