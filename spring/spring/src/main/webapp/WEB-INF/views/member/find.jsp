<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<meta http-equiv="X-UA-Compatible" content="ie=edge">
	<jsp:include page="/WEB-INF/views/common/header.jsp"></jsp:include>
	<link rel="stylesheet" href="<%=request.getContextPath()%>/resources/css/main.css">
	
	<script type="text/javascript">
		$(document).ready(function(){
			$('input[name=id]').focus();
			$('#findBtn').click(function(){
				var id = $('input[name=id]').val();		//인풋창에 입력받은 값을 저장
				var email = $('input[name=email]').val();
				$.ajax({
		        async:true,
		        type:'POST',
		        data:{'id':id, 'email': email},		//매개변수로 컨트롤러에 변수값을 전송
		        url:"<%=request.getContextPath()%>/checkemail",
		        dataType:"json",
		        contentType:"application/json; charset=UTF-8",
		        success : function(data){
		            if(data.isOk){		//입력한 id와 email이 회원 정보와 일치하면
		            	$('#findForm').submit();	//form태그의 정보 전송 기능을 실행
		            }else{	//입력한 id와 email이 회원 정보와 일치하지 않으면
		            	alert('일치하는 정보가 없습니다.');		//정보가 일치하지 않음을 알리고 form태그의 정보를 전송하지 않는다
		            }
		      	  }
		   		});
			});
		})
	</script>
	<title>로그인</title>
	<style>
	*{
		margin: 0;
		padding : 0;
	}
	.main{
		margin-top:50px;
	}
	.row{
		margin: 5px 0px;
	}
	.fab.fa-amazon{
		font-size: 100px;
		color: red;
	}
	</style>
</head>
<body>
	<div>
		<div class="offset-4 col-4 border border-dark mt-5 clearfix">
			<h1 class="text-center">비밀번호 찾기</h1>
			<form method="post" action="<%=request.getContextPath()%>/password/send" id="findForm">
				<div class="row">
					<label class="col-4">아이디</label>
					<input type="text"class="form-control col-7" placeholder="아이디" name="id" tabindex="1">
				</div>
				<div class="row">
					<label class="col-4">이메일</label>
					<input type="email"class="form-control col-7" placeholder="이메일" name="email" tabindex="2">
				</div>
				<div class="offset-7 col-4 clearfix p-0">
					<button type="button" class="btn btn-primary float-right" id="findBtn">비밀번호 찾기</button>
				</div>
			</form>
		</div>
	</div>
</body>
</html>