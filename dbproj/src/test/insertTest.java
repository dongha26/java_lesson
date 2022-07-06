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

	
	//Connection 객체를 이용해서 sql을 실행할 수 있습니다 -> sql을 db로 전송
	//PreparedStatement 객체는 sql을 컴파일해서 저장합니다.
	String sql ="INSERT INTO tbl_custom (custom_id,name,email,age) "
			+ "VALUES (?,?,?,?)";	// ?는 실행전에 전달될 값.(바인딩) 
	PreparedStatement pstmt = null;
	Scanner sc = new Scanner(System.in);
	System.out.print("고객 ID(unique한 값) >>> ");
	String id = sc.nextLine();	
	System.out.print("고객 이름 >>> ");
	String name = sc.nextLine();	
	System.out.print("이메일  >>> ");
	String email = sc.nextLine();
	System.out.print("나이 >>> ");
	int age = Integer.parseInt(sc.nextLine());
	
	try {
		pstmt = conn.prepareStatement(sql);		//1)
		//2) //sql에 바인딩 될 값 설정 : 데이터타입에 따라 setXXX() 메소드선택.
		pstmt.setNString(1,id);			// "VALUES(?,?,?,?)에서 첫번쨰 ?
		pstmt.setNString(2,name);		// 					    두번쨰 ?
		pstmt.setNString(3,email);		//					   세번쨰 ?
		pstmt.setInt(4,age);			//					  네번쨰 ?
		
		//3)
		pstmt.execute();		// insert,update,delete SQL 실행합니다.
		System.out.println("고객이 등록되었습니다.");
	} catch (SQLException e) {
		System.out.println("SQL 실행 오류 입니다. : "+e.getMessage());
	} finally {
		OracleConnectionUtil.close(conn,pstmt);
	}
	}

}

