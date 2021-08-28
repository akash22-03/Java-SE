package Collection;
import java.util.*;
public class LinkedHashMapPrac {

	@SuppressWarnings({"serial","rawtypes"})
	public static void main(String[] args) {
		LinkedHashMap<Integer,Character> lhm = new LinkedHashMap<>(5,0.75f,/*based on order or access*/true)
				{
					//here to achieve and actually set size to 5 we need to override a function and here we do it by using anonymous class
					//here 1st inserted element is deleted of Order of access is not set or false else least recently used is deleted.
					@Override
					protected boolean removeEldestEntry(Map.Entry e)
					{
						return size()>5;
					}
				};
		
		lhm.put(1, 'A');
		lhm.put(2, 'B');
		lhm.put(3, 'C');
		lhm.put(4, 'D');
		lhm.put(5, 'E');
		lhm.put(8, 'J');
		
		lhm.get(2);
		lhm.get(5);
		lhm.get(1);
		
		lhm.forEach((k,v)->System.out.println(k+" "+v));
		//prints least recently used entries first/
	}

}
