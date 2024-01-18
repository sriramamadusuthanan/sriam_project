package com.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

//creating entitiy calss

@Entity
@Table(name="studentInfo")
public class Student {
	
	@Id
	@GeneratedValue
	private int stdNo;
	
	@Column(name="emp_name")
	private String stdName;
	
	@Column(name="emp_job")
	private int stdRoll;
	 
	private String course;
	
	//grnerating setter and getter for funcatility 
	
	public int getStdNo() {
		return stdNo;
	}
	public void setStdNo(int stdNo) {
		this.stdNo = stdNo;
	}
	public String getStdName() {
		return stdName;
	}
	public void setStdName(String stdName) {
		this.stdName = stdName;
	}
	public int getStdRoll() {
		return stdRoll;
	}
	public void setStdRoll(int stdRoll) {
		this.stdRoll = stdRoll;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	
	

}
