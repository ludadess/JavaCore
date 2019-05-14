package JavaPractice;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarDemo {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		System.out.println(new SimpleDateFormat("hh:mm:ss").format(new Date()));
		System.out.println(new SimpleDateFormat("hh:mm:ss").format(Calendar.getInstance().getTime()));
		//System.out.println(new SimpleDateFormat("YYYY/MM/dd").format(cal.add(Calendar.MONTH, -1)));
		
	}

}