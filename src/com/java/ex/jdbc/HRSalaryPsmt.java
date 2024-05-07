package com.java.ex.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class HRSalaryPsmt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dburl = "jdbc:oracle:thin:@localhost:1521:xe";
		String dbuser = "hr";
		String dbpass = "hr";
		
		Connection conn=null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		Scanner sc= new Scanner(System.in);
		
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(dburl, dbuser, dbpass);
			
			System.out.print("최소급여 최대급여");
			String keyword = sc.nextLine();
			
			String [] input=keyword.trim().split(" ");
			String sql="SELECT first_name ||' '|| last_name, salary FROM employees"+
						"WHERE salary BETWEEN ? AND ? ORDER BY salary ASC";
			pstmt=conn.prepareStatement(sql);
			System.out.println("Query:" + sql);
			pstmt.setString(1, input[0]);
			pstmt.setString(2, input[1]);
			
			rs=pstmt.executeQuery();
			
		}catch (ClassNotFoundException e) {
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
				pstmt.close();
			} catch (Exception e) {

			}
			try {
				conn.close();
			} catch (Exception e) {

			}
		}
		
		sc.close();
	}

}


