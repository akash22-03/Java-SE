package JavaIOStreams;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class fileInputStream {

	public static void main(String[] args) throws IOException
	{
		try(FileInputStream fis=new FileInputStream("C:/MyJava/Test.txt");)
        {
			/*byte b[] = new byte[fis.available()];
			fis.read(b);
			String str = new String(b);
			System.out.println(str);*/
			
			int x;
			while((x=fis.read())!=-1)
				System.out.print((char)x);
        }
		
		try(FileReader fr =new FileReader("C:/MyJava/Test.txt");)
        {			
			int x;
			while((x=fr.read())!=-1)
				System.out.print((char)x);
        }
		

	}

}
