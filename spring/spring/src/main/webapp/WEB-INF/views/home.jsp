<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<meta http-equiv="X-UA-Compatible" content="ie=edge">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.css">
	<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.2/css/all.css" integrity="sha384-oS3vJWv+0UjzBfQzYUhtDYW+Pj2yciDJxpsK1OYPAYjqT085Qq/1cq5FLXAZQ7Ay" crossorigin="anonymous">
	<title>회원가입</title>
	<style>
	input.form-control:focus{
		color: green;
		background-color: aqua;
		font-size: 30px;
	}
	input.form-control:hover{
		background-color: wheat;
	}
	.container{
		border: 1px solid black;
		width: 50%;
	}
	i.fab{
		font-size: 100px;
		color: red;
	}
	</style>
</head>
<body>
	<div class="row m-5">
		<div class="container offset-4 col-4">
			<div class="offset-3"> <h1>로그인</h1></div>
			<form method="post" action="<%=request.getContextPath()%>/signin">	<!-- signinPost메서드에 매핑 -->
				<div class="form-group">
					<label for="usr">아이디</label>
					<input type="text" class="form-control col-7" id="id" placeholder="아이디" name="id">
				</div>
				<div class="form-group">
					<label for="pwd">비밀번호</label>
					<input type="password" class="form-control col-7" id="pw" placeholder="비밀번호" name="pw">
				</div>
				<button type="submit" class="btn btn-primary float-right">로그인</button>
			</form>
		</div>
	</div>
</body>
</html>

<%-- 
<body>
<!-- eq = equals(같다), ne = !equals(같지 않다) -->
	<c:if test="${user eq null}">	<!-- test = 조건식(해당 조건식 결과가 true이면 해당 코드를 실행하며, c:if는 else가 없다) -->
		<a href="<%=request.getContextPath()%>/signup">회원가입</a>
		<a href="<%=request.getContextPath()%>/signin">로그인</a>
	</c:if>
	<c:if test="${user ne null}">
		<a href="<%=request.getContextPath()%>/member/modify">회원정보 수정</a>
		<a href="<%=request.getContextPath()%>/board/list">게시판</a>
	${user} 변수 호출을 통해 interceptor에 저장된 객체 정보를 호출 
	</c:if>
</body>
--%>