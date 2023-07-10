package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import connectionManager.connectionManager;
import model.Login;

public class LoginDao{
	
	public boolean validate(Login login) throws ClassNotFoundException, SQLException
	{
		String username = login.getUSERNAME();
		String password = login.getPASSWORD();
		
		connectionManager conn = new connectionManager();
		Connection con = conn.establishconnection();
		
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("SELECT * FROM LOGIN");
		
		while(rs.next())
		{
			if(username.equals(rs.getString("USERNAME")) 
					&& password.equals(rs.getString("PASSWORD")))
			{
				conn.closeConnection();
				return true;	
			}
		}
		conn.closeConnection();
		return false;		
	}
}