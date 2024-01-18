package com.apps;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Student;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
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
		
		Student std = new Student();
		
		std.setStdNo(2);
		std.setStdName("madu");
		std.setStdRoll(102);
		std.setCourse("english");
		
		session.save(std);
		trans.commit();
		
		session.close();
		sf.close();
		
		System.out.println("Inserted Row ...........");
		
		
		
		
	}

}
