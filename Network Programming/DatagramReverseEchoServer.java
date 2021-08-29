package NetworkProgramming;
import java.io.IOException;
import java.net.*;
public class DatagramReverseEchoServer 
{

	public static void main(String[] args) throws IOException
	{
		DatagramSocket ds = new DatagramSocket(2000);
		
		byte b[] = new byte[1024];
		DatagramPacket dp = new DatagramPacket(b,1024);
		ds.receive(dp);
	
		String msg = new String(dp.getData()).trim();
		System.out.println("From Server "+msg);
		StringBuilder sb = new StringBuilder(msg);
		sb.reverse();
		msg = sb.toString();
		
		dp = new DatagramPacket(msg.getBytes(), msg.length(), InetAddress.getByName("localhost"),2001);
		ds.send(dp);
	
		ds.close();	

	}

}
