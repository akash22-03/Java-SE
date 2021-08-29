package NetworkProgramming;
import java.net.*;
import java.io.*;

public class ReveseEchoServer {

	public static void main(String[] args) throws IOException
	{
		ServerSocket ss = new ServerSocket(2000);
		Socket stk = ss.accept();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(stk.getInputStream()));
		PrintStream ps = new PrintStream(stk.getOutputStream());
		StringBuilder sb;
		String msg;
		do
		{
			msg = br.readLine();
			
			sb = new StringBuilder(msg);
			sb.reverse();
			msg = sb.toString();
			
			ps.println(msg);
		}while(!msg.equals("dne"));
		stk.close();
	}

}
