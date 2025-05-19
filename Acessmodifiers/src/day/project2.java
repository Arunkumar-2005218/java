package day;//nested inner class

public class project2 {
    void show() {
    	System.out.println("hi");
    }
	class test23{
		void print() {
			System.out.println("hello");
		}
	}
   
	public static void main(String[] args) {
		project2  p1=new project2 ();
		p1.show();
		project2.test23 s1=new project2 ().new test23();
		s1.print();
	}

}
