package com.java.ex.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class HRSearchEmployeesPstmt {

	public static void main(String[] args) {
		String dburl = "jdbc:oracle:thin:@localhost:1521:xe";
		String dbuser = "hr";
		String dbpass = "hr";
		Scanner sc = new Scanner(System.in);

		// Connection, PreparedStatement, ResultSet
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(dburl, dbuser, dbpass);

			// Prompt user for search keyword
			System.out.print("Enter part of the employee's first or last name: ");
			String keyword = sc.nextLine();

			// SQL query to search for employees by parts of their first or last name
			String sql = "SELECT first_name, last_name, email, phone_number, hire_date " + "FROM employees "
					+ "WHERE first_name LIKE ? OR last_name LIKE ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "%" + keyword.toLowerCase() + "%");
			pstmt.setString(2, "%" + keyword.toLowerCase() + "%");

			rs = pstmt.executeQuery();

			// Display search results
			while (rs.next()) {
				String firstName = rs.getString("first_name"); //1
				String lastName = rs.getString("last_name");//2
				String email = rs.getString("email");//3
				String phoneNumber = rs.getString("phone_number");//4
				String hireDate = rs.getString("hire_date");//5

				System.out.println("First Name: " + firstName);
				System.out.println("Last Name: " + lastName);
				System.out.println("Email: " + email);
				System.out.println("Phone Number: " + phoneNumber);
				System.out.println("Hire Date: " + hireDate);
				System.out.println();
			}
		} catch (ClassNotFoundException e) {
			System.err.println("JDBC 드라이버를 로드하지 못했습니다.");
			e.printStackTrace();
		} catch (SQLException e) {
			System.err.println("SQL Error! ");
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
