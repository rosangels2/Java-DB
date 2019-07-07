$(document).ready(function(){
	var empty = [];
	var empty1 = [];
	var str = '';
	var isChange = 0;
	$('.empty-box1').eq(0).addClass('border-green');	//empty-box1의 첫번쨰 태그의 보더 컬러를 초록색으로 변경

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
		$('.banner-black').addClass('display-none');
		$('.banner-black-empty').removeClass('display-none');
		$('.empty-box-1').eq(0).addClass('border-green');
		if(isChange == 1){
			empty1 = empty.slice(0,empty.length);
			addEmptyBox(5);
			for(var i=0; i<empty.length; i++){
				var val = empty[i];
				$('#'+val).prop('checked',true);
			}
		}else if(isChange == 0){
			addEmptyBox(5);
		}
	});

	$('.svc-cancel').click(function(){	//메뉴설정 취소 버튼을 눌렀을 때
		cancel();
	});

	$('.ico-close').click(function(){	//more 박스 닫기 버튼을 눌렀을 때
		cancel();
		$('div.more-bottom').addClass('display-none');
		$('.banner-img.more').removeClass('fold');
	});

	$('.svc-reset').click(function(){	//초기화 버튼을 눌렀을 떄
		reset();
	});

	$('.svc-confirm').click(function(){
		//확인을 눌렀을 떄 배열에 추가된 값으로 banner-black를 변경
		if(empty.length == 0){
			alert('선택된 값이 없습니다. 초기값으로 돌아갑니다.');
			reset();
			return;
		}else{
			$('.banner-black').empty();
			for(var i=0; i<empty.length ; i++){
				arr = empty[i];
				str = '<span class="cm-box cm-'+arr+'"><span class="cm-icon"></span></span>';
				$('.banner-black').append(str);
			}
			$('.banner-black-empty').addClass('display-none');
			$('.banner-black').removeClass('display-none');
			isChange = 1;	//isChange를 먼저 증가시킨 뒤 moreClose와 moreReset함수를 호출
			moreClose();
			moreReset();
		}
	});

	$('.svc-li').click(function(){	//li태그가 체크됐을 떄
		var obj = $(this).find('.svc-check');	//클릭된 li태그의 자손 체크박스 객체를 변수 obj에 저장
		var isChecked = obj.prop('checked');	//체크박스 객체의 체크값 상태를 변수에 저장
		var index = empty.indexOf(obj.val());	//배열 empty에서 체크된 체크박스의 값이 있는지 찾아서 결과를 변수에 저장
		if(index == -1 && empty.length < 5 && isChecked == false){	//4개 이하 체크 상태에서 체크했을 때
			empty.push(obj.val());	//배열 empty의 마지막 번지에 obj의 문자열을 추가
			obj.prop('checked', true);	//해당 체크박스를 체크
		}else if(index == -1 && empty.length >= 5 && isChecked == false){ //5개 체크 상태에서 체크했을 때
			alert('최대 5개까지 선택할 수 있습니다.');
			obj.prop('checked', false);
		}else if(index != -1 && empty.length <= 5 && isChecked == true){	//5개 이하 체크 상태에서 체크를 해제했을 경우
			empty.splice(index,1);	//배열 empty에서 index번지를 제거
			obj.prop('checked', false);	//체크를 해제
		}
		console.log(empty);
		addEmptyBox(5);
		$('.empty-box-1').eq(0).addClass('border-green');
	});

	function moreReset(){	//메뉴 설정을 취소하고 체크값 초기화와 체크상자를 숨기는 함수
		$('.svc-btn').removeClass('display-none');
		$('.svc-btn1').addClass('display-none');
		$('.more-svc .svc-check').addClass('display-none');	//체크박스들의 display-none을 추가
		if(isChange == 0){
			$('.more-menu .svc-check').prop('checked',false);
			empty.splice(0,5);
		}
		else if(isChange == 1){
			return;
		}
	}
	function moreClose(){	//접기를 더보기로 바꾸고 more 박스의 모든 내용을 초기화한 뒤 닫는 함수
		$('div.more-bottom').addClass('display-none');
		$('.banner-img.more').removeClass('fold');
		moreReset();
	}
	function addEmptyBox(max){
		var arr = '';
		if(empty.length == 0){	//배열이 비어 있다면
			str = '<span class="empty-box-1"></span>';
			for(var i=0; i<max; i++){
				$('.empty-box').eq(i).empty();
				$('.empty-box').eq(i).append(str);
			}
		}else if(empty.length >= 1){	//배열에 값이 있다면
			for(var i=0; i<empty.length ; i++){
				arr = empty[i];
				str = '<span class="cm-box cm-'+arr+'"><span class="cm-icon"></span></span>';
				$('.empty-box').eq(i).empty();
				$('.empty-box').eq(i).append(str);
			}
			for(var i=empty.length; i<max; i++){
				str = '<span class="empty-box-1"></span>';
				$('.empty-box').eq(i).empty();
				$('.empty-box').eq(i).append(str);
			}
		}
	}
	function reset(){
		alert('초기 설정으로 돌아갑니다.');	//알림 메시지
		moreClose();	//more 박스의 내용을 초기화한 뒤 닫는 함수 호출
		//banner-black를선택 메뉴를 처음 값으로 초기화
		var code = '<li><a href="#" class="banner-img dic"></a></li><li><a href="#" class="banner-img news"></a></li><li><a href="#" class="banner-img stock"></a></li><li><a href="#" class="banner-img land"></a></li><li><a href="#" class="banner-img map"></a></li><li><a href="#" class="banner-img movie"></a></li><li><a href="#" class="banner-img music"></a></li><li><a href="#" class="banner-img book"></a></li><li><a href="#" class="banner-img comic"></a></li>';
		$('.banner-black').empty();
		$('.banner-black').append(code);
		$('.banner-black-empty').addClass('display-none');
		$('.banner-black').removeClass('display-none');
		isChange = 0;
	}
	function cancel(){
		$('.banner-black-empty').addClass('display-none');
		$('.banner-black').removeClass('display-none');
		moreReset();	//메뉴 설정을 취소하고 체크값 초기화와 체크상자를 숨기는 함수를 호출
		var str = '<span class="empty-box-1"></span>';
		for(var i=0; i<5; i++){
			$('.empty-box').eq(i).empty();
			$('.empty-box').eq(i).append(str);
		}
		if(isChange == 1){
			empty = empty1.slice(0,empty1.length);
			$('.svc-check').prop('checked',false);
			for(var i=0; i<empty.length; i++){
				var arr = empty[i];
				$('#'+arr).prop('checked',true);
			}
		}
	}
});