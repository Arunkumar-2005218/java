package day;
interface I6{
	void add(); 

}
interface I7 extends I6{
	void sub();
}
class ppr implements I7{
	public void add() {
		System.out.println("hi");
	}
	public void sub() {
		System.out.println("welcome");
	}
	public void mul() {
		System.out.println("bro");
	}
}
class ppr1 implements I7{
	public void add() {
		System.out.println("hi");
	}
	public void sub() {
		System.out.println("hello");
	}
	public void mul() {
		System.out.println("bYe");
	}
}

public class sample7 {
	public static void main(String[] args) {
		 ppr1 s1=new ppr1();
		 s1.add();
		 s1.sub();
		 s1.mul();

		 ppr s2=new ppr();
		 s2.add();
		 s2.sub();
		 s2.mul();

}
}
