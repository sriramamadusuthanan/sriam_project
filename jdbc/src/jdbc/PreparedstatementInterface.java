package jdbc;
import java.sql.*;
import java.util.Scanner;
public class PreparedstatementInterface {

	public static void main(String[] args) throws ClassNotFoundException{
		// TODO Auto-generated method stub
		
		//driver loading
		Class.forName("com.mysql.cj.jdbc.Driver");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the name");
		String cname = sc.next();
		
		System.out.println("Enter the job");
		String job = sc.next();
		
		
		System.out.println("Enter the salary");
		int salary = sc.nextInt();
		
		sc.close();
		//make connection
		try {
			Connection contobj = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/student","root","root");
			
			PreparedStatement ps= contobj.prepareStatement("Insert into child(cname,job,salary) values(?,?,?)");
			ps.setString(1, cname);
			ps.setString(2,job);
			ps.setInt(3, salary);
			
			ps.executeUpdate();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}

	}

}
