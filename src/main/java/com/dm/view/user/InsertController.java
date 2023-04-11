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

@WebServlet("/insert.do")
public class InsertController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String i = request.getParameter("memberid");
		String p = request.getParameter("password");
		String n = request.getParameter("name");
		String g = request.getParameter("gender");
		String ph = request.getParameter("phone");
		String e = request.getParameter("email");
		MemberDTO rd = new MemberDTO();
		rd.setMemberid(i);
		rd.setPassword(p);
		rd.setName(n);
		rd.setGender(g);
		rd.setPhone(ph);
		rd.setEmail(e);
		MemberDAO rt = new MemberDAO();
		
		try {
			rt.insertMember(rd);
		} catch (SQLException e1) {
			e1.printStackTrace();
			response.sendRedirect("error.jsp");
		}
		
		
		RequestDispatcher dispather = request.getRequestDispatcher("index.jsp");
		dispather.forward(request, response);
	}

}