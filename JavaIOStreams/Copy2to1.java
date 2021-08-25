package JavaIOStreams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

public class Copy2to1 {

	public static void main(String[] args) throws IOException
	{
		FileInputStream fis1=new FileInputStream("C:/MyJava/Test.txt");
		FileInputStream fis2=new FileInputStream("C:/MyJava/Copy.txt");
		
		FileOutputStream fos = new FileOutputStream("C:/MyJava/Merge.txt");
		
		SequenceInputStream sis = new SequenceInputStream(fis1,fis2);
		
		int b;
        while((b=sis.read())!=-1)
        { 
            fos.write(b);
        }
        
        sis.close();
        fis1.close();
        fis2.close();
        fos.close();
	}
}
