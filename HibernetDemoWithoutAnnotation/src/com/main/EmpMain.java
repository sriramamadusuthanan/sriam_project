package com.main;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Student;

public class EmpMain {

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		Student std = new Student();
		std.setStdNo(2);
		Scanner sc = new Scanner(System.in);
		System.out.println("Employee Name");
		std.setStdName(sc.next());
		System.out.println("Enter employee rollno");
		std.setStdRoll(sc.nextInt());
		System.out.println("Enter employee course");
		
		std.setCourse(sc.next());

		
		//create a configuration 
				Configuration cfg = new Configuration();
				cfg.configure("hibernate.cfg.xml");
				cfg.addAnnotatedClass(Student.class);
				
				//importing sessionfactory
				
				SessionFactory sf = cfg.buildSessionFactory();		

				//importing session
				
				Session session = sf.openSession();
				
				//transaction to add to database
				
				Transaction trans = session.beginTransaction();
				
				
				
				
				//std.setStdName("sriram");
				
				
				
				session.save(std);
				trans.commit();
				
				session.close();
				sf.close();
				
				System.out.println("Inserted Row ...........");
	}

}
