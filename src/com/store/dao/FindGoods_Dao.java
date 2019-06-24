package com.store.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.store.bean.Goods;
import com.store.util.DataMySQL;

/**
 * 查找数据库商品数据
 * @shop Administrator
 *
 */
public class FindGoods_Dao {
	/*	模糊查找某商品	*/
	public List<Goods> find_Goods(String goodsname){
		Connection con = DataMySQL.getConnection();
		String sql = "select * from goods where goodsname like '%"+goodsname+"%' ";
		PreparedStatement pst = null;
		ResultSet rs 	= null ;
		List<Goods> list   = new ArrayList<Goods>(); ;
		try {
		pst = con.prepareStatement(sql);
		rs = pst.executeQuery();
		while(rs.next()) {
			Goods 	pu	=	new	Goods();
			pu.setNumber(rs.getInt("number"));
			pu.setGoodsname(rs.getString("goodsname"));
			pu.setShop(rs.getString("shop"));
			pu.setPrice(rs.getDouble("price"));
			pu.setShopinfo(rs.getString("shopinfo"));
			pu.setContentinfo(rs.getString("contentinfo"));
			pu.setCategory(rs.getString("category"));
			pu.setInventory(rs.getInt("inventory"));
			pu.setSales(rs.getInt("sales"));
			pu.setDate(rs.getDate("date"));
			pu.setKeyword(rs.getString("keyword"));
			pu.setImg1(rs.getString("img1"));
			pu.setImg2(rs.getString("img2"));
			pu.setImg3(rs.getString("img3"));
			pu.setDelsoft(rs.getInt("delsoft"));
			list.add(pu);
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
	return list;
	}
	
	/*	模糊查找某店铺	*/
	public List<Goods> find_Shop(String shop){
		Connection con = DataMySQL.getConnection();
		String sql = "select * from goods where shop like '%"+shop+"%' ";
		PreparedStatement pst = null;
		ResultSet rs 	= null ;
		List<Goods> list   = new ArrayList<Goods>(); ;
		try {
		pst = con.prepareStatement(sql);
		rs = pst.executeQuery();
		while(rs.next()) {
			Goods 	pu	=	new	Goods();
			pu.setNumber(rs.getInt("number"));
			pu.setGoodsname(rs.getString("goodsname"));
			pu.setShop(rs.getString("shop"));
			pu.setPrice(rs.getDouble("price"));
			pu.setShopinfo(rs.getString("shopinfo"));
			pu.setContentinfo(rs.getString("contentinfo"));
			pu.setCategory(rs.getString("category"));
			pu.setInventory(rs.getInt("inventory"));
			pu.setSales(rs.getInt("sales"));
			pu.setDate(rs.getDate("date"));
			pu.setKeyword(rs.getString("keyword"));
			pu.setImg1(rs.getString("img1"));
			pu.setImg2(rs.getString("img2"));
			pu.setImg3(rs.getString("img3"));
			pu.setDelsoft(rs.getInt("delsoft"));
			list.add(pu);
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
	return list;
	}
	
	/*	模糊查找某类别	*/
	public List<Goods> find_Category(String Category){
		Connection con = DataMySQL.getConnection();
		String sql = "select * from goods where category like '%"+Category+"%' ";
		PreparedStatement pst = null;
		ResultSet rs 	= null ;
		List<Goods> list   = new ArrayList<Goods>(); 
		try {
		pst = con.prepareStatement(sql);
		rs = pst.executeQuery();
		while(rs.next()) {
			Goods 	pu	=	new	Goods();
			pu.setNumber(rs.getInt("number"));
			pu.setGoodsname(rs.getString("goodsname"));
			pu.setShop(rs.getString("shop"));
			pu.setPrice(rs.getDouble("price"));
			pu.setShopinfo(rs.getString("shopinfo"));
			pu.setContentinfo(rs.getString("contentinfo"));
			pu.setCategory(rs.getString("category"));
			pu.setInventory(rs.getInt("inventory"));
			pu.setSales(rs.getInt("sales"));
			pu.setDate(rs.getDate("date"));
			pu.setKeyword(rs.getString("keyword"));
			pu.setImg1(rs.getString("img1"));
			pu.setImg2(rs.getString("img2"));
			pu.setImg3(rs.getString("img3"));
			pu.setDelsoft(rs.getInt("delsoft"));
			list.add(pu);
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
	return list;
	}
	
	/*	根据商品序列号查找某商品	*/
	public Goods find_SomeGoods(String number){
		Connection con = DataMySQL.getConnection();
		String sql = "select * from goods where number = '"+number+"' ";
		PreparedStatement pst = null;
		ResultSet rs 	= null ;
		Goods 	pu	=	new	Goods();
		try {
		pst = con.prepareStatement(sql);
		rs = pst.executeQuery();
		if(rs.next()) {
			pu.setNumber(rs.getInt("number"));
			pu.setGoodsname(rs.getString("goodsname"));
			pu.setShop(rs.getString("shop"));
			pu.setPrice(rs.getDouble("price"));
			pu.setShopinfo(rs.getString("shopinfo"));
			pu.setContentinfo(rs.getString("contentinfo"));
			pu.setCategory(rs.getString("category"));
			pu.setInventory(rs.getInt("inventory"));
			pu.setSales(rs.getInt("sales"));
			pu.setDate(rs.getDate("date"));
			pu.setKeyword(rs.getString("keyword"));
			pu.setImg1(rs.getString("img1"));
			pu.setImg2(rs.getString("img2"));
			pu.setImg3(rs.getString("img3"));
			pu.setDelsoft(rs.getInt("delsoft"));
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
	
	/*	根据商品名查找某商品	*/
	public Goods find_inventory(String goodsname){
		Connection con = DataMySQL.getConnection();
		String sql = "select * from goods where goodsname = '"+goodsname+"' ";
		PreparedStatement pst = null;
		ResultSet rs 	= null ;
		Goods 	pu	=	new	Goods();
		try {
		pst = con.prepareStatement(sql);
		rs = pst.executeQuery();
		if(rs.next()) {
			pu.setInventory(rs.getInt("inventory"));
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
	
	/*	查询 销售排行榜 	*/
	public List<Goods> find_HotGoods(){
		Connection con = DataMySQL.getConnection();
		String sql = "select * from goods order by sales DESC";
		PreparedStatement pst = null;
		ResultSet rs 	= null ;
		List<Goods> list   = new ArrayList<Goods>(); ;
		try {
		pst = con.prepareStatement(sql);
		rs = pst.executeQuery();
		while(rs.next()) {
		Goods 	pu	=	new	Goods();
		pu.setNumber(rs.getInt("number"));
		pu.setGoodsname(rs.getString("goodsname"));
		pu.setShop(rs.getString("shop"));
		pu.setPrice(rs.getDouble("price"));
		pu.setShopinfo(rs.getString("shopinfo"));
		pu.setContentinfo(rs.getString("contentinfo"));
		pu.setCategory(rs.getString("category"));
		pu.setInventory(rs.getInt("inventory"));
		pu.setSales(rs.getInt("sales"));
		pu.setDate(rs.getDate("date"));
		pu.setKeyword(rs.getString("keyword"));
		pu.setImg1(rs.getString("img1"));
		pu.setImg2(rs.getString("img2"));
		pu.setImg3(rs.getString("img3"));
		pu.setDelsoft(rs.getInt("delsoft"));
		list.add(pu);
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
	return list;
	}
		
	/*	查询 最新上架 	*/
	public List<Goods> find_NewGoods(){
		Connection con = DataMySQL.getConnection();
		String sql = "select * from goods order by date DESC";
		PreparedStatement pst = null;
		ResultSet rs 	= null ;
		List<Goods> list   = new ArrayList<Goods>(); ;
		try {
		pst = con.prepareStatement(sql);
		rs = pst.executeQuery();
		while(rs.next()) {
		Goods 	pu	=	new	Goods();
		pu.setNumber(rs.getInt("number"));
		pu.setGoodsname(rs.getString("goodsname"));
		pu.setShop(rs.getString("shop"));
		pu.setPrice(rs.getDouble("price"));
		pu.setShopinfo(rs.getString("shopinfo"));
		pu.setContentinfo(rs.getString("contentinfo"));
		pu.setCategory(rs.getString("category"));
		pu.setInventory(rs.getInt("inventory"));
		pu.setSales(rs.getInt("sales"));
		pu.setDate(rs.getDate("date"));
		pu.setKeyword(rs.getString("keyword"));
		pu.setImg1(rs.getString("img1"));
		pu.setImg2(rs.getString("img2"));
		pu.setImg3(rs.getString("img3"));
		pu.setDelsoft(rs.getInt("delsoft"));
		list.add(pu);
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
	return list;
	}
		
	/*	查询今日推荐商品 	*/
	public List<Goods> find_RecommendGoods(){
		Connection con = DataMySQL.getConnection();
		String sql = "select * from goods where keyword='今日推荐'";
		PreparedStatement pst = null;
		ResultSet rs 	= null ;
		List<Goods> list   = new ArrayList<Goods>(); ;
		try {
		pst = con.prepareStatement(sql);
		rs = pst.executeQuery();
		while(rs.next()) {
		Goods 	pu	=	new	Goods();
		pu.setNumber(rs.getInt("number"));
		pu.setGoodsname(rs.getString("goodsname"));
		pu.setShop(rs.getString("shop"));
		pu.setPrice(rs.getDouble("price"));
		pu.setShopinfo(rs.getString("shopinfo"));
		pu.setContentinfo(rs.getString("contentinfo"));
		pu.setCategory(rs.getString("category"));
		pu.setInventory(rs.getInt("inventory"));
		pu.setSales(rs.getInt("sales"));
		pu.setDate(rs.getDate("date"));
		pu.setKeyword(rs.getString("keyword"));
		pu.setImg1(rs.getString("img1"));
		pu.setImg2(rs.getString("img2"));
		pu.setImg3(rs.getString("img3"));
		pu.setDelsoft(rs.getInt("delsoft"));
		list.add(pu);
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
	return list;
	}
	
	/* 查询特色商品*/
	public List<Goods> find_CharacteristicGoods(){
		Connection con = DataMySQL.getConnection();
		String sql = "select * from goods where keyword='特色商品'";
		PreparedStatement pst = null;
		ResultSet rs 	= null ;
		List<Goods> list   = new ArrayList<Goods>(); ;
		try {
		pst = con.prepareStatement(sql);
		rs = pst.executeQuery();
		while(rs.next()) {
		Goods 	pu	=	new	Goods();
		pu.setNumber(rs.getInt("number"));
		pu.setGoodsname(rs.getString("goodsname"));
		pu.setShop(rs.getString("shop"));
		pu.setPrice(rs.getDouble("price"));
		pu.setShopinfo(rs.getString("shopinfo"));
		pu.setContentinfo(rs.getString("contentinfo"));
		pu.setCategory(rs.getString("category"));
		pu.setInventory(rs.getInt("inventory"));
		pu.setSales(rs.getInt("sales"));
		pu.setDate(rs.getDate("date"));
		pu.setKeyword(rs.getString("keyword"));
		pu.setImg1(rs.getString("img1"));
		pu.setImg2(rs.getString("img2"));
		pu.setImg3(rs.getString("img3"));
		pu.setDelsoft(rs.getInt("delsoft"));
		list.add(pu);
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
	return list;
	}
	
	/* 查询畅销商品*/
	public List<Goods> find_SellingGoods(){
		Connection con = DataMySQL.getConnection();
		String sql = "select * from goods where keyword='畅销商品'";
		PreparedStatement pst = null;
		ResultSet rs 	= null ;
		List<Goods> list   = new ArrayList<Goods>(); ;
		try {
		pst = con.prepareStatement(sql);
		rs = pst.executeQuery();
		while(rs.next()) {
		Goods 	pu	=	new	Goods();
		pu.setNumber(rs.getInt("number"));
		pu.setGoodsname(rs.getString("goodsname"));
		pu.setShop(rs.getString("shop"));
		pu.setPrice(rs.getDouble("price"));
		pu.setShopinfo(rs.getString("shopinfo"));
		pu.setContentinfo(rs.getString("contentinfo"));
		pu.setCategory(rs.getString("category"));
		pu.setInventory(rs.getInt("inventory"));
		pu.setSales(rs.getInt("sales"));
		pu.setDate(rs.getDate("date"));
		pu.setKeyword(rs.getString("keyword"));
		pu.setImg1(rs.getString("img1"));
		pu.setImg2(rs.getString("img2"));
		pu.setImg3(rs.getString("img3"));
		pu.setDelsoft(rs.getInt("delsoft"));
		list.add(pu);
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
	return list;
	}
	
	/* 查询今日热销*/
	public List<Goods> find_MostGoods(){
		Connection con = DataMySQL.getConnection();
		String sql = "select * from goods where keyword='今日热销'";
		PreparedStatement pst = null;
		ResultSet rs 	= null ;
		List<Goods> list   = new ArrayList<Goods>(); ;
		try {
		pst = con.prepareStatement(sql);
		rs = pst.executeQuery();
		while(rs.next()) {
		Goods 	pu	=	new	Goods();
		pu.setNumber(rs.getInt("number"));
		pu.setGoodsname(rs.getString("goodsname"));
		pu.setShop(rs.getString("shop"));
		pu.setPrice(rs.getDouble("price"));
		pu.setShopinfo(rs.getString("shopinfo"));
		pu.setContentinfo(rs.getString("contentinfo"));
		pu.setCategory(rs.getString("category"));
		pu.setInventory(rs.getInt("inventory"));
		pu.setSales(rs.getInt("sales"));
		pu.setDate(rs.getDate("date"));
		pu.setKeyword(rs.getString("keyword"));
		pu.setImg1(rs.getString("img1"));
		pu.setImg2(rs.getString("img2"));
		pu.setImg3(rs.getString("img3"));
		pu.setDelsoft(rs.getInt("delsoft"));
		list.add(pu);
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
	return list;
	}
	
	/* 查询 最受好评*/
	public List<Goods> find_PraisedGoods(){
		Connection con = DataMySQL.getConnection();
		String sql = "select * from goods where keyword='最受好评'";
		PreparedStatement pst = null;
		ResultSet rs 	= null ;
		List<Goods> list   = new ArrayList<Goods>(); ;
		try {
		pst = con.prepareStatement(sql);
		rs = pst.executeQuery();
		while(rs.next()) {
		Goods 	pu	=	new	Goods();
		pu.setNumber(rs.getInt("number"));
		pu.setGoodsname(rs.getString("goodsname"));
		pu.setShop(rs.getString("shop"));
		pu.setPrice(rs.getDouble("price"));
		pu.setShopinfo(rs.getString("shopinfo"));
		pu.setContentinfo(rs.getString("contentinfo"));
		pu.setCategory(rs.getString("category"));
		pu.setInventory(rs.getInt("inventory"));
		pu.setSales(rs.getInt("sales"));
		pu.setDate(rs.getDate("date"));
		pu.setKeyword(rs.getString("keyword"));
		pu.setImg1(rs.getString("img1"));
		pu.setImg2(rs.getString("img2"));
		pu.setImg3(rs.getString("img3"));
		pu.setDelsoft(rs.getInt("delsoft"));
		list.add(pu);
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
	return list;
	}
	
	/* 查询  即将售罄*/
	public List<Goods> find_OutsellGoods(){
		Connection con = DataMySQL.getConnection();
		String sql = "select * from goods where keyword='即将售罄'";
		PreparedStatement pst = null;
		ResultSet rs 	= null ;
		List<Goods> list   = new ArrayList<Goods>(); ;
		try {
		pst = con.prepareStatement(sql);
		rs = pst.executeQuery();
		while(rs.next()) {
		Goods 	pu	=	new	Goods();
		pu.setNumber(rs.getInt("number"));
		pu.setGoodsname(rs.getString("goodsname"));
		pu.setShop(rs.getString("shop"));
		pu.setPrice(rs.getDouble("price"));
		pu.setShopinfo(rs.getString("shopinfo"));
		pu.setContentinfo(rs.getString("contentinfo"));
		pu.setCategory(rs.getString("category"));
		pu.setInventory(rs.getInt("inventory"));
		pu.setSales(rs.getInt("sales"));
		pu.setDate(rs.getDate("date"));
		pu.setKeyword(rs.getString("keyword"));
		pu.setImg1(rs.getString("img1"));
		pu.setImg2(rs.getString("img2"));
		pu.setImg3(rs.getString("img3"));
		pu.setDelsoft(rs.getInt("delsoft"));
		list.add(pu);
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
	return list;
	}

	/*更新 商品数据	库存-count 销量+count*/
	public void	Updata_Goods(String goodsname,int count) {
		Connection con = DataMySQL.getConnection();

		String sql = "update goods set inventory=(inventory-'"+count+"') , sales=(sales+'"+count+"') where goodsname='"+goodsname+"'";		//根据 cartserial   软删除这条数据
		try {
			 Statement stmt=con.createStatement();//创建Statement对象
			stmt.executeUpdate(sql);//执行sql语句
			stmt = con.prepareStatement(sql);
			stmt.close();
			}catch (Exception e) {
				e.printStackTrace();
			}
	}
}

