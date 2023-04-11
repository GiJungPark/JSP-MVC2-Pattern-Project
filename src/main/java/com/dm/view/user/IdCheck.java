package com.dm.view.user;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dm.common.MemberDAO;

@WebServlet("/idCheck.do")
public class IdCheck extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String id = request.getParameter("memberid");
		
		MemberDAO mDao = new MemberDAO();
		boolean idCheck = mDao.checkId(id);
		
		//아이디가 존재 하는지 확인한다. 만약, 아이디칸이 비어있다면 아이디 칸이 비어있다고 알림
		if(idCheck) {
			request.setAttribute("idKey", "");
			request.setAttribute("msg", "사용중인 아이디입니다.");
		} else {
			if("".equals(id)){
				request.setAttribute("msg", "아이디 칸이 비어있습니다.");
			} else {
				request.setAttribute("idKey", id);
				request.setAttribute("msg", "사용가능한 아이디입니다.");
			}
		}
		RequestDispatcher dispather = request.getRequestDispatcher("index.jsp?CONTENTPAGE=signup.jsp");
		dispather.forward(request, response);
		
	}
}
