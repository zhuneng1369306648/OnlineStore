package com.store.servlet;
//查找商品
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.store.bean.Goods;
import com.store.bean.Cart;
import com.store.bean.Users;
import com.store.dao.FindGoods_Dao;
import com.store.dao.LoginDao;
import com.store.dao.ShoppingCart_Dao;

import javafx.css.ParsedValue;

/**
 * Servlet implementation class SearchGoodsServlet
 */
@WebServlet("/SearchGoodsServlet")
public class SearchGoodsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchGoodsServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		response.setContentType("text/html;charset=utf-8");
		response.setCharacterEncoding("utf-8");
		//int Id	=	(int)request.getSession().getAttribute("Id");
		//int Id = (int)(request.getSession().getAttribute("Id"));
		String massage = request.getParameter("massage");		//类别
		String search = request.getParameter("search");			//搜索内容
		FindGoods_Dao dao = new FindGoods_Dao();
		//购物车商品详情数据
		List<Cart>	Cart = new ArrayList<Cart>(); 
		ShoppingCart_Dao dao3 = new ShoppingCart_Dao();
		//Cart 	= 	dao3.Cart_Find(Id);
		request.setAttribute("Cart", Cart);	
		
		List<Goods> goods = new ArrayList<Goods> ();
		List<Goods> Rgoods =  dao.find_RecommendGoods() ;		//查询今日推荐 
		if(massage.equals("按物品名")) {
			
			goods =  dao.find_Goods(search) ;		//搜索成功
			request.setAttribute("Rgoods", Rgoods);
			request.setAttribute("Agoods", goods);
			request.getRequestDispatcher("/shop_grid_full_width.jsp").forward(request, response);
			
		}
		else if(massage.equals("按店铺")) {
			
			goods =  dao.find_Shop(search) ;		//搜索成功
			request.setAttribute("Rgoods", Rgoods);
			request.setAttribute("Agoods", goods);
			request.getRequestDispatcher("/shop_grid_full_width.jsp").forward(request, response);
		}
		else if(massage.equals("按类别")) {
			
			goods =  dao.find_Category(search) ;		//搜索成功
			request.setAttribute("Rgoods", Rgoods);
			request.setAttribute("Agoods", goods);
			request.getRequestDispatcher("/shop_grid_full_width.jsp").forward(request, response);
		}
		else if(massage.equals("销量排行榜")){
			//按销量排序
			goods =  dao.find_HotGoods() ;		
			request.setAttribute("Rgoods", Rgoods);
			request.setAttribute("Agoods", goods);
			request.getRequestDispatcher("/shop_grid_full_width.jsp").forward(request, response);
		}
		else if(massage.equals("最新上架")){
			//按上架时间
			goods =  dao.find_NewGoods() ;		
			request.setAttribute("Rgoods", Rgoods);
			request.setAttribute("Agoods", goods);
			request.getRequestDispatcher("/shop_grid_full_width.jsp").forward(request, response);
		}
		else {
			// 404
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
