package day;
import java.util.*;
public class Test56 {

	public static void main(String[] args) {
		Map<Integer,String>m1=new HashMap<Integer,String>();
		m1.put(null, null);
		m1.put(5,null);
		m1.put(2, "eee");
		m1.put(3, "civil");
		m1.put(4, "ds");
		m1.put(6, "aiml");
		System.out.println(m1);
		for(Map.Entry<Integer,String>i:m1.entrySet()) {
			System.out.println(i.getValue());
			System.out.println(i.getKey()); 
		}
		

	}

}
