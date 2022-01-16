package com.hibernate.crud;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.entity.Student;

public class QueryStudentDemo {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class)
				.buildSessionFactory();

		Session session = factory.getCurrentSession();

		session.beginTransaction();

		//Lay danh sach tat ca cac student trong truonng du lieu
		List<Student> listStudent = session.createQuery(" from Student").getResultList();
		
		//for (Student student : listStudent) {
			//System.out.println(student);
		//}
		
		//Lay danh sach student co firt name la Tran
		List<Student> listStudent1 = session.createQuery(" from Student s where s.firstName = 'Tran' ").getResultList();//firtname cua java class

		//for (Student student : listStudent1) {
			//System.out.println(student);
		//}
		
		//Lay danh sach student co firstname la viet hoac co email la tranquocviet12001@gmail.com
		List<Student> listStudent2 = session.createQuery(" from Student s where s.firstName = 'Tran' or s.email = 'tranquocviet12001@gmail.com' ").getResultList();//firtname cua java class
		//for (Student student : listStudent2) {
		//	System.out.println(student);
		//}
		
		//Lay danh sach student co email bat dau bang chu h
		List<Student> listStudent3 = session.createQuery(" from Student s where  s.email LIKE 't%' ").getResultList();
		for (Student student : listStudent3) {
			System.out.println(student);
		}
		
		session.getTransaction().commit();

		session.close();
	}

}
