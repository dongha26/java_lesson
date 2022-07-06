package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

import jdbc.util.OracleConnectionUtil;

public class DeleteTest {

	public static void main(String[] args) {
		Connection conn = OracleConnectionUtil.connect();
		Scanner sc = new Scanner(System.in);
		PreparedStatement pstmt = null;
		String sql ="DELETE FROM TBL_BUY WHERE CUSTOM_ID = ?";
		System.out.println("회원 구매내역 삭제 --------------");
		try {
			conn.setAutoCommit(false);
			pstmt = conn.prepareStatement(sql);
			System.out.print("고객 id >>> ");
			String cid = sc.nextLine();
			pstmt.setNString(1,cid);
			pstmt.execute();
			System.out.print("삭제함?(y or n) >>");
			if (sc.nextLine().equals("y")) {
				conn.commit();
				System.out.println("구매 내역 삭제 완료");
			}else {
				conn.rollback();
				System.out.println("구매 내역 삭제 취소");
			}
		} catch (Exception e) {
			System.out.println("SQL 오류 : "+e.getMessage());
		}
		System.out.println("삭제됨.");
	}

}
