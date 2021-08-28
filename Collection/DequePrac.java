package Collection;
import java.util.*;
public class DequePrac {

	public static void main(String[] args) {
		ArrayDeque<Integer> dq = new ArrayDeque<>();
		
		dq.offer(10);
		dq.offerLast(20); /*same as*/ dq.offer(30);
		
		dq.offerFirst(9);
		dq.offerFirst(7);
		dq.offerFirst(5);
		
		dq.poll();/*same as*/dq.pollFirst();
		dq.pollLast();
		
		dq.forEach(x->System.out.print(x+" "));
		
		
		
		

	}

}
