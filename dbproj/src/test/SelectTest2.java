package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import jdbc.util.OracleConnectionUtil;

public class SelectTest2 {	// SelectTest Ŭ���� while �� ���� ��ȸ�� ��� ��� ���

	public static void main(String[] args) {
		
		Connection conn = OracleConnectionUtil.connect();
		PreparedStatement pstmt = null;
		// select ���� ����� ��������� ��ü�� �����ϴ� �������̽� ����Ÿ�� ����
		ResultSet rs = null;
		
		String sql = "SELECT  * FROM TBL_CUSTOM order by custom_id";
		// select ���� ��� ���� ������ ���߽������� �� �� ����. �÷����� �˰�����.
		try {
			pstmt = conn.prepareStatement(sql);
			//select ���� ���� . ����� ��������� ��ü�� ����
			rs=pstmt.executeQuery();
			int i =1;
			// rs�� ���ؼ� ������ Ȯ��  rs.next() ��ȸ�� �����(row) ������� ����
			while(rs.next()) {
			System.out.println(String.format("\n��ȸ�� ����� �ֽ��ϱ�?(%d ��° ��)",i++));
			System.out.println("���� ���� �� ID : "+rs.getNString("CUSTOM_ID"));
			System.out.println("���� ���� �̸� : "+rs.getNString("NAME"));
			System.out.println("���� ���� ���� : "+rs.getInt("AGE"));
			System.out.println("���� ���� ���Գ�¥ : "+rs.getDate("REG_DATE"));
			System.out.println("���� ���� ���Գ�¥ : "+rs.getTimestamp("REG_DATE"));
			}

		
		} catch (SQLException e) {
			System.out.println("SQL select ���� ���� : "+e.getMessage());
		}finally {
			OracleConnectionUtil.close(conn, pstmt);
		}
	
	}

}
