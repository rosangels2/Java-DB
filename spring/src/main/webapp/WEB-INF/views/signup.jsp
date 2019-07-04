<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
			<div class="offset-3"> <h1>회원가입</h1></div>
			<form method="post" action="">
				<div class="form-group">
					<label for="usr">아이디</label>
					<input type="text" class="form-control col-7" id="usr" placeholder="아이디" name="id">
				</div>
				<div class="form-group">
					<label for="pwd">비밀번호</label>
					<input type="password" class="form-control col-7" id="pwd" placeholder="비밀번호" name="pw">
				</div>
				<div class="form-group">
					<label for="pwdRe">비밀번호 확인</label>
					<input type="password" class="form-control col-7" id="pwdRe" placeholder="비밀번호 확인">
				</div>
				<div class="form-group">
					<label for="sel1">성별</label>
					<select class="form-control col-4" id="sel1" name="gender">
						<option value="남">남자</option>
						<option value="여">여자</option>
					</select>
				</div>
				<div class="form-group">
					<label for="email">이메일</label>
					<input type="text" class="form-control" id="email" placeholder="이메일" name="email">
				</div>
				<button type="button" class="btn btn-dark float-right">취소</button>
				<button type="submit" class="btn btn-primary float-right">입력완료</button>
			</form>
		</div>
	</div>
</body>
</html>