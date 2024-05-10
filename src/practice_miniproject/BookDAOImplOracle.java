package practice_miniproject;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class BookDAOImplOracle implements BookDBDAO {
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
	public List<BookVO> getList() {
		List<BookVO> list = new ArrayList<>();
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		try {
			// 1. Connection
			conn = getConnection();
			// 2. Statement
			stmt = conn.createStatement();
			// 3. SQL 쿼리 전송 -> ResultSet
			String sql = "SELECT name, mobile_number, landline_number FROM phonedb";
			//String sql = "SELECT author_id, author_name, author_desc FROM author";
			rs = stmt.executeQuery(sql);

			// 4. ResultSet 순회 -> 레코드를 BookVO로 변경
			// List에 추가
			while (rs.next()) {
				String name = rs.getString(1); // = rs.getLong("Book_id")
				String phoneNumber = rs.getString(2);
				String homeNumber = rs.getString(3);

				BookVO vo = new BookVO(name, phoneNumber, homeNumber);
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
	public BookVO get(String name) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		BookVO vo = null;

		try {
			conn = getConnection();

			// 실행 계획 수립
			String sql = "SELECT name, mobile_number, landline_number FROM phoneDB " + "WHERE name=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);

			rs = pstmt.executeQuery();

			if (rs.next()) {
				name = rs.getString(1); // = rs.getLong("Book_id")
				String phoneNumber = rs.getString(2);
				String homeNumber = rs.getString(3);

				vo = new BookVO(name, phoneNumber, homeNumber);
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
		return vo;
	}

	@Override
	public boolean insert(BookVO BookVo) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		int insertedCount = 0; // INSERT 결과 영향받은 레코드 수

		try {
			// 커넥션
			conn = getConnection();
			// 실행 계획 준비
			String sql = "INSERT INTO phoneDB (name, phone_number, landline_number) "
					+ "VALUES (seq_Book_id.NEXTVAL, ?, ?)";
			pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, BookVo.getName());
			pstmt.setString(2, BookVo.getPhoneNumber());

			// 쿼리 수행
			insertedCount = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
			}
		}
		return insertedCount == 1;
	}

	@Override
	public boolean delete(String name) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		int deletedCount = 0;

		try {
			conn = getConnection();

			String sql = "DELETE FROM phoneDB WHERE name=?";
			pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, name);

			deletedCount = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
			}
		}
		return deletedCount == 1;
	}

	@Override
	public boolean update(BookVO BookVo) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		int updatedCount = 0;

		try {
			// Connection 맺기
			conn = getConnection();
			// 실행 계획 준비
			String sql = "UPDATE phoneDB SET name=?, phone_number=? WHERE landline_number=?";
			pstmt = conn.prepareStatement(sql);

			// 파라미터 바인딩
			pstmt.setString(1, BookVo.getName());
			pstmt.setString(2, BookVo.getPhoneNumber());
			pstmt.setString(3, BookVo.getHomeNumber());

			// SQL 실행 -> 영향 받은 레코드 카운트
			updatedCount = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
			}
		}

		return updatedCount == 1;
	}

}
