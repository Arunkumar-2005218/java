package day;//anynomous inner class
class demo1{
	void show() {
		System.out.println("hi");
	}
}
public class project5 {
	 demo1 d1=new demo1() {//anynomous
		 void show() {
			 System.out.println("hello");
			 super.show();
		 }
};
	public static void main(String[] args) {
		  project5 p1 =new project5();
		  p1.d1.show();

	}

}
