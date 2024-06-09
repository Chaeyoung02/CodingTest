package Happy_book.model.dao;

import Happy_book.model.vo.Book;
import Happy_book.view.BookMenu;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BookDao {

    public List<Book> selectAll() {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        List<Book> list = new ArrayList<>();
        try{
            conn = DriverManager.getConnection(url, user, pwd);
            stmt = conn.createStatement();

            String sql = "SELECT * FROM tbl_book";
            rs = stmt.executeQuery(sql);


            while(rs.next()){
                Book b= new Book();
                b.setBk_no(rs.getInt("bk_no"));
                b.setBk_name(rs.getString("bk_name"));
                b.setBk_author(rs.getString("bk_author"));
                b.setBk_publisher(rs.getString("bk_publisher"));
                b.setBk_date(rs.getTimestamp("bk_date").toLocalDateTime());
                b.setBk_price(rs.getString("bk_price"));
                b.setBk_amount(rs.getInt("bk_amount"));

                list.add(b);
            }
            if(list.isEmpty()){
                System.out.println("저장된 결과가 없습니다.");
            }else {
                System.out.println("조회된 결과는 다음과 같습니다.");
                System.out.println("이름||지은이||출판사||출간일||가격||수량");
            }

        }catch(Exception e){
            e.printStackTrace();
        }finally {
            try {
                rs.close();
                stmt.close();
                conn.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        return list;
    }
    public int insert(Book b){
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        int result =0;
        try {
            conn = DriverManager.getConnection(url, user, pwd);
            conn.setAutoCommit(false);

            stmt = conn.createStatement();

            String sql = "SELECT * FROM `tbl_book` WHERE bk_name = '" + b.getBk_name() + "' AND bk_author = '" + b.getBk_author()+ "'";
            rs = stmt.executeQuery(sql);

            if (rs.next()) {
                System.out.println("같은 도서가 있습니다. 다시 추가하세요.");
                new BookMenu().insertBook();

            }else{
                String sql2 = "INSERT INTO tbl_book(bk_name, bk_author, bk_publisher, bk_price) " +
                        "VALUES('"+b.getBk_name()+"','"+b.getBk_author()+"','"+b.getBk_publisher()+"','"+b.getBk_price()+"')";
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

    //도서삭제
    public int delete(Book b){
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        int result = 0;
        try{
            conn = DriverManager.getConnection(url, user, pwd);
            conn.setAutoCommit(false);

            stmt = conn.createStatement();

            String sql = "SELECT * FROM `tbl_book` WHERE bk_name = '" + b.getBk_name() + "' AND bk_author = '" + b.getBk_author() + "'" +
                    "AND bk_publisher = '"+b.getBk_publisher()+"'";
            rs = stmt.executeQuery(sql);

            if (rs.next()) {
                String sql2 = "DELETE FROM tbl_book WHERE bk_name = '" + b.getBk_name() + "' AND bk_author = '" + b.getBk_author() + "'" +
                        "AND bk_publisher = '"+b.getBk_publisher()+"'";
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

    //도서 입고
    public int updateAmount(Book b){
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        int result = 0;
        try{
            conn = DriverManager.getConnection(url, user, pwd);
            conn.setAutoCommit(false);

            stmt = conn.createStatement();

            String sql = "SELECT * FROM `tbl_book` WHERE bk_name = '" + b.getBk_name() + "' AND bk_author = '" + b.getBk_author() + "'" ;

            rs = stmt.executeQuery(sql);

            if (rs.next()) {

                String sql2 = "UPDATE tbl_book SET bk_amount = ( bk_amount + '" + b.getBk_amount() + "')  " +
                        "WHERE bk_name = '" + b.getBk_name() + "' AND bk_author = '" + b.getBk_author() + "'";
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

    public int buy(Book b){
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        int result = 0;
        try{
            conn = DriverManager.getConnection(url, user, pwd);
            conn.setAutoCommit(false);

            stmt = conn.createStatement();

            String sql = "SELECT bk_amount FROM `tbl_book` WHERE bk_name = '" + b.getBk_name() + "' AND bk_author = '" + b.getBk_author() + "'" ;

            rs = stmt.executeQuery(sql);

            if (rs.next()) {

                System.out.println(b.getBk_amount());
                if (b.getBk_amount() >0) {
                    String sql2 = "UPDATE tbl_book SET bk_amount = ( bk_amount - '" + b.getBk_amount() + "')  " +
                            "WHERE bk_name = '" + b.getBk_name() + "' AND bk_author = '" + b.getBk_author() + "'";
                    result = stmt.executeUpdate(sql2);
                }else {
                    result = 0;
                }

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
