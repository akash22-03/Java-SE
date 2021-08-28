package JavaGenerics;

class MyArray<E>
{
	@SuppressWarnings("unchecked")
	E A[] = (E[]) new Object[10];
	int len = 0;
	
	public void append(E v)
	{
		A[len++] = v;
	}
	public void display()
	{
		for(int i=0;i<len;i++)
			System.out.println(A[i]);
	}
}

public class Data <T>
{
	private T obj;
	
	public T getObj() {
		return obj;
	}

	public void setObj(T obj) {
		this.obj = obj;
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args)
	{
		Data<Integer> d = new Data<>();
		d.setObj(10);//Auto-boxing same as d.setObj(new Integer(10)); 
		System.out.println(d.getObj());
		
		MyArray<Integer> ma = new MyArray<>();
		ma.append(10);
		ma.append(20);
		ma.append(30);
		ma.display();
		
		MyArray ma2 = new MyArray();
		ma2.append(10);
		ma2.append(2.3);
		ma2.append("Hello");//since no generic param is passed then it acts as a normal Object array 
	}

}
