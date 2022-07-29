package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import jdbc.util.OracleConnectionUtil;

public class SelectWhereTest {

	public static void main(String[] args) {
		// ����ڿ��� �˻��� �� id�� �Է� �޴´�.
		// �Է¹��� �� id�� ��ȸ�� ��� �̸�,�̸����� ����Ѵ�
		Connection conn = OracleConnectionUtil.connect();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "SELECT  NAME,EMAIL  FROM TBL_CUSTOM# WHERE CUSTOM_ID = ? ";
		
		Scanner sc = new Scanner(System.in);
		System.out.println("��id�� �Է��ϼ���");
		String id = sc.nextLine();
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			rs=pstmt.executeQuery();
			while(rs.next()) {
			System.out.println("�̸� : "+rs.getNString("NAME"));
			System.out.println("�̸��� : "+rs.getNString("EMAIL"));
			}
			
		} catch (SQLException e) {
			System.out.println("SQL select ���� ���� : "+e.getMessage());
		}finally {
			OracleConnectionUtil.close(conn, pstmt);
		}
	}

}
