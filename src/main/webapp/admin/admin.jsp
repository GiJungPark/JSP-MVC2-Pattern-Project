<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="UTF-8" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" href="../css/style.css">
<title>BYTEBOX JSP Theater</title>
</head>
<body>
	<div id="wrap">
		<header>
			<jsp:include page="../module/top.jsp" flush="false" />
		</header>
		<nav>
			<jsp:include page="../module/navigator.jsp" flush="false" />
		</nav>
		<main>
			<div align="right">
<form method="post" action="list.do">
	<input type="submit" value="조회하기">
</form>
				
			</div>
			<div style="width: 100%; height: 250px; overflow: auto">
				<table width="95%" align="center">
					<tr>
						<td align="center">
							<table width="95%" align="center" border="1">
								<tr>
									<td align="center"><font>회원이름</font></td>
									<td align="center"><font>회원아이디</font></td>
									<td align="center"><font>패스워드</font></td>
									<td align="center"><font>전화번호</font></td>
									<td align="center"><font>이메일</font></td>
									<td align="center"><font>수정</font></td>
									<td align="center"><font>삭제</font></td>
								</tr>
								
								<c:forEach items="${vlist}" var="memberList">
									<tr>
										<td>${memberList.memberid}</td>
										<td>${memberList.password}</td>
									</tr>
								</c:forEach>
							</table>
						</td>
					</tr>
				</table>
			</div>
		</main>
		<footer>
			<jsp:include page="../module/footer.jsp" flush="false" />
		</footer>
	</div>
</body>
</html>