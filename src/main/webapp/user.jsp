<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!-- 로그인을 하지 않을 경우 로그인 요청, 관리자인 경우 관리자 페이지 이동, 회원인 경우 회원 페이지 이동-->
<c:choose>
	<c:when test="${empty idKey}">
		로그인 후, 이용하실수 있습니다.
	</c:when>
	<c:when test="${memInfo.memberid eq 'admin'}">
		<jsp:forward page = "list.do"/>
	</c:when>
	<c:otherwise>
		<h1>${memInfo.name}님 어서오세요</h1>
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
					<td align="center"><b>[비밀번호 수정]</b></td>
				</tr> 
			</table>
			<table width="700" height="300" cellpadding="0"
				style="border-collapse: collapse; font-size: 9pt;">
				<tr class="register" height="30">
					<td width="5%" align="center">*</td>
					<td width="15%">회원 ID</td>
					<td><input type="text" name="memberid" value="${memInfo.memberid}" readonly/></td>
				</tr>
				<tr height="3">
					<td colspan="3"><hr /></td>
				</tr>
				<tr class="register" height="30">
					<td width="5%" align="center">*</td>
					<td width="15%">현재 비밀번호</td>
					<td><input type="password" name="password" /></td>
				<tr height="3">
					<td colspan="3"><hr /></td>
				</tr>
				<tr class="register" height="30">
					<td width="5%" align="center">*</td>
					<td width="15%">바꿀 비밀번호</td>
					<td><input type="password" name="newpassword" /></td>
				</tr>
				<tr height="3">
					<td colspan="3"><hr /></td>
				</tr>
				<tr class="register" height="30">
					<td width="5%" align="center">*</td>
					<td width="15%">바꿀 비밀번호 확인</td>
					<td><input type="password" name="newpasswordCheck" /></td>
				</tr>
			</table>
			<br />
			<table>
				<tr height="40">
					<td><input width="120" type="submit" value="제출" formaction="userPassword.do" /></td>
				</tr>
			</table>
		</form>
		<form method="post">
			<table style="width: 800px;">

				<tr height="40">
					<td align="center"><b>[이메일 수정]</b></td>
				</tr> 
			</table>
			<table width="700" height="300" cellpadding="0"
				style="border-collapse: collapse; font-size: 9pt;">
				<tr class="register" height="30">
					<td width="5%" align="center">*</td>
					<td width="15%">회원 ID</td>
					<td><input type="text" name="memberid" value="${memInfo.memberid}" readonly/></td>
				</tr>
				<tr height="3">
					<td colspan="3"><hr /></td>
				</tr>
				<tr class="register" height="30">
					<td width="5%" align="center">*</td>
					<td width="15%">현재 이메일</td>
					<td><input type="text" name="email" /></td>
				<tr height="3">
					<td colspan="3"><hr /></td>
				</tr>
				<tr class="register" height="30">
					<td width="5%" align="center">*</td>
					<td width="15%">바꿀 이메일</td>
					<td><input type="text" name="newemail" /></td>
				</tr>
			</table>
			<br />
			<table>
				<tr height="40">
					<td><input width="120" type="submit" value="제출" formaction="userEmail.do" /></td>
				</tr>
			</table>
		</form>
	</c:otherwise>
</c:choose> 


