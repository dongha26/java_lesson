package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import jdbc.util.OracleConnectionUtil;

public class insertTest {

	public static void main(String[] args) {
	Connection conn = OracleConnectionUtil.connect();
	System.out.println(conn);

	
	//Connection ��ü�� �̿��ؼ� sql�� ������ �� �ֽ��ϴ� -> sql�� db�� ����
	//PreparedStatement ��ü�� sql�� �������ؼ� �����մϴ�.
	String sql ="INSERT INTO tbl_custom (custom_id,name,email,age) "
			+ "VALUES (?,?,?,?)";	// ?�� �������� ���޵� ��.(���ε�) 
	PreparedStatement pstmt = null;
	Scanner sc = new Scanner(System.in);
	System.out.print("�� ID(unique�� ��) >>> ");
	String id = sc.nextLine();	
	System.out.print("�� �̸� >>> ");
	String name = sc.nextLine();	
	System.out.print("�̸���  >>> ");
	String email = sc.nextLine();
	System.out.print("���� >>> ");
	int age = Integer.parseInt(sc.nextLine());
	
	try {
		pstmt = conn.prepareStatement(sql);		//1)
		//2) //sql�� ���ε� �� �� ���� : ������Ÿ�Կ� ���� setXXX() �޼ҵ弱��.
		pstmt.setNString(1,id);			// "VALUES(?,?,?,?)���� ù���� ?
		pstmt.setNString(2,name);		// 					    �ι��� ?
		pstmt.setNString(3,email);		//					   ������ ?
		pstmt.setInt(4,age);			//					  �׹��� ?
		
		//3)
		pstmt.execute();		// insert,update,delete SQL �����մϴ�.
		System.out.println("���� ��ϵǾ����ϴ�.");
	} catch (SQLException e) {
		System.out.println("SQL ���� ���� �Դϴ�. : "+e.getMessage());
	} finally {
		OracleConnectionUtil.close(conn,pstmt);
	}
	}

}

