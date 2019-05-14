package JavaPractice;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo4 {

	public static void main(String[] args) {
		ArrayList<String> colors = new ArrayList<String>();
		colors.add("red");
		colors.add("blue");
		colors.add("green");
		colors.add("brown");
		colors.add("white");
		colors.add("black");
		System.out.println(colors);
		List<String> colorsSub = colors.subList(0, 3);
		System.out.println(colorsSub);
		
		
	}

}
