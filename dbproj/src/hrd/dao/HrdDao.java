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
				+ "decode(grade,'A','우수','B','일반','C','직원') AS agrade,"
				+ "city from member_tbl_02";
				
		MemberVO vo;
		List<MemberVO> list = new ArrayList<MemberVO>();
		try {
			pstmt = conn.prepareStatement(sql);

			rs = pstmt.executeQuery();
			while (rs.next()) {// 조회 결과 자바 객체와 매핑 -> mybatis라이브러리 사용해서 처리예정
				vo = new MemberVO(rs.getInt(1),rs.getString(2), rs.getString(3), 
						rs.getString(4), rs.getDate(5),rs.getString(6),rs.getString(7));
				list.add(vo); // 리스트에 추가합니다.
			}
			return list;
		} catch (SQLException e) {
			System.out.println("Member List 조회에 문제가 있습니다. : " + e.getMessage());
		} finally {
			try {
				rs.close();
			} catch (SQLException e) {
				System.out.println("close 오류 : " + e.getMessage());
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
				"	decode(mt.GRADE,'A','우수','B','일반','C','직원') AS agrade, \r\n" + 
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
			while (rs.next()) {		//첫번째 결과행부터 순서대로 다음행 이동 , 다음행이 있으면
				vo = new SaleVO(rs.getInt(1),
						rs.getString(2), 
						rs.getString(3), 
						rs.getInt(4));
				list.add(vo); // 리스트에 추가합니다.
			}
			return list;
		} catch (SQLException e) {
			System.out.println("회원매출조회에  문제가 있습니다. : " + e.getMessage());
		} finally {
			try {
				rs.close();
			} catch (SQLException e) {
				System.out.println("close 오류 : " + e.getMessage());
			}
			OracleConnectionUtil.close(conn,pstmt);
		}

		return null;	
	}
}
