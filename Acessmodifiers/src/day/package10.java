package day;//user defined exception 
class CheppanuException  extends Exception{
	public CheppanuException (String message) {
		super(message);
	}
}
public class package10 {
	public static void  agecheck(int age)throws CheppanuException  {
	if(age<18) {
		throw new  CheppanuException ("nenu cheppanu");
	}else {
		System.out.println(" na age 18 below");
		
	}
	}

	public static void main(String[] args) {
		 try {
			 agecheck(24);
		 }catch(CheppanuException e) {
			 System.out.println(e.getMessage());
		 }finally {
			 System.out.println(" maths oka confusion");
		 }

	}

}
