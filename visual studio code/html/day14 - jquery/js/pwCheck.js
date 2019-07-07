$(document).ready(function(){
	//pw1 : 길이 -> 내용이 변경됐을 때 체크 or 가입 버튼이 눌렸을 때
	$('#pw1').change(function(){
		if(!checkLength('#pw1',8,13)){
			alert('비밀번호는 8~13자리를 입력해야 합니다.');
		}
	});
	$('#pw2').change(function(){
		if(!equals('#pw1','#pw2')){
			alert('비밀번호와 일치하지 않습니다');
		}
	});
	//pw2 : pw1과 같은지 확인 -> 내용이 변경됐을 때 체크 or 가입 버튼이 눌렸을 때
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