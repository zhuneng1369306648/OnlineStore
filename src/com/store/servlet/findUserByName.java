package com.store.servlet;
//用用户名查找用户
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.store.util.DataMySQL;
import com.store.biz.UserBiz;
import com.store.biz.UserBizImpl;
import com.store.bean.Users;

@WebServlet("/findUserByName")
public class findUserByName extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String username = req.getParameter("username");
		System.out.println(username);
		UserBiz userBiz = new UserBizImpl();
		try {
			List<Users> list = userBiz.finByNameUsers(username);
			if(list.size()!=0){
			req.setAttribute("list", list);
			req.getRequestDispatcher("deleteUser.jsp?rowid=1").forward(req, resp);
			}else{
				 req.setAttribute("findError", "没有该用户");
				req.getRequestDispatcher("deleteUser.jsp?rowid=1").forward(req, resp);

			}
	} catch (Exception e) {
			e.printStackTrace();
		}finally{
		}
	}
}
