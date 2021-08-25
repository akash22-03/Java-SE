package JavaIOStreams;
import java.io.*;
import java.util.Scanner;

class Customer implements Serializable
{
	String custID;
	String name;
	String phno;
	
	static int count=0;
	
	Customer(){}
	
	Customer(String n, String p)
	{
		custID = "C"+count;
		count++;
		name= n;
		phno = p;
	}
	
	public String toString()
	{
		return "Customer ID:"+custID+"\nName :"+name+"\nPhno :"+phno+"\n";
	}
}
public class FinalProject {

	public static void main(String[] args) throws IOException, ClassNotFoundException
	{
		
		/*Customer list[] = {new Customer("Akash","9090037002"), new Customer("Dibya","7789541233"), new Customer("Ankita","9040436179"), new Customer("Rishi","9437056027")};
		FileOutputStream fos = new FileOutputStream("Customer.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeInt(list.length);
		for(Customer c:list)
			oos.writeObject(c);
		oos.close();
		fos.close();*/
		
		
		Scanner sc = new Scanner(System.in);
		
		FileInputStream fis = new FileInputStream("Customer.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		int len = ois.readInt();
		
		Customer list[] = new Customer[len];
		
		for(int i=0;i<len;i++)
			list[i] =(Customer)ois.readObject();
		
		System.out.println("Enter name of Customer");		
		String name = sc.nextLine();
		
		for(int i=0;i<len;i++)
		{
			if(name.equalsIgnoreCase(list[i].name))
				System.out.println(list[i]);
		}
		
		ois.close();
		fis.close();
		
	}

}
