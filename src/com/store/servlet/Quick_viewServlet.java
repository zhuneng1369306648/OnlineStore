package com.store.servlet;
//点击商品 快速看到商品信息
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.store.bean.Goods;
import com.store.dao.FindGoods_Dao;

/**
 * Servlet implementation class Quick_viewServlet
 */
@WebServlet("/Quick_viewServlet")
public class Quick_viewServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Quick_viewServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		String Name	=	request.getParameter("param1");
		FindGoods_Dao	dao	=	new	FindGoods_Dao();
		List<Goods> Agoods =  dao.find_Goods(Name) ;		//查询指定商品
		List<Goods> Rgoods =  dao.find_RecommendGoods() ;		//查询今日推荐 
		request.setAttribute("Agoods", Agoods);
		request.setAttribute("Rgoods", Rgoods);
		request.getRequestDispatcher("/quick_view.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
