package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import connectionManager.connectionManager;
import model.Product;

public class ProductDao {
	
	public void addProduct(Product product) throws ClassNotFoundException, SQLException
	{
		int id = product.getPRODUCTID();
		String name = product.getPRODUCTNAME();
		int minsell = product.getMINSELL();
		int price = product.getPRICE();
		int quantity = product.getQUANTITY();
		
		connectionManager conn = new connectionManager();
		Connection con = conn.establishconnection();
		
		String query = "insert into "
				+ "PRODUCT(PRODUCTID,PRODUCTNAME,MINSELL,PRICE,QUANTITY)"
				+ "values(?,?,?,?,?)";
		
		PreparedStatement ps = con.prepareStatement(query);
		ps.setInt(1, id);
		ps.setString(2, name);
		ps.setInt(3, minsell);
		ps.setInt(4, price);
		ps.setInt(5,quantity);
		
		ps.executeUpdate();
		conn.closeConnection();
	}
	
	public void display() throws ClassNotFoundException, SQLException
	{
		connectionManager conn = new connectionManager();
		Connection con = conn.establishconnection();
		
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("SELECT * FROM PRODUCT");
		
		while(rs.next())
		{
			System.out.println("---------------------------------------------");
			System.out.println(rs.getString("PRODUCTNAME")+" | "+
					rs.getInt("PRODUCTID")+" | "+
					rs.getInt("MINSELL")+" | "+
					rs.getInt("PRICE")+" | "+
					rs.getInt("QUANTITY"));
			System.out.println("---------------------------------------------");
		}
	}
}