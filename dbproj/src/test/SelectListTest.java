package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import jdbc.util.OracleConnectionUtil;
import vo.CustomVo;

public class SelectListTest {

	public static void main(String[] args) {
	long start = System.currentTimeMillis();	
	String sql = "Select * from tbl_custom"; // ��ȸ��� �ִ� n��
	ResultSet rs = null;
	List<CustomVo>list = new ArrayList<>(); 	//��ȸ��� �ִ� n���� �����ϴ� �÷���
	try(Connection conn = OracleConnectionUtil.connect();
				PreparedStatement pstmt = conn.prepareStatement(sql))
	{
		rs = pstmt.executeQuery();
		while(rs.next()) {	// ��ȸ��� �ִ� n�� -> while
			CustomVo vo = new CustomVo(rs.getNString(1),
					rs.getNString(2),
					rs.getNString(3),
					rs.getInt(4),
					rs.getDate(5));
			list.add(vo);
		}
		System.out.println(list);
		
	}catch (SQLException e) {
		System.out.println("SQL ������� : " + e.getMessage());
	}
	long end = System.currentTimeMillis();
	System.out.println("����ð� : "+(end-start)+ "ms");
	}

}
