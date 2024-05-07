package com.java.ex.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


	/*
	 * [실습 1] hr/hr 계정의 사원 이름과 매니저 이름을 함께 출력해 봅시다  사원 이름은 이름 성 순으로 표기합니다  정렬은 사원
	 * 이름 내림차순입니다  HREmpList 프로젝트를 만들고 HREmpList 클래스에서 실행되어야 합니다
	 */
	/*
	 * [실습 3] 급여 검색 프로그램 작성 : 사용자로부터 최소 급여와 최대 급여를 입력 받아 급여가 이 범위 내에 속하는 사원 의 정보를
	 * 출력하는 프로그램을 작성해 봅시다  정렬은 salary 오름차순입니다  HRSalary 프로젝트의 HRSalary 클래스에서 실행되어야
	 * 합니다  결과 예시 2000 10000
	 * ============================================================ Kevin Freeney
	 * 3000 Donald Oconnell 4000 Pat Fay 90000
	 */


public class HREmpList {

	public static void main(String[] args) {
		String dburl = "jdbc:oracle:thin:@localhost:1521:xe";
		String dbuser = "hr";
		String dbpass = "hr";

		// Connection, Statement, ResultSet

		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(dburl, dbuser, dbpass);
			stmt = conn.createStatement();

//				String sql = "SELECT emp.first_name || ' ' || emp.last_name name," +
//								"mgr.first_name || ' ' || mgr.last_name " +
//								"FROM employees emp JOIN employees mgr " +
//								"ON emp.manager_id = mgr.employee_id " +
//								"ORDER BY name DESC";
			String sql = "SELECT emp.first_name || ' ' || emp.last_name name,";
			sql += "mgr.first_name || ' ' || mgr.last_name ";
			sql += "FROM employees emp JOIN employees mgr ";
			sql += "ON emp.manager_id = mgr.employee_id ";
			sql += "ORDER BY name DESC";
			System.out.println("Query:" + sql);

			rs = stmt.executeQuery(sql); // DB Cursor 반환

			// ResultSet 순회
			while (rs.next()) {
				String empName = rs.getString(1);
				String mgrName = rs.getString(2); // rs.getString(2)

				System.out.printf("Name: %s, Manager:%s%n", empName, mgrName);
			}
		} catch (ClassNotFoundException e) {
			System.err.println("드라이버를 로드하지 못했습니다.");
			e.printStackTrace();
		} catch (SQLException e) {
			System.err.println("SQLError!");
			e.printStackTrace();
		} finally {
			try {
				rs.close();
			} catch (Exception e) {

			}
			try {
				stmt.close();
			} catch (Exception e) {

			}
			try {
				conn.close();
			} catch (Exception e) {

			}
		}
	}
}
