<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="UTF-8"%>
<nav class="navigator">
	<ul>
		<li class="navMenuLi">
			<a class="menuLink" href="./index.jsp">메인</a>
		</li>
		<li class="navMenuLi">
			<a class="menuLink" href="./movieSearch.jsp">영화</a>
				<ul class="subMenu">
					<li><a class="submenuLink" href="./movieSearch.jsp">영화 검색</a></li>
					<li><a class="submenuLink" href="./movieRecommend.jsp">영화 추천</a></li>
				</ul>
		</li>
		<li class="navMenuLi">
			<a class="menuLink" href="./reservationMovie.jsp">예매</a>
				<ul class="subMenu">
					<li><a class="submenuLink" href="./reservationMovie.jsp">영화 예매</a></li>
					<li><a class="submenuLink" href="./reservationSearch.jsp">예매 조회</a></li>
				</ul>
		</li>
		<li class="navMenuLi">
			<a class="menuLink" href="./store.jsp">스토어</a>
		</li>
	</ul>
</nav>
