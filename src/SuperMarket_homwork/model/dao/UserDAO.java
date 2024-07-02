package SuperMarket_homwork.model.dao;


import SuperMarket_homwork.model.vo.User;

import java.sql.*;

public class UserDAO {
	//회원가입
	//중복값 확인
	public int insert(User u) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int result = 0;
		try {

			conn = DriverManager.getConnection(url,id,pwd);
			conn.setAutoCommit(false);


			String sql1 = "SELECT COUNT(*) AS cnt FROM sm_user WHERE user_id = ?";
			pstmt = conn.prepareStatement(sql1);
			pstmt.setString(1, u.getUser_id());
			rs = pstmt.executeQuery();
			if(rs.next()) {
				result = rs.getInt("cnt");
				//중복되는 아이디가 있는 경우 :-1
				//INSERT과정 중 오류가 발생한 경우 : 0
				//정상 INSERT : 1
			}
			if(result == 0) {
				String sql2 = "INSERT INTO sm_user(user_id, user_pwd, user_nick)"
						+ " VALUES(?,?,?)";
				pstmt = conn.prepareStatement(sql2);
				pstmt.setString(1,u.getUser_id());
				pstmt.setString(2, u.getUser_pwd());
				pstmt.setString(3, u.getUser_nick());
				result = pstmt.executeUpdate();



			}else {
				//insert X
				//중복되는 아이디가 있는 경우
				result = 0;
			}
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
	public User check(User u) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		int result = 0;
		User info =null;
		try {


			conn = DriverManager.getConnection(url, user, userPwd);

			stmt = conn.createStatement();

			String sql1 = "SELECT * FROM `sm_user` WHERE user_id = '"+u.getUser_id()+"' AND user_pwd ='"+u.getUser_pwd()+"'";
			rs = stmt.executeQuery(sql1);

			if(rs.next()) {

				info = new User(
						rs.getInt("user_no"),
						rs.getString("user_id"),
						rs.getString("user_pwd"),
						rs.getString("user_nick"),
						rs.getTimestamp("sign_date").toLocalDateTime(),
						rs.getTimestamp("update_date").toLocalDateTime());
			}

		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
		return info;
	}
	public int update(User u) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int result = 0;

		try {

			conn = DriverManager.getConnection(url,id,pwd);
			conn.setAutoCommit(false);


			String sql1 = "SELECT COUNT(*) AS cnt FROM `sm_user` WHERE user_pwd = ? AND user_id = ?";
			pstmt = conn.prepareStatement(sql1);
			pstmt.setString(1, u.getUser_pwd());
			pstmt.setString(2, u.getUser_id());
			rs = pstmt.executeQuery();
			if(rs.next()) {

				result = rs.getInt("cnt");
				//중복되는 아이디가 있는 경우 :-1
				//INSERT과정 중 오류가 발생한 경우 : 0
				//정상 INSERT : 1
			}
			if(result == 1) {
				System.out.println("here");
				String sql2 = "UPDATE `sm_user` SET  user_nick = ?"
						+ " WHERE user_pwd= ? AND user_id = ?";
				pstmt = conn.prepareStatement(sql2);
				pstmt.setString(1, u.getUser_nick());
				pstmt.setString(2, u.getUser_pwd());
				pstmt.setString(3, u.getUser_id());
				result = pstmt.executeUpdate();



			}else {
				//insert X
				//중복되는 아이디가 있는 경우
				result = 0;
			}
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
		return result ;
	}
	public int deleteUser(User u, String pw) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		int result = 0;
		ResultSet rs =null;
		try {

			conn = DriverManager.getConnection(url,id,pwd);
			conn.setAutoCommit(false);


			String sql1 = "SELECT COUNT(*) AS cnt FROM `sm_user` WHERE user_pwd = ? AND user_id = ?";
			pstmt = conn.prepareStatement(sql1);
			pstmt.setString(1, u.getUser_pwd());
			pstmt.setString(2, u.getUser_id());
			rs = pstmt.executeQuery();

			if(rs.next()) {

				result = rs.getInt("cnt");
				//중복되는 아이디가 있는 경우 :-1
				//INSERT과정 중 오류가 발생한 경우 : 0
				//정상 INSERT : 1
			}
			if(result == 1) {
				System.out.println("here");
				String sql2 = "DELETE FROM `sm_user` WHERE user_pwd = ? AND user_id = ?";
				pstmt = conn.prepareStatement(sql2);
				pstmt.setString(1, u.getUser_pwd());
				pstmt.setString(2, u.getUser_id());
				result = pstmt.executeUpdate();
			}else {
				//insert X
				//중복되는 아이디가 있는 경우
				result = 0;
			}
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
		return result ;
	}

}
