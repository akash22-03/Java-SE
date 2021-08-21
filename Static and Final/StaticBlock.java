package staticAndFinal;
class Block
{
    static
    {
        System.out.println("Block 1");
    }
    
    static
    {
    System.out.println("Block 2");
    }
}

public class StaticBlock
{
    /*static
    {
        System.out.println("Block 1");
    }*/
    public static void main(String[] args) 
    {
        Block t=new Block();
        System.out.println("Main");

    } 
    /*static
    {
    System.out.println("Block 2");
    }*/

}
