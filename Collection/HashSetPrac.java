package Collection;
import java.util.*;
public class HashSetPrac {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		HashSet<Integer> hs = new HashSet<>();
		HashSet<Integer> hs1 = new HashSet<>(20, 0.75f);
		hs.add(10);
		hs.add(20);
		hs.add(65);
		hs.add(15);
		hs.add(24);
		hs.add(64);
		hs.add(50);
		System.out.println(hs);

	}

}
