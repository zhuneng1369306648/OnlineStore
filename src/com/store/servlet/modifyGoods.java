package com.store.servlet;

import java.awt.Image;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;
import javax.swing.RepaintManager;
import javax.websocket.Session;

import com.store.biz.GoodsBiz;
import com.store.biz.GoodsBizImpl;
import com.store.dao.GoodsImpl;
import com.store.dao.PhotoDao;
import com.store.util.DataMySQL;
import com.store.bean.Goods;
import com.store.bean.Users;
//增加商品到数据库
@MultipartConfig
@WebServlet("/modifyGoods")
public class modifyGoods extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String number = req.getParameter("number");
		Goods goods = new Goods();
		GoodsBiz goodsBiz = new GoodsBizImpl();
		try {
			Goods goods2 = goodsBiz.findByIdGoods(Integer.valueOf(number));
			req.setAttribute("good", goods2);
			req.getRequestDispatcher("updateGood.jsp").forward(req, resp);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		String number = req.getParameter("number");
		String goodsname = req.getParameter("goodsname");
		String price = req.getParameter("price");
		String inventory = req.getParameter("inventory");
		String userid = req.getParameter("userid");
		String category = req.getParameter("category");
		String date = req.getParameter("date");
		String shop = req.getParameter("shop");
		String shopinfo = req.getParameter("shopinfo");
		String contentinfo = req.getParameter("contentinfo");
//		 List<String> list=new ArrayList<String>();
        //String filename=PhotoDao.getPhotoNewName();
       ServletContext servletContext=null;
       //servletContext=req.getSession().getServletContext();
       //数据库中存储格式:/webTest/imgs/***.jpg
      //第一步:获取页面上上传的图片资源


     //List<FileItem> items=PhotoDao.getRequsetFileItems(req,servletContext);
    
     Part part = req.getPart("file");
		//String filename = part.getHeader("content-disposition");// 获取包含文件名的信息

     String filename=PhotoDao.getPhotoNewName();
     servletContext=req.getSession().getServletContext();
		
		InputStream inputStream = part.getInputStream();
		String impath = req.getServletContext().getRealPath("/images/products/所有商品/"+filename);
		OutputStream outputStream = new FileOutputStream(impath);
		byte bar[] = new byte[1024];
		int l = 0;
		while ((l = inputStream.read(bar)) != -1) {
			outputStream.write(bar, 0, l);
			outputStream.flush();
		}
		outputStream.close();
		inputStream.close();

		          //存在数据库里面的照片路径是在项目里的相对路径
		         //req.getContextPath()+
		          String finalPhotoName= "images\\products\\所有商品\\"+filename;
		          
//				int bol=GoodsImpl.addGood();
//				if(bol>0) {
//	                 PrintWriter out=resp.getWriter();                                           
//	                  out.flush();                                                                    
//	                 out.print("<script>");                                                          
//	                  out.println("alert('添加商品信息成功！！！')"); 
//				}
        HttpSession session=req.getSession();
		Users users=(Users)session.getAttribute("user");
        Goods goods=new Goods();
        goods.setCategory(category);
        goods.setInventory(Integer.valueOf(inventory));
        goods.setNumber(Integer.valueOf(number));
        goods.setDate(new Date());
        goods.setImg1(finalPhotoName);
        goods.setGoodsname(goodsname);
        goods.setUsers(users);
        goods.setPrice(Double.valueOf(price));
        goods.setContentinfo(contentinfo);
        goods.setShopinfo(shopinfo);
        goods.setShop(shop);
        
	    GoodsBiz goodsBiz=new GoodsBizImpl();
	    try {
			if(goodsBiz.modifyGood(goods)>0){
			   resp.sendRedirect("findAllGoods");	
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

//goodsBiz.modifyGood(goods)>0