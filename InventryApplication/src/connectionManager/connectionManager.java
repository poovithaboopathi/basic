package connectionManager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connectionManager {
	
	Connection con = null;
	
	public Connection establishconnection() throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		con = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/INVENTORY",
				"root",
				"Poovi@198");
		return con;
	}
	
	public void closeConnection() throws SQLException
	{
		con.close();
	}
}