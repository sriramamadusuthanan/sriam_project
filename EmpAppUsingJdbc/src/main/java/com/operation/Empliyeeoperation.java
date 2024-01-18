package com.operation;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.connectiondb.DB_connection;
import com.model.Employee;

public class Empliyeeoperation {
	
	private Connection conobj;
	private PreparedStatement ps;
	

	//to add employe -operation
	
	public boolean AddNewEmployee(Employee emp) {
		
		
		
		try {
			
			ps = conobj.prepareStatement("Insert into child(cname,job,salary,email,pass) values (?,?,?,?,?)");
			ps.setString(1, emp.getCname());
			ps.setString(2,emp.getJob() );
			ps.setInt(3, emp.getSalary());
			ps.setString(4, emp.getEmail());
			ps.setString(5, emp.getPassword());
			
			return true;
			
		}catch(Exception e) {
			
			System.out.println(e);
			return false;
			
		}
		
		
		
	}
	
	//for view opeation
	
	public List<Employee> viewAllemp(){
		
		List<Employee> emplist = new ArrayList<Employee>();
		Employee emp = null;
		
		try {
			
			ps= conobj.prepareStatement("Select *from child");
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				
				emp= new Employee();
				emp.setStudNo(rs.getInt("studNo"));
				emp.setCname(rs.getString("cname"));
				emp.setJob(rs.getString("job"));
				emp.setSalary(rs.getInt("salary"));
				emp.setEmail(rs.getString("email"));
				emp.setPassword(rs.getString("pass"));
				
				emplist.add(emp);
			}
					
		}catch(Exception e) {
			
			 
			System.out.println(e);
			
			
			
		}
		return emplist; 

		
		
		
	}
	
	
	public Empliyeeoperation(){
		
		conobj = DB_connection.getConnection();
	}
	
	

}
