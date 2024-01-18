package com.main;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.entity.Student;

public class ShowallEmploye {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Student.class);
		
		
		SessionFactory sf = cfg.buildSessionFactory();		

		//importing session
		
		Session session = sf.openSession();
		//hibernet qurey to select all from db
		TypedQuery qry = session.createQuery("from Student");
		
		List<Student> studentlist = qry.getResultList();
		
		for (Student s : studentlist) {
			
			System.out.println(s.getStdNo()+"\t"+s.getStdName()+"\t"+
			s.getCourse()+"\t"+s.getStdRoll());
		}
		
		
	}

}
