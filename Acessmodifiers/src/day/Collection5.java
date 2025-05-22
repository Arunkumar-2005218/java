package day;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Collection5 {

	public static void main(String[] args) {
		List<Object> l1=new ArrayList<Object>();
		l1.add(12);
		l1.add("hi");
		l1.add(67);
		 l1.add(2, 67);
		System.out.println(l1);
		List<Object> extra=Arrays.asList( 34,56,78);
		l1.addAll(1,extra);
		System.out.println(l1.get(5));
		System.out.println(l1.indexOf(90));
		Object[] arr=l1.toArray();
		for (Object a1:arr) {
			System.out.println(a1);
		}
		

	}

}
