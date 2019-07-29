<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>	
	<jsp:include page="/WEB-INF/views/common/header.jsp"></jsp:include>
	<title>display</title>
<style>
a{
	float: right;			
	color: black;
	margin-right : 30px;
}
</style>
</head>
<body>
	<jsp:include page="/WEB-INF/views/common/nav.jsp"></jsp:include>
	<form method="post" action="<%=request.getContextPath()%>/board/modify" enctype="multipart/form-data">	<!-- action이 따로 없다면 현재 jsp의 post방식 매핑으로 이동한다 -->
		<input type="hidden" name="num" value="${board.num}">
		<div class="container-fluid" style="margin-top:20px;">	              
		    <div class="form-group">
			  <label>제목</label>
			  <input type="text" class="form-control" name="title" value="${board.title}">
		    </div>
		    <div class="form-group">
			  <label>작성자</label>
			  <input type="text" class="form-control" name="writer" value="${board.writer}" readonly>
		    </div>
		    <div class="form-group">
			  <label>작성일</label>
			  <input type="text" class="form-control" name="registered" value="${board.registered}" readonly>
		    </div>
		    <div class="form-group">
			  <label>조회수</label>
			  <input type="text" class="form-control" name="views" value="${board.views }" readonly>
		    </div>
		    <div class="form-group">
			  <label>내용</label>
			  <textarea class="form-control" rows="5" name="contents">${board.contents }</textarea>
			</div>
		    <div class="form-group">
			  <label>파일첨부</label>
			  <input type="text" class="form-control" name="file" value="${board.fileName}" readonly>
			  <input type="file" class="form-control" name="file2">
		    </div>	  		
		</div>
		<button style="float: right; margin-right: 20px;">수정 완료</button>
	</form>
	<a style="float: left; margin-left: 20px;" href="<%=request.getContextPath()%>/board/display?num=${board.num}"><button type="button" class="btn btn-outline-primary">취소</button></a>
</body>
</html>