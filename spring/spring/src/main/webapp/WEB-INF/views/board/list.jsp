<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>	<!-- c태그를 사용하기 위한 링크 -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table>
		<tr>
			<th>번호</th>
			<th>제목</th>
			<th>작성자</th>
			<th>등록일</th>
			<th>조회수</th>	
		</tr>
		<c:forEach var="board" items="${list}">	<!-- 향상된 포문처럼 items에서 list를 하나씩 꺼내서 board에 추가한다 -->
			<tr>
				<th>${board.num}</th>	<!-- getter를 호출 -->
				<th>${board.title}</th>
				<th>${board.writer}</th>
				<th>${board.registered}</th>
				<th>${board.views}</th>		
			</tr>
		</c:forEach>
	</table>
</body>
</html>