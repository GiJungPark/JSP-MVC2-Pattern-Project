package com.dm.view.user;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dm.common.MemberDAO;
import com.dm.common.MemberDTO;

@WebServlet("/userPassword.do")
public class UserPassword extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.getWriter().append("Served at: ").append(request.getContextPath());
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String id = request.getParameter("memberid");
		String pwd = request.getParameter("password");
		String npwd = request.getParameter("newpassword");
		String npwdc = request.getParameter("newpasswordCheck");

		MemberDAO rt = new MemberDAO();

		if (rt.loginCheck(id, pwd)) {
			if (npwd.equals(npwdc)) {
				rt.updatePassword(id, npwd);
				RequestDispatcher dispather = request.getRequestDispatcher("index.jsp");
				dispather.forward(request, response);
			} else {
				request.setAttribute("msg", "새로운 비밀번호가 동일하지 않습니다.");
				try {
					MemberDTO memInfo = rt.findMemberList(id);
					request.setAttribute("memInfo", memInfo);
					RequestDispatcher dispather = request.getRequestDispatcher("index.jsp?CONTENTPAGE=user.jsp");
					dispather.forward(request, response);
				} catch (SQLException e) {
					e.printStackTrace();
				}
				
			}
		} else {
			request.setAttribute("msg", "현재 비밀번호가 일치하지 않습니다.");
			try {
				MemberDTO memInfo = rt.findMemberList(id);
				request.setAttribute("memInfo", memInfo);
				RequestDispatcher dispather = request.getRequestDispatcher("index.jsp?CONTENTPAGE=user.jsp");
				dispather.forward(request, response);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}

}
