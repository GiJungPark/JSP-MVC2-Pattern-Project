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

@WebServlet("/searchId.do")
public class SearchId extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.getWriter().append("Served at: ").append(request.getContextPath());
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		MemberDAO rdao = new MemberDAO();
		try {
			MemberDTO memInfo = rdao.findId(email, phone);
			if(email.equals(memInfo.getEmail())) {
				request.setAttribute("msg", "아이디는"+memInfo.getMemberid()+"입니다.");
			} else {
				request.setAttribute("msg", "이메일, 핸드폰번호를 확인해 주세요.");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		RequestDispatcher dispather = request.getRequestDispatcher("index.jsp?CONTENTPAGE=search.jsp");
		dispather.forward(request, response);
	}

}
