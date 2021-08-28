package Collection;
import java.util.*;

class My implements Comparator<Integer>
{
    public int compare(Integer i1,Integer i2)
    {
        if(i1<i2)
            return 1;
        if(i1>i2)
            return -1;
        return 0;
    }
}
public class ArraysAndComparator {

	public static void main(String[] args) 
	{
		int a[] = {2,4,6,8,10,12};
		int b[] = {2,4,6,9,10,12};
		System.out.println(Arrays.compare(a, b));
		
		int x[] = Arrays.copyOf(a, 4);
		for(int c:x)
			System.out.println(c);
		
		Integer ar[]={2,4,6,8,1,3,5,7};  
		
        Arrays.sort(ar); 
        for(Integer k:ar) 
            System.out.print(k+" ");
        
        System.out.println();
        
        Arrays.sort(ar, new My()); 
        for(Integer k:ar) 
            System.out.print(k+" ");
	}
}

