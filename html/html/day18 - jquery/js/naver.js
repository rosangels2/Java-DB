$(document).ready(function(){
	$('.auto-search').click(function(){	//클릭했을 떄 가상 키보드를 보여주는 코드
		$(this).find('.icon-auto-down').toggleClass('icon-auto-up');	//우선순위가 같기 때문에 토글로 나중에 추가된 up 클래스로 이미지가 변경
		$('.search-input-box').toggleClass('border-bottom-none');	//검색창에 녹색 밑줄을 토글(제거했다 추가)하는 코드
		$('.auto-box').slideToggle(10);	//0.1초 속도로 토글을 실행하는 코드
	});

	//mouseover - 자손들까지도 같이 호출된다(자식으로 마우스가 들어가도 부모까지 같이 호출) 
	$('.realtime-search').mouseenter(function(){	//mouseenter - 마우스가 들어갔을 동안 한 번씩 호출(자손들이 호출돼도 호출 x)
		$('.realtime-search-box').addClass('display-block');	//실시간 검색어에 display-block을 추가
	})
	$('.realtime-search-box').mouseout(function(){	//실시간 검색어 창을 벗어났을 때 실행
		$(this).removeClass('display-block');	//실시간 검색어에 display-block을 제거
	})

	function ticker(selector,height){
		setTimeout(function(){	//설정한 시간이 지난 뒤에 해당 익명 함수를 실행
			$(selector+' li:first').animate( {marginTop: '-'+height}, 400, function(){	//li태그의 첫번째를 선택
				//animate효과를 0.5초 동안 실행하고, 실행이 끝나면 다음으로 익명 함수를 실행
				$(this).detach().appendTo(selector+' ul').removeAttr('style');//detach(), removeAttr()가 먼저여도 문법상 문제 x
				//animate가 실행된 첫번째 li태그를 잘라내서 ul태그 안에서 마지막 순서로 추가하고 style값을 초기화
      });
			ticker(selector,height);
		}, 1000);//setTimeout 이벤트를 1초 뒤에 실행
	};
	ticker('.realtime-search','20px');
	ticker('.news-ticker','20px');

	function ticker1(){
		setTimeout(f1, 1000);	//1초후에 f1함수를 실행
	};
	function f1(){
		$('.realtime-search li:first').animate( {marginTop: '-20px'}, 400, f2);	//첫번째 li태그를 0.4초동안 위로 20px올린 후 f2를 실행
		ticker1();	//ticker1() - 재귀함수처럼 보이지만 일반 재귀함수랑 형태가 다르다.
	}
	function f2(){	//맨위에 있는 li태그를 잘라서 ul태그 끝에 붙이는 함수
		$(this).detach().appendTo('.realtime-search ul').removeAttr('style');	//this(맨 위의 li태그)를 잘라서 ul태그 끝에 붙이고 style 속성 제거
	}
	ticker();//ticker함수 실행
	
$('.r2-top-btn.next').click(function(){
		var num = $('#num').text();	//#num의 문자열을 가져와 변수 num에 저장
		num++;	//num을 하나 증가
		if(num==7) num = 1;	//하나 증가한 num이 7이면 num에 1을 저장
		$('#num').text(num);	//#num의 text를 num으로 변경
	})
	$('.r2-top-btn.prev').click(function(){
		var num = $('#num').text();	//#num의 문자열을 가져와 변수 num에 저장
		num--;	//num을 하나 감소
		if(num==0) num = 6;	//하나 감소한 num이 0이면 num에 6을 저장
		$('#num').text(num);	//#num의 text를 num으로 변경
	})

	$('.l3-item').hover(function(){
		$(this).find('.l3-item-btn').toggleClass('display-block');
	});

	$('.banner-img.more').click(function(){	//더보기 버튼이나 접기 버튼을 눌렀을 떄
		$(this).toggleClass('fold');	//이 태그에 fold 클래스를 토글
		$('div.more-bottom').toggleClass('display-none');	//더보기창에 display-none 클래스를 토글 
		moreReset();	//메뉴 설정을 취소하고 체크값 초기화와 체크상자를 숨기는 함수를 호출
	});

	$('.svc-setting').click(function(){	//메뉴 설정을 눌렀을 때
		$('.more-svc .svc-check').removeClass('display-none');	//체크박스들의 display-none을 제거
		$('.svc-btn').addClass('display-none');	//btn메뉴에 display-none을 추가
		$('.svc-btn1').removeClass('display-none');	//btn메뉴1에 display-none을 제거
		$('.banner-black-empty').removeClass('display-none');
	});

	$('.svc-cancel').click(function(){	//메뉴설정 취소 버튼을 눌렀을 때
		moreReset();	//메뉴 설정을 취소하고 체크값 초기화와 체크상자를 숨기는 함수를 호출
		$('.banner-black-empty').addClass('display-none');
	});

	$('.ico-close').click(function(){	//more 박스 닫기 버튼을 눌렀을 때
		moreClose();	//more 박스의 내용을 초기화한 뒤 닫는 함수 호출
	});

	$('.svc-reset').click(function(){	//초기화 버튼을 눌렀을 떄
		alert('초기 설정으로 돌아갑니다.');	//알림 메시지
		moreClose();	//more 박스의 내용을 초기화한 뒤 닫는 함수 호출
	});

	function moreReset(){	//메뉴 설정을 취소하고 체크값 초기화와 체크상자를 숨기는 함수
		$('.svc-btn').removeClass('display-none');
		$('.svc-btn1').addClass('display-none');
		$('.more-svc .svc-check').addClass('display-none');	//체크박스들의 display-none을 추가
		$('.more-menu .svc-check').prop('checked',false);
	}
	function moreClose(){	//접기를 더보기로 바꾸고 more 박스의 모든 내용을 초기화한 뒤 닫는 함수
		$('div.more-bottom').addClass('display-none');
		$('.banner-img.more').removeClass('fold');
		moreReset();
	}
});