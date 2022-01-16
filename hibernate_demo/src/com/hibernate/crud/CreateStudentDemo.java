package com.hibernate.crud;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.entity.Student;

public class CreateStudentDemo {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		//Student student = new Student("Tran", "Quoc Viet", "tranquocviet1200@gmail.com");
		Student student1 = new Student("Nguyen", "Toan", "tranquocviet12001@gmail.com");
		
		session.beginTransaction();
		
		//session.save(student);
		session.save(student1);
		//session.save(student2);
		session.getTransaction().commit();
		
		session.close();
	}

}
