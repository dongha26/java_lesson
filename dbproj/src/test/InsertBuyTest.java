package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import jdbc.util.OracleConnectionUtil;

public class InsertBuyTest {
	// tbl_buy ���̺� insert �׽�Ʈ:
	// sana97 ȸ���� GALAXY22�� 1�� ���� 
	// VALUES (?,?,...) ���� ���ε����� SQL�� ���� �������ϰ� ���ప�� �� �� �������� ����. 

	public static void main(String[] args) {
		Connection conn1 = OracleConnectionUtil.connect();
		System.out.println(conn1);
		
	String sql1 = "insert into tbl_buy (custom_id,pcode,quantity,buyno) "
			+ "values(?,?,?,test_seq1.nextval)";
	PreparedStatement ptsd = null;
	Scanner sc = new Scanner(System.in);
	
	System.out.print("�� ID(unique�� ��) >>> ");
	String cid = sc.nextLine();	
	System.out.print("�����ڵ� >>> ");
	String pcode = sc.nextLine();	
	System.out.print("���ż���  >>> ");
	int quantity = Integer.parseInt(sc.nextLine());
	
	
	try {
		conn1.setAutoCommit(false);
		
		ptsd = conn1.prepareStatement(sql1);
		ptsd.setNString(1,cid);
		ptsd.setString(2,pcode);
		ptsd.setInt(3,quantity);
		

		
		ptsd.execute();
		System.out.println("��");
		sc.nextLine();
		//		conn1.commit(); //Ʈ����� commit(Ȯ��)
		//		conn1.rollback(); // ���
		System.out.println("��ϵǾ����ϴ�");
	} catch (SQLException e) {
		System.out.println("sql ���� �����Դϴ�. : " +e.getMessage());
		
		  try{conn1.rollback();
		  }//Ʈ����� �ѹ�}catch(SQLException e1){
		  catch(SQLException e1){}
		 
		 
	
	}finally {
		OracleConnectionUtil.close(conn1, ptsd); //conn.close �� �� commit ����
	}
	}
}
