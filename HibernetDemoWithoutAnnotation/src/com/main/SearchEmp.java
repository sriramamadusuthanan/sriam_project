package com.main;

import java.util.List;
import java.util.Scanner;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.entity.Student;

public class SearchEmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Student.class);
		
		
		SessionFactory sf = cfg.buildSessionFactory();		

		//importing session
		
		Session session = sf.openSession();
		//to search from db
		
		TypedQuery qry = session.createQuery("from Student where course=:course ");
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the employee course : ");
		String course=sc.next();
		
		qry.setParameter("course", course);
		
		List<Student> studentlist = qry.getResultList();
		sc.close();
		
		if(studentlist.isEmpty()) {
			System.out.println("no employ in the given course");
		}else {
			
			//the list will be having only one ement 
			
			for (Student s : studentlist )
			System.out.println(s.getStdNo()+"\t"+s.getStdName()+"\t"+s.getCourse()
			+ "\t"+ s.getStdRoll());
			
		}
		
	
		
	}

}
