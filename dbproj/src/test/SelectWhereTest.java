package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import jdbc.util.OracleConnectionUtil;

public class SelectWhereTest {

	public static void main(String[] args) {
		// 사용자에게 검색할 고객 id를 입력 받는다.
		// 입력받은 고객 id로 조회된 결과 이름,이메일을 출력한다
		Connection conn = OracleConnectionUtil.connect();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "SELECT  NAME,EMAIL  FROM TBL_CUSTOM# WHERE CUSTOM_ID = ? ";
		
		Scanner sc = new Scanner(System.in);
		System.out.println("고객id를 입력하세요");
		String id = sc.nextLine();
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			rs=pstmt.executeQuery();
			while(rs.next()) {
			System.out.println("이름 : "+rs.getNString("NAME"));
			System.out.println("이메일 : "+rs.getNString("EMAIL"));
			}
			
		} catch (SQLException e) {
			System.out.println("SQL select 실행 오류 : "+e.getMessage());
		}finally {
			OracleConnectionUtil.close(conn, pstmt);
		}
	}

}
