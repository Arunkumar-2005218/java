package day;//interface/multiple inheritance
interface I1{
	void add();	
	}
interface I2{
	void  sub();
}
public class sample4  implements I1,I2{
	public void add() {
		System.out.println("hi");
	}
public void sub() {
	System.out.println("hello");
}
	public static void main(String[] args) {
		 sample4 s1=new sample4();
		 s1.add();
		 s1.sub();

	}}

