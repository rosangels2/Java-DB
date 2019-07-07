$(document).ready(function(){
	$('.auto-search').click(function(){
		$(this).find('.icon-auto-down').toggleClass('icon-auto-up');
		//검색창에 녹색 밑줄을 토글(제거했다 추가)하는 코드
		$('.search-input-box').toggleClass('border-bottom-none');
		$('.auto-box').slideToggle(10);
	});
	$('.realtime-search').mouseenter(function(){
		$('.realtime-search-box').addClass('display-block');
	})
	$('.realtime-search-box').mouseout(function(){
		$(this).removeClass('display-block');
	})

/*	function ticker(){
		//1초후에 f1함수를 실행해라
		setTimeout(f1, 1000);
	};
	function f1(){
		//첫번째 li태그를 0.4초동안 위로 20px올린 후 f2를 실행
		$('.realtime-search li:first')
			.animate( {marginTop: '-20px'}, 400, f2);
		//ticker()함수처럼 보이지만 일반 재귀함수랑 형태가 다르다.
		ticker();
	}
	//맨위에 있는 li태그를 잘라서 ul태그 끝에 붙이는 함수
	function f2(){
		$(this)//li태그 첫번째 요소 : $('.realtime-search li:first')
			.detach()//떼서  
			.appendTo('.realtime-search ul')//ul태그 뒤에 
			.removeAttr('style');//style="margin-top:-20px"를 제거
	}
	ticker();//ticker함수 실행
	*/
	//A.append(B);//A요소 자손들 끝에 B를 추가해라
	//A.appendTo(B);//A요소를 B자손 끝에 추가해라
	function ticker(selector,height){
		setTimeout(function(){
			$(selector+' li:first')
				.animate( {marginTop: '-'+height}, 400, function(){
					$(this)
						.detach()
						.appendTo(selector+' ul')
						.removeAttr('style');
      });
			ticker(selector,height);
		}, 1000);
	};
	ticker('.realtime-search','20px');
	ticker('.news-ticker','20px');
	$('.r2-top-btn.next').click(function(){
		var num = $('#num').text();
		num++;
		if(num==7) num = 1;
		$('#num').text(num);
	})
	$('.r2-top-btn.prev').click(function(){
		var num = $('#num').text();
		num--;
		if(num==0) num = 6;
		$('#num').text(num);
	})
	// $('.l3-item').mouseenter(function(){
	// 	$(this).parent().find('.l3-item-1').addClass('display-block');
	// 	$(this).addClass('display-none');
	// })
	// $('.l3-item-1').mouseleave(function(){
	// 	$('.l3-item').removeClass('display-none');
	// 	$('.l3-item-1').removeClass('display-block');
	// 	$(this).parent().find('.l3-item').removeClass('display-none');
		
	// })
	//검은색 배너의 기본 리스트를 클래스이름으로 저장
	var defaultArr = ['dic','news','stock',
						'land','map','movie','music','book','comic'];
	//메뉴 설정에서 현재 선택한 배너 리스트	
	var tmpArr =[];
	//확인을 통해 확정된 배너 리스트
	var arr = [];
	var arrSave = [];
	
	//arr1에 있는 내용을 arr2에 복사
	//메뉴 설정을 클릭하면 동작=>copArr(arr,tmpArr)
	//메뉴 설정에서 선택 후 확인 버튼 클릭하면 동작
	//   =>copyArr(tmpArr,arr)
	function copyArr(arr1){
		var arr2 = arr1.slice(0);
		return arr2;
	}
	//arr에 있는 값을 기준으로 checkbox의 체크 상태를 결정
	//메뉴 설정 클릭 시 동작
	function checkArr(){
		$('.setting-list input[type=checkbox]').each(function(){
			var data = $(this).val();
			if(arr.indexOf(data)>=0)
				$(this).prop('checked',true);
			else
				$(this).prop('checked',false);
		})
		$('.banner-black .empty').removeClass('border-green');
		$('.banner-black .empty').eq(0).addClass('border-green');
	}
	//메뉴설정클릭 후 체크박스를 체크또는 해제하면 해당 값을 
	//tmpArr에 반영하는 함수
	//체크 해제는 아무런 문제가 없다.
	//체크는 최대 max개이므로
	//5개 이상이면 추가하지 않고 체크된 상태를 해제된 상태로 돌려야함
	//그리고 5개이상 추가할 수 없다는 정보를 return으로 알려줌
	//obj는 값이 변경된 체크박스 요소(객체)
	function arrCheck(obj,max){
		var data = obj.val();
		var index = tmpArr.indexOf(data);
		if(index>=0){	//배열에 있는데 체크한 경우(체크 해제한 경우)
			tmpArr.splice(index,1);	//해당 번지를 배열에서 삭제한다
			return 1;
		}else if(tmpArr.length<max){	//배열에 없고 배열의 크기가 4 이하일 때 체크 시(새로 체크한 경우)
			tmpArr.push(data);	//배열에 해당 체크값의 value를 추가한다
			return 1;
		}else{	//5개 이상 체크한 경우
			$(obj).prop('checked',false); //체크값을 false로 수정한다
			return 0;
		}
	}
	//arr에 있는 값을 토대로 배너에 적용하는 함수
	function displayArr(){
		if(arr.length == 0){
			var i = 0;
			$('.banner-black .banner-img').each(function(){
				//기존에 불필요한 클래스 제거
				$(this).parent().removeClass('display-none');
				$(this).attr('class','banner-img');
				$(this).addClass(defaultArr[i++]);
			})
		}else{
			var i = 0;
			$('.banner-black .banner-img').each(function(){
				//기존에 불필요한 클래스 제거
				$(this).parent().removeClass('display-none');
				$(this).attr('class','banner-img');
				if(i<arr.length){
					$(this).addClass(arr[i++]);
				}else{
					$(this).parent().addClass('display-none');
				}
			})
		}
	}
	//arr.push('book');
	displayArr();

	$('.more-confirm').click(function(){	//확인 버튼이 눌렸을 때
		arr = copyArr(tmpArr);	//arr에 현재 tmpArr를 복사해서 저장
		if(arr.length == 0){
			alert('선택된 메뉴가 없습니다. 초기 설정으로 돌아갑니다.');
		}
		moreBoxClose();	//더보기 창을 닫고 체크박스들에 display-none을 추가
		displayArr();	//배너에 배열의 value들을 클래스에 추가
	});
	
	$('.more-setting').click(function(){	//메뉴 변경 클릭 시
		checkArr();	//현재 배너에 있는 배열의 값들을 체크박스에 체크
		drawOpenBox(arr);
		$('.banner-black .empty').removeClass('border-green');
		$('.banner-black .empty').eq(0).addClass('border-green');
	});

	$('.setting-list input[type=checkbox]').change(function(){
		if(arrCheck($(this),5) == 0){
			alert('최대 5개까지만 선택할 수 있습니다.');
		}
	});

	$('.l3-item-p').hover(function(){
		$(this).find('.l3-item-1').toggleClass('display-block');
		$(this).find('.l3-item').toggleClass('display-none');
	})

	//더보기 또는 접기 버튼 클릭하면 
	$('.more').click(function(){
		//접기 버튼을 누르면 박스 접기
		if($(this).hasClass('fold')){
			moreBoxClose();	
			displayArr();
		}
		//아니면 박스 열기
		else
			moreBoxOpen();
	})
	//메뉴 설정 클릭
	$('.sub1>a:nth-child(2)').click(function(){
		$('.sub1').addClass('display-none');
		$('.sub2').removeClass('display-none');
		$('.setting-list input[type=checkbox]').removeClass('display-none');
	})
	//취소버튼
	$('.more-cancel').click(function(){
		moreBoxOpen();
		moreBoxClose();
		displayArr();
	})
	//각 서브메뉴 닫기 버튼 클릭
	$('.more-sub-menu .more-close').click(function(){
		moreBoxClose();
	})
	$('.more-init').click(function(){
		alert('초기 설정으로 돌아갑니다.');
		moreBoxClose();
		displayArr();
	});

	function drawOpenBox(arr){											//일괄처리 시 모든 코드가 같다면 ()로 일괄처리, 다르다면 each로 각각 세분화
		$('.banner-black .banner-img').attr('class','banner-img');	//모든 배너의 클래스를 기본 클래스로 설정
		var i = 0;	//변수 i 생성 및 0으로 초기화
		$('.banner-black .banner-img').each(function(){	//모든 배너의 개체 정보를 가져온다
			$(this).parent().removeClass('display-none');	//this의 부모에 display-none 클래스가 적용되어 있을 수 있기 때문에 제거
			if(i < arr.length){	//i가 arr의 길이보다 작으면
				$(this).addClass(arr[i++]);	//해당 객체에 arr[i]에 있는 클래스 추가 후 i 증가
			}else if(i < 5){	//i가 5보다 작으면
				$(this).addClass('empty');//빈 상자를 그리기 위한 클래스 추가
				i++;	//i증가
			}else{
				$(this).parent().addClass('display-none');	//부모의 클래스에 display-none추가
			}	
		});
	}

	function moreBoxOpen(){
		moreBox();
		$('.sub1').removeClass('display-none');
		tmpArr = arr.slice(0);
		checkArr();
	}
	function moreBoxClose(){
		moreBox();
		$('.sub2').addClass('display-none');
		$('.setting-list input[type=checkbox]').addClass('display-none');	
		tmpArr.splice(0);
	}
	function moreBox(){
		$('.more-bg-box').toggleClass('display-none');
		$('.more-box').toggleClass('display-none');
		$('.more').toggleClass('fold');
	}
});
