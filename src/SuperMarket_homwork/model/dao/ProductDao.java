package com.gn.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.gn.model.vo.Member;
import com.gn.model.vo.Product;

public class ProductDao {
	public int insert(Product p) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int result = 0;
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			//경로와 아이디와 비밀번호는 보안상으로 지웁니다.
			conn = DriverManager.getConnection(url,id,pwd);
			conn.setAutoCommit(false);
			
			String sql1 = "SELECT COUNT(*) AS cnt FROM sm_product WHERE prod_name = ?";
			pstmt = conn.prepareStatement(sql1);
			System.out.println(p.getProduct_name());
			pstmt.setString(1,p.getProduct_name());
			rs = pstmt.executeQuery();
			if(rs.next()) {
				result = rs.getInt("cnt");
				//중복되는 아이디가 있는 경우 :-1
				//INSERT과정 중 오류가 발생한 경우 : 0
				//정상 INSERT : 1
			}
			if(result == 0) {
				String sql2 = "INSERT INTO sm_product(prod_name, prod_price, prod_amount)"
						+ " VALUES(?,?,?)";
				pstmt = conn.prepareStatement(sql2);
				pstmt.setString(1,p.getProduct_name());
				pstmt.setString(2, p.getProduct_price());
				pstmt.setInt(3,p.getProduct_amount());
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
	public int add(Product p) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int result = 0;
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			//경로와 아이디와 비밀번호는 보안상으로 지웁니다.
			conn = DriverManager.getConnection(url,id,pwd);
			conn.setAutoCommit(false);
			
			String sql1 = "SELECT COUNT(*) AS cnt FROM sm_product WHERE prod_no = ?";
			pstmt = conn.prepareStatement(sql1);
			pstmt.setInt(1,p.getProd_no());
			rs = pstmt.executeQuery();
			if(rs.next()) {
				result = rs.getInt("cnt");
				//중복되는 아이디가 있는 경우 :-1
				//INSERT과정 중 오류가 발생한 경우 : 0
				//정상 INSERT : 1
			}
			if(result == 1) {
				String sql2 = "UPDATE `sm_product` SET prod_amount = (? + prod_amount) WHERE prod_no = ?";
	
				pstmt = conn.prepareStatement(sql2);
				pstmt.setInt(1,p.getProduct_amount());
				pstmt.setInt(2, p.getProd_no());
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

	public List<Product> selectAll(){
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		List<Product> resultList = new ArrayList<Product>();
		
		try {
			Class.forName("org.mariadb.jdbc.Driver");
		//경로와 아이디와 비밀번호는 보안상으로 지웁니다.
			
			conn = DriverManager.getConnection(url, user, userPwd);
			
			stmt = conn.createStatement();
			String sql = "SELECT * FROM sm_product";
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				Product p = new Product(rs.getInt("prod_no"),
						rs.getString("prod_name"),
						rs.getInt("prod_amount"),
						rs.getString("prod_price")
						);
				resultList.add(p);
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
	//
	public int deleteProduct(Product p){
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int result = 0;
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			//경로와 아이디와 비밀번호는 보안상으로 지웁니다.
			conn = DriverManager.getConnection(url,id,pwd);
			conn.setAutoCommit(false);
			
			String sql1 = "SELECT (prod_amount - ?) AS cnt FROM sm_product WHERE prod_no = ?";
			pstmt = conn.prepareStatement(sql1);
			pstmt.setInt(1,p.getProduct_amount());
			pstmt.setInt(2,p.getProd_no());
			rs = pstmt.executeQuery();
			if(rs.next()) {
				result = rs.getInt("cnt");
				//중복되는 아이디가 있는 경우 :-1
				//INSERT과정 중 오류가 발생한 경우 : 0
				//정상 INSERT : 1
			}
			if(result > 0) {
				String sql2 = "UPDATE `sm_product` SET prod_amount = (prod_amount - ?) WHERE prod_no = ?";
				pstmt = conn.prepareStatement(sql2);
				pstmt.setInt(1,p.getProduct_amount());
				pstmt.setInt(2, p.getProd_no());
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
}
