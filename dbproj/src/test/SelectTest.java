package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import jdbc.util.OracleConnectionUtil;

public class SelectTest {

	public static void main(String[] args) {
		
		Connection conn = OracleConnectionUtil.connect();
		PreparedStatement pstmt = null;
		// select 쿼리 결과로 만들어지는 객체를 참조하는 인터페이스 참조타입 변수
		ResultSet rs = null;
		
		String sql = "SELECT  * FROM TBL_CUSTOM#";
		// select 실행 결과 행의 개수는 개발시점에서 알 수 없음. 컬럼명은 알고있음.
		try {
			pstmt = conn.prepareStatement(sql);
			//select 쿼리 실행 . 결과로 만들어지는 객체를 참조
			rs=pstmt.executeQuery();
			// rs를 통해서 실행결과 확인  rs.next() 조회된 결과를(row) 순서대로 접근
			System.out.println("조회된 결과가 있습니까?(첫번째행) "+ rs.next());
			System.out.println("현재 행의 고객 ID : "+rs.getNString("CUSTOM_ID"));
			System.out.println("현재 행의 이름 : "+rs.getNString("NAME"));
			System.out.println("현재 행의 이메일 : "+rs.getNString("EMAIL"));
			System.out.println("현재 행의 나이 : "+rs.getInt("AGE"));
			System.out.println("현재 행의 가입날짜 : "+rs.getDate("REG_DATE"));
			System.out.println("현재 행의 가입날짜 : "+rs.getTimestamp("REG_DATE"));
		
			System.out.println("조회된 결과가 있습니까?(두번째행) "+ rs.next());
			System.out.println("현재 행의 고객 ID : "+rs.getNString(1));
			System.out.println("현재 행의 이름 : "+rs.getNString(2));
			System.out.println("현재 행의 이메일 : "+rs.getNString(3));
			System.out.println("현재 행의 나이 : "+rs.getInt(4));
			System.out.println("현재 행의 가입날짜 : "+rs.getDate(5));
			System.out.println("현재 행의 가입날짜 : "+rs.getTimestamp(5));
		
		} catch (SQLException e) {
			System.out.println("SQL select 실행 오류 : "+e.getMessage());
		}finally {
			OracleConnectionUtil.close(conn, pstmt);
		}
	
	}

}
