<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<jsp:include page="/WEB-INF/views/common/header.jsp"></jsp:include>
</head>
<body>
<jsp:include page="/WEB-INF/views/common/nav.jsp"></jsp:include>
<%-- ${user} 변수 호출을 통해 interceptor에 저장된 객체 정보를 호출  --%>
</body>
</html>