package com.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.entity.Address;
import com.hibernate.entity.Student;

public class CreateDemo {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Address.class)
				.addAnnotatedClass(Student.class)
				.buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		Address address = new Address("Quy NHơn");
		
		Student student = new Student("Nguyễn ", "A", address); //khi tạo student thì dối tượng address cũng sẽ tạo theo
		
		session.beginTransaction();
		
		session.save(student);
		
		session.getTransaction().commit();
		
		session.close();
	}

}
