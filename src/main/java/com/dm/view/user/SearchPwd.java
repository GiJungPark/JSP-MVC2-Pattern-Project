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


@WebServlet("/searchPwd.do")
public class SearchPwd extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		String phone = request.getParameter("phone");
		MemberDAO rdao = new MemberDAO();
		try {
			MemberDTO memInfo = rdao.findPwd(id, phone);
			if(id.equals(memInfo.getMemberid())) {
				request.setAttribute("msg", "비밀번호는"+memInfo.getPassword()+"입니다.");
			} else {
				request.setAttribute("msg", "아이디, 핸드폰번호를 확인해 주세요.");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		RequestDispatcher dispather = request.getRequestDispatcher("index.jsp?CONTENTPAGE=search.jsp");
		dispather.forward(request, response);
	}

}
