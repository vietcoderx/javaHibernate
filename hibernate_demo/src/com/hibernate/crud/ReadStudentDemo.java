package com.hibernate.crud;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.entity.Student;

public class ReadStudentDemo {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		

		session.beginTransaction();
		Student student = session.get(Student.class, 5);
		System.out.println(student.getFirstName());

		session.getTransaction().commit();
		
		session.close();
	}

}
