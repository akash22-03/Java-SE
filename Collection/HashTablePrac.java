package Collection;
import java.util.*;
public class HashTablePrac {

	@SuppressWarnings({ "rawtypes", "unchecked" ,"unused"})
	public static void main(String[] args) {
		Hashtable ht = new Hashtable();
		ht.put(1, 'A');
		ht.put(2, 'B');
		ht.put(3, 'C');
		ht.put(4, 'D');
		
		ht.compute(2, (k,v)->v+"Z");
		ht.computeIfAbsent(7, (k)->"Z");
		
		char req = (char) ht.get(3);
		
		Enumeration e = ht.elements();
		while(e.hasMoreElements())
			System.out.print(e.nextElement()+" ");
		
		
		

	}

}
