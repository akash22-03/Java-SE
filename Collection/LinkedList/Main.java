package Collection.LinkedList;

import java.util.LinkedList;
import java.util.List;

public class Main {

	public static void main(String[] args)
	{
		LinkedList<Integer> ll1 = new LinkedList<>();
		LinkedList<Integer> ll2 = new LinkedList<>(List.of(50,60,70,80,90));
		ll1.add(10);
		ll1.add(0, 5);
		ll1.addAll(ll2);
		ll1.addAll(1, ll2);
		ll1.set(6, 100);
		
		//extra ll class methods
		ll1.addFirst(200);
		ll1.addLast(100);
		ll1.removeFirst();/*same as*/ll1.poll();
		ll1.removeLast();
		ll1.peek();
		
		
		
		ll1.forEach(n->System.out.println(n+" "));
	}

}
