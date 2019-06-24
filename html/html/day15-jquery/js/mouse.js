$(document).ready(function(){
	$('.box1').mouseover(function(){	//클래스명이 box1인 객체에 마우스가 올라왔을 때 익명 함수를 실행한다 (또는 mouseenter)
		$(this).animate({width : '200px', height : '200px'}, 1000);	//this를 통해 이벤트가 발생한 객체에 animate 함수를 통해 효과를 넣는다
		$(this).css('border-color','red');	//jquery의 animate 함수에선 border-color값 변경은 지원하지 않기 때문에 css를 변경한다 
	});
	$('.box1').mouseout(function(){	//클래스명이 box1인 객체에서 마우스가 밖으로 나갔을 떄 익명 함수를 실행한다
		$(this).animate({width : '20px', height : '20px'}, 1000);
		$(this).css('border-color','black');
	});
})