package day;
interface student{
	void nrcm();	
}
class roll{
	public void name() {
		System.out.println("rakesh");
	}
}
class marks extends roll implements student{
	public void college() {
		System.out.println("passed");
	}

}
class test extends marks{
	public void course() {
		System.out.println("btech");
	}
}
public class ex3 {

	public static void main(String[] args) {
		 marks m1=new marks();
		 test t1=new test();
		 m1.name();
		 m1.college();
	

	}

}
