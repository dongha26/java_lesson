package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import jdbc.util.OracleConnectionUtil;

public class DBConnectionTest {

	public static void main(String[] args) {
//	db���� �õ��غ��ϴ�. -> �����ϸ� Connection ��ü�� ��������ϴ�
	Connection conn = OracleConnectionUtil.connect();
	System.out.println(conn);
	if (conn!=null) 
		System.out.println("�����ͺ��̽� ���� ����");
	else 
		System.out.println("�����ͺ��̽� ���� ����");
	
	//Connection ��ü�� �̿��ؼ� sql�� ������ �� �ֽ��ϴ� -> sql�� db�� ����
	//PreparedStatement ��ü�� sql�� �������ؼ� �����մϴ�.
	String sql ="INSERT INTO tbl_custom (custom_id,name,email,age) "
			+ "VALUES ('youngb','����','youngb@naver.com',23)"; 
	// sql ������ ; �����ʵ���
	PreparedStatement pstmt = null;
	try {
		pstmt = conn.prepareStatement(sql);
		pstmt.execute();		// insert,update,delete SQL �����մϴ�.
		pstmt.close();          // �ڿ� ��� ����(����)
	} catch (SQLException e) {
		System.out.println("SQL ���� ���� �Դϴ�. : "+e.getMessage());
		//e.printStackTrace();
	} finally {
		OracleConnectionUtil.close(conn,pstmt);
	}
	}

}

