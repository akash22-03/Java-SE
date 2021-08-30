import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Database 
{
	public static void main(String[] args) throws SQLException, ClassNotFoundException
	{
		Class.forName("org.sqlite.JDBC"); //connect referenced library
		Connection con = DriverManager.getConnection("jdbc:sqlite:C://SQLite//MyCricket.db");
		Statement stm = con.createStatement();
		PreparedStatement pstm = con.prepareStatement("INSERT INTO players VALUES (?,?,?,?)");
		String re="", sel="", ename, ranking, speciality, country;
		Scanner sc = new Scanner(System.in);
		ResultSet rs;
		while(true)
		{
			System.out.println("Enter 1 to Select\nEnter 2 to Insert\nEnter 3 to Exit");
			sel = sc.nextLine();
			switch(sel)
			{
			case "1":System.out.println("Enter your query: ");
					 re = sc.nextLine();
					
					 if(re.equals("end")) break;
					 rs = stm.executeQuery(re);
					 String rank;
					 String name;
					 while(rs.next())
					 {
						rank = rs.getString("Ranking");
						name = rs.getString("Name");
						System.out.println(rank+" "+ name);
					 }
					 break;
			case "2":
					
				while(true) 
				{
				    System.out.println("Enter Name: "); 
					ename = sc.nextLine();
					if(ename.equals("end"))
						break;
					
					System.out.println("Enter Country: ");
					country = sc.nextLine();
					System.out.println("Enter Ranking: "); 
					ranking = sc.nextLine();
					System.out.println("Enter Speciality: "); 
					speciality = sc.nextLine();
					
					pstm.setString(1, ename);
					pstm.setString(2, country);
					pstm.setString(3, ranking);
					pstm.setString(4, speciality);
					
					pstm.executeUpdate();
				}
				System.out.println("Records added to Database.");
					break;
					
			case "3": System.exit(0);
			}
			
			
			
		}		
	}

}
