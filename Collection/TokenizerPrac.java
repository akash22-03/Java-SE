package Collection;
import java.io.FileInputStream; 
import java.io.IOException;
import java.util.*;
public class TokenizerPrac {

	public static void main(String[] args) throws IOException 
	{
		String data = "name=Vijay;address=delhi;country=india;dept=cse";
		StringTokenizer stk = new StringTokenizer(data,"=;");
		String s;
		while(stk.hasMoreTokens())
		{
			s = stk.nextToken();
			System.out.println(s);
		}
		
		FileInputStream fis = new FileInputStream("C:/Users/Akash/MyData.txt");
		byte b[] = new byte[fis.available()];
		fis.read();
		String str = new String(b);
		StringTokenizer stk2 = new StringTokenizer(str,"=");
		while(stk2.hasMoreTokens())
		{
			s = stk2.nextToken();
			System.out.println(s);
		}
		
		FileInputStream fis22 = new FileInputStream("C:/Users/Akash/Num.txt");
		byte b22[] = new byte[fis22.available()];
		fis22.read(b22);
		String s22;
		String str22 = new String(b22);
		ArrayList<Integer> arr = new ArrayList<>();
		StringTokenizer stk22 = new StringTokenizer(str22, ",");
		
		while(stk22.hasMoreTokens())
		{
			s22 = stk22.nextToken();
			arr.add(Integer.valueOf(s22));
		}
		System.out.println(arr);
		
	}

}
