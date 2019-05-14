package JavaPractice;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Test {

	public static void main(String[] args) {
		String original = "fish tea note Fish dog cat tea tea";
		
		String[] words = original.toLowerCase().split(" ");
		
		
		Map<String, Integer> hm = new HashMap<String, Integer>();
		int i;
		int k = 1;
		for(i=0;i<words.length;i++) {
			if (!hm.containsKey(words[i])){
				hm.put(words[i],k);
			}
			 else {	
				 hm.put(words[i],hm.get(words[i])+1); 
			 }
			}
		
		 Map<String, Integer> map = new TreeMap<String, Integer>(hm); 
		 
		 Set set = map.entrySet();
         Iterator it = set.iterator();
         while (it.hasNext()) {
        	 Map.Entry me = (Map.Entry)it.next();
             System.out.print(me.getKey() + "-"+me.getValue()+", ");
            
         }
	}

}
