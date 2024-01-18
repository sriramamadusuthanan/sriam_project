package jdbc;
import java.sql.*;
import java.util.Scanner;
public class Db_insertcomment {

	public static void main(String[] args) throws ClassNotFoundException{
		// TODO Auto-generated method stub
		
		//driver loading
		Class.forName("com.mysql.cj.jdbc.Driver");
		Scanner sc = new Scanner(System.in);
		
		//make connection
		try {
			
			
			System.out.println("Enter the name: ");
			String cname=sc.next();
			
			System.out.println("Enter the job: ");
			String job = sc.next();
			
			System.out.println("Enter the salary: ");
			int salary = sc.nextInt();
			
			String newadd= "insert child(cname,job,salary) values('" +cname+ "','" + job+"'," + salary+ ")";
			
			sc.close();
			
			Connection contobj = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/student","root","root");
			
			Statement stat = contobj.createStatement();
			
			stat.executeUpdate(newadd);
			
			//stat.executeUpdate("insert child(cname,job,salary) values(\"Sriram\", \"designer\", 100)");
			
			//adding dynamic
			//stat.executeUpdate("insert child(cname,job,salary) values('" +cname + "','" +job+ "'," +salary+")");
			
			System.out.println("new child added ");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}

	}

}
