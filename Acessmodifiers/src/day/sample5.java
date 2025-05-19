package day;
interface I4{
	void add();	
}
class test56{
	void sub() {
		System.out.println("hello extends");
	}
}
public class sample5 extends test56 implements I4{
public void add() {
	System.out.println("hi");
}
	public static void main(String[] args) {
		 sample5 s1=new sample5();
		 s1.add();
		 s1.sub();
	}

}
