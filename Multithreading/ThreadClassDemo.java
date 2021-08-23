package MultiThreading;

class MyThread extends Thread
{	
	@Override
	public void run()
	{
		int i = 1;
		while(true)
		{
			System.out.println(i+"Hello");
			++i;
		}
	}
}
public class ThreadClassDemo {

	public static void main(String[] args) 
	{
		MyThread t = new MyThread();
		t.start();
		int i = 1;
		while(true)
		{
			System.out.println(i+"World");
			++i;
		}
	}

}
