package Collection;
import java.util.*;
class Point implements Comparable
{
	int x; 
	int y;
	
	Point(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	@Override
	public int compareTo(Object o) 
	{
		Point p = (Point)o; 
		if(this.x < p.x) return -1;
		else if(this.x > p.x) return 1;
		else 
		{
			if(this.y < p.y) return -1;
			else if(this.y>p.y) return 1;
			else return 0;
		}
		
	}
	@Override
	public String toString()
	{
		return x+" "+y;
	}
	
}
public class TreeSetPrac 
{
	public static void main(String[] args) 
	{
		TreeSet<Integer> ts = new TreeSet<>(List.of(10,20,50,70,10,40));
		ts.add(42);
		System.out.println(ts.ceiling(56)+" "+ts.floor(56)); //nearest greater number and nearest closest number
		System.out.println(ts);
		ts.remove(42);
		System.out.println(ts.contains(42));
		
		TreeSet<Point> ps = new TreeSet<>();
		ps.add(new Point(1,1));
	}

}
