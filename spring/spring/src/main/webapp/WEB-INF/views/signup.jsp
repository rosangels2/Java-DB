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
	<script type="text/javascript" src="<%=request.getContextPath()%>/resources/js/jquery.validate.js"></script>
	<script type="text/javascript" src="<%=request.getContextPath()%>/resources/js/additional-methods.js"></script>
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
		.error{
		color : red;
	}
</style>
<script type="text/javascript">

	var isCheck = -1;

	$(document).ready(function(){
	
		$('#id').change(function(){
			isCheck = -1;
		});
		
		$('#signup').submit(function(){		//회원가입 버튼을 눌렀을 때
			if(isCheck == -1){	//아이디 중복확인을 하지 않았을 경우
				alert('아이디 중복 확인을 해주세요');
				return false;
			}else if(isCheck == 0){	//이미 가입된 아이디일 경우
				alert('가입한 회원 아이디입니다.');
				return false;
			}else{
				alert('회원가입을 진행합니다.');
				return true;
			}
			if($('#signup input[type=email]').val().length == 0){	//이메일이 입력되지 않았다면
				alert('이메일을 입력해주세요.')
				return false;
			}
			alert('회원가입이 완료 되었습니다.');
			isCheck = -1;
			return true;
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
		           if(!data.isMember){	//컨트롤러를 통해 반환된 데이터의 id값이 true이면
		        	   alert('회원 가입이 가능한 아이디입니다.');
		          	   isCheck = 1;	//중복 확인 성공(회원가입 가능)
		           }else{
		        	   alert('이미 가입된 아이디입니다.');
		        	   isCheck = 0;	//중복 확인 실패(회원가입 불가능)
		           }
		       	}
		    });
		});
		
		$("form").validate({
	        rules: {
	            id: {
	                required : true,	//필수 항목인지 여부
	                minlength : 8,
	                maxlength : 20
	            },
	            pw: {
	                required : true,
	                minlength : 8,
	                maxlength : 20,
	                regex: /^\w*(\d[A-z]|[A-z]\d)\w*$/	//정규표현식
	            },
	            pw1: {
	                required : true,
	                equalTo : pw
	            },
	            email: {
	                required : true,
	                email : true	//email 형식에 맞는지 여부
	            }
	        },
	        messages : {	//규칙체크 실패시 출력될 메시지
	            id: {
	                required : "필수로 입력하세요",
	                minlength : "최소 {0}글자 이상이어야 합니다",
	                maxlength : "최대 {0}글자 이하여야 합니다"
	            },
	            pw: {
	                required : "필수로 입력하세요",
	                minlength : "최소 {0}글자 이상이어야 합니다",
	                maxlength : "최대 {0}글자 이하여야 합니다",
	                regex : "영문자, 숫자로 이루어져 있으며 최소 하나이상 포함"
	            },
	            pw1: {
	                required : "필수로 입력하세요",
	                minlength : "최소 {0}글자 이상이어야 합니다",
	                equalTo : "비밀번호가 일치하지 않습니다."
	            },
	            email: {
	                required : "필수로 입력하세요",
	                minlength : "최소 {0}글자 이상이어야 합니다",
	                email : "메일규칙에 어긋납니다"
	            }
	        }
	    });
	});		//ready 끝
	$.validator.addMethod(
		    "regex",
		    function(value, element, regexp) {
		        var re = new RegExp(regexp);
		        return this.optional(element) || re.test(value);
		    },
		    "Please check your input."
		);
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
					<label id="id-error" class="offset-4 col-7" for="id"></label>
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