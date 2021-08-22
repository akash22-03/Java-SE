package ExceptionHandling;

import java.io.*;
import java.util.*;

public class Resources
{
	/*
	 * static FileInputStream fi; static Scanner sc; static void Divide() throws
	 * FileNotFoundException, IOException { fi = new
	 * FileInputStream("C:/Users/Akash/OneDrive/Desktop/Test.txt"); sc = new
	 * Scanner(fi); int a=sc.nextInt(); int b=sc.nextInt(); int c=sc.nextInt();
	 * System.out.println(a/b);
	 * 
	 * fi.close(); //sc.close(); }
	 */
    
    
    static void Divide() throws Exception
    {
        try( FileInputStream fi=new FileInputStream("C:/Users/Akash/OneDrive/Desktop/Test.txt"); Scanner sc=new Scanner(fi) ) //Try with resources
        {
	        int a=sc.nextInt();
	        int b=sc.nextInt();
	        int c=sc.nextInt();
	        System.out.println(a/c);
        }
    }
    
    public static void main(String[] args) throws Exception
    {
        try
        {
        	Divide();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
		/*
		 * int x=sc.nextInt(); System.out.println(x);
		 */
        
    }
    
}