package jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class OracleConnectionUtil {

	public static Connection connect() { //Connection �������̽� : ����� db�� ���� ����̹� Ŭ������ �޶�����
										 // �׿� ���� ����Ŭ����(��ü)�� �ٸ��ϴ�.
										 // sql ������ ���� ���� ���� �ʿ��Ѱ��� Connection ��ü�Դϴ�.
		
		Connection conn = null;

		String url = "jdbc:oracle:thin:@localhost:1521:XE";   //�����ͺ��̽� URL - �������� Ȯ�ΰ����մϴ�.
					 // jdbc��������,����Ŭ ����, localhost�� ������ ���ӽ� ip�� ��ü,1521�� ����Ŭ ��Ʈ
		String driver="oracle.jdbc.driver.OracleDriver";     //����Ŭ ����̹�Ŭ����(��Ű����.Ŭ������)
		String user ="c##idev";				//������ ���� ���� - �����̸�
		String password="1234";				//            �� �н�����
		
		try {
			//�޸𸮿� �����ͺ��̽� ����̹��� �ε��մϴ�.(�ε�-> ����)
			Class.forName(driver);
			
	//DriverManager Ŭ������ �޸𸮿� �ε�� ����̹� Ŭ������ �����ϰ�		
	//DriverManager Ŭ������ �޼ҵ� getConnection ���� �����ͺ��̽�(����Ŭ) ����̹��� ���� Connection ������ü�� ����
	//                                                    			��    �������̽� Connection Ÿ������ �����մϴ�.
			conn = DriverManager.getConnection(url,user,password);    //db ���ῡ �ʿ��� ���� ���ڷ� ����
			
			
			
		} catch (ClassNotFoundException e) {
			System.out.println("�����ͺ��̽� ����̹� �ε忡 ������ ������ϴ�. : " + e.getMessage());
		} catch (SQLException e) {
			System.out.println("�����ͺ��̽� ���� �� ��뿡 ������ ������ϴ�. : " + e.getMessage());
		} 
		
		return conn;   //������ Connection ��ü �����մϴ�.
	}
	//����Ŭ ���� Connection ��ü close �޼ҵ� - ���� Ÿ�� Connection
		public static void close(Connection conn,PreparedStatement pstmt) {
			if(conn != null)   //conn �� ���̾ƴҶ��� close �����ϵ��� �մϴ�.
				try {
					if(conn != null) conn.close();
					if(pstmt != null) pstmt.close();
				} catch (SQLException e) {
					System.out.println("�����ͺ��̽� ���� ���ῡ ������ ������ϴ�. : " + e.getMessage());
				}
		}




	
}
