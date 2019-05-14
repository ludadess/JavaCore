package JavaPractice;

import java.util.ArrayList;

public class ArrayListDemo5 {

	public static void main(String[] args) {
		ArrayList<String> colors1 = new ArrayList<String>();
		colors1.add("red");
		colors1.add("blue");
		colors1.add("green");
		colors1.add("brown");
		colors1.add("white");
		colors1.add("black");
		System.out.println(colors1);
		
		ArrayList<String> colors2 = new ArrayList<String>();
		colors2.add("yellow");
		colors2.add("blue");
		colors2.add("green");
		colors2.add("pink");
		colors2.add("white");
		colors2.add("gold");
		System.out.println(colors2);
		
		ArrayList<String> result = new ArrayList<String>();
		for(String c1:colors1) {
			result.add(colors2.contains(c1)? "Yes":"No");
		}
		System.out.println(result);

	}

}
