package NetworkProgramming;
import java.net.*;
import java.io.*;

public class ReverseEchoClient {

	public static void main(String[] args) throws IOException
	{
		Socket stk = new Socket("localhost",2000); // else IP is 192.168.1.12
		
		BufferedReader keyb = new BufferedReader(new InputStreamReader(System.in));
		BufferedReader br = new BufferedReader(new InputStreamReader(stk.getInputStream()));
		PrintStream ps = new PrintStream(stk.getOutputStream());

		String msg;
		do
		{
			msg = keyb.readLine();
			ps.println(msg);
			msg = br.readLine();
			if(msg.equals("dne"))
				System.out.println("Ok Bye.!!");
			else
				System.out.println("From Server : "+msg);
		}
		while(!msg.equals("dne"));
		stk.close();
	}

}
