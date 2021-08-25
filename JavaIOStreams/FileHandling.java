package JavaIOStreams;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileHandling {

	public static void main(String[] args) throws IOException
	{
		  // select path of any directory on you computer
	       File f=new File("C:/MyJava");
	       
	       System.out.println(f.isDirectory());
	       File list[]=f.listFiles();
	        
	       for(File x:list)
	       {
	           System.out.println(x.getParent()+" "+x.getName()+" "+x.getPath());
	       }
	       
	       File fa = new File("C:/MyJava/Data.txt");
	       //fa.setReadOnly();
	       FileOutputStream fos = new FileOutputStream("C:/MyJava/Data.txt");//throws error
	       fa.lastModified();
	       fa.isHidden();
	       
	}

}
