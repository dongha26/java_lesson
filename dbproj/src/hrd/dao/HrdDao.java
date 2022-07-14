package hrd.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import hrd.vo.MemberVO;
import hrd.vo.SaleVO;
import jdbc.util.OracleConnectionUtil;
import vo.CustomVo;

public class HrdDao {
	private static HrdDao dao = new HrdDao();
	private HrdDao() { }
	public static HrdDao getInstance() {
		return dao;
	}
	
	
	public List<MemberVO> getMembers() {
		Connection conn = OracleConnectionUtil.connect();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "select custno,"
				+ "custname,phone,address,to_char(joindate,'yyyy-MM-dd'),"
				+ "decode(grade,'A','���','B','�Ϲ�','C','����') AS agrade,"
				+ "city from member_tbl_02";
				
		MemberVO vo;
		List<MemberVO> list = new ArrayList<MemberVO>();
		try {
			pstmt = conn.prepareStatement(sql);

			rs = pstmt.executeQuery();
			while (rs.next()) {// ��ȸ ��� �ڹ� ��ü�� ���� -> mybatis���̺귯�� ����ؼ� ó������
				vo = new MemberVO(rs.getInt(1),rs.getString(2), rs.getString(3), 
						rs.getString(4), rs.getDate(5),rs.getString(6),rs.getString(7));
				list.add(vo); // ����Ʈ�� �߰��մϴ�.
			}
			return list;
		} catch (SQLException e) {
			System.out.println("Member List ��ȸ�� ������ �ֽ��ϴ�. : " + e.getMessage());
		} finally {
			try {
				rs.close();
			} catch (SQLException e) {
				System.out.println("close ���� : " + e.getMessage());
			}
			OracleConnectionUtil.close(conn,pstmt);
		}

		return null;		
		
	}
	
	public List<SaleVO> getSales() {
		Connection conn = OracleConnectionUtil.connect();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "SELECT  mt.CUSTNO , \r\n" + 
				"	mt.CUSTNAME , \r\n" + 
				"	decode(mt.GRADE,'A','���','B','�Ϲ�','C','����') AS agrade, \r\n" + 
				"	sale.asum \r\n" + 
				"FROM MEMBER_TBL_02 mt ,\r\n" + 
				"		(SELECT CUSTNO, sum(price) AS asum FROM MONEY_TBL_02  \r\n" + 
				"		GROUP BY CUSTNO\r\n" + 
				"		ORDER BY asum desc) sale\r\n" + 
				"WHERE mt.CUSTNO = sale.CUSTNO"; 
		SaleVO vo;
		List<SaleVO> list = new ArrayList<SaleVO>();
		try {
			pstmt = conn.prepareStatement(sql);

			rs = pstmt.executeQuery();
			while (rs.next()) {		//ù��° �������� ������� ������ �̵� , �������� ������
				vo = new SaleVO(rs.getInt(1),
						rs.getString(2), 
						rs.getString(3), 
						rs.getInt(4));
				list.add(vo); // ����Ʈ�� �߰��մϴ�.
			}
			return list;
		} catch (SQLException e) {
			System.out.println("ȸ��������ȸ��  ������ �ֽ��ϴ�. : " + e.getMessage());
		} finally {
			try {
				rs.close();
			} catch (SQLException e) {
				System.out.println("close ���� : " + e.getMessage());
			}
			OracleConnectionUtil.close(conn,pstmt);
		}

		return null;	
	}
}
