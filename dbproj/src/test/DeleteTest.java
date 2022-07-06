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
		System.out.println("ȸ�� ���ų��� ���� --------------");
		try {
			conn.setAutoCommit(false);
			pstmt = conn.prepareStatement(sql);
			System.out.print("�� id >>> ");
			String cid = sc.nextLine();
			pstmt.setNString(1,cid);
			pstmt.execute();
			System.out.print("������?(y or n) >>");
			if (sc.nextLine().equals("y")) {
				conn.commit();
				System.out.println("���� ���� ���� �Ϸ�");
			}else {
				conn.rollback();
				System.out.println("���� ���� ���� ���");
			}
		} catch (Exception e) {
			System.out.println("SQL ���� : "+e.getMessage());
		}
		System.out.println("������.");
	}

}
