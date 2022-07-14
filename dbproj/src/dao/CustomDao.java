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

// 테이블마다 필요한 insert,update,delete,select 주요 SQL 동작을 메소드로 작성한 클래스입니다.(DAO)
// CustomDao는 tbl_custom 테이블을 대상으로 하는 SQL 실행 메소드를 포함.
//				Singleton 패턴 적용해보기 : 객체를 오직 1개만 생성하는 유형입니다.

public class CustomDao { // Singleton 패턴 적용해보기
	private static CustomDao dao = new CustomDao();	//자기자신 타입으로 객체를 참조하는 변수.

	private CustomDao() {	//생성자는 private. 다른 클래스에서 new CustomDao()못합니다.
	}

	public static CustomDao getInstance() { //자기자신 타입 객체를 리턴하는 메소드
		return dao;
	}
	// CUSTOM# 테이블 대상으로 sql 실행할 메소드 정의합니다.
	public List<CustomVo> getList() { // 전체 조회
		Connection conn = OracleConnectionUtil.connect();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "SELECT * FROM tbl_custom ORDER BY custom_id"; // --> 실행예측 : row의 최대갯수는 많음.
		CustomVo vo;
		List<CustomVo> list = new ArrayList<CustomVo>();
		try {
			pstmt = conn.prepareStatement(sql);

			rs = pstmt.executeQuery();
			while (rs.next()) {
				vo = new CustomVo(rs.getString(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getDate(5));
				list.add(vo); // 리스트에 추가합니다.
			}
			return list;
		} catch (SQLException e) {
			System.out.println("custom List 조회에 문제가 있습니다. : " + e.getMessage());
		} finally {
			try {
				rs.close();
				pstmt.close();
			} catch (SQLException e) {
				System.out.println("close 오류 : " + e.getMessage());
			}
			OracleConnectionUtil.close(conn,pstmt);
		}

		return null;
	}


	public CustomVo getOne(String custom_id) {
		Connection conn = OracleConnectionUtil.connect();
		String sql ="SELECT * FROM TBL_CUSTOM WHERE CUSTOM_ID =?";		//0 or 1개
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
			System.out.println("select one SQL 실행 오류 : " + e.getMessage());
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
			pstmt.setInt(4, vo.getAge()); // sql 을 먼저 전달 -> 필요한 데이터는 그 후에 설정이됩니다.

			pstmt.execute();   
			pstmt.close(); 
			System.out.println("insert 정상완료!!");
		} catch (SQLException e) {
			System.out.println("SQL 실행에 오류가 발생했습니다. : " + e.getMessage());
			// e.printStackTrace();
		} finally {
			OracleConnectionUtil.close(conn,pstmt); // 연결 종료
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
//현재 날짜 
			
			pstmt.execute();
			pstmt.close();
		}catch (SQLException e) {
			System.out.println("SQL 실행에 오류가 발생했습니다. : " + e.getMessage());
		}finally {
			OracleConnectionUtil.close(conn,pstmt);
		}
		
		
	}
	public void dekete(CustomVo vo) {
		Connection conn = OracleConnectionUtil.connect();
		
	}
	public  int delete(String custom_id) {
		// 외래키 제약조건 : custom_id 삭제 오류 발생할 수 있습니다
		// -> 1) 구매내역이 있으면 삭제 못한다 또는
		// -> 2) 회원삭제할 때 구매내역도 삭제한다. 외래키 옵션 on table cascade
		// -> 3) 			tbl_buy 테이블 custom_id를 null로 변경 ㅐon delete set null
		//					custom_id는 복합 기본키 컬럼 중 하나이므로 null은 안욉니다.
		Connection conn = OracleConnectionUtil.connect();
		String sql="DELETE FROM TBL_CUSTOM WHERE CUSTOM_ID = ?";   

		PreparedStatement pstmt =null;
		int result =0;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setNString(1,custom_id);
			
			result = pstmt.executeUpdate();
			
			
		} catch (SQLException e) {
			System.out.println("SQL 실행에 오류가 발생했습니다. : " + e.getMessage());
		}finally {
			OracleConnectionUtil.close(conn,pstmt);
		}
		return result;
	}

}


		
		
	

