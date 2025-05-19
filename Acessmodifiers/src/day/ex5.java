package day;
interface I12{
	void mean();
}
interface I22{
	void mode();
}
interface I33{
	void median();
}
class start implements I12,I22,I33 {
	public void mean() {
		System.out.println("normal");
	}
	public void mode() {
		System.out.println("least");
	}
	public void median() {
		System.out.println("supreme");
	
	}
	
	public void basic() {
		System.out.println("simple");
	}}
public class ex5 extends start {
	public void worst() {
		System.out.println("case");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ex5 w=new ex5();
		start s=new start();
		s.mean();
		s.mode();
		s.median();
		s.basic();
		w.worst();

	}

}

 
