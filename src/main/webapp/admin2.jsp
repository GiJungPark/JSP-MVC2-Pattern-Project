<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" href="css/style.css">
<title>BYTEBOX JSP Theater</title>
</head>
<body>
	<div id="wrap">
		<header>
			<jsp:include page="module/top.jsp" flush="false" />
		</header>
		<nav>
			<jsp:include page="module/navigator.jsp" flush="false" />
		</nav>
		<main>
			<div style="width: 100%; height: 500px; overflow: auto">
				<table width="95%" align="center">
					<tr>
						<td align="center">
							<table width="95%" align="center" border="1">
								<tr>
									<td align="center"><font>회원아이디</font></td>
									<td align="center"><font>비밀번호</font></td>
									<td align="center"><font>회원이름</font></td>
									<td align="center"><font>성별</font></td>
									<td align="center"><font>전화번호</font></td>
									<td align="center"><font>이메일</font></td>
									<td align="center"><font>수정</font></td>
									<td align="center"><font>삭제</font></td>
								</tr>
								
								<!-- 회원 리스트 출력, 회원이 없는 경우는 없다고 출력 -->
								<c:choose>
									<c:when test="${empty vlist}">
										등록된 회원이 없습니다.
									</c:when>
									<c:when test="${not empty vlist}">
										<c:forEach items="${vlist}" var="memberList">
											<tr>
												<td>${memberList.memberid}</td>
												<td>${memberList.password}</td>
												<td>${memberList.name}</td>
												<td>${memberList.gender}</td>
												<td>${memberList.phone}</td>
												<td>${memberList.email}</td>
												<td><a href="updateMemberForm.do?id=${memberList.memberid}">수정</a></td>
												<td><a href="deleteMember.do?id=${memberList.memberid}">삭제</a></td>
											</tr>
										</c:forEach>
									</c:when>
								</c:choose>
							</table>
						</td>
					</tr>
				</table>
			</div>
		</main>
		<footer>
			<jsp:include page="module/footer.jsp" flush="false" />
		</footer>
	</div>
</body>
</html>