package com.connectiondb;
import java.sql.*;
public class DB_connection {
	
	public static Connection getConnection(){
		
		Connection conn = null;
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/student" ,"root", "root");
		}
		catch(Exception e) {
			
			System.out.println(e);
		}
		
		return conn;
	}

}
