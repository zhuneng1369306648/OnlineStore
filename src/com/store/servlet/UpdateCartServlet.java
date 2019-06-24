package com.store.servlet;
//更新购物车
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
 * Servlet implementation class UpdateCartServlet
 */
@WebServlet("/UpdateCartServlet")
public class UpdateCartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateCartServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		int id = (Integer) request.getSession().getAttribute("Id");
		String goodsname = request.getParameter("param1");
		int count = Integer.parseInt(request.getParameter("param2"));
		System.out.println(id);
		System.out.println(goodsname);
		System.out.println(count);
		ShoppingCart_Dao	dao	=	new	ShoppingCart_Dao();
		
		FindGoods_Dao d = new FindGoods_Dao();
		Goods goods = d.find_inventory(goodsname);
		if(count < goods.getInventory()) {
		dao.cart_Update(goodsname, id, count);
		request.getRequestDispatcher("/ShoppingCartServlet").forward(request, response);
		}else {
			request.getRequestDispatcher("/inverntory.jsp").forward(request, response);
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
