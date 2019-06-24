package com.store.servlet;
//查看具体商品信息页面
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
import com.store.bean.Review;
import com.store.dao.FindGoods_Dao;
import com.store.dao.Review_Dao;
import com.store.dao.ShoppingCart_Dao;

/**
 * Servlet implementation class Single_productServlet
 */
@WebServlet("/Single_productServlet")
public class Single_productServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Single_productServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//int Id	=	(Integer) request.getSession().getAttribute("Id");
		String Name	=	request.getParameter("param1");
		
		FindGoods_Dao	dao	=	new	FindGoods_Dao();
		List<Goods> Agoods =  dao.find_Goods(Name) ;			//查询指定商品
		List<Goods> Rgoods =  dao.find_RecommendGoods() ;		//查询今日推荐 
		
		Review_Dao 		dao2 = 	new Review_Dao();
		List<Review> Review	=	dao2.select(Name);
		
		//购物车商品详情数据
		List<Cart>	Cart = new ArrayList<Cart>(); 
		ShoppingCart_Dao dao3 = new ShoppingCart_Dao();
		//Cart 	= 	dao3.Cart_Find(Id);
		
		request.setAttribute("Cart", Cart);				
		request.setAttribute("Review", Review);
		request.setAttribute("Agoods", Agoods);
		request.setAttribute("Rgoods", Rgoods);
		request.getRequestDispatcher("/single_product.jsp").forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
