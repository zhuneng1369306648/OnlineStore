package com.store.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.store.bean.*;
import com.store.util.DataMySQL;

public class ShoppingCart_Dao {
	
	/*	从购物车表中查找数据*/
	public List<Cart> Cart_Find(int id) {
		Connection con = DataMySQL.getConnection();
		String sql = "select * from Shoppingcart where id=? and delsoft=1";		//根据 用户id查找购物车表
		PreparedStatement pst = null;
		ResultSet rs = null ;	
		List<Cart> list   = new ArrayList<Cart>();						//Cart 型的list 存储查找到的所有 购物车数据
		//float total = 0;
		try {
		pst = con.prepareStatement(sql);
		pst.setInt(1, id);
		rs = pst.executeQuery();
		while(rs.next()) {
			Cart pu = null ;
			pu = new Cart();
			pu.setCartserial(rs.getInt("cartserial"));		//序号
			pu.setId(rs.getInt("id"));					//用户id
			pu.setNumber(rs.getInt("number"));			//商品编号
			pu.setGoodsname(rs.getString("goodsname")); 		//商品名字
			pu.setPrice(rs.getFloat("price")); 				//商品价格
			pu.setImg1(rs.getString("img1"));
			pu.setCount(rs.getInt("count"));				//商品数量	
			pu.setTotalprice(rs.getFloat("totalprice"));	//商品总价
			list.add(pu);
		}
			pst.close();
			con.close();
			}catch (Exception e) {
				e.printStackTrace();
			}
		return list;
	}
	
