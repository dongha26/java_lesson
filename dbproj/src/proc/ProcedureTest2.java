package proc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;
import java.util.Scanner;

import jdbc.util.OracleConnectionUtil;

//1. check_member 프로시저 실행
//2. check_book 프로시저 실행
//3. 2번에서 없는 책 오류 확인하고 해결하기
//4. 확인 IDX와 도서명을 입력받아서 실행
public class ProcedureTest2 {

	public static void main(String[] args) {
		Connection conn = OracleConnectionUtil.connect();
		String sql1 ="{ call check_member(?,?) }";	// 저장프로시저 check_member 호출 sql
		String sql2 ="{ call check_book(?,?) } ";
		int memIdx = 10001;
		String book = "푸른사자 와나니";
		CallableStatement cstmt = null;			//저장 프로시저는 PreparedStatement 아닙니다.
		Scanner sc = new Scanner(System.in);
		try {
			cstmt = conn.prepareCall(sql1);	//prepareCall는 저장프로시저 실행하기 위한 객체 생성 메소드
			System.out.print("회원 idx >>>");
			memIdx = Integer.parseInt(sc.nextLine());
			cstmt.setInt(1, memIdx);	//첫번째 입력 매개변수 IN 의 *값 설정하기
			//두번째 출력 매개변수 OUT 의 *오라클 데이터 타입 설정하기
			cstmt.registerOutParameter(2, Types.VARCHAR);   
			cstmt.executeUpdate();		//실행.
			
			
			System.out.print("대출 가능 ? ");
			System.out.println(cstmt.getString(2));		//실행결과 OUT 매개변수값 가져오기
			
			//check_book 프로시저 실행/
			
			cstmt = conn.prepareCall(sql2);
			System.out.print("도서명 >>>");
			book = sc.nextLine();
			cstmt.setString(1, book);
			cstmt.registerOutParameter(2, Types.VARCHAR);
			cstmt.executeUpdate();
			
			System.out.println("대출가능한책?");
			System.out.println(cstmt.getString(2));
			cstmt.close();
		} catch (SQLException e) {
			System.out.println("오류 "+e.getMessage());
				e.printStackTrace();
		}finally {
			OracleConnectionUtil.close(conn, null);
		}
	}

}
