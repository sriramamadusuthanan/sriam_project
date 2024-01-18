package com.model;

public class Employee {
	
	private int studNo;
	private String cname;
	private String job;
	private int salary;
	private String email;
	private String password;
	public int getStudNo() {
		return studNo;
	}
	public void setStudNo(int studNo) {
		this.studNo = studNo;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
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
	
	
	
	public Employee(int studNo, String cname, String job, int salary, String email, String password) {
		super();
		this.studNo = studNo;
		this.cname = cname;
		this.job = job;
		this.salary = salary;
		this.email = email;
		this.password = password;
	}
	
	
	
	public Employee() {
		super();
	}
	
	
	
	

}
