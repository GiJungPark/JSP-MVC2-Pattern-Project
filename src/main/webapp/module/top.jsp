<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>



<div class="header">
	<h1 class="header_logo">
		<a href="/ByteBox/index.jsp">
			<img src="/ByteBox/img/logo2_WP.png" alt="main logo">
		</a>
	</h1>
	<nav class="header_user">
		<ul>
			<c:choose>
				<c:when test="${empty idKey}">
					<li id="login"><a href="/ByteBox/index.jsp?CONTENTPAGE=login.jsp"><img src="/ByteBox/img/padlock.png" alt="login icon"></a></li>
				</c:when>
				<c:otherwise>
					<li id="login"><form method="post" action="logout.do">
						<input type="hidden" name="checkValue" value="${checkValue}" />
						<input type="image" src="/ByteBox/img/padunlock.png" alt="login icon" width=30px, height=30px></form>
					</li>
				</c:otherwise>
			</c:choose> 
			<li id="userinfo"><a href="userForm.do?id=${idKey}"><img src="/ByteBox/img/profile-user.png" alt="userinfo icon"></a></li>
		</ul>
	</nav>
</div>

