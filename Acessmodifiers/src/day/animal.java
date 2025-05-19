package day;//multilevel

 class bike{
	void speed() {
		System.out.println("250 km per hour");
	}
 }
	class Bmw extends bike{
		void rev() {
			System.out.println("1000cc");
		}
	}
class model extends Bmw	{
		void price() {
			System.out.println("just 30 lakhs");
		}
	}
public class animal{
	public static void main(String[] args) {
		 model d1=new model();
			 d1.speed();
		     d1.rev();
		     d1.price();
	}        

}
