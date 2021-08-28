package Collection;
import java.util.*; 
public class LinkedHashSetPrac
{
	public static void main(String[] args) 
	{
		LinkedHashSet<Integer> lhs = new LinkedHashSet<>(10);
		lhs.add(1);
		lhs.add(2);
		lhs.add(5);
		lhs.add(4);
		lhs.add(3);
		lhs.add(2);
		lhs.forEach(x->System.out.print(x+" "));
		System.out.println( );
		Iterator<Integer> itr = lhs.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next()+" ");
		}

	}

}
