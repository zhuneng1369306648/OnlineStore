package com.store.bean;

import java.util.Date;

import com.store.bean.Users;


public class Goods implements java.io.Serializable {
	private	int number;		//
	private	String goodsname;		//
	private	String shop;		//
	private	Double  price;			//
	private	String shopinfo;	//
	private	String contentinfo;	//
	private	String category;		//
	private	int    inventory;		//
	private	int    sales;			//
	private	Date date;			//
	private	String keyword;		//
	private	String img1;			//
	private	String img2;			//
	private	String img3;			//
	private	int	   delsoft;		//
	private Users users;
	private int	status;
//number,goodsname,shop,price,shopinfo,contentinfo,category,inventory,sales,date,keyword,img1,img2,img3,delsoft,userid,status
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getGoodsname() {
		return goodsname;
	}
	public void setGoodsname(String goodsname) {
		this.goodsname = goodsname;
	}
	public String getShop() {
		return shop;
	}
	public void setShop(String shop) {
		this.shop = shop;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getShopinfo() {
		return shopinfo;
	}
	public void setShopinfo(String shopinfo) {
		this.shopinfo = shopinfo;
	}
	public String getContentinfo() {
		return contentinfo;
	}
	public void setContentinfo(String contentinfo) {
		this.contentinfo = contentinfo;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getInventory() {
		return inventory;
	}
	public void setInventory(int inventory) {
		this.inventory = inventory;
	}
	public int getSales() {
		return sales;
	}
	public void setSales(int sales) {
		this.sales = sales;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getKeyword() {
		return keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	public String getImg1() {
		return img1;
	}
	public void setImg1(String img1) {
		this.img1 = img1;
	}
	public String getImg2() {
		return img2;
	}
	public void setImg2(String img2) {
		this.img2 = img2;
	}
	public String getImg3() {
		return img3;
	}
	public void setImg3(String img3) {
		this.img3 = img3;
	}
	public int getDelsoft() {
		return delsoft;
	}
	public void setDelsoft(int delsoft) {
		this.delsoft = delsoft;
	}
	public Users getUsers() {
		// TODO Auto-generated method stub
		return users;
	}
	public void setUsers(Users users) {
		// TODO Auto-generated method stub
		this.users = users;
		
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
//	public Goods(String number,String goodsname,String shop,Double  price,String shopinfo,String contentinfo,String category,
//			int    inventory,int    sales,Date date,String keyword,String img1,String img2,String img3,int delsoft,Users users)
//	{
//		super();
//		this.number		=	number;			
//		this.goodsname	=	goodsname;
//		this.shop		=	shop;
//		this.price		=	price;
//		this.shopinfo	=	shopinfo;
//		this.contentinfo	=	contentinfo;
//		this.category	=	category;
//		this.inventory	=	inventory;
//		this.sales		=	sales;
//		this.date		=	date;
//		this.keyword	=	keyword;
//		this.img1		=	img1;
//		this.img2		=	img2;
//		this.img3		=	img3;
//		this.delsoft	=	delsoft;
//		this.users = users;
//		
//	}
//	 @Override
//	 public String toString() {
//		return "Goods [number=" + number + ", goodsname=" + goodsname + ", shop=" + shop
//				+ ", price=" + price + ", shopinfo=" + shopinfo + ", contentinfo=" + contentinfo
//				+ ", category=" + category + ", inventory=" + inventory + ", sales="
//				+ sales + ",date=" + date + ", keyword=" + keyword + ", img1="
//				+ img1 + ",img2=" + img2 + ", img3=" + img3 + ", delsoft="
//						+ delsoft +",users=" + users + "]";
//	 }



}
