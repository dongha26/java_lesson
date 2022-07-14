package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import jdbc.util.OracleConnectionUtil;
import vo.CustomVo;

// ���̺����� �ʿ��� insert,update,delete,select �ֿ� SQL ������ �޼ҵ�� �ۼ��� Ŭ�����Դϴ�.(DAO)
// CustomDao�� tbl_custom ���̺��� ������� �ϴ� SQL ���� �޼ҵ带 ����.
//				Singleton ���� �����غ��� : ��ü�� ���� 1���� �����ϴ� �����Դϴ�.

public class CustomDao { // Singleton ���� �����غ���
	private static CustomDao dao = new CustomDao();	//�ڱ��ڽ� Ÿ������ ��ü�� �����ϴ� ����.

	private CustomDao() {	//�����ڴ� private. �ٸ� Ŭ�������� new CustomDao()���մϴ�.
	}

	public static CustomDao getInstance() { //�ڱ��ڽ� Ÿ�� ��ü�� �����ϴ� �޼ҵ�
		return dao;
	}
	// CUSTOM# ���̺� ������� sql ������ �޼ҵ� �����մϴ�.
	public List<CustomVo> getList() { // ��ü ��ȸ
		Connection conn = OracleConnectionUtil.connect();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "SELECT * FROM tbl_custom ORDER BY custom_id"; // --> ���࿹�� : row�� �ִ밹���� ����.
		CustomVo vo;
		List<CustomVo> list = new ArrayList<CustomVo>();
		try {
			pstmt = conn.prepareStatement(sql);

			rs = pstmt.executeQuery();
			while (rs.next()) {
				vo = new CustomVo(rs.getString(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getDate(5));
				list.add(vo); // ����Ʈ�� �߰��մϴ�.
			}
			return list;
		} catch (SQLException e) {
			System.out.println("custom List ��ȸ�� ������ �ֽ��ϴ�. : " + e.getMessage());
		} finally {
			try {
				rs.close();
				pstmt.close();
			} catch (SQLException e) {
				System.out.println("close ���� : " + e.getMessage());
			}
			OracleConnectionUtil.close(conn,pstmt);
		}

		return null;
	}


	public CustomVo getOne(String custom_id) {
		Connection conn = OracleConnectionUtil.connect();
		String sql ="SELECT * FROM TBL_CUSTOM WHERE CUSTOM_ID =?";		//0 or 1��
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setNString(1, custom_id);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				return new CustomVo(rs.getNString(1), 
						rs.getNString(2), rs.getNString(3), 
						rs.getInt(4), rs.getDate(5));
			}
		}catch (SQLException e) {
			System.out.println("select one SQL ���� ���� : " + e.getMessage());
		}
		
		return null;
	}


	public void insert(CustomVo vo) {
		Connection conn = OracleConnectionUtil.connect();
		String sql = "INSERT INTO TBL_CUSTOM (CUSTOM_ID, NAME, EMAIL, AGE) VALUES(?,?,?,?)";
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, vo.getCustom_id());
			pstmt.setString(2, vo.getName());
			pstmt.setString(3, vo.getEmail());
			pstmt.setInt(4, vo.getAge()); // sql �� ���� ���� -> �ʿ��� �����ʹ� �� �Ŀ� �����̵˴ϴ�.

			pstmt.execute();   
			pstmt.close(); 
			System.out.println("insert ����Ϸ�!!");
		} catch (SQLException e) {
			System.out.println("SQL ���࿡ ������ �߻��߽��ϴ�. : " + e.getMessage());
			// e.printStackTrace();
		} finally {
			OracleConnectionUtil.close(conn,pstmt); // ���� ����
		}
	}

	public void update(CustomVo vo) {
		Connection conn = OracleConnectionUtil.connect();
		String sql="UPDATE TBL_CUSTOM SET email = ? , AGE = ? " + 
				"WHERE CUSTOM_ID = ? ";   

		PreparedStatement pstmt =null; 
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, vo.getEmail());
			pstmt.setInt(2, vo.getAge());
			pstmt.setString(3, vo.getCustom_id());
//���� ��¥ 
			
			pstmt.execute();
			pstmt.close();
		}catch (SQLException e) {
			System.out.println("SQL ���࿡ ������ �߻��߽��ϴ�. : " + e.getMessage());
		}finally {
			OracleConnectionUtil.close(conn,pstmt);
		}
		
		
	}
	public void dekete(CustomVo vo) {
		Connection conn = OracleConnectionUtil.connect();
		
	}
	public  int delete(String custom_id) {
		// �ܷ�Ű �������� : custom_id ���� ���� �߻��� �� �ֽ��ϴ�
		// -> 1) ���ų����� ������ ���� ���Ѵ� �Ǵ�
		// -> 2) ȸ�������� �� ���ų����� �����Ѵ�. �ܷ�Ű �ɼ� on table cascade
		// -> 3) 			tbl_buy ���̺� custom_id�� null�� ���� ��on delete set null
		//					custom_id�� ���� �⺻Ű �÷� �� �ϳ��̹Ƿ� null�� �ȿ�ϴ�.
		Connection conn = OracleConnectionUtil.connect();
		String sql="DELETE FROM TBL_CUSTOM WHERE CUSTOM_ID = ?";   

		PreparedStatement pstmt =null;
		int result =0;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setNString(1,custom_id);
			
			result = pstmt.executeUpdate();
			
			
		} catch (SQLException e) {
			System.out.println("SQL ���࿡ ������ �߻��߽��ϴ�. : " + e.getMessage());
		}finally {
			OracleConnectionUtil.close(conn,pstmt);
		}
		return result;
	}

}


		
		
	
