<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
	<a href="<%=request.getContextPath()%>/signup">회원가입</a>
	<a href="<%=request.getContextPath()%>/signin">로그인</a>
	<a href="<%=request.getContextPath()%>/member/modify">회원 정보 수정</a>
</body>
</html>
