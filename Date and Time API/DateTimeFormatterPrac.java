package DateAndTimeAPI;
import java.time.*;
import java.time.format.*;
import java.time.temporal.ChronoField;
public class DateTimeFormatterPrac
{
	public static void main(String[] args) 
	{
		ZonedDateTime dt =ZonedDateTime.now();
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss z");
		System.out.println(df.format(dt));		
		LocalDateTime ld = LocalDateTime.now();
		System.out.println(ld.get(ChronoField.YEAR));
	}
}
