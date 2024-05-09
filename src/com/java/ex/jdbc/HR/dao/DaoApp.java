package com.java.ex.jdbc.HR.dao;

import java.util.Scanner;

public class DaoApp {

	public static void main(String[] args) {
		//searchEmployees();
		System.out.println();
		
		searchSalary();

		System.out.println();
		
		
	}
	private static void searchEmployees() {
		Scanner sc=new Scanner(System.in);
		System.out.print("emp Name:");
		String empName=sc.nextLine();	
		HRDAO dao = new HRDAOImplOracle();	
	    boolean success = dao.HRsearch(empName);
		
//		if(vo!=null) {
//			System.out.println("First Name: " + vo.getFirstName());
//			System.out.println("Last Name: " + vo.getFirstName());
//			System.out.println("Email: " + vo.getEmail());
//			System.out.println("Phone Number: " + vo.getPhoneNumber());
//			System.out.println("Hire Date: " + vo.getHiredate());
//			System.out.println();
//		}
//		else {
//			System.out.println("레코드를 찾지 못했습니다");
//		}
		sc.close();
	}
	private static void searchSalary() {
	    try (Scanner sc = new Scanner(System.in)) {
	        System.out.print("최소/최대급여:");
	        String empSalary = sc.nextLine();

	        HRDAO dao = new HRDAOImplOracle();
	        boolean success = dao.HRSalary(empSalary);

	        System.out.println("Salary Search " + (success ? "성공" : "실패"));
	    }
	}


}