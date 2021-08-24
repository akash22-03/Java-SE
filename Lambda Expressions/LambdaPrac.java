package LambdaExpressions;
/*
@FunctionalInterface
interface MyLambda
{
	public void display();
}
*/
/*
 * class My implements MyLambda {
 * 
 * @Override public void display() { System.out.println("Hello World."); } }
 */

public class LambdaPrac {

	public static void main(String[] args)
	{
		MyLambda obj = new MyLambda() {
			@Override
			public void display() 
			{ 
				System.out.println("Hello World."); 
			}
		};
		obj.display();
		
		//same as
		
		MyLambda lambdaobj = () -> {System.out.println("Hello World");};
		lambdaobj.display();

	}

}
