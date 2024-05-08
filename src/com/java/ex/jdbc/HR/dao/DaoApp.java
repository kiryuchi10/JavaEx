package com.java.ex.jdbc.HR.dao;

import java.util.Scanner;

public class DaoApp {

	public static void main(String[] args) {
		//searchEmployees();
		System.out.println();
		
		searchSalary();

		System.out.println();
		
		
	}
//	private static void deleteAuthor() {
//		Scanner sc=new Scanner(System.in);
//		System.out.print("삭제할 레코드 ID:");
//		Long authorId=Long.parseLong(sc.nextLine());
//		
//		AuthorDAO dao= new AuthorDAOImplOracle();
//		boolean success = dao.delete(authorId);
//		
//		System.out.println("Author DELETE " + (success ? "성공": "실패"));	
//		
//	}
	private static void searchEmployees() {
		Scanner sc=new Scanner(System.in);
		System.out.print("emp Name:");
		String empName=sc.nextLine();
		
		HRDAO dao= new HRDAOImplOracle();
		HRVO vo =dao.get(empName);
		
		if(vo!=null) {
			System.out.println("First Name: " + vo.getFirstName());
			System.out.println("Last Name: " + vo.getFirstName());
			System.out.println("Email: " + vo.getEmail());
			System.out.println("Phone Number: " + vo.getPhoneNumber());
			System.out.println("Hire Date: " + vo.getHiredate());
			System.out.println();
		}
		else {
			System.out.println("레코드를 찾지 못했습니다");
		}
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
//	private static void updateAuthor() {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("변경할 레코드 ID");
//		Long authorId = Long.parseLong(sc.nextLine());
//		System.out.print("이름:");
//		String name =sc.nextLine();
//		System.out.print("정보:");
//		String desc =sc.nextLine();
//		
//		AuthorVO vo = new AuthorVO(authorId,name,desc);
//		AuthorDAO dao= new AuthorDAOImplOracle();
//		boolean success=dao.update(vo);
//		
//		System.out.print("AUTHOR UPDATE "+(success? "성공":"실패"));
//		sc.close();
//		
//		}
//	private static void insertAuthor() {
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("이름:");
//		String name = sc.nextLine();
//		
//		System.out.print("정보:");
//		String desc = sc.nextLine();
//		
//		AuthorVO vo = new AuthorVO(name, desc);
//		
//		AuthorDAO dao = new AuthorDAOImplOracle();
//		boolean success = dao.insert(vo);
//		
//		System.out.println("Author INSERT " + (success ? "성공": "실패"));
//		
//		sc.close();
//		
//	}
	
//	private static void listAuthors() {
//		AuthorDAO dao = new AuthorDAOImplOracle();
//		System.out.println("========== Authors ==========");
//		
//		List<VO> list = dao.getList();
//		if (list.size() > 0) {
//			//	Iterator 순회
//			Iterator<AuthorVO> it = list.iterator();
//			
//			while (it.hasNext()) {
//				AuthorVO vo = it.next();
//				System.out.printf("%d\t%s\t%s%n", vo.getAuthorId(), 
//												vo.getAuthorName(), 
//												vo.getAuthorDesc());
//			}
//		} else {
//			System.out.println("데이터가 없습니다.");
//		}
//	}

}