package com.dm.view.user;



import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dm.common.MemberDAO;

@WebServlet("/login.do")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String check = request.getParameter("check");
		
		MemberDAO mDao = new MemberDAO();
		boolean loginCheck = mDao.loginCheck(id, pw);
		
		//로그인 실패 페이지 전환의 문제 
		if(loginCheck) {
			HttpSession session = request.getSession();
			session.setAttribute("idKey", id);
			if("check".equals(check)) {
				session.setAttribute("checkValue", id);
			} else {
				session.removeAttribute("checkValue");
			}
			RequestDispatcher dispather = request.getRequestDispatcher("index.jsp");
			dispather.forward(request, response);
		} else {
			request.setAttribute("msg", "아이디,비밀번호를 확인해주세요.");
			RequestDispatcher dispather = request.getRequestDispatcher("index.jsp?CONTENTPAGE=login.jsp");
			dispather.forward(request, response);
		}
		
		
		
		
		/*
		try {
			if(mDao.login(id, pw) == 0) {
				request.setAttribute("loginResult", 1);
				HttpSession session = request.getSession();
				session.setAttribute("sessionID", id);
				RequestDispatcher dispather = request.getRequestDispatcher("index.jsp");
				dispather.forward(request, response);
				
			} else {
				request.setAttribute("loginResult", 0);
				RequestDispatcher dispather = request.getRequestDispatcher("login.jsp");
				dispather.forward(request, response);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ServletException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}	
		*/
	}
}
