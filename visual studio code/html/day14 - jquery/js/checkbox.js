$(document).ready(function(){
	$('.box').addClass('display-none');
	$('.box-check').change(function(){
		var isChecked = $(this).prop('checked');
		if(isChecked){ //체크된 경우
			//$(this).addClass('display-none'); 	//this를 사용할 시 체크박스에 적용된다
			$('.box').eq($(this).val()).addClass('bg-'+this.id);
			$('.box').eq($(this).val()).removeClass('display-none');
		}else{	//체크 해제된 경우
			$('.box').eq($(this).val()).removeClass('bg-'+this.id);
			$('.box').eq($(this).val()).addClass('display-none');
		}
	});
});