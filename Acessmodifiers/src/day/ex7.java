package day;
interface Hyderabad{
	void action();
}
class Mumbai{
	void show() {
		System.out.println("Mubmai is known for its pav Bhaji");
	}
}
class Delhi extends Mumbai implements Hyderabad{
	void print() {
		System.out.println("Delhi is known for its Red fort");
	}
	public void action() {
		System.out.println("Hyderabad is known for its Biryani");
	}
}
class Tamilnadu{
	void display() {
		System.out.println("Tamilnadu Known for its culture");
	}
}
public class ex7 extends Tamilnadu {
	void place() {
		System.out.println("Every place is Great of its own");
	}
	public static void main(String args[]) {
		Delhi d1 = new Delhi();
		ex7 p1 = new ex7();
		d1.action();
		d1.show();
		d1.print();
		p1.display();
		p1.place();
}
}

 