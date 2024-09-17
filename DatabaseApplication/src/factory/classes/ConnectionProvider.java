package factory.classes;
import java.sql.DriverManager;
import java.sql.Connection;
public class ConnectionProvider {
	 private static Connection con;
	static {
		try {
			

			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/record","root","admin");
			}
			catch(Exception e)
			{
				System.out.println("Something went wrong ");
			}
	}
	
	public static Connection connect()
	{
		return con;
	}

}
