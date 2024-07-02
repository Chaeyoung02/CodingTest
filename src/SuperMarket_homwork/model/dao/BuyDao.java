package SuperMarket_homwork.model.dao;
import SuperMarket_homwork.model.vo.Buy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;



public class BuyDao {
	public int insert(Buy b) {
		Connection conn = null;
		PreparedStatement pstmt = null;

		int result = 0;
		try {

			conn = DriverManager.getConnection(url,id,pwd);
			conn.setAutoCommit(false);

			String sql = "INSERT INTO sm_buy(user_no, prod_no, buy_amount)"
					+ " VALUES(?,?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1,b.getUser_no());
			pstmt.setInt(2,b.getProd_no());
			pstmt.setInt(3,b.getBuy_amount());
			result = pstmt.executeUpdate();


			conn.commit();

		}catch (Exception e) {
			e.printStackTrace();
			try {
				conn.rollback();
			}catch (SQLException e1) {
				e1.printStackTrace();
			}
		}finally {
			try {
				pstmt.close();
				conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

		return result;
	}
	public List<String> select() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Buy b = null;
		List<String> resultList = new ArrayList<String>();
		try {

			conn = DriverManager.getConnection(url,user_id,pwd);

			String sql = "SELECT u.user_nick, p.prod_name, SUM(b.buy_amount) FROM sm_user u "
					+ "JOIN sm_buy b ON u.user_no = b.user_no "
					+ "JOIN sm_product p ON b.prod_no = p.prod_no "
					+ "GROUP BY p.prod_no, u.user_no";
			pstmt = conn.prepareStatement(sql);

			rs = pstmt.executeQuery();
			while(rs.next()) {
				String nickname = rs.getString("prod_name");
				String prodnameString  = rs.getString("user_nick");
				int amount = rs.getInt("SUM(b.buy_amount)");
				String result = nickname+ " "  + prodnameString + " " + amount;
				resultList.add(result);
			}

		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				pstmt.close();
				conn.close();
			}catch (Exception e) {
				e.printStackTrace();
			}
		}

		return resultList;
	}
}
