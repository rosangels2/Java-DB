<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
	<!-- eq = equals(같다), ne = !equals(같지 않다) -->
	<c:if test="${user eq null}">	<!-- test = 조건식(해당 조건식 결과가 true이면 해당 코드를 실행하며, c:if는 else가 없다) -->
		<a href="<%=request.getContextPath()%>/signup">회원가입</a>
		<a href="<%=request.getContextPath()%>/signin">로그인</a>
	</c:if>
	<c:if test="${user ne null}">
		<a href="<%=request.getContextPath()%>/member/modify">회원정보 수정</a>
		<a href="<%=request.getContextPath()%>/board/list">게시판</a>
	</c:if>
</body>
</html>
