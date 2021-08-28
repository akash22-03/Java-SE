package Collection.ArrayListAndIterator;

import java.util.*;

public class Main {

	public static void main(String[] args) 
	{
		ArrayList<Integer> al1 = new ArrayList<>(20);
		ArrayList<Integer> al2 = new ArrayList<>(List.of(50,60,70,80,90));
		al1.add(10);
		al1.add(0, 5);
		al1.addAll(al2);
		al1.addAll(1, al2);
		
		System.out.println(al1);
		
		System.out.println(al1.contains(50));
		System.out.println(al1.contains(25));
		System.out.println(al1.containsAll(al2));
		
		System.out.println(al1.get(4));
		
		System.out.println(al1.indexOf(70));
		System.out.println(al1.lastIndexOf(70));
		
		al1.set(1, 1000);
		
		for(int i=0;i<al1.size();i++)
			System.out.print(al1.get(i)+" ");
		
		System.out.println();
		
		for(int x:al1)
			System.out.print(x+" ");
		
		for(var x: al1)
			System.out.print(x+" ");
		
		Iterator<Integer> it = al1.iterator();
		while(it.hasNext())
			System.out.print(it.next()+" ");
		
		System.out.println("Hello");
		
		ListIterator<Integer> lit = al1.listIterator();
		while(lit.hasPrevious())
			System.out.println(lit.hasPrevious()+" ");
		
		for(ListIterator<Integer> lit2 = al1.listIterator();lit2.hasNext();)
			System.out.print(lit2.next()+" ");
		
		
		al1.forEach(n->System.out.println(n));
		al1.forEach(System.out::println);
		al1.forEach(n->show(n));
		
		

	}
	static  void show(int n)
	{
		if(n>60)
			System.out.println(n);
	}
}
