package com.hibernate.crud;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.entity.Student;

public class DeleteStudentDemo {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		

		//Xoa
		session.beginTransaction();
		//xoa student id =1
		//cach 1
		//Student student = session.get(Student.class, 1);
		//session.delete(student);

		
		//cach2 dung lenh truy van createQuery
		
		session.createQuery(" delete Student s where s.id = 6 ").executeUpdate();
		session.getTransaction().commit();
		
		session.close();
	}

}
