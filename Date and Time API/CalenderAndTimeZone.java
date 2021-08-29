package DateAndTimeAPI;

import java.util.*;
public class CalenderAndTimeZone {

	public static void main(String[] args) {
		//GregorianCalendar is mutable
		GregorianCalendar gc = new GregorianCalendar();
		System.out.println(gc.isLeapYear(1960));
		System.out.println(gc.get(Calendar.DAY_OF_WEEK));//here day starts with 1
		System.out.println(gc.get(Calendar.MONTH));//here month starts with 0
		System.out.println(gc);
		gc.setTimeZone(TimeZone.getTimeZone("America/Los_Angeles"));
		TimeZone tz = gc.getTimeZone();
		System.out.println(tz+"\n"+tz.getDisplayName()+"\n"+tz.getID());
	}

}
