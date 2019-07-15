<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>	<!-- c태그를 사용하기 위한 링크 -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<jsp:include page="/WEB-INF/views/common/header.jsp"></jsp:include>
<script src="https://code.jquery.com/jquery-3.4.1.js"></script>
<title>Insert title here</title>
<script type="text/javascript">
	$(document).ready(function(){
		
	});
</script>
</head>
<body>
<jsp:include page="/WEB-INF/views/common/nav.jsp"></jsp:include>
	<h1>게시판</h1>
	<table class="table">
		<tr>
			<th width="10%">번호</th>		<!-- width를 통해 가로를 지정 -->
			<th width="50%">제목</th>
			<th width="10%">작성자</th>
			<th width="20%">등록일</th>
			<th width="10%">조회수</th>	
		</tr>
		<c:forEach var="board" items="${list}">	<!-- 향상된 포문처럼 items에 있는 변수 list의 값을 0번지부터 하나씩 꺼내서 board에 추가한다 -->
			<tr>
				<th>${board.num}</th>	<!-- list의 값이 추가된 변수 board의 getter 호출 -->
				<th><a href="<%=request.getContextPath()%>/board/display?num=${board.num}">${board.title}</a></th>
				<th>${board.writer}</th>
				<th>${board.registered}</th>
				<th>${board.views}</th>		
			</tr>
		</c:forEach>
	</table>
	<a href="<%=request.getContextPath()%>/board/register?id=${user.id}" style="float: right;"> <button type="button" class="btn btn-outline-dark">게시글 등록</button> </a>
</body>
</html>