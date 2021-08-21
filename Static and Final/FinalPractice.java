package staticAndFinal;

final class Final 
{
    public final void show()
    {
        System.out.println();
    }
}
class Final1 extends Final //final class can't be inherited
{
    public void show(){}
    //gives error as final methods cannot be overloaded.
}
public class FinalPractice {

	final float MAX = 45f;//needs to be init here only else instance block can be used or in the constructor
	final float MIN;
	{
		MIN = 1;
	}
	final float NORMAL;
    public FinalPractice()
    {
       NORMAL = 3.1425f;
    }
    
    public static void main(String[] args) 
    {
        final float PI;
        PI=3.1425f;
        System.out.println(PI);     
    }
}
