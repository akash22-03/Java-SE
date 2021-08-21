package myPack1;

public class Demo2
{
    Demo1 d=new Demo1();
    public void show()
    {
        System.out.println(d.a+d.b+d.c+d.d);
        //b is private not accessible
    }
    
}