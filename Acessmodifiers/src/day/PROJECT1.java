package day;
class test1{
	  void show() {
		System.out.println("hi");
	}
}
public class PROJECT1 extends test1 {
	 void show() {
		 int a=23;
		 System.out.println(a);
		 a=34;
		 System.out.println(a);
		 }
	public static void main(String[] args) {
		PROJECT1 p1=new PROJECT1 ();
		p1.show();
	}

}
