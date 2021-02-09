package databaseconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBHandler extends Configs {
	
	Connection dbConnection;
	
	public Connection getConnection() {

		String connectionString = "jdbc:mysql://"+ Configs.dbhost + ":" + Configs.dbport + "/" + Configs.dbname+"?autoReconnect=true&useSSL=false";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			dbConnection = DriverManager.getConnection(connectionString,Configs.dbuser,Configs.dbpass);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return dbConnection;
	}
}
