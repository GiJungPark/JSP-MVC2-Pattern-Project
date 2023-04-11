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


@WebServlet("/updateMemberForm.do")
public class UpdateMemberForm extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		MemberDAO rdao = new MemberDAO();
		try {
			MemberDTO memInfo = rdao.findMemberList(id);
			request.setAttribute("memInfo", memInfo);
			RequestDispatcher dispather = request.getRequestDispatcher("index.jsp?CONTENTPAGE=updateMember.jsp");
			dispather.forward(request, response);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		

		doGet(request, response);
	}

}
