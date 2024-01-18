package com.model;

public class Employee {
	
	
	private int empno;
	private String empname;
	private String job;
	private int salary;
	private String email;
	private String password;
	
	//constoctor
	public Employee(int empno, String empname, String job, int salary, String email, String password) {
		super();
		this.empno = empno;
		this.empname = empname;
		this.job = job;
		this.salary = salary;
		this.email = email;
		this.password = password;
	}

	public Employee() {
		super();
	}

	public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	
	

}
