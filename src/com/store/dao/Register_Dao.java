package com.store.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.store.bean.Users;
import com.store.util.DataMySQL;

public class Register_Dao {
	public boolean judge(int id){
		Connection con = DataMySQL.getConnection();
		PreparedStatement pst = null;
		ResultSet rs = null;
		try{
		String sql ="select * from user where id = '"+id+"'";
		pst = con.prepareStatement(sql);
		rs = pst.executeQuery();
		if(rs.next()){
			return false;
		}
		}catch (Exception e) {
			e.printStackTrace();
			try {
				con.rollback();
			}catch(Exception sqlexp) {
				e.printStackTrace();
			}
		}
		return true;
	}
	public boolean insert(Users user) {
		Connection con = DataMySQL.getConnection();
		boolean  result = false;
		
		PreparedStatement pst = null;
		try {
			String sql = "insert into user(id,username,password,email,rowid,status) values(?,?,?,?,?,?)";
			pst = con.prepareStatement(sql);
			pst.setInt(1,user.getId());
			pst.setString(2,user.getUsername());
			pst.setString(3,user.getPassword());
			pst.setString(4,user.getEmail());
			pst.setInt(5,user.getRowid());
			pst.setInt(5,user.getStatus());
			if(pst.executeUpdate()>0)
			   result = true;
			else
				result = false;
			pst.close();
			con.close();
			}catch (Exception e) {
				e.printStackTrace();
			}
		return result;
		}
}
