<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<script src="//code.jquery.com/jquery-3.6.0.min.js"></script>

<c:if test="${not empty msg}">
	<script>
		$(function() {
			alert("${msg}");
		});
	</script>
</c:if>
			
<form method="post">
	<table style="width: 800px; ">
		<tr height="40">
			<td align="center"><b>[아이디 찾기]</b></td>
		</tr> 
	</table>
	<table width="700" height="300" cellpadding="0"
		style="border-collapse: collapse; font-size: 9pt;">
		<tr class="register" height="30">
			<td width="5%" align="center">*</td>
			<td width="15%">가입한 이메일</td>
			<td><input type="text" name="email" /></td>
		</tr>
		<tr height="3">
			<td colspan="3"><hr /></td>
		</tr>
		<tr class="register" height="30">
			<td width="5%" align="center">*</td>
			<td width="15%">가입한 핸드폰 번호</td>
			<td><input type="text" name="phone" /></td>
		<tr height="3">
			<td colspan="3"><hr /></td>
		</tr>
	</table>
	<br />
	<table>
		<tr height="40">
			<td><input width="120" type="submit" value="제출" formaction="searchId.do" /></td>
		</tr>
	</table>
</form>

<form method="post">
	<table style="width: 800px; ">
		<tr height="40">
			<td align="center"><b>[비밀번호 찾기]</b></td>
		</tr> 
	</table>
	<table width="700" height="300" cellpadding="0"
		style="border-collapse: collapse; font-size: 9pt;">
		<tr class="register" height="30">
			<td width="5%" align="center">*</td>
			<td width="15%">아이디</td>
			<td><input type="text" name="id" /></td>
		</tr>
		<tr height="3">
			<td colspan="3"><hr /></td>
		</tr>
		<tr class="register" height="30">
			<td width="5%" align="center">*</td>
			<td width="15%">가입한 핸드폰 번호</td>
			<td><input type="text" name="phone" /></td>
		<tr height="3">
			<td colspan="3"><hr /></td>
		</tr>
	</table>
	<br />
	<table>
		<tr height="40">
			<td><input width="120" type="submit" value="제출" formaction="searchPwd.do" /></td>
		</tr>
	</table>
</form>
</body>
</html>