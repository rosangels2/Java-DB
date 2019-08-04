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
	<form method="post" action="<%=request.getContextPath()%>/board/register">	<!-- action이 따로 없다면 현재 jsp 경로에 전송 -->
		<div class="container-fluid" style="margin-top:20px;">	              
		    <div class="form-group">
			  <label>제목</label>
			  <input type="text" class="form-control" name="title">
		    </div>
		    <div class="form-group">
			  <label>작성자</label>
			  <input type="text" class="form-control" name="writer" readonly>
		    </div>
		    <div class="form-group">
			  <label>작성일</label>
			  <input type="text" class="form-control" name="" readonly>	<!-- input태그는 입력값이 없을 시 null이 아닌 빈 문자열이 입력된다 -->
		    </div>
		    <div class="form-group">
			  <label>조회수</label>
			  <input type="text" class="form-control" name="" readonly>
		    </div>
		    <div class="form-group">
			  <label>내용</label>
			  <textarea class="form-control" rows="5" name="contents"></textarea>
			</div>
		    <div class="form-group">
			  <label>파일첨부</label>
			  <input type="text" class="form-control" name="file">
		    </div>	  		
		</div>
		<button style="float: right; margin-right: 20px;">게시글 등록</button>
	</form>
	<a style="float: left; margin-left: 20px;" href="<%=request.getContextPath()%>/board/list"><button type="button" class="btn btn-outline-primary">취소</button></a>
</body>
</html>