<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<main>
	
	<div class="loginForm">
		<div class="login-wrapper">
			<h2>Login</h2>
			<form method="post" action="login.do">
				<input type="text" name="id" placeholder="ID" value="${checkValue}"> 
				<input type="password" name="pw" placeholder="Password"> 
				<input type="checkbox" name="check" value="check">아이디 저장하기
				<input type="submit" value="Login">
			</form>
			<ul>
				<li><a href="/ByteBox/index.jsp?CONTENTPAGE=search.jsp">ID / PW 찾기</a></li>
				<li><a href="/ByteBox/index.jsp?CONTENTPAGE=signup.jsp">회원가입</a></li>
			</ul>
		</div>
	</div>
</main>
