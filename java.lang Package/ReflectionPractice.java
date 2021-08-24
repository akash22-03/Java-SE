package JavaLangPackage;

import java.lang.reflect.*;

class My
{
    private int a;
    protected int b;
    public int c;
    int d; 
    public My() 
    {
    	
    }   
    public My(int x,int y) 
    {
    	
    }
    public void display(String s1,String s2)
    {
    	
    }
    public int show(int x,int y) 
    {
    	return 0;
    }
    
}

public class ReflectionPractice 
{
    public static void main(String[] args) 
    {
        Class c = Integer.class;
        
        Field field[]=c.getDeclaredFields();
        
        for(Field f: field)
        	System.out.println(f);
        
        System.out.println("/*************************************************************************************/");
        
        Constructor con[] = c.getConstructors();
        
        for(Constructor var : con) {
        	System.out.println(var);
        }
        
        System.out.println("/*************************************************************************************/");
        
        Method meth[]=c.getMethods();
        
        for(Method m:meth)
            System.out.println(m);
        
        System.out.println("/************************************* ******************************************/"); 
        
        Parameter param[]=meth[0].getParameters(); //param of 0th method
        
        for(Parameter p:param){
            System.out.println(p);
        }
        
    }   
}
