package d0727.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import d0727.vo.MoneySum;
import dao.CustomDao;
import jdbc.util.OracleConnectionUtil;

public class AggrDao {
	private static AggrDao dao = new AggrDao();
	private AggrDao() {	
	}

	public static AggrDao getInstance() { 
		return dao;
	}
	

	public List<MoneySum> moneySum(){
		List<MoneySum>list = new ArrayList<>();
		Connection conn = OracleConnectionUtil.connect();
		String sql = "SELECT BUY_DATE2,sum(money) \r\n" + 
				"FROM (SELECT TO_CHAR(BUY_DATE,'yyyy-MM-dd') AS buy_date2, custom_id,\r\n" + 
				"tb.pcode,quantity*price AS money FROM \"TBL_BUY#\" tb ,\"TBL_PRODUCT#\" tp \r\n" + 
				"WHERE tb.PCODE = tp.PCODE )\r\n" + 
				"GROUP BY BUY_DATE2\r\n" + 
				"ORDER BY BUY_DATE2";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
	try {
		pstmt = conn.prepareStatement(sql);
		rs = pstmt.executeQuery();
		while(rs.next()) {
			list.add(new MoneySum(rs.getDate(1),rs.getInt(2)));
		}
	} catch (SQLException e) {
		System.out.println("moneySum ¿À·ù : " + e.getMessage());
	}
		return list;
		
	
	
	}
}
