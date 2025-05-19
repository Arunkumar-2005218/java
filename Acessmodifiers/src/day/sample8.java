package day;
class sample45{
	public sample45() {
		System.out.println("good evening");
	}
	int x=99;
	void print() {
		System.out.println("hello");
	}
}
public class sample8  extends sample45{
	public sample8() {
		super();
	}
	void show() {
		int y=45;
		super.print();
		System.out.println(super.x);
		System.out.println(y);
	}

	public static void main(String[] args) {
		 sample8 s1=new sample8();
		 s1.show();
	}

}
