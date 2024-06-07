package Happy_book.model.dao;

import Happy_book.model.vo.User;

import java.sql.*;

public class UserDao {

    public User Login(User u) {//로그인과 동시에 회원 정보를 다시 저장하기 위해 객체로 리턴
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        User info = null;
        try {
            conn = DriverManager.getConnection(url, user, pwd);

            stmt = conn.createStatement();

            String sql = "SELECT * FROM `tbl_employee` WHERE em_id = '" + u.getEm_id() + "' AND em_pwd = '" + u.getEm_pwd() + "'";
            rs = stmt.executeQuery(sql);

            if (rs.next()) {
                info = new User(rs.getInt("em_no"),
                        rs.getString("em_id"),
                        rs.getString("em_pwd"),
                        rs.getString("em_name"),
                        rs.getString("em_check"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                rs.close();
                stmt.close();
                conn.close();
            } catch (SQLException e2) {
                e2.printStackTrace();
            }
        }
        return info;
    }
    //계정 생성
    public int insert(User u){
        Connection conn  = null;
        PreparedStatement pstmt = null;
        int result = 0;
        try {
            conn = DriverManager.getConnection(url, user, pwd);

            String sql2 = "INSERT INTO tbl_employee(em_id, em_pwd, em_name) VALUES (?, ?, ?)";
            pstmt = conn.prepareStatement(sql2);
            pstmt.setString(1, u.getEm_id());
            pstmt.setString(2, u.getEm_pwd());
            pstmt.setString(3, u.getEm_name());

            result = pstmt.executeUpdate();

        }catch(Exception e){
            e.printStackTrace();
        }finally {
            try {
                pstmt.close();
                conn.close();
            } catch (SQLException e2) {
                e2.printStackTrace();
            }
        }
        return result;
    }

    //쿼리 두개 사용하여 트랜잭션 이용
    //직원 정보 수정
    public int update(User u) {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        int result =0;
        try {
            conn = DriverManager.getConnection(url, user, pwd);
            conn.setAutoCommit(false);

            stmt = conn.createStatement();

            String sql = "SELECT * FROM `tbl_employee` WHERE em_id = '" + u.getEm_id() + "' AND em_pwd = '" + u.getEm_pwd() + "'";
            rs = stmt.executeQuery(sql);

            if (rs.next()) {
               String sql2 = "UPDATE tbl_employee SET em_pwd = '"+u.getEm_pwd()+"', em_name='"+u.getEm_name()+"', em_check ='"+u.getEm_check()+"' " +
                       "WHERE em_id = '"+u.getEm_id()+"'";
               result = stmt.executeUpdate(sql2);
            }
            conn.commit();
        } catch (SQLException e) {
            if (conn != null) {
                try {
                    conn.rollback();
                } catch (SQLException e2) {
                    e2.printStackTrace();
                }
            }
            e.printStackTrace();
        } finally {
            try {
                rs.close();
                stmt.close();
                if (conn != null) conn.close();
            } catch (SQLException e2) {
                e2.printStackTrace();
            }
        }
        return result;
    }
}
