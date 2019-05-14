package JavaPractice;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo3 {

	public static void main(String[] args) {
		ArrayList<String> colors = new ArrayList<String>();
		colors.add("red");
		colors.add("blue");
		colors.add("green");
		colors.add("brown");
		colors.add("white");
		colors.add("black");
		System.out.println(colors);
		
		Collections.reverse(colors);
		System.out.println(colors);
		
		Collections.sort(colors);
		System.out.println(colors);
	}

}
