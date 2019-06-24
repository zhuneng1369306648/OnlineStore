package com.store.bean;

import java.util.Date;

public class Review {		
	private String 	username;	
	private String 	goodsname;
	private String 	review;		
	private int 	rstore;		
	private int 	rquality;
	private int 	logistics;
	private Date time;
	public Review(){
	}

	public String getReview() {
		return review;
	}
	public void setReview(String review) {
		this.review = review;
	}
	public String getGoodsname() {
		return goodsname;
	}
	public void setGoodsname(String goodsname) {
		this.goodsname = goodsname;
	}
	public int getRstore() {
		return rstore;
	}
	public void setRstore(int rstore) {
		this.rstore = rstore;
	}
	public int getRquality() {
		return rquality;
	}
	public void setRquality(int rquality) {
		this.rquality = rquality;
	}
	public int getLogistics() {
		return logistics;
	}
	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setLogistics(int logistics) {
		this.logistics = logistics;
	}
	public Review( String username, String goodsname, String review, int rstore, int rquality, int logistics) {
		super();
		this.username = username;
		this.goodsname = goodsname;
		this.review = review;
		this.rstore = rstore;
		this.rquality = rquality;
		this.logistics = logistics;
	}
	
}
