package com.store.servlet;
//删除商品
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.store.util.DataMySQL;
import com.store.biz.GoodsBiz;
import com.store.biz.GoodsBizImpl;


@WebServlet("/DeleteGoods")
public class DeleteGoods extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String goodsid = req.getParameter("goodsid");
		GoodsBiz goodsbiz=new GoodsBizImpl();
		
		 try {
				if(goodsbiz.deleteGood(Integer.valueOf(goodsid))>0){
					req.getRequestDispatcher("deleteGoods.jsp").forward(req, resp);

				}else{
					resp.getWriter().print("删除失败");	
				}
		 } catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally{
				
			}

	}
}
