package JavaPractice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Tax {

	public static void main(String[] args) {
		getTax(65000.00);

	}
// 0.00		- 25000.00 	10%
// 25000.01 - 45000.00	15%
// 45000.01 - 60000.00	20%
// 60000.01 - 90000.00	25%
// 90000.01				30%	
	
	public static Double getTax (Double salary) {
		double tax = 0;
		HashMap<Double, Double> hm = new HashMap<Double, Double>();
				
		if (salary <=25000.00) {
			hm.put(salary, 0.10);
		}
		else if (salary >25000.00 && salary <=45000.00) {
			hm.put(25000.00, 0.10);
			salary = salary-25000.00;
			hm.put(salary, 0.15);
		}	
		else if (salary >45000.00 && salary <=60000.00) {
			hm.put(25000.00, 0.10);
			hm.put(20000.00, 0.15);
			salary = salary-45000.00;
			hm.put(salary, 0.20);	
		}
		else if (salary >60000.00 && salary <=90000.00) {
			hm.put(25000.00, 0.10);
			hm.put(20000.00, 0.15);
			hm.put(15000.00, 0.20);
			salary = salary-60000.00;
			hm.put(salary, 0.25);	
		}
		else if (salary >90000.00 ) {
			hm.put(25000.00, 0.10);
			hm.put(20000.00, 0.15);
			hm.put(15000.00, 0.20);
			hm.put(30000.00, 0.25);
			salary = salary-90000.00;
			hm.put(salary, 0.30);	
		}
		System.out.println(hm);
		Set<Double> keys = hm.keySet();
		 
		 Iterator<Double> it = keys.iterator();
		 while (it.hasNext()) {
			 Double key =  it.next();
			 Double value = (Double) hm.get(key);
			 tax = tax+ key*value;
			 
		}
		System.out.println(tax);	
		return tax;
				
	}
	
}
