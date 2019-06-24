package com.store.bean;

public class Cart {
	private int cartserial;
	private int  id;			
	private int 	number;	
	private String  goodsname;
	private float	price;
	private String  img1;
	private int 	count;			
	private float 	totalprice;
	private	String	keyword;
	public Cart(){
		
	}
	public Cart(int cartserial, int id, int number, String  goodsname,float price,String img1,int count, float totalprice,String	keyword) {
		super();
		this.cartserial = cartserial;
		this.id = id;
		this.number = number;
		this.goodsname = goodsname;
		this.price = price;
		this.img1  = img1;
		this.count = count;
		this.totalprice = totalprice;
		this.keyword	=	keyword;
	}
	public int getCartserial() {
		return cartserial;
	}
	public void setCartserial(int cartserial) {
		this.cartserial = cartserial;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
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
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getImg1() {
		return img1;
	}
	public void setImg1(String img1) {
		this.img1	=	img1;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public float getTotalprice() {
		return totalprice;
	}
	public void setTotalprice(float f) {
		this.totalprice = f;
	}
	public String getKeyword() {
		return keyword;
	}
	public void	setKeyword(String keyword) {
		this.keyword	=	keyword;
	}
}
