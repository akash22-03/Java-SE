package LambdaExpressions;
/*
interface MyLambda
{
	public void display();
}*/
/*
class Demo
{
	int temp = 10;
	public void method1()
	{
		int i = 0;
		MyLambda m1 = () -> {
			int count = 0;
			count++;
			//i++; access only those variables that are final or they are never modified inside the method.
			System.out.println("Hi");
			System.out.println("Bye"+count);
			temp++; //class instance variables can be accessed and modified.
		};
	}
}
*/
class UseLambda
{
	public void callambda(MyLambda ml)
	{
		ml.display();
	}
}
class Demo
{
	public void method1()
	{
		UseLambda ul=new UseLambda();
	    ul.callambda(()->{System.out.println("Hello");});
	}
}
public class CapturePrac {

	public static void main(String[] args) 
	{
		Demo d=new Demo();
        d.method1();

	}

}
