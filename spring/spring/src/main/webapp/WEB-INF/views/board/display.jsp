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
	${board.title} <br>
	${board.writer} <br>
	${board.registered} <br>
	${board.views} <br>
	${board.contents} <br>
	${board.file} <br>
</body>
</html>