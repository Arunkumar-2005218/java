package day;
 public class project8{
static void add(int a,int b) throws ArithmeticException  {
	if(b==0) {
		throw new ArithmeticException("maths radha neeku");
	}
			 int c=a/b;
			 System.out.println(c); 
}
    public static void main(String[] args) { 
    	try {
    		add(10,0);
    		
    	}catch(ArithmeticException e) {
    		System.out.println(e.getMessage());
    	}finally {
    		System.out.println("covered all keywords");
    	}
				 
	 }
}


