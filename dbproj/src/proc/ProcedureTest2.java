package proc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;
import java.util.Scanner;

import jdbc.util.OracleConnectionUtil;

//1. check_member ���ν��� ����
//2. check_book ���ν��� ����
//3. 2������ ���� å ���� Ȯ���ϰ� �ذ��ϱ�
//4. Ȯ�� IDX�� �������� �Է¹޾Ƽ� ����
public class ProcedureTest2 {

	public static void main(String[] args) {
		Connection conn = OracleConnectionUtil.connect();
		String sql1 ="{ call check_member(?,?) }";	// �������ν��� check_member ȣ�� sql
		String sql2 ="{ call check_book(?,?) } ";
		int memIdx = 10001;
		String book = "Ǫ������ �ͳ���";
		CallableStatement cstmt = null;			//���� ���ν����� PreparedStatement �ƴմϴ�.
		Scanner sc = new Scanner(System.in);
		try {
			cstmt = conn.prepareCall(sql1);	//prepareCall�� �������ν��� �����ϱ� ���� ��ü ���� �޼ҵ�
			System.out.print("ȸ�� idx >>>");
			memIdx = Integer.parseInt(sc.nextLine());
			cstmt.setInt(1, memIdx);	//ù��° �Է� �Ű����� IN �� *�� �����ϱ�
			//�ι�° ��� �Ű����� OUT �� *����Ŭ ������ Ÿ�� �����ϱ�
			cstmt.registerOutParameter(2, Types.VARCHAR);   
			cstmt.executeUpdate();		//����.
			
			
			System.out.print("���� ���� ? ");
			System.out.println(cstmt.getString(2));		//������ OUT �Ű������� ��������
			
			//check_book ���ν��� ����/
			
			cstmt = conn.prepareCall(sql2);
			System.out.print("������ >>>");
			book = sc.nextLine();
			cstmt.setString(1, book);
			cstmt.registerOutParameter(2, Types.VARCHAR);
			cstmt.executeUpdate();
			
			System.out.println("���Ⱑ����å?");
			System.out.println(cstmt.getString(2));
			cstmt.close();
		} catch (SQLException e) {
			System.out.println("���� "+e.getMessage());
				e.printStackTrace();
		}finally {
			OracleConnectionUtil.close(conn, null);
		}
	}

}
