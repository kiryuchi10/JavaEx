package com.java.ex.jdbc.dao;

import java.util.List;

public interface AuthorDAO {
	public List<AuthorVO> getList(); // 전체 목록 
	public AuthorVO get(Long id);// PK로 객체 찾기
	public boolean insert(AuthorVO authorVo); // 레코드 삽입
	public boolean delete(Long id); // PK
	public boolean update(AuthorVO authorVo);
	
}
