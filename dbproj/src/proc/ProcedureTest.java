package proc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;

import jdbc.util.OracleConnectionUtil;

// 1. check_member 프로시저 실행
// 2. check_book 프로시저 실행
// 3. 2번에서 없는 책 오류 확인하고 해결하기
// 4. 확인 IDX와 도서명을 입력받아서 실행
public class ProcedureTest {
	
	public static void main(String[] args) {
		Connection conn = OracleConnectionUtil.connect();
		String sql ="{ call check_member(?,?) }";	// 저장프로시저 check_member 호출 sql
		int memIdx = 10001;
		String book = "페스트";
		CallableStatement cstmt = null;			//저장 프로시저는 PreparedStatement 아닙니다.
		
		try {
			cstmt = conn.prepareCall(sql);	//prepareCall는 저장프로시저 실행하기 위한 객체 생성 메소드
			cstmt.setInt(1, memIdx);	//첫번째 입력 매개변수 IN 의 *값 설정하기
			//두번째 출력 매개변수 OUT 의 *오라클 데이터 타입 설정하기
			cstmt.registerOutParameter(2, Types.VARCHAR);   
			cstmt.executeUpdate();		//실행.
			
			System.out.print("대출 가능 ? ");
			System.out.println(cstmt.getString(2));		//실행결과 OUT 매개변수값 가져오기
			
			cstmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
				e.printStackTrace();
		}finally {
			OracleConnectionUtil.close(conn, null);
		}

	}
}

