package proc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;

import jdbc.util.OracleConnectionUtil;

// 1. check_member ���ν��� ����
// 2. check_book ���ν��� ����
// 3. 2������ ���� å ���� Ȯ���ϰ� �ذ��ϱ�
// 4. Ȯ�� IDX�� �������� �Է¹޾Ƽ� ����
public class ProcedureTest {
	
	public static void main(String[] args) {
		Connection conn = OracleConnectionUtil.connect();
		String sql ="{ call check_member(?,?) }";	// �������ν��� check_member ȣ�� sql
		int memIdx = 10001;
		String book = "�佺Ʈ";
		CallableStatement cstmt = null;			//���� ���ν����� PreparedStatement �ƴմϴ�.
		
		try {
			cstmt = conn.prepareCall(sql);	//prepareCall�� �������ν��� �����ϱ� ���� ��ü ���� �޼ҵ�
			cstmt.setInt(1, memIdx);	//ù��° �Է� �Ű����� IN �� *�� �����ϱ�
			//�ι�° ��� �Ű����� OUT �� *����Ŭ ������ Ÿ�� �����ϱ�
			cstmt.registerOutParameter(2, Types.VARCHAR);   
			cstmt.executeUpdate();		//����.
			
			System.out.print("���� ���� ? ");
			System.out.println(cstmt.getString(2));		//������ OUT �Ű������� ��������
			
			cstmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
				e.printStackTrace();
		}finally {
			OracleConnectionUtil.close(conn, null);
		}

	}
}

