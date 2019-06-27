$(document).ready(function(){
	//선생님 방법 - 체크박스
	$('.checkAll').change(function(){	//전체 선택/해제 체크박스를 체크 시
		var isChecked = $(this).prop('checked');	//변수 isChecked에 this의 체크값을 저장한다
		//$('.checkbox').prop('checked',isChecked);	//each를 사용한 것과 같은 기능
		$('.checkbox').each(function(){	//each를 통해 checkbox클래스의 객체들을 하나씩 적용한다
			$(this).prop('checked',isChecked);	//해당 값의 체크값을 isChecked의 값으로 변경한다
		});
	});
	//내 방법 - 버튼
	$('.checkBtn').click(function(){
		$('.checkbox').prop('checked','true');	//체크박스들의 속성값들을 모두 true로 변경한다
		$('.checkAll').prop('checked','true');
	});
	$('.unCheckBtn').click(function(){
		$('.checkbox').prop('checked',false);		//체크박스들의 속성값들을 모두 false로 변경한다
		$('.checkAll').prop('checked',false);
	});
});