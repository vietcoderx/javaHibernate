package com.hibernate;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Test {

	public static void main(String[] args) {
		String URL ="jdbc:mysql://localhost:3306/student";
		String user = "hibernate_01";
		String password ="123456";
		
		try {
			Connection connection = DriverManager.getConnection(URL, user, password);
			System.out.println("Thành công");
		} catch (SQLException e) {
			System.out.println("Thất bại");
			e.printStackTrace();
		}
	}

}
