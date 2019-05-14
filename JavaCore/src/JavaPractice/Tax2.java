package JavaPractice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Tax2 {

	public static void main(String[] args) {
		getTax(95000.00);

	}
	// 0.00		- 25000.00 	10%
	// 25000.01 - 45000.00	15%
	// 45000.01 - 60000.00	20%
	// 60000.01 - 90000.00	25%
	// 90000.01				30%	
	
	public static Double getTax (Double salary) {
		double tax = 0;
		HashMap<Double, Double> hm = new HashMap<Double, Double>();
		Double a [] = {25000.00, 20000.00, 15000.00, 30000.00, 100000.00};
		Double b [] = {0.10, 0.15, 0.20, 0.25, 0.30};
		
		double sum = a[0];
		int i;
		double remain = 0;
		for (i=1; i<=a.length; i++) {
			
			if (salary < sum) {
				remain = salary-sum+a[i-1] ;
				hm.put(remain, b[i-1]);
				break;
			}
			else
				hm.put(a[i-1],b[i-1]);
				sum = sum + a[i];
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
