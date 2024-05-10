package practice_miniproject;

import java.util.List;

import com.java.ex.jdbc.dao.AuthorVO;

public interface BookDBDAO {
	public List<BookVO> getList(); // 전체 목록 
	public BookVO get(String name);// PK로 객체 찾기
	public boolean insert(BookVO bookVo); // 레코드 삽입
	public boolean delete(String name); // PK
	public boolean update(BookVO bookVo);
}
