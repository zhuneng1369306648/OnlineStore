package com.store.servlet;
//我要把你的账号删了，哈哈
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.store.biz.UserBiz;
import com.store.biz.UserBizImpl;
import com.store.util.DataMySQL;

@WebServlet("/deleteUser")
public class deleteUser extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException { 	
	          String userid=req.getParameter("userid");
                  UserBiz userBiz=new UserBizImpl();
                  try {
					if(userBiz.deleteByIdUsers(Integer.valueOf(userid))>0){
					     req.getRequestDispatcher("admin_index.jsp").forward(req, resp);
					}else{
						
					}
				
                  } catch (NumberFormatException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}finally{
				}

	}
}
