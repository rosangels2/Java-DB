<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>	<!-- c태그를 사용하기 위한 링크 -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<style type="text/css">
.box{
	border : 1px solid black;
}
.box div{
	font-size:30px;
}
</style>
<body>
	<div class="box">
	게시글 번호
	<div>${board.num}</div>
	</div>
	<div class="box">
	게시글 제목
	<div>${board.title}</div>
	</div>
	<div class="box">
	작성자
	<div>${board.writer}</div>
	</div>
	<div class="box">
	게시글 내용
	<div>${board.contents}</div>
	</div>
	<div class="box">
	조회수
	<div>${board.views}</div>
	</div>
	<div class="box">
	작성일
	<div>${board.registered}</div>
	</div>
	<div class="box">
	첨부파일
	<div>${board.file}</div>
	</div>
</body>
</html>