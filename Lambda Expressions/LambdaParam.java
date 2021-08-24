package LambdaExpressions;

@FunctionalInterface
interface MyLambda
{
	public void display(String str);
}

@FunctionalInterface
interface Addition
{
	public int add(int x, int y);
}
/*
 * class My implements MyLambda {
 * 
 * @Override public void display() { System.out.println("Hello World."); } }
 */

public class LambdaParam {

	public static void main(String[] args)
	{
		/*
		MyLambda obj = new MyLambda() {
			@Override
			public void display() 
			{ 
				System.out.println("Hello World."); 
			}
		};
		obj.display();
		*/
		//same as
		
		MyLambda lambdaobj = (s) -> {System.out.println("Hello "+s);};
		lambdaobj.display("Akash");
		
		Addition obj = (a,b) -> {return a+b;};
		System.out.println(obj.add(4, 6));
		
		//same as
		Addition newobj = (a,b) -> a+b;
		System.out.println(newobj.add(4, 6));
	}

}
