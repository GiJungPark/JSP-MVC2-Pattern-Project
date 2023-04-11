<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!-- form 태그로 묶어서 서블릿으로 전송해야 함. -->  
<!-- 서블릿은 각 라디오 그룹에 점수를 집계하여 거기에 맞는 장르의 영화를 db를 통해 가져온다. -->
<!-- 로맨스 액션 호러 코믹 SF -->
<div style="width: 100%; height: 400px;">
	<table width="95%" align="center" border="1">
		<tr>
			<td colspan="5">1번 문제</td>
			<td colspan="5">2번 문제</td>
		</tr>
		<tr>
			<td><input type="radio" name="rec_1" value="1">1</td>
			<td><input type="radio" name="rec_1" value="2">2</td>
			<td><input type="radio" name="rec_1" value="3" checked="checked">3</td>
			<td><input type="radio" name="rec_1" value="4">4</td>
			<td><input type="radio" name="rec_1" value="5">5</td>
			<td><input type="radio" name="rec_2" value="1">1</td>
			<td><input type="radio" name="rec_2" value="2">2</td>
			<td><input type="radio" name="rec_2" value="3" checked="checked">3</td>
			<td><input type="radio" name="rec_2" value="4">4</td>
			<td><input type="radio" name="rec_2" value="5">5</td>
		</tr>
		<tr>
			<td colspan="5">3번 문제</td>
			<td colspan="5">4번 문제</td>
		</tr>
		<tr>
			<td>1</td>
			<td>2</td>
			<td>3</td>
			<td>4</td>
			<td>5</td>
			<td>1</td>
			<td>2</td>
			<td>3</td>
			<td>4</td>
			<td>5</td>
		</tr>
		<tr>
			<td colspan="5">5번 문제</td>
			<td colspan="5">6번 문제</td>
		</tr>
		<tr>
			<td>1</td>
			<td>2</td>
			<td>3</td>
			<td>4</td>
			<td>5</td>
			<td>1</td>
			<td>2</td>
			<td>3</td>
			<td>4</td>
			<td>5</td>
		</tr>
		<tr>
			<td colspan="5">7번 문제</td>
			<td colspan="5">8번 문제</td>
		</tr>
		<tr>
			<td>1</td>
			<td>2</td>
			<td>3</td>
			<td>4</td>
			<td>5</td>
			<td>1</td>
			<td>2</td>
			<td>3</td>
			<td>4</td>
			<td>5</td>
		</tr>
		<tr>
			<td colspan="5">9번 문제</td>
			<td colspan="5">10번 문제</td>
		</tr>
		<tr>
			<td>1</td>
			<td>2</td>
			<td>3</td>
			<td>4</td>
			<td>5</td>
			<td>1</td>
			<td>2</td>
			<td>3</td>
			<td>4</td>
			<td>5</td>
		</tr>

	</table>
</div>