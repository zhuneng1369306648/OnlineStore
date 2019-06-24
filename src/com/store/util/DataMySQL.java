package com.store.util;

/**
 * �������ݿ�����
 */

import java.sql.Connection;
import java.sql.DriverManager;

public class DataMySQL {
	private static String driver = "com.mysql.jdbc.Driver";
	private static String url  	 = "jdbc:mysql://localhost:3306/store?useUnicode=true&characterEncoding=utf-8&useSSL=false";
	private static String user	 = "root";
	private static String pwd	 = "root";
	public static Connection getConnection() {
		Connection con = null;
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url,user,pwd);
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		return con;
	}
}
