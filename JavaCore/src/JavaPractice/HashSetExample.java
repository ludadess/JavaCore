package JavaPractice;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

// Set interface - unordered collection	that contains no duplicate elements
// implements by HashSet, LinkedHashSet, 
	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		hs.add("USA");
		hs.add("UK");
		hs.add("Canada");
		System.out.println(hs);
		hs.add("Russia");
		System.out.println(hs);
		System.out.println(hs.size());
		System.out.println(hs.isEmpty());
		
		Iterator<String> it = hs.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());	
			
		}
		

	}

}
