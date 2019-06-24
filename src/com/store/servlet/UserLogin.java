package com.store.servlet;
//管理员和店铺卖家登录
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.store.util.DataMySQL;
import com.store.biz.UserBiz;
import com.store.biz.UserBizImpl;
import com.store.dao.LoginDao;
import com.store.bean.Users;
@WebServlet("/UserLogin")
public class UserLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//Integer id = (Integer) request.getSession().getAttribute("Id");
		//String id = request.getParameter("id");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String rowid = request.getParameter("roletype");
		System.out.println(rowid);
		
		Users users = new Users();
		//users.setRowid(Integer.valueOf(id));
		users.setPassword(password);
		users.setUsername(username);
		users.setRowid(Integer.valueOf(rowid));
		UserBiz userBiz = new UserBizImpl();
		Users u2 = new Users();

		try {
			if ((u2 = userBiz.UserLogin(users)) != null) {

				if (users.getRowid() == u2.getRowid()) {
					 List<String> list=userBiz.findFunticon(u2.getRowid());
					switch (u2.getRowid()) {
//					case 2: //用户
//						//String id=request.getParameter("id");
//						//Integer usId=Integer.parseInt(id);
//						//LoginDao dao = new LoginDao();
//						HttpSession session = request.getSession();
//						session.setAttribute("Id", users.getId());//users.getId()
//				        session.setAttribute("user", u2);
//				        request.getRequestDispatcher("FindGoodsServlet").forward(request, response);
//						break;
						
						
						
								//request.getSession().setAttribute("Id",id);
								//request.setAttribute("Id", id);
								//request.getRequestDispatcher("FindGoodsServlet").forward(request, response);
						
						//HttpSession session = request.getSession();
						//session.setAttribute("username", users.getUsername());
				       // session.setAttribute("user", u2);
						//request.getRequestDispatcher("index.jsp")
								//.forward(request, response);
						
					case 1:  //管理员
						HttpSession session2 = request.getSession();
						session2.setAttribute("username", users.getUsername());
						session2.setAttribute("functionlist", list);
				        session2.setAttribute("user", u2);
						System.out.println(u2.getId());

						request.getRequestDispatcher("admin_index.jsp")
								.forward(request, response);
						break;
					case 3:  //卖家
						HttpSession session3 = request.getSession();
						session3.setAttribute("username", users.getUsername());
						session3.setAttribute("functionlist", list);
				        session3.setAttribute("user", u2);
						System.out.println(u2.getId());

						request.getRequestDispatcher("admin_index.jsp")
								.forward(request, response);
										
						break;
					}
				} else {
					request.setAttribute("loginError", "您的身份不属于这个组");
					request.getRequestDispatcher("login.jsp").forward(request,
							response);
				}
			} else {
				request.setAttribute("loginError", "用户名或密码错误");
				request.getRequestDispatcher("login.jsp").forward(request,
						response);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
		}
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
	         doPost(req, resp);
	}
}
