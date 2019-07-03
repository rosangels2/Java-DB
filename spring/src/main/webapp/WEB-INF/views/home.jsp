<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}.${name}</P>	<!-- 주석에도 $ {변수명}을 붙여서 사용 불가(에러 발생) -->
<form method="get" action="<%=request.getContextPath()%>">	<!-- 프로젝트 명을 입력받는 코드 : 현재 /spring/ -->
	<input name="id" value="${name}"><br><br>	<!-- 인풋창에 입력한 값이 위쪽의 P태그에도 적용 -->
	<input name="num1" value="${num1}">
	<input name="num2" value="${num2}">
	<input name="res" value="${res}" readonly>
	<!-- value : 실행됐을 때의 보여지는 값 -->
	<button>계산하기</button>	<!-- form태그 안의 button은 기본적으로 타입이 submit이기 때문에 추가 작업이 없어도 버튼 클릭시 데이터 전송이 진행 -->
	<br><br>
	<input name="zero" value="${zero}"><button>더하기</button>
</form>
</body>
</html>
