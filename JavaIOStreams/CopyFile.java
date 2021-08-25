package JavaIOStreams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {

	public static void main(String[] args) throws IOException
	{
		FileInputStream fis=new FileInputStream("C:/MyJava/Test.txt");
		FileOutputStream fos=new FileOutputStream("C:/MyJava/Copy.txt");
		
		int b;
		while((b=fis.read())!=-1)
		{
			if(b>=65 && b<=90)
				fos.write(b+32);
			else
				fos.write(b);
		}
		fis.close();
		fos.close();
	}

}
