package JavaIOStreams;
//import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class fileOutputStream {

	/*
	public static void main(String[] args) 
	{
		try 
		{
			FileOutputStream fos = new FileOutputStream("C:/MyJava/Test.txt");
			String str = "Learn Java Programming";		
			fos.write(str.getBytes());
			fos.close();
		}
		catch(FileNotFoundException e)
		{
			System.err.println(e);
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
	}*/
	
	public static void main(String[] args) throws IOException
	{
		try(FileOutputStream fos=new FileOutputStream("C:/MyJava/Test.txt");)
        {
			String str="Learn Java Programming";
			byte b[] = str.getBytes();
			fos.write(b);
        }
	}
}
