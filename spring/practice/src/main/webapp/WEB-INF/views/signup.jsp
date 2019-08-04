<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<meta http-equiv="X-UA-Compatible" content="ie=edge">
	<jsp:include page="/WEB-INF/views/common/header.jsp"></jsp:include>
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
<script type="text/javascript">

var isCheck = -1;	//중복 확인을 요구하는 초기값

$(document).ready(function(){
	
	$('#id').change(function(){
		isCheck = -1;
	});
	
	$('#dup').click(function(){
		var id = $('input[name=id]').val();	//data를 통해 넘겨줄 매개변수에 저장할 값을 입력
		 $.ajax({
	        async:true,
	        type:'POST',
	        data:id,	//컨트롤러에게 넘겨주는 매개변수명
	        url:"dup",	//전송하는 URI 주소
	        dataType:"json",
	        contentType:"application/json; charset=UTF-8",
	        success : function(data){	//요청이 성공해서 보내준 값을 저장할 변수명
				if(data.isMember){
					alert('이미 가입된 아이디입니다');
	        	 	isCheck = 0;	//아이디 중복(회원가입 불가능)
				}else{
					alert('회원 가입이 가능한 아이디입니다.');
					isCheck = 1;	//아이디 비중복(회원가입 가능)
				}
	        }
	    });
	});
	
	$('#signup').submit(function(){		//회원가입 버튼을 눌렀을 때
		if(isCheck == -1){	//아이디 중복확인을 하지 않았을 경우
			alert('아이디 중복 확인을 해주세요');
			return false;
		}else if(isCheck == 0){	//이미 가입된 아이디일 경우
			alert('가입한 회원 아이디입니다.');
			return false;
		}else{
			
		}
		alert('회원가입이 완료 되었습니다.');
		isCheck = -1;	//회원 가입 완료 후 isCheck를 초기화
		return true;
	});
	
});	//레디

</script>
</head>
<body>
	<div class="row m-5">
		<div class="container offset-4 col-4">
			<div class="offset-3"> <h1>회원가입</h1></div>
			<form method="post" action="<%=request.getContextPath()%>/signup" id="signup">
				<div class="form-group">
					<label for="usr">아이디</label>
					<input type="text" class="form-control col-7" id="id" placeholder="아이디" name="id">
				</div>
				<div>
					<button type="button" class="btn btn-outline-success col-7" id="dup">아이디 중복확인</button>
				</div>
				<div class="form-group">
					<label for="pwd">비밀번호</label>
					<input type="password" class="form-control col-7" id="pw" placeholder="비밀번호" name="pw">
				</div>
				<div class="form-group">
					<label for="pwdRe">비밀번호 확인</label>
					<input type="password" class="form-control col-7" id="pw1" placeholder="비밀번호 확인" name="pw1">
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
				<div class="form-group">
					<label for="usr">이름</label>
					<input type="text" class="form-control col-7" id="name" placeholder="이름" name="name">
				</div>				
				<a href="<%=request.getContextPath()%>/"><button type="button" class="btn btn-dark float-right" id="cancel" name="cancel">취소</button></a>
				<button type="submit" class="btn btn-primary float-right" id="ok" name="ok">입력완료</button>
			</form>
		</div>
	</div>
</body>
</html>