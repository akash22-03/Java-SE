package JavaGenerics;

public class GenericMethod {
	
	static <E> void show(E[] list)
	{
		for(E x: list)
			System.out.println(x);
	}
	static <T extends Number> void display(T... list)
	{
		for(T x: list)
			System.out.println(x);
	}
	// 
	static void fun(MyArray<?> obj)//static void fun(MyArray<?> obj){obj.display();} both are same
	{
		obj.display();
	}
	
	public static void main(String[] args)
	{
		show(new Integer[] {10,20,30,40});
		display(new Double[] {10.3,20.3,30.3,40.3});
		MyArray<String> ma1 = new MyArray<>();
		ma1.append("Hi");
		ma1.append("Akash");
		
		MyArray<Integer> ma2 = new MyArray<>();
		ma2.append(10);
		ma2.append(20);
		fun(ma1);
		fun(ma2);
		
	}
}
