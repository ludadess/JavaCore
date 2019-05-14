package JavaPractice;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {
	
// List interface - ordered collection, allows duplicate elements
// implements by ArrayList, LinkedList, Vector
// ArrayList - resizable-array
	
	public static void main(String[] args) {
		
		ArrayList<String> a = new ArrayList<String>();
		a.add("abc");
		a.add("abc");
		a.add("zxc");
		System.out.println(a);
		a.add(0,"student");
		System.out.println(a);
		System.out.println(a.contains("abc"));
		System.out.println(a.indexOf("zxc"));
		System.out.println(a.get(0));
		System.out.println(a.size());
		System.out.println(a.set(2, "ddd"));
		System.out.println(a.isEmpty());
		System.out.println(a);
		
		 Iterator<String> it = a.iterator();
		 while (it.hasNext()) {
			 System.out.println(it.next());
		 }
		
				
	}

}
