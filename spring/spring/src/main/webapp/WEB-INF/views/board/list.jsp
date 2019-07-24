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
	
	<ul class="pagination" style="justify-content: center;">
	    <c:if test="${pageMaker.prev}">	<!-- 이전 버튼(boolean 값이 true면 보여준다) -->
	        <li class="page-item">
	            <a class="page-link" href="<%=request.getContextPath()%>/board/list?page=${pageMaker.startPage-1}&type=${pageMaker.criteria.type}&search=${pageMaker.criteria.search}">Previous</a>
	        </li>																<!-- 현재 페이지의 스타트 페이지에서 -1을 뺀 값을 페이지로 결정 -->
	    </c:if>
	    <c:forEach begin="${pageMaker.startPage }" end="${pageMaker.endPage}" var="index">	<!-- begin/end를 통해 시작과 끝을 지정하고 반복 -->
	        <c:if test="${pageMaker.criteria.page == index}">	<!-- uri의 페이지 번호가 index와 같다면 active를 추가-->
	        <li class="page-item active">													<!-- index : 반복문의 i같은 역할로 증감연산 -->
	            <a class="page-link" href="<%=request.getContextPath()%>/board/list?page=${index}&type=${pageMaker.criteria.type}&search=${pageMaker.criteria.search}">${index}</a>	<!-- 숫자를 찍는 역할 -->
	        </li>
	        </c:if>
	        <c:if test="${pageMaker.criteria.page != index}">	<!-- uri의 페이지 번호가 index와 다르다면 -->
	        <li class="page-item">															<!-- index : 반복문의 i같은 역할로 증감연산 -->
	            <a class="page-link" href="<%=request.getContextPath()%>/board/list?page=${index}&type=${pageMaker.criteria.type}&search=${pageMaker.criteria.search}">${index}</a>	<!-- 숫자를 찍는 역할 -->
	        </li>
	        </c:if>
	    </c:forEach>
	    <c:if test="${pageMaker.next}">	<!-- 다음버튼 -->
	        <li class="page-item">
	            <a class="page-link" href="<%=request.getContextPath()%>/board/list?page=${pageMaker.endPage+1}&type=${pageMaker.criteria.type}&search=${pageMaker.criteria.search}">Next</a>
	        </li>
	    </c:if>
	</ul>
	<form class="" method="get" action="<%=request.getContextPath()%>/board/list">
		<select name="type" class="float-left">
			<option value="1" <c:if test="${pageMaker.criteria.type eq 1}">selected</c:if> >제목</option>
			<option value="2" <c:if test="${pageMaker.criteria.type eq 2}">selected</c:if> >내용</option>
			<option value="3" <c:if test="${pageMaker.criteria.type eq 3}">selected</c:if> >작성자</option>
		</select>
		<input type="text" name="search" class="float-left" value="${pageMaker.criteria.search}">
		<button type="submit" class="btn btn-outline-success float-left">검색</button>
	</form>
</body>
</html>