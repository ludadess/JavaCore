package JavaPractice;

import java.util.ArrayList;

public class StringDemo {

	public static void main(String[] args) {
		String abc = "table";
		System.out.println(abc.length());
		int i;
		String cba = "";
		for (i=abc.length()-1; i>=0 ;i--) {
			cba = cba + (abc.charAt(i));
		}		
			
		System.out.print(cba);
	}

}
