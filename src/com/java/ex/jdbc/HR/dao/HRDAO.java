package com.java.ex.jdbc.HR.dao;

import java.util.List;

import com.java.ex.jdbc.dao.AuthorVO;

public interface HRDAO {
	public List<HRVO> getList(); // 전체 목록 
	public HRVO get(String empName);// PK로 객체 찾기
	public boolean HRsearch(String empName);// PK로 객체 찾기
	public boolean HRSalary(String empSalary); // 레코드 삽입
}
