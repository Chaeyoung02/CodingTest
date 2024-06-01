package Dao_homework;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class MemberDAO {
    public int insertMember(Member m) {
        Connection conn = null;
        Statement stmt = null;
        int result = 0;
        try {
            Class.forName("org.mariadb.jdbc.Driver");
            String url ="jdbc:mariadb://127.0.0.1:3306/jdbc_test";
            String user = "scott";
            String userPwd = "tiger";

            conn = DriverManager.getConnection(url, user, userPwd);

            stmt = conn.createStatement();
            String sql = "INSERT INTO `member` (`member_id`, `member_pwd`, `member_name`,"
                    + " `member_email`, `member_phone`, `member_gender`) "
                    + "VALUES('"+m.getMemberId()+"', '"+m.getMemberPwd()+"', '"+m.getMemberName()+"',"
                    + "'"+m.getMemberEmail()+"', '"+m.getMemberPhone()+"', '"+m.getMemberGender()+"')";
            result = stmt.executeUpdate(sql);



        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                stmt.close();
                conn.close();
            }catch (Exception e) {
                e.printStackTrace();
            }
        }
        return result;
    }

    public List<Member> selectMemberAll(){
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        List<Member> resultList = new ArrayList<Member>();

        try {
            Class.forName("org.mariadb.jdbc.Driver");
            String url ="jdbc:mariadb://127.0.0.1:3306/jdbc_test";
            String user = "scott";
            String userPwd = "tiger";

            conn = DriverManager.getConnection(url, user, userPwd);

            stmt = conn.createStatement();
            String sql = "SELECT * FROM member";
            rs = stmt.executeQuery(sql);

            while(rs.next()) {
                Member m = new Member(rs.getInt("member_no")
                        ,rs.getString("member_id")
                        ,rs.getString("member_pwd")
                        ,rs.getString("member_name")
                        ,rs.getString("member_email")
                        ,rs.getString("member_phone")
                        ,rs.getString("member_gender")
                        ,rs.getTimestamp("reg_date").toLocalDateTime()
                        ,rs.getTimestamp("mod_date").toLocalDateTime());
                resultList.add(m);
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
        return resultList;
    }

    public Member selectByMemberId(String id) {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        Member m = null;

        try {
            Class.forName("org.mariadb.jdbc.Driver");
            String url ="jdbc:mariadb://127.0.0.1:3306/jdbc_test";
            String user = "scott";
            String userPwd = "tiger";

            conn = DriverManager.getConnection(url, user, userPwd);

            stmt = conn.createStatement();
            String sql = "SELECT * FROM member WHERE  member_id = '"+id+"' ";
            rs = stmt.executeQuery(sql);

            if(rs.next()) {
                m = new Member(rs.getInt("member_no")
                        ,rs.getString("member_id")
                        ,rs.getString("member_pwd")
                        ,rs.getString("member_name")
                        ,rs.getString("member_email")
                        ,rs.getString("member_phone")
                        ,rs.getString("member_gender")
                        ,rs.getTimestamp("reg_date").toLocalDateTime()
                        ,rs.getTimestamp("mod_date").toLocalDateTime());
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
        return m;
    }
    public List<Member> selectByMemberName(String word){
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        List<Member> resultList = new ArrayList<Member>();

        try {
            Class.forName("org.mariadb.jdbc.Driver");
            String url ="jdbc:mariadb://127.0.0.1:3306/jdbc_test";
            String user = "scott";
            String userPwd = "tiger";

            conn = DriverManager.getConnection(url, user, userPwd);

            stmt = conn.createStatement();
            String sql = "SELECT * FROM member WHERE member_name LIKE '%"+word+"%'";
            rs = stmt.executeQuery(sql);

            while(rs.next()) {
                Member m = new Member(rs.getInt("member_no")
                        ,rs.getString("member_id")
                        ,rs.getString("member_pwd")
                        ,rs.getString("member_name")
                        ,rs.getString("member_email")
                        ,rs.getString("member_phone")
                        ,rs.getString("member_gender")
                        ,rs.getTimestamp("reg_date").toLocalDateTime()
                        ,rs.getTimestamp("mod_date").toLocalDateTime());
                resultList.add(m);
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
        return resultList;


    }

    public int updateMember(Member m) {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        int result = 0;
        try {
            Class.forName("org.mariadb.jdbc.Driver");
            String url ="jdbc:mariadb://127.0.0.1:3306/jdbc_test";
            String user = "scott";
            String userPwd = "tiger";

            conn = DriverManager.getConnection(url, user, userPwd);

            stmt = conn.createStatement();

            String sql1 = "SELECT COUNT(*) AS cnt FROM member WHERE member_id = '"+m.getMemberId()+"' AND member_pwd ='"+m.getMemberPwd()+"'";
            rs = stmt.executeQuery(sql1);

            if(rs.next()) {
                result = rs.getInt("cnt");
            }
            if(result > 0) {
                String sql = "UPDATE member "
                        + "SET member_name = '"+m.getMemberName()+"'"
                        + ",member_email='"+m.getMemberEmail()+"'"
                        + ",member_phone ='"+m.getMemberPhone()+"'"
                        + "WHERE member_id = '"+m.getMemberId()+"'";
                result = stmt.executeUpdate(sql);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                stmt.close();
                conn.close();
            }catch (Exception e) {
                e.printStackTrace();
            }
        }
        return result;

    }
    public int deleteMember(String memberId) {
        Connection conn = null;
        Statement stmt = null;
        int result = 0;

        try {
            Class.forName("org.mariadb.jdbc.Driver");
            String url = "jdbc:mariadb://127.0.0.1:3306/jdbc_test";
            String id = "scott";
            String pwd ="tiger";
            conn = DriverManager.getConnection(url, id, pwd);

            stmt = conn.createStatement();

            String sql = "DELETE FROM member WHERE member_id = '"+memberId+"'";
            result = stmt.executeUpdate(sql);

        }catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                stmt.close();
                conn.close();

            }catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return result;
    }

    public int login(Member m) {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        int result = 0;
        try {
            Class.forName("org.mariadb.jdbc.Driver");
            String url ="jdbc:mariadb://127.0.0.1:3306/jdbc_test";
            String user = "scott";
            String userPwd = "tiger";

            conn = DriverManager.getConnection(url, user, userPwd);

            stmt = conn.createStatement();

            String sql1 = "SELECT COUNT(*) AS cnt FROM member WHERE member_id = '"+m.getMemberId()+"' AND member_pwd ='"+m.getMemberPwd()+"'";
            rs = stmt.executeQuery(sql1);

            if(rs.next()) {
                result = rs.getInt("cnt");
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
        return result;
    }

}
