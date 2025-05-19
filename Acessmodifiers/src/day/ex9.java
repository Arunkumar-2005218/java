package day;

interface Subject{
	void lecture();
}
interface Semester{
	void number();
}
interface Lab{
	void experiment();
}
class College implements Subject,Semester,Lab{
	public void area() {
		System.out.println("Hyderabad");
	}
	public void lecture() {
		System.out.println("first");
	}
	public void number() {
		System.out.println("sem 2");
	}
	public void experiment() {
		System.out.println("pn junction doide");
	}
}
interface Domain{
	void branch();
}
class Duration extends College implements Domain{
	public void time() {
		System.out.println("4 years");
	}
	public void branch() {
		System.out.println("CSE");
	}
}
public class ex9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Duration d1=new Duration();
		College c1=new College();
		d1.branch();
		d1.time();
		d1.lecture();
		d1.number();
		d1.experiment();
		d1.area();

	}

}

 