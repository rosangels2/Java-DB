$(document).ready(function(){
	$('li').click(function(){
		var pos = this.id;	//이벤트가 발생한 객체의 id값을 변수 pos에 저장한다
		//선생님 방법 - 변수 추가 사용으로 조건문 사용 x
		var obj = $('.checkbox').eq(pos);	//변경할 번지의 체크박스 객체 정보를 변수에 저장한다
		isChecked = obj.prop('checked');	//객체의 속성 체크값을 변수에 저장한다
		obj.prop('checked', !isChecked);	//객체의 속성 체크값을 반대로 변경한다
		//내 방법
		//isChecked = $('.checkbox').eq(pos).prop('checked');	//해당 id번지 체크박스의 체크값을 변수에 저장한다
		// if(isChecked){	//체크값이 true이면
		// 	$('.checkbox').eq(pos).prop('checked', false);	//해당 id번지 체크박스의 체크값을 false로 변환한다
		// }else{
		// 	$('.checkbox').eq(pos).prop('checked', true);		//해당 id번지 체크박스의 체크값을 true로 변환한다
		// }
		$('li input[type=checkbox]').click(function(){	//체크박스를 눌렀을 때도 li태그 클릭 시의 함수가 작동하기 때문에 한번 더 변경 
			var isChecked = $(this).prop('checked');	//현재 체크박스의 체크값을 변수에 저장한다
			$(this).prop('checked',!isChecked);	//체크박스를 클릭했을 때 한번 더 체크값을 반대로 변경한다
		});
	});
});