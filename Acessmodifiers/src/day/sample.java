package day;//heirarical
class chocolate{
	void  candy() {
		System.out.println("taste1");
	}
}
class dark extends chocolate{
	void tasty() {
		System.out.println("taste2");
	}
}
class sweet extends dark{
	void tictac() {
		System.out.println("super tasty");
	}
}
class arun extends sweet{
	void cost1() {
		System.out.println("eat");
	}
}
class amul extends arun{
	void cost2() {
		System.out.println("super");
	}
}
class dairymilk extends amul{
	void weight() {
		System.out.println("super and healthy");
	}
}
class kitkat extends dairymilk{
	void weight2() {
		System.out.println("awesome");
	}
}
public class sample {

	public static void main(String[] args) {
	 amul a1=new amul();
	 kitkat k1=new kitkat();
	 dairymilk d1=new dairymilk();
	 sweet s1 =new sweet();
	 s1.tictac();
	 a1.candy();
	 a1.tasty();
	 a1.cost1();
	 a1.cost2();
	 d1.weight();
	 
	}

}
