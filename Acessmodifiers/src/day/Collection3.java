package day;
import java.util.*;
public class Collection3 {

	public static void main(String[] args) {
		List<Integer> l1=new ArrayList<Integer>();
		l1.add(12);
		l1.add(45);
		l1.add(67);
		List<Integer> l2=new ArrayList<Integer>(l1);
		l2.add(12);
		l2.add(45);
		l2.add(67);
		System.out.println(l2);
	}

}
