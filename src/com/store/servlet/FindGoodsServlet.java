package com.store.servlet;
//去找自己想要的商品
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

/**
 * Servlet implementation class FindGoodsServlet
 */
@WebServlet("/FindGoodsServlet")
public class FindGoodsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FindGoodsServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		Users		user = new Users();
		List<Cart>	Cart = new ArrayList<Cart>(); 
		LoginDao usr	=	new	LoginDao();
		FindGoods_Dao	dao	=	new	FindGoods_Dao();
		ShoppingCart_Dao dao2 = new ShoppingCart_Dao();
		//int Id	=	(Integer) request.getSession().getAttribute("Id");
		//通过用户id查询 购物车信息	
		//user	=	usr.login1(Id);	
		//Cart 	= 	dao2.Cart_Find(Id);
		List<Goods> Rgoods =  dao.find_RecommendGoods() ;		//查询今日推荐 商品
		List<Goods> Cgoods =  dao.find_CharacteristicGoods() ;	//查询特色商品
		List<Goods> Sgoods =  dao.find_SellingGoods() ;		//查询畅销商品
		List<Goods> Mgoods =  dao.find_MostGoods() ;			//查询今日热销商品
		List<Goods> Pgoods =  dao.find_PraisedGoods() ;		//查询最受好评 
		List<Goods> Ogoods =  dao.find_OutsellGoods() ;		//查询即将售罄 
		
		request.setAttribute("User", user);
		request.setAttribute("Cart", Cart);					//购物车商品详情数据
		request.setAttribute("Rgoods", Rgoods);
		request.setAttribute("Cgoods", Cgoods);
		request.setAttribute("Sgoods", Sgoods);
		request.setAttribute("Mgoods", Mgoods);
		request.setAttribute("Pgoods", Pgoods);
		request.setAttribute("Ogoods", Ogoods);
		request.getRequestDispatcher("/index.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
