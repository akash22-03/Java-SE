package myPack2;
import myPack1.Demo1;


class Demo4 extends Demo1
{
    public void show()
    {
        System.out.println(a+b+c+d);
        //default and private not accessible
    }
}

public class Test 
{
	public static void main(String[] args) 
	{
		Demo1 d1 = new Demo1();
		d1.display();
	    System.out.println(d1.a+d1.b+d1.c+d1.d);
	    //except public none other are accessible
	}

}
