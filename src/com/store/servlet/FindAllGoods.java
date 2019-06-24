package com.store.servlet;
//展现所有商品
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.store.biz.GoodsBiz;
import com.store.biz.GoodsBizImpl;
import com.store.bean.Goods;
import com.store.bean.Users;

@WebServlet("/findAllGoods")
public  class FindAllGoods extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		try {
			GoodsBiz goodsBiz = new GoodsBizImpl();
			String page = req.getParameter("page");
			HttpSession session = req.getSession();
			int pages = goodsBiz.GoodsPages(9);
			Users users = (Users) session.getAttribute("user");
			List<Goods> list;
			if (page == null || Integer.valueOf(page) <= 0
					|| Integer.valueOf(page) > pages) {
				list = goodsBiz.findAllGoods(users.getId(), 1, 9);
			} else {
				list = goodsBiz.findAllGoods(users.getId(),
						Integer.valueOf(page), 9);
			}

			req.setAttribute("list", list);
			req.setAttribute("page", pages);
			req.getRequestDispatcher("GoodsManage.jsp").forward(req, resp);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
