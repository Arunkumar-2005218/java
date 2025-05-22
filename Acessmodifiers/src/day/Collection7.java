package day;
import java.util.*;
public class Collection7 {

	public static void main(String[] args) {
		 LinkedList<Integer> l1=new LinkedList<Integer>();
		 l1.add(13);
		 l1.add(14);
		 System.out.println(l1);
		 l1.addFirst(24);
		 l1.addLast(45);
		 l1.removeFirst();
         l1.removeLast();
         l1.removeFirstOccurrence(45);
		 System.out.println(l1);
		 l1.remove(1);

	}

}
