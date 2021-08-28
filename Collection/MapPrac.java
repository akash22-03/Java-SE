package Collection;
import java.util.*; 
public class MapPrac 
{
	public static void main(String[] args) 
	{
		TreeMap<Integer,String> tm = new TreeMap<>(Map.of(0, "A", 1, "B", 2, "C", 3, "D", 4, "E"));
		//HashMap<Integer,String> tm = new HashMap<>(Map.of(0, "A", 1, "B", 2, "C", 3, "D", 4, "E"));
		tm.put(5,"F");
		System.out.println(tm.get(4));
		System.out.println(tm.ceilingEntry(5).getValue());//hash map not sorted so
		System.out.println(tm);
		
		java.util.Map.Entry<Integer,String> e = tm.firstEntry(); //hash map not sorted so
		System.out.println(e.getKey()+" "+e.getValue());
	}

}
