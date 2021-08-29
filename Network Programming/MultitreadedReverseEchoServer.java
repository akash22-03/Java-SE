package NetworkProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class MultitreadedReverseEchoServer extends Thread
{
	Socket stk;
	public MultitreadedReverseEchoServer(Socket st)
	{
		this.stk = st;
	}
	@Override
	public void run()
	{
		try
		{
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
			}
			while(!msg.equals("dne"));
			stk.close();
		}
		catch(IOException e) {};
	}

	public static void main(String[] args) throws IOException
	{
		ServerSocket ss = new ServerSocket(2000);
		Socket stk;
		MultitreadedReverseEchoServer re;
		int count = 1;
		do
		{
			stk= ss.accept();
			System.out.println("Client Connected.");
			re = new MultitreadedReverseEchoServer(stk);
			re.start();
		}
		while(true);		
	}
}
