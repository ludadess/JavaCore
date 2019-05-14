package JavaPractice;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/d");
		System.out.println(sdf.format(date));
		
		System.out.println(new SimpleDateFormat("hh:mm:ss").format(new Date()));
	}

}
