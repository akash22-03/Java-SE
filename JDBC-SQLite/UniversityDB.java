import java.sql.*;
import java.util.*;

public class UniversityDB {

	public static void main(String[] args) throws Exception
	{
		Class.forName("org.sqlite.JDBC");
		Connection con = DriverManager.getConnection("jdbc:sqlite:C://SQLite//University.db");
		Statement stm = con.createStatement();
		stm.executeUpdate("CREATE TABLE Hent (deptno Float, dname TEXT)");
		

	}

}
