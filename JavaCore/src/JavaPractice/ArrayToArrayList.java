package JavaPractice;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayToArrayList {

	public static void main(String[] args) {
		//Using Collection.addAll
		 String[] students = {"Raj", "Kumar", "Rajkumar"};
		 
		 ArrayList<String> arrList = new ArrayList<String>();
		 
		 Collections.addAll(arrList, students);
		 
		 arrList.add("Hello");
		 
		 System.out.println(arrList);

	}

}
