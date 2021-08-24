package JavaLangPackage;

public class WrapperDemo {

    public static void main(String[] args) 
    {   
        Integer i = new Integer(10); //this method is deprecated
        Integer a =  Integer.valueOf(10);
        Integer b=10;
        
        Byte c=15;
        Byte d=Byte.valueOf("15");
        byte bb=15;
        Byte e = Byte.valueOf(bb);
        
        Short f=Short.valueOf("123");
        
        Float g=12.3f;
        Float h=Float.valueOf("123.5");
        Double j=Double.valueOf(123.456);
        
        Character k=Character.valueOf('A');
        
        Boolean l=Boolean.valueOf("true");

        float x=h.floatValue();
        float y=h;
        
        int m=10;
        //Integer n=Integer.valueOf(m);
        Integer n=m;
        //int p=n.intValue();
        int p=n;
        
        /***********************************************************************************/
        
        int m1=15;
        
        //Integer m2=m1;
        //Integer m3=15;
        
        Integer m2=Integer.valueOf("123");
        //Integer m3=Integer.valueOf("11111111", 2);
        Integer m3=Integer.valueOf("A7", 16);
        Integer m4=Integer.decode("0xA7");
        
        //System.out.println(m2.equals(m1));
        //System.out.println(m2.equals(m3));
        //System.out.println(m3);
        
        //System.out.println(Integer.parseInt("123"));
        //System.out.println(Integer.reverseBytes(128)==Integer.MIN_VALUE);
        System.out.println(Integer.toBinaryString(40));
        
        /*************************************************************************************/
        
        float aa=12.5f;
        
        //Float b=12.5f;
        //Float b=-12.5f/0;
        
        Float cc=(float)Math.sqrt(9);
        
        System.out.println(cc.equals(aa));
        System.out.println(cc.isInfinite());
        System.out.println(Float.POSITIVE_INFINITY==cc);
        System.out.println(cc==Float.NEGATIVE_INFINITY);
        System.out.println(cc.isNaN());
        System.out.println(cc!=Float.NaN);
    }
    
}