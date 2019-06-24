$(document).ready(function(){
	var pos = 0;	//전역변수를 통해 변경된 현재 값을 저장
	$('.next').click(function(){	//next 버튼 클릭 시
		if(pos >= $('.box').length-1){	//범위를 넘어섰을 떄
			return;	//실행하지 않고 리턴한다
		}
		$('.box').eq(pos).removeClass('border-red');	//현재 번지에서 border-red 클래스를 삭제한다
		pos++;	//pos를 하나 증가시킨다
		$('.box').eq(pos).addClass('border-red');	//하나 증가된 다음 번지에 border-red 클래스를 추가한다 
	});
	$('.preview').click(function(){	//preview 버튼 클릭 시
		if(pos <= 0){	//범위를 벗어났을 때
			return;	//실행하지 않고 리턴한다
		}
		$('.box').eq(pos).removeClass('border-red');	//현재 번지에서 border-red 클래스를 삭제한다
		pos--;	//pos를 하나 감소시킨다
		$('.box').eq(pos).addClass('border-red');	//하나 감소된 다음 번지에 border-red 클래스를 추가한다 
	});
});