package JavaPractice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Test2 {

	public static void main(String[] args) {
		String original = "fish tea note Fish dog cat tea tea";
		String[] words = original.toLowerCase().split(" ");
		Map<String,Integer> hm = new HashMap<String,Integer>();
		int count =1;
		for(int i=0;i<words.length;i++) {
			if (!hm.containsKey(words[i])) {
				hm.put(words[i], count);
			}
			else {
				hm.put(words[i], hm.get(words[i])+1);
			}
			
			}
			System.out.println(hm);
		 Map<String,Integer> tm = new TreeMap<String,Integer>(hm);
		 System.out.println(tm);
		 Set<String> keys = tm.keySet();
		 
		 Iterator<String> it = keys.iterator();
		 while (it.hasNext()) {
			 String key = (String) it.next();
			 Integer value = tm.get(key);
			 System.out.print(key+"-"+value+" ");		 
		 }
		 
		
	}

	
}
