package JavaPractice;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class HashMapExample {

	public static void main(String[] args) {
		
/*Map interface- it maps keys to values, cannot contain duplicate keys
each key can map to at most one value. 
this interface takes the place of the Dictionary class 
Map interface provides three collection views:
- a set of keys, Saturday
- collection of values,
- set of key-value mappings.*/
		
	Hashtable<Integer, String> hm = new Hashtable<Integer, String>();
	hm.put(0, "Sunday");
	hm.put(1, "Monday");
	hm.put(2, "Tuesday");
	hm.put(3, "Wednesday");
	hm.put(4, "Thursday");
	hm.put(5, "Friday");
	hm.put(7, "Saturday");
	System.out.println(hm);
	System.out.println(hm.get(3));
	System.out.println(hm.keySet());
	System.out.println(hm.values());
	int i;
	for (i=0;i<= hm.size();i++) {
		if (hm.get(i).equals("Wednesday")){
			System.out.println(i);
			break;
		}
	
	}
	Enumeration el = hm.elements();
	while (el.hasMoreElements()) {
		System.out.println(el.nextElement());
	}
	
	
	Set sm = hm.entrySet();
	
	System.out.println(sm);
	Iterator it = sm.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
	}
	while(it.hasNext()) {
		Map.Entry mp = (Map.Entry)it.next();
		System.out.println(mp.getKey());
		System.out.println(mp.getValue());
		
	}
	
	}

}
