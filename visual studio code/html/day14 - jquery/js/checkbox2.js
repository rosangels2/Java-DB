$(document).ready(function(){
	$('.box-check').change(function(){
		//여기서 this는 값이 변경된 box-check 클래스를 
		//가지고 있는 요소이다.
		var isChecked = $(this).prop('checked');
		var pos = 0;//현재 이벤트가 발생된 체크박스의 위치
		var cnt = 0;
		var thisObj = $(this);
		$('.box-check').each(function(){
			//여기서 this는 box-check 클래스를 가지고 있는
			//요소를 하나씩 꺼냈을 때 해당 요소가 this가 된다.
			//each()밖에 있는 this와는 다른 this이다.
			if($(this).val() == thisObj.val()){
				pos = cnt;
			}
			cnt++;
		})
		//체크된 경우
		if(isChecked){
			$('.box').eq(pos).addClass('display-none');
		}
		//체크 해제된 경우
		else{
			$('.box').eq(pos).removeClass('display-none');
		}
	});
});