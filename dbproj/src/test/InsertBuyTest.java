package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import jdbc.util.OracleConnectionUtil;

public class InsertBuyTest {
	// tbl_buy 테이블에 insert 테스트:
	// sana97 회원이 GALAXY22를 1개 구매 
	// VALUES (?,?,...) 동적 바인딩으로 SQL을 먼저 컴파일하고 실행값은 그 후 실행전에 전달. 

	public static void main(String[] args) {
		Connection conn1 = OracleConnectionUtil.connect();
		System.out.println(conn1);
		
	String sql1 = "insert into tbl_buy (custom_id,pcode,quantity,buyno) "
			+ "values(?,?,?,test_seq1.nextval)";
	PreparedStatement ptsd = null;
	Scanner sc = new Scanner(System.in);
	
	System.out.print("고객 ID(unique한 값) >>> ");
	String cid = sc.nextLine();	
	System.out.print("물건코드 >>> ");
	String pcode = sc.nextLine();	
	System.out.print("구매수량  >>> ");
	int quantity = Integer.parseInt(sc.nextLine());
	
	
	try {
		conn1.setAutoCommit(false);
		
		ptsd = conn1.prepareStatement(sql1);
		ptsd.setNString(1,cid);
		ptsd.setString(2,pcode);
		ptsd.setInt(3,quantity);
		

		
		ptsd.execute();
		System.out.println("끝");
		sc.nextLine();
		//		conn1.commit(); //트랜잭션 commit(확정)
		//		conn1.rollback(); // 취소
		System.out.println("등록되었습니다");
	} catch (SQLException e) {
		System.out.println("sql 실행 오류입니다. : " +e.getMessage());
		
		  try{conn1.rollback();
		  }//트랜잭션 롤백}catch(SQLException e1){
		  catch(SQLException e1){}
		 
		 
	
	}finally {
		OracleConnectionUtil.close(conn1, ptsd); //conn.close 할 때 commit 실행
	}
	}
}
