package JavaGenerics;

class Generic<T>
{
	@SuppressWarnings("unchecked")
	T data [] = (T[]) new Object[3];
	//T newdata[] = new T[3];	error		
}

public class NormalClass {

	@SuppressWarnings({ "deprecation", "unused" })
	public static void main(String[] args) {
		Object obj = new String("Hi");
		//String str = obj; here type casting is required
		String str = (String)obj;
		obj = new Integer(10);
		//No Type Safety
		String xstr = (String) obj;
		//It will throw run time error, but compiler doesn't show it is not allowed
		Object objarr[] = new Object[4];
		objarr[0] = "Hello";
		objarr[1] = new String("Java");
		objarr[2] = 10;
		objarr[3] = new Integer(20);
		//No Type Safety any Class Object can be added
		
		for(Object x: objarr)
			System.out.println((String)x);
		
		Generic<Integer> gen = new Generic();
		gen.data[0] = 1;
		gen.data[1] = 2;
		//gen.data[2] = "Hi"; mismatch error
		
		Integer init = gen.data[1];
	}

}
