package DateAndTimeAPI;
import java.util.*;
import java.time.*;
public class TimeClassPrac {

	public static void main(String[] args) {
		ZonedDateTime zdt = ZonedDateTime.now();
		System.out.println(zdt);
		OffsetDateTime odt = OffsetDateTime.now();
		System.out.println(odt);
		ZonedDateTime zdt2 = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));
		System.out.println(zdt2);
		
		MonthDay md = MonthDay.now();
		md.atYear(2001);
		System.out.println(md);
		
		//YearMonth
		//Year
		
		//Period - Diff in Date
		//Duration - Diff in Time
		//Instant - independent of timezone, store greenwich mean time (GMT)
	 	
		Period p = Period.of(2, 2, 10);
		System.out.println(p.addTo(LocalDate.now()));
		
		Instant i = Instant.now();
		System.out.println(i);
	}

}
 