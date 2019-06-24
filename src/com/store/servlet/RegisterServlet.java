package com.store.servlet;
//重新登录
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.store.bean.Users;
import com.store.dao.Register_Dao;



/**
 * Servlet implementation class RegisterServlet
 */
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		String username = request.getParameter("username");
		String password 		= request.getParameter("password");
		int id 		= Integer.parseInt(request.getParameter("id"));
		String email 		= request.getParameter("email");
		int rowid 	= Integer.parseInt(request.getParameter("rowid"));
		int status 	= Integer.parseInt(request.getParameter("status"));
		Users pu = new Users();
		pu.setId(Integer.valueOf(id));
		pu.setUsername(username);
		pu.setPassword(password);
		pu.setEmail(email);
		pu.setRowid(Integer.valueOf(rowid));
		pu.setStatus(Integer.valueOf(status));
		Register_Dao dao = new Register_Dao();

		if(dao.judge(id)){
			if(dao.insert(pu)){
				//注册成功
				request.getRequestDispatcher("account_page.jsp").forward(request, response);
				}
			else
			{
				request.getRequestDispatcher("fail.jsp").forward(request, response);
			}
		}else{
			request.getRequestDispatcher("resist.jsp").forward(request, response);
			
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
