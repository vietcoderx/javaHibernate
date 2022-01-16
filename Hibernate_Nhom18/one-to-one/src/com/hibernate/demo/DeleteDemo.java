package com.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.entity.Address;
import com.hibernate.entity.Student;

public class DeleteDemo {

	public static void main(String[] args) {


		//
		
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Address.class)
				.addAnnotatedClass(Student.class)
				.buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		

		
		
		session.beginTransaction();
		
		Student student = session.get(Student.class, 4); //lay doi tuong student co id la 1
		
		if(student !=null ) {//neu doi tuong khac null, no se xoa
			
			session.delete(student);
		}
		
		session.getTransaction().commit();
		
		session.close();
	}

}
