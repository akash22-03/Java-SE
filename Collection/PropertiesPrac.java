package Collection;

import java.util.*;
import java.io.*;

public class PropertiesPrac 
{
	public static void main(String[] args) throws Exception
	{
		Properties p = new Properties();
		   p.setProperty("Brand", "HP");
		p.setProperty("Processor", "Intel");
		p.setProperty("OS", "Windows");
		p.setProperty("Model", "Pavilion");
		
		p.store(new FileOutputStream("C:/Users/Akash/MyData.txt"), "Laptop");
		p.storeToXML(new FileOutputStream("C:/Users/Akash/MyData.xml"), "Laptop");
		
		System.out.println(p);
		
		p.loadFromXML(new FileInputStream("C:/Users/Akash/MyData.xml"));
		System.out.println(p.getProperty("Brand"));
		
		p.load(new FileInputStream("C:/Users/Akash/MyData.txt"));
		System.out.println(p);
		
	}

}
