package com.store.servlet;
//所有用户和卖家和管理员信息
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.store.biz.UserBiz;
import com.store.biz.UserBizImpl;
import com.store.bean.Users;

@WebServlet("/findAllUser")
public class findAllUser extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		try {
		List<Users> list;
		String page = req.getParameter("page");
		System.out.println("页数为" + page);
		UserBiz userBiz = new UserBizImpl();
		int pages = userBiz.UserPages(5);
	
			if (page == null||Integer.valueOf(page)<=0||Integer.valueOf(page)>pages) {
				page = "1";
				list = userBiz.findAllUsers(Integer.valueOf(page), 5);
			} else {
				list = userBiz.findAllUsers(Integer.valueOf(page), 5);
			}
			req.setAttribute("list", list);
			req.setAttribute("page", pages);
			req.getRequestDispatcher("allUser.jsp?rowid=1").forward(req, resp);

		} catch (Exception e) {

			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
