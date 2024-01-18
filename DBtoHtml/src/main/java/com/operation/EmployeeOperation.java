package com.operation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.ConnectDb.DbConnection;
import com.model.Employee;

public class EmployeeOperation {
	
	private Connection conObj;
	private PreparedStatement ps;
	
	//constoctor to call the connection 
	public EmployeeOperation(){
		
		conObj = DbConnection.getConnection();
		
	}
	//to add employee to the database
	public boolean AddNewEmployee(Employee emp) {
		
		try {
			
			ps=conObj.prepareStatement("Insert into EmployeeList(EmpName,job,salary,email,password) values(?,?,?,?,?)" );
			ps.setString(1, emp.getEmpname());
			ps.setString(2,emp.getJob() );
			ps.setInt(3, emp.getSalary());
			ps.setString(4, emp.getEmail());
			ps.setString(5, emp.getPassword());
			
			ps.executeUpdate();			
			return true;
			
		}catch(Exception e){
			
			System.out.println(e);
			return false;
		}
		
		
		
	}
	
	//to view the table
	
	public List<Employee> ViewEmployee(){
		
		List<Employee> empllist = new ArrayList<Employee>();
		
		Employee emp = null;
		
		try {
			
			ps=conObj.prepareStatement("Select*from EmployeeList");
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				emp = new Employee();
				emp.setEmpno(rs.getInt("empno"));
				emp.setEmpname(rs.getString("empname"));
				emp.setJob(rs.getString("job"));
				
				emp.setSalary(rs.getInt("salary"));
				emp.setEmail(rs.getString("email"));
				emp.setPassword(rs.getString("password"));
				
				empllist.add(emp);
				
			}
			
		}catch(Exception e) {
			
			System.out.println(e);
		}
		
		return empllist;
	}
	
	//delete a employee
	public int DeleteEmployee(int eno) {
		
		int result= -1;
		try {
			
			ps = conObj.prepareStatement("Delete from EmployeeList where empno=?");
			ps.setInt(1, eno);
			result=ps.executeUpdate();
			
			
			
			
		}catch(Exception e) {
			result=-1;
			System.out.println(e);
			
			
			
		}
		
		return result;
	}
	
	
	//to usercheck 
	
	public Employee UserCheck(String email, String password) {
		
		Employee emp = null;
		try {
			
			ps= conObj.prepareStatement("select *from EmployeeList where email=? and password=?");
			ps.setString(1, email);
			ps.setString(2, password);
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				emp=new Employee();
				emp.setEmpno(rs.getInt("empno"));
				emp.setEmpname(rs.getString("EmpName"));
				emp.setJob(rs.getString("job"));
				emp.setSalary(rs.getInt("salary"));
				emp.setEmail(rs.getString("email"));
				emp.setPassword(rs.getString("password"));
				
				
			}
		}catch(Exception e) {
			emp=null;
			System.out.println(e);
			
			
		}
		
		return emp;
	}
	
	
	//search employee
public Employee SearchEmployee(int eno) {
		
		Employee emp = null;
		try {
			
			ps= conObj.prepareStatement("select *from EmployeeList where EmpNo=?");
			ps.setInt(1, eno);
			
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				emp=new Employee();
				emp.setEmpno(rs.getInt("EmpNo"));
				emp.setEmpname(rs.getString("EmpName"));
				emp.setJob(rs.getString("job"));
				emp.setSalary(rs.getInt("salary"));
				emp.setEmail(rs.getString("email"));
				emp.setPassword(rs.getString("password"));
				
				
			}
		}catch(Exception e) {
			emp=null;
			System.out.println(e);
			
			
		}
		
		return emp;
	}
	
	public boolean ChangePassword(String password,int EmpNo) {
		
		boolean b= false;
		
		
		try {
			ps= conObj.prepareStatement("update EmployeeList set password=? where EmpNo=?");
			ps.setString(1, password);
			ps.setInt(2, EmpNo);
			
			int r = ps.executeUpdate();
			
			if(r>=1) {
				b=true;
			}
			
					
			}catch(Exception e) {
			
			b=false;
			
			System.out.println(e);
		}
		
		return b;
		
	}
	

}
