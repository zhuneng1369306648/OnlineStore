package com.store.servlet;
//登录并验证用户
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.store.bean.Goods;
import com.store.bean.Users;
import com.store.dao.FindGoods_Dao;
import com.store.dao.LoginDao;

/**
 * Servlet implementation class FindUserServlet
 */
@WebServlet("/FindUserServlet")
public class FindUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FindUserServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setCharacterEncoding("UTF-8");
		request.setCharacterEncoding("UTF-8");
		int id = Integer.parseInt(request.getParameter("id"));
		//String id=request.getParameter("id");
		//Integer usId=Integer.parseInt(id);
		//String username = request.getParameter("username");
		String password = request.getParameter("password");
		LoginDao dao = new LoginDao();
		if(dao.login2(id,password)!=null){
				request.getSession().setAttribute("Id",id);
				//request.setAttribute("Id", id);
				request.getRequestDispatcher("FindGoodsServlet").forward(request, response);
			}
				
			else {
				request.getRequestDispatcher("fail.jsp").forward(request, response);
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
