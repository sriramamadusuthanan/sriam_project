package com.ConnectDb;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnection {
	
	public static Connection getConnection() {
		
		
		Connection con =null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con= DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/Employee","root","root");
			
			
		}catch(Exception e) {
			
			System.out.println(e);
		}
		
		return con;
	}
	
	

}