	public boolean Cart_Find1(int id, String number) {
		Connection con = DataMySQL.getConnection();
		boolean result = false;
		String sql = "select * from Shoppingcart where id='"+id+"' and number='"+number+"' and delsoft=1" ;		//根据 用户id查找购物车表
		PreparedStatement pst = null;
		ResultSet rs = null ;	
		try {
		pst = con.prepareStatement(sql);
		rs = pst.executeQuery();
		Cart c = new 	Cart();
		
		/*goods.setGoodsname(rs.getString("goodsname"));
		System.out.println(goods.getGoodsname());*/
		if(rs.next())
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
	
	/*	从购物车表中查找数据*/
	public Cart Cart_Find2(int cartserial) {
		Connection con = DataMySQL.getConnection();
		String sql = "select * from Shoppingcart where cartserial='"+cartserial+"'";		//根据 用户id查找购物车表
		PreparedStatement pst = null;
		ResultSet rs = null ;	
		Cart pu   = new Cart();					
		try {
		pst = con.prepareStatement(sql);
		rs = pst.executeQuery();
		if(rs.next()) {
			pu.setCartserial(rs.getInt("cartserial"));		//序号
			pu.setId(rs.getInt("id"));					//用户id
			pu.setNumber(rs.getInt("number"));			//商品编号
			pu.setGoodsname(rs.getString("goodsname")); 		//商品名字
			pu.setPrice(rs.getFloat("price")); 				//商品价格
			pu.setImg1(rs.getString("img1"));
			pu.setCount(rs.getInt("count"));				//商品数量	
			pu.setTotalprice(rs.getFloat("totalprice"));	//商品总价
		}
			pst.close();
			con.close();
			}catch (Exception e) {
				e.printStackTrace();
			}
		return pu;
	}
	
	/*	插入购物车数据	*/
	public void Cart_Insert(int id, String number, int count) {
		Connection con = DataMySQL.getConnection();
		String sql = "select * from goods where number=?";		//从表中查找商品数据
		PreparedStatement pst = null;
		PreparedStatement pstt = null;
		ResultSet rs = null ;
		Goods pu = null ;
		double total = 0;
		try {
		pst = con.prepareStatement(sql);
		pst.setString(1, number);
		rs = pst.executeQuery();
		if (rs.next()) {
			pu = new Goods();
			pu.setGoodsname(rs.getString("goodsname"));		//商品名
			pu.setPrice(rs.getDouble("price"));				//价格
			pu.setImg1(rs.getString("img1"));				//图片
			Double price = pu.getPrice();
			total = price*count;							//总价
		}		
		String sqll = "insert into shoppingcart(id,number,goodsname,price,img1,count,totalprice) values(?,?,?,?,?,?,?)";
		pstt = con.prepareStatement(sqll);
		pstt.setInt(1,id);
		pstt.setString(2,number);
		pstt.setString(3,pu.getGoodsname());
		pstt.setDouble(4,pu.getPrice());
		pstt.setString(5,pu.getImg1());
		pstt.setInt(6,count);
		pstt.setDouble(7,total);
		pstt.executeUpdate();
			pst.close();
			pstt.close();
			con.close();
			}catch (Exception e) {
				e.printStackTrace();
			}
	}
	
	/*	从购物车表中删除数据*/
	public void Cart_Delete(int cartserial) {
		Connection con = DataMySQL.getConnection();
		String sql = "update shoppingcart set delsoft=0 where cartserial='"+cartserial+"'";		//根据 cartserial   软删除这条数据
		try {
			 Statement stmt=con.createStatement();//创建Statement对象
			stmt.executeUpdate(sql);//执行sql语句
			stmt = con.prepareStatement(sql);
			stmt.close();
			con.close();
			}catch (Exception e) {
				e.printStackTrace();
			}
	}
	
	public void cart_Update(String goodsname,int id, int count) {
		Connection con = DataMySQL.getConnection();
		String sql = "select * from goods where goodsname='"+goodsname+"'";		//从表中查找商品数据
		PreparedStatement pst = null;
		PreparedStatement pstt = null;
		ResultSet rs = null ;
		Goods pu = null ;
		double total = 0;
		try {
		pst = con.prepareStatement(sql);
		//pst.setString(1, number);
		rs = pst.executeQuery();
		if (rs.next()) {
			pu = new Goods();
			pu.setGoodsname(rs.getString("goodsname"));		//商品名
			pu.setPrice(rs.getDouble("price"));				//价格
			pu.setImg1(rs.getString("img1"));//图片
			pu.setNumber(rs.getInt("number"));
			Double price = pu.getPrice();
			int number = pu.getNumber();
			total = price*count;	//总价
		}
		String sqll = "update shoppingcart set count=?,totalprice=? where goodsname='"+goodsname+"' and id='"+id+"'";		//根据 cartserial   软删除这条数据
		PreparedStatement psttt = null; 
		psttt = con.prepareStatement(sqll);
		psttt.setInt(1, count);
		psttt.setDouble(2, total);
		psttt.executeUpdate();
		//Statement stmt=con.createStatement();//创建Statement对象
			//stmt.executeUpdate(sqll);//执行sql语句
			//stmt = con.prepareStatement(sql);
			con.close();
			}catch (Exception e) {
				e.printStackTrace();
			}
	}
	
	public void cart_Update1(String number, int count) {
		Connection con = DataMySQL.getConnection();
		String sql = "select * from shoppingcart where number='"+number+"' and delsoft=1";		//从购物车表中查找商品数据
		PreparedStatement pst = null;
		PreparedStatement pstt = null;
		ResultSet rs = null ;
		Cart pu = null ;
		float total = 0;
		int countt=0;
		try {
		pst = con.prepareStatement(sql);
		//pst.setString(1, number);
		rs = pst.executeQuery();
		if (rs.next()) {
			pu = new Cart();
			pu.setCount(rs.getInt("count"));
			pu.setPrice(rs.getFloat("price"));
			float price = pu.getPrice();
			int co = pu.getCount();
			countt = co +count; 
			total = price*countt;	//总价
		}
		String sqll = "update shoppingcart set count=?,totalprice=? where number='"+number+"' and delsoft=1";		//根据 cartserial   软删除这条数据
		PreparedStatement psttt = null; 
		psttt = con.prepareStatement(sqll);
		
		psttt.setInt(1, countt);
		psttt.setFloat(2, total);
		psttt.executeUpdate();
		//Statement stmt=con.createStatement();//创建Statement对象
			//stmt.executeUpdate(sqll);//执行sql语句
			//stmt = con.prepareStatement(sql);
			con.close();
			}catch (Exception e) {
				e.printStackTrace();
			}
	}
}

