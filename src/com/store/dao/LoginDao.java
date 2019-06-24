package com.store.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.store.bean.Users;
import com.store.util.DataMySQL;



/**
 * 
 * @shop Administrator
 */

public class LoginDao {
	public Users login1(int id){
		Connection con = DataMySQL.getConnection();
		String sql = "select * from user where id=?";
		PreparedStatement pst = null;
		ResultSet rs = null ;
		Users pu = null ;
		try {
		pst = con.prepareStatement(sql);
		pst.setInt(1, id);
		rs = pst.executeQuery();
		if (rs.next()) {
		pu = new Users();
		pu.setId(rs.getInt("id"));
		pu.setUsername(rs.getString("username"));
		pu.setPassword(rs.getString("password"));
		pu.setEmail(rs.getString("email"));
		pu.setRowid(rs.getInt("rowid"));
		pu.setStatus(rs.getInt("status"));
		}
	}catch (SQLException e) {
		e.printStackTrace();
	}finally{
		try {
			if(rs!=null) { 
				rs.close();
			}
			if(con!=null) {
				con.close ();
			}
		}catch (Exception e2) {
			e2.printStackTrace() ;
		}
	}
	return pu;
	}
	
	public Users login2(int id, String password){
		Connection con = DataMySQL.getConnection();
		String sql = "select * from user where id=? and password=?";
		PreparedStatement pst = null;
		ResultSet rs = null ;
		Users pu = null ;
		try {
		pst = con.prepareStatement(sql);
		pst.setInt(1, id);
		pst.setString(2, password);
		rs = pst.executeQuery();
		if (rs.next()) {
		pu = new Users();
		pu.setId(rs.getInt("id"));
		pu.setUsername(rs.getString("username"));
		pu.setPassword(rs.getString("password"));
		pu.setEmail(rs.getString("email"));
		pu.setRowid(rs.getInt("rowid"));
		pu.setStatus(rs.getInt("status"));
		}
	}catch (SQLException e) {
		e.printStackTrace();
	}finally{
		try {
			if(rs!=null) { 
				rs.close();
			}
			if(con!=null) {
				con.close ();
			}
		}catch (Exception e2) {
			e2.printStackTrace() ;
		}
	}
	return pu;
	}
}
