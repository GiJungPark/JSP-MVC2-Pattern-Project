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

@WebServlet("/userEmail.do")
public class UserEmail extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String id = request.getParameter("memberid");
		String email = request.getParameter("email");
		String nemail = request.getParameter("newemail");
		
		MemberDAO rt = new MemberDAO();

		if (rt.checkEmail(id, email)) {
			rt.updateEmail(id, nemail);
			request.setAttribute("msg", "이메일이 변경 되었습니다.");
		} else {
			request.setAttribute("msg", "현재 이메일이 일치하지 않습니다.");
		}
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
