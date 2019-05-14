package JavaPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListDemo1 {
	
	public static void main(String[] arg) {
	ArrayList<String> colors = new ArrayList<String>();
	colors.add("red");
	colors.add("blue");
	colors.add("green");
	colors.add("brown");
	colors.add("white");
	colors.add("black");
	System.out.println(colors);
	colors.add(0,"yellow");
	colors.set(2,"orange");
	System.out.println(colors);
	colors.remove(2);
	System.out.println(colors);
	
	Collections.sort(colors);
	System.out.println(colors);
	
	Collections.swap(colors, 0, 3);
	System.out.println(colors);
	
	ArrayList<String> colors1 = (ArrayList<String>) colors.clone();
	System.out.println(colors1);
	
	colors.removeAll(colors);
	System.out.println(colors.isEmpty());
	
	
	}

	
	
	}

