import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class dbconnections {
	public static void main(String args[]) throws ClassNotFoundException, SQLException  {
		Class.forName("com.mysql.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/tourisy","root", "baddayswillEND23");
		System.out.print("Connected to DataBase");
	}

}
