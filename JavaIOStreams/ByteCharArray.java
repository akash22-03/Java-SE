package JavaIOStreams;

import java.io.*;

public class ByteCharArray
{
    public static void main(String[] args) throws IOException
    {
        
    	byte b[]={'a','b','c','d','e','f','g','h','i','j'};
    	ByteArrayInputStream bis = new ByteArrayInputStream(b);
    	int x;
        while((x=bis.read())!=-1)
            System.out.print((char)x);
        //meth2
        String str = new String(bis.readAllBytes());
        System.out.println(str);
        
        System.out.println(bis.markSupported());
        
        bis.close();
    	
        ByteArrayOutputStream bos = new ByteArrayOutputStream(20);
        bos.write('a');
        bos.write('b');
        bos.write('c');
        bos.write('d');
        byte i[] = bos.toByteArray();
        for(byte l:i)
        	System.out.println((char)l+" ");
        bos.writeTo(new FileOutputStream("C:/Test.txt"));
        bos.close();
        
        
        
        char c[]={'a','b','c','d','e','f','g','h','i','j'};
        CharArrayReader cr=new CharArrayReader(c); 
        int y;
        while((y=cr.read())!=-1)
            System.out.print((char)y);
        cr.close();
        
    }
}