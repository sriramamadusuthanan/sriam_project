package com.connection;
import java.sql.*;
public class Dbconnection {
	
	public static Connection getConnection() {
		
		Connection con= null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con= DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/student","root","root");
			
		}
		catch(Exception ex) {
			
			System.out.println(ex);
		}
		
		return con;
		
		
	}
	
	

}
