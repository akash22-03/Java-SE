package LambdaExpressions;

@FunctionalInterface
interface MyLambda
{
   // public void display(String str);
    public int display(String str1, String str2);
}

public class MethodReferences 
{
	public MethodReferences(String str)
	{
		System.out.println(str.toUpperCase());
	}
	public static void reverse(String str)
	{
		StringBuffer sb = new StringBuffer(str);
		sb.reverse();
		System.out.println(sb);
	}
	public void append(String str)
	{
		StringBuffer sb = new StringBuffer(str);
		sb.append("Ok");
		System.out.println(sb);
	}
    public static void main(String[] args) {
        
       /* MyLambda ml = System.out::println;      //scope resolution  
        ml.display("Hello");*/
        
    	/*//for static methods
    	MyLambda ml =  MethodReferences::reverse;
    	ml.display("Hello");*/
        
    	/*//for non static methods
    	MethodReferences mrobj = new MethodReferences();
    	MyLambda ml1 = mrobj::append;
    	ml1.display("ok"); */
    	
    	/*MyLambda ml2 = MethodReferences::new;
    	ml2.display("hello");*/
    	
    	MyLambda ml = String::compareTo;
    	System.out.println(ml.display("hello", "hello"));
    	
    	
    }
    
}