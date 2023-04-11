<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<c:set var="checkedId" value=""/>
<c:choose>
	<c:when test="${empty idKey}">
		<c:set var="checkedId" value=""/>
	</c:when>
	<c:when test="${not empty idKey}">
		<c:set var="checkedId" value="${idKey}"/>
	</c:when>
</c:choose>

<main>
	<!-- 아이디 체크 알림 -->
 	<script src="//code.jquery.com/jquery-3.6.0.min.js"></script>
	<c:if test="${not empty msg}">
		<script>
        $(function() {
        	alert("${msg}");
        });
    	</script>
	</c:if>
	<div id="signup">
		<form method="post">
			<table style="width: 800px;">

				<tr height="40">
					<td align="center"><b>[회원가입]</b></td>
				</tr> 
			</table>
			<table width="700" height="400" cellpadding="0"
				style="border-collapse: collapse; font-size: 9pt;">
				<tr class="register" height="30">
					<td width="5%" align="center">*</td>
					<td width="15%">회원 ID</td>
					<td><input type="text" name="memberid" value="${idKey}" /></td>
					<!-- 아이디 중복체크 -->
					<td><input width="120" type="submit" value="아이디 중복 체크" formaction="idCheck.do" />
					</td>
				</tr>
				<tr height="3">
					<td colspan="3"><hr /></td>
				</tr>
				<tr class="register" height="30">
					<td width="5%" align="center">*</td>
					<td width="15%">비밀번호</td>
					<td><input type="password" name="password" /></td>
				<tr height="3">
					<td colspan="3"><hr /></td>
				</tr>
				<tr class="register" height="30">
					<td width="5%" align="center">*</td>
					<td width="15%">이 름</td>
					<td><input type="text" name="name" /></td>
				</tr>
				<tr height="3">
					<td colspan="3"><hr /></td>
				</tr>
				<tr class="register" height="30">
					<td width="5%" align="center">*</td>
					<td width="15%">성 별</td>
					<td><input type="radio" name="gender" value="men" checked>남성
						<input type="radio" name="gender" value="woman">여성</td>
				</tr>
				<tr height="3">
					<td colspan="3"><hr /></td>
				</tr>
				<tr class="register" height="30">
					<td width="5%" align="center">*</td>
					<td width="15%">휴대전화</td>
					<td><input type="text" name="phone" /></td>
				</tr>
				<tr height="3">
					<td colspan="3"><hr /></td>
				</tr>
				<tr class="register" height="30">
					<td width="5%" align="center">*</td>
					<td width="15%">이메일</td>
					<td><input type="text" name="email" /></td>
				</tr>
			</table>
			<br />
			<table>
				<tr height="40">
					<td><input width="120" type="submit" value="제출" formaction="insert.do" /></td>
				</tr>
			</table>
		</form>
	</div>
</main>