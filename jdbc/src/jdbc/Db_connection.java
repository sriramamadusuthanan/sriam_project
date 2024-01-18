package jdbc;
import java.sql.*;
public class Db_connection {

	public static void main(String[] args) throws ClassNotFoundException{
		// TODO Auto-generated method stub
		
		//driver loading
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//make connection
		try {
			Connection contobj = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/student","root","root");
			
			if(contobj!=null) {
				System.out.println("DB Connected");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}

	}

}
