<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<main>
	<div id="update">
		<form method="post">
			<table style="width: 800px;">

				<tr height="40">
					<td align="center"><b>[회원정보 수정]</b></td>
				</tr> 
			</table>
			<table width="700" height="400" cellpadding="0"
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
					<td width="15%">비밀번호</td>
					<td><input type="password" name="password" value="${memInfo.password}" /></td>
				<tr height="3">
					<td colspan="3"><hr /></td>
				</tr>
				<tr class="register" height="30">
					<td width="5%" align="center">*</td>
					<td width="15%">이 름</td>
					<td><input type="text" name="name" value="${memInfo.name}"/></td>
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
					<td><input type="text" name="phone" value="${memInfo.phone}"/></td>
				</tr>
				<tr height="3">
					<td colspan="3"><hr /></td>
				</tr>
				<tr class="register" height="30">
					<td width="5%" align="center">*</td>
					<td width="15%">이메일</td>
					<td><input type="text" name="email" value="${memInfo.email}"/></td>
				</tr>
			</table>
			<br />
			<table>
				<tr height="40">
					<td><input width="120" type="submit" value="제출" formaction="updateMember.do" /></td>
				</tr>
			</table>
		</form>
	</div>
</main>