package jdbc;
import java.sql.*;
public class Db_readdata {

	public static void main(String[] args) throws ClassNotFoundException{
		// TODO Auto-generated method stub
		
		//driver loading
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//make connection
		try {
			Connection contobj = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/student","root","root");
			
			Statement stat = contobj.createStatement();
			ResultSet  rs = stat.executeQuery("Select *from child");
			
			while(rs.next()) {
				System.out.println(rs.getInt("studNo") + "\t" + rs.getString("cname") +"\t" + rs.getString(3) +"\t"+ rs.getInt("salary"));
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}

	}

}
