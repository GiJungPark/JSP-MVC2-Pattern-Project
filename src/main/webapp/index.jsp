<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!-- 메인 페이지 모듈화 -->
<c:set var="contentPage" value="null"/>
<c:choose>
	<c:when test="${empty param.CONTENTPAGE}">
		<c:set var="contentPage" value="contents/main.jsp"/>
	</c:when>
	<c:otherwise>
		<c:set var="contentPage" value="${param.CONTENTPAGE}"/>
	</c:otherwise>
</c:choose>

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
			<jsp:include page="${contentPage}" flush="false" />
		</main>
		<footer>
			<jsp:include page="module/footer.jsp" flush="false" />
		</footer>
	</div>
</body>
</html>