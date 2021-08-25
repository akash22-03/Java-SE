package JavaIOStreams;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedStreams {

	public static void main(String[] args) throws IOException
	{
		FileReader fis=new FileReader("C:/MyJava/Test.txt"); //all same for FileInputStream and BufferedInputStream
        BufferedReader bis=new BufferedReader(fis);
        
        System.out.println("File "+fis.markSupported());
        System.out.println("Buffer "+bis.markSupported());
        
        System.out.print((char)bis.read());
        System.out.print((char)bis.read());
        System.out.print((char)bis.read());
        
        bis.mark(10);
        
        System.out.print((char)bis.read());
        System.out.print((char)bis.read());
        
        bis.reset();
        
        System.out.print((char)bis.read());
        System.out.print((char)bis.read());
        
        System.out.println("\nString "+bis.readLine());//not present in bufferedinputstream

	}

}
