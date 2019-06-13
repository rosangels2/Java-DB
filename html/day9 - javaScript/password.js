function checkPwConfirm(idPw1, idPw2,min,max){
	var pw1 = document.getElementById(idPw1).value;
	var pw2 = document.getElementById(idPw2).value;
	//비밀번호 id값을 이용하여 에러메세지 박스(html코드에서 div)
	//아이디 만들기
	var strErrorPw1 = 'error'+idPw1;
	var strErrorPw2 = 'error'+idPw2;
	//에러메세지 아이디를 이용하여 에러메세지를 화면에 추가
	var errorMessage1 = '';
	var errorMessage2 = '';

	if(!checkPw(pw1,min,max)){
		errorMessage1 = '비밀번호는 '+min+'~'+max+'자리입니다.';
	}
	if(pw1 != pw2){
		errorMessage2 = '비밀번호가 일치하지 않습니다.';
	}
	document.getElementById(strErrorPw1).innerHTML = errorMessage1;
	document.getElementById(strErrorPw2).innerHTML = errorMessage2;
}
function checkStringLength(str, min, max){
	if(str.length > max || str.length < min)
		return false;
	return true;
}
function checkPw(str,min,max){
	if(!checkStringLength(str,min,max)){
	//alert('비밀번호는 '+min+'~'+max+'자리입니다.');
		return false;
	}
	return true;
}