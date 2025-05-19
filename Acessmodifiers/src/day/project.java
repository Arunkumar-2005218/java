package day;

public class project   {
	int a=89;
	 void add() {
		 int a=89;
		 System.out.println(a);
	 }
	 void sub() {
		 System.out.println(this.a);
		 this.add(); 
	 }
	public static void main(String[] args) {
		 project p1 =new project();
		 p1.sub();
	}

}
