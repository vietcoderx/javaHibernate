package com.hibernate.crud;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.entity.Student;

public class UpdateStudentDemo {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		

		session.beginTransaction();
		
		// doi firtname doi tuong có id bằng 1 thành "Trần"
//		Student student = session.get(Student.class, 1);
//		
//		student.setFirstName("Trần");
//		
//		session.update(student);
		
		//Update tat ca cac email cua student thanh abc@gmail.com
		
		session.createQuery("update Student s set s.email = 'abcd@gmail.com' ").executeUpdate();
		
		session.getTransaction().commit();
		
		session.close();
	}

}
