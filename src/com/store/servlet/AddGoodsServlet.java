package com.store.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.store.bean.Goods;
import com.store.dao.FindGoods_Dao;
import com.store.dao.ShoppingCart_Dao;

/**
 * Servlet implementation class AddGoodsServlet
 * 把商品添加到购物车
 */
@WebServlet("/AddGoodsServlet")
public class AddGoodsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddGoodsServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());		
		/**
		 * 添加购物车
		 */
		request.setCharacterEncoding("UTF-8");
		String number=request.getParameter("param1");	//编号
		Integer Id	=	(Integer) request.getSession().getAttribute("Id");
		if(Id!=null) {
			int count  = 	1;//商品数量
			String qty = 	request.getParameter("qty");	
			if(	qty!=null) {
				count	=	Integer.parseInt(qty);
				
			}
			
				//用户id
			ShoppingCart_Dao	dao	=	new	ShoppingCart_Dao();
			System.out.println(number);
			System.out.println(count);
			//System.out.println(goods.getGoodsname());
			if(dao.Cart_Find1(Id, number)) {
				dao.cart_Update1(number, count);
			}else {
				dao.Cart_Insert(Id, number, count);
			}  
							//将商品数据插入购物车数据库
			request.getRequestDispatcher("/ShoppingCartServlet").forward(request, response);
		}else {
			request.getRequestDispatcher("/remainlogin.jsp").forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
