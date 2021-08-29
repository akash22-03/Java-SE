package DateAndTimeAPI;
import java.util.Date;

public class DeprecatedDateClass {

	@SuppressWarnings({"deprecation"})
	public static void main(String[] args) 
	{
		System.out.println("This much year passed since 1st Jan 1970 : "+System.currentTimeMillis()/(1000*60*60*24*365));
		System.out.println("Maximum Year Long can store : "+Long.MAX_VALUE/(1000*60*60*24*365));

		Date d = new Date();
		System.out.println(d);
			
		Date bday = new Date("3/22/2001");//mm/dd/yyyy
		System.out.println(bday);
		System.out.println(bday.getDay());
		System.out.println(bday.getMonth());
		System.out.println(bday.getYear());//shows years passed after 1900
		System.out.println(bday.getYear()+1900);
	}

}
