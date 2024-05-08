package com.java.ex.jdbc.HR.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class HRDAOImplOracle implements HRDAO {
	private Connection getConnection() throws SQLException {
		Connection conn = null;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String dburl = "jdbc:oracle:thin:@localhost:1521:xe";

			conn = DriverManager.getConnection(dburl, DatabaseConfig.DB_USER, DatabaseConfig.DB_PASS);
		} catch (ClassNotFoundException e) {
			System.err.println("드라이버를 찾을 수 없습니다.");
		}

		return conn;
	}

	@Override
	public List<HRVO> getList() {
		List<HRVO> list = new ArrayList<>();
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		try {
			// 1. Connection
			conn = getConnection();
			// 2. Statement
	

			stmt = conn.createStatement();

			String sql = "SELECT first_name || ' ' || last_name, email, phone_number, hire_date "
					+ " FROM employees";

			// 4. ResultSet 순회 -> 레코드를 AuthorVO로 변경
			// List에 추가
			while (rs.next()) {
				String firstName=rs.getString(0);
				String lastName = rs.getString(1);
				String email = rs.getString(2);
				String phoneNumber = rs.getString(3);
				Date hireDate = rs.getDate(4);

				HRVO vo = new HRVO(firstName, lastName, email, phoneNumber, hireDate);
				list.add(vo);
			}
			// 5. List를 반환
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (stmt != null)
					stmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
			}
		}

		return list;
	}

	@Override
	public HRVO HRsearch(String empName) {
	    Scanner sc = new Scanner(System.in);
	    Connection conn = null;
	    PreparedStatement pstmt = null;
	    ResultSet rs = null;
	    HRVO vo = null;

	    try {
	        conn = getConnection();
	        System.out.print("Enter part of the employee's first or last name: ");
	        String keyword = sc.nextLine();

	        String sql = "SELECT first_name, last_name, email, phone_number, hire_date " +
	                     "FROM employees " +
	                     "WHERE first_name LIKE ? OR last_name LIKE ?";
	        pstmt = conn.prepareStatement(sql);
	        pstmt.setString(1, "%" + keyword.toLowerCase() + "%");
	        pstmt.setString(2, "%" + keyword.toLowerCase() + "%");

	        rs = pstmt.executeQuery();

	        if (rs.next()) {
	            String firstName = rs.getString("first_name");
	            String lastName = rs.getString("last_name");
	            String email = rs.getString("email");
	            String phoneNumber = rs.getString("phone_number");
	            Date hireDate = rs.getDate("hire_date");
	            
	            vo = new HRVO(firstName, lastName, email, phoneNumber, hireDate);
	        }
	    } catch (SQLException e) {
	        System.err.println("SQL Error! ");
	        e.printStackTrace();
	    } finally {
	        try {
	            if (rs != null) rs.close();
	            if (pstmt != null) pstmt.close();
	            if (conn != null) conn.close();
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	    return vo;
	}

	@Override
	public boolean HRSalary(String empSalary) {
	    Connection conn = null;
	    PreparedStatement pstmt = null;
	    ResultSet rs = null;
	    int salaryCount = 0;

	    try {
	        conn = getConnection();
	        System.out.print("최소급여 최대급여: ");
	        String keyword = empSalary.trim();

	        String[] input = keyword.split(" ");
	        String sql = "SELECT first_name ||' '|| last_name, salary FROM employees " +
	                     "WHERE salary BETWEEN ? AND ? ORDER BY salary ASC";
	        pstmt = conn.prepareStatement(sql);
	        pstmt.setString(1, input[0]);
	        pstmt.setString(2, input[1]);

	        rs = pstmt.executeQuery();
	        
	        // Iterate through the result set and print employee names and salaries
	        while (rs.next()) {
	            String name = rs.getString(1); // Retrieve the employee name from the first column
	            int salary = rs.getInt(2);     // Retrieve the salary from the second column
	            System.out.printf("%s\t%d%n", name, salary); // Print the name and salary
	            salaryCount++; // Increment the count of employees found
	        }
	    } catch (SQLException e) {
	        System.err.println("SQL Error! ");
	        e.printStackTrace();
	    } finally {
	        try {
	            if (rs != null) rs.close();
	            if (pstmt != null) pstmt.close();
	            if (conn != null) conn.close();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }

	    return salaryCount > 0;  // Return true if any employees were found within the salary range
	}


	@Override
	public HRVO get(String empName) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		HRVO vo = null;
		

		try {
			conn = getConnection();
			// 실행 계획 수립
			String sql = "SELECT employee_id, first_name||' '||last_name,salary FROM employees";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, empName);

			rs = pstmt.executeQuery();
			if (rs.next()) {
				Long empId = rs.getLong(1);
				empName = rs.getString(2);
				String empSalary = rs.getString(3);
				vo = new HRVO(empId, empName, empSalary);
			}
		} catch (SQLException e) {
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
			}
		}
		return null;
	}
}
