package DateAndTimeAPI;

import java.time.*;
import java.time.temporal.*;
import java.util.*;

public class JodaAPI 
{
	public static void main(String[] args) 
	{
		Date d = new Date();
		d.setHours(21);
		//System.out.println(d);
		
		//LocalDate dt = new LocalDate(); we can't create a new date it works in this sense.
		LocalDate dt = LocalDate.now();
		System.out.println(dt);//yyyy-mm-dd
		
		LocalDate o = LocalDate.now(Clock.systemDefaultZone());
		System.out.println(o);
		
		LocalDate ob = LocalDate.now(ZoneId.of("Asia/Kolkata"));
		System.out.println(ob);
		
		LocalDate obj = LocalDate.of(2001, Month.MARCH, 22);
		System.out.println(obj);
		
		LocalDate day = LocalDate.ofEpochDay(1);
		System.out.println(day);
		
		LocalDate pa = LocalDate.parse("2022-01-03");
		LocalDate d1 = pa.plusMonths(6);
		System.out.println(pa+" "+d1);
		
		LocalTime t = LocalTime.now();
		LocalTime mod = t.minusHours(3);
		System.out.println(t+" "+mod);
		
		LocalDateTime ok = LocalDateTime.now();
		System.out.println(ok);
	}
}
