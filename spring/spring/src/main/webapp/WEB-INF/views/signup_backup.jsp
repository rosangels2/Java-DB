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
	<script src="https://code.jquery.com/jquery-3.4.1.js"></script>
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

	var idCheck = 0;	//플래그로 사용할 전역변수 선언
	
	$(document).ready(function(){
		$('#id').change(function(){	//id가 변경됐을 때
			idCheck = 0;	//중복체크를 다시 하도록 전역변수 값을 수정
			if(!checkLength('#id',8,13)){
				alert('ID는 8~13자리를 입력해야 합니다.');
			}
			var regex = /^\w*(\d[A-z]|[A-z]\d)\w*$/;
			if(!regex.test($('#id').val())){
				alert('영문 또는 숫자를 1개 이상 입력해야 합니다');
			}
		});
		//pw1 : 길이 -> 내용이 변경됐을 때 체크 or 가입 버튼이 눌렸을 때
		$('#pw').change(function(){
			if(!checkLength('#pw',8,13)){
				alert('비밀번호는 8~13자리를 입력해야 합니다.');
			}
			var regex = /^\w*(\d[A-z]|[A-z]\d)\w*$/;
			if(!regex.test($('#pw').val())){
				alert('영문 또는 숫자를 1개 이상 입력해야 합니다');
			}
		});
		$('#pw1').change(function(){
			if(!equals('#pw','#pw1')){
				alert('비밀번호와 비밀번호 확인이 일치하지 않습니다');
			}
			var regex = /^\w*(\d[A-z]|[A-z]\d)\w*$/;
			if(!regex.test($('#pw1').val())){
				alert('영문 또는 숫자를 1개 이상 입력해야 합니다');
			}
		});
		
		//pw2 : pw1과 같은지 확인 -> 내용이 변경됐을 때 체크 or 가입 버튼이 눌렸을 때
		$('#ok').click(function(){
			if(!checkLength('#pw',8,13)){
				alert('비밀번호는 8~13자리를 입력해야 합니다.');
				return false;
			}else if(!equals('#pw','#pw1')){
				alert('비밀번호와 비밀번호 확인이 일치하지 않습니다');
				return false;
			}
			var regex = /^\w*(\d[A-z]|[A-z]\d)\w*$/;
			if(!regex.test($('#id').val())){
				alert('영문 또는 숫자를 1개 이상 입력해야 합니다');
				return false;
			}
			if(!regex.test($('#pw').val())){
				alert('영문 또는 숫자를 1개 이상 입력해야 합니다');
				return false;
			}
			if(!regex.test($('#pw1').val())){
				alert('영문 또는 숫자를 1개 이상 입력해야 합니다');
				return false;
			}
			if(idCheck == 0){	//중복확인을 하지 않았을 때
				alert('아이디 중복 확인이 필요합니다.');
				return false;	//정보를 컨트롤러에 전송하지 않고 리턴
			}else if(idCheck == 1){	//이미 가입한 회원의 id와 중복될 때
				alert('이미 가입된 아이디입니다.');
				return false;	//정보를 컨트롤러에 전송하지 않고 리턴
			}else if(idcheck == 2)	//가입 가능한 id일 때
				alert('회원가입을 진행합니다.');
				idCheck = 0;	//전역변수를 초기화
				return true;
		});
		$('#dup').click(function(){
			var id = $('input[name=id]').val();	//data를 통해 넘겨줄 매개변수에 저장할 값을 입력
			 $.ajax({
		        async:true,
		        type:'POST',
		        data:id,	//컨트롤러 매개변수로 넘겨주는 매개변수명
		        url:"dup",	//전송하는 URI 주소
		        dataType:"json",
		        contentType:"application/json; charset=UTF-8",
		        success : function(data){	//요청이 성공해서 보내준 값을 저장할 변수명
		           if(!data.isMember){	//컨트롤러를 통해 반환된 데이터의 id값이 true이면
		        	   alert('회원 가입이 가능한 아이디입니다.');
		               idCheck = 2;
		           }else{
		        	   alert('이미 가입된 아이디입니다.');
		        	   idCheck = 1;
		           }
		       	}
		    });
		});
	});
	//일반함수 선언 및 구현은 .ready함수 밖에서 한다 -> ready 밖에서 호출할 경우 화면이 구성되기 전에 함수가 실행돼 에러가 발생할 수 있다
	function checkLength(selector,min,max){		
		var length = $(selector).val().length;	//변수 length에 매개변수로 입력받은 selector의 value값 길이를 저장한다
		if(min > max){
			var tmp = min;
			min = max;
			max = tmp;
		}
		if(length < min || length > max){
			return false;
		}else{
			return true;
		}
	}
	function equals(sel1,sel2){
		if($(sel1).val() == $(sel2).val()){
			return true;
		}else{
			return false;
		}
	}	
</script>
</head>
<body>
	<div class="row m-5">
		<div class="container offset-4 col-4">
			<div class="offset-3"> <h1>회원가입</h1></div>
			<form method="post" action="<%=request.getContextPath()%>/signup">
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
				<button type="button" class="btn btn-dark float-right" id="cancel" name="cancel">취소</button>
				<button type="submit" class="btn btn-primary float-right" id="ok" name="ok">입력완료</button>
			</form>
		</div>
	</div>
</body>
</html>