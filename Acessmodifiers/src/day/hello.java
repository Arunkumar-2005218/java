package day;//polymerphism /method overloading

public class hello {
 void add() {
	System.out.println("hii");
 }
 void add(int a) {
	System.out.println(a);
 }
 void add(int a, int b) {
	System.out.println(a+b);
 }
 void add(int a,int b,double d1) {
	System.out.println(a+b-d1);
}
 
public static void main(String[] args) {
	hello h1=new hello();
	h1.add();
	h1.add(34);
	h1.add(2,6);
	h1.add(4,5,7.9);

	}

}
