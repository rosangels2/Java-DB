<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>	<!-- c태그를 사용하기 위한 링크 -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<jsp:include page="/WEB-INF/views/common/header.jsp"></jsp:include>
</head>
<style type="text/css">
</style>
<script type="text/javascript">
	$(document).ready(function(){
		$('#perPageNum').change(function(){
			var type = $('select[name=type]').val();	//검색한 상태에서 게시글 개수를 변경했을 떄 검색한 값을 유지하기 위해 추가
			var search = $('input[name=search]').val();
			location.href = "<%=request.getContextPath()%>/admin/user/list?perPageNum="+$(this).val()+'&type='+type+'&search='+search;
		});
		$('select[name=userModifySelect]').change(function(){
			location.href = "<%=request.getContextPath()%>/admin/user/modify?"+$(this).val()+"&search=${pageMaker.criteria.search}&type=${pageMaker.criteria.type}&page=${pageMaker.criteria.page}&perPageNum=${pageMaker.criteria.perPageNum}";
		});
		
	});	//레디
</script>
<body>
<jsp:include page="/WEB-INF/views/common/nav.jsp"></jsp:include>
	<h1>회원 리스트</h1>
	    <select class="form-control col-3 float-right" id="perPageNum">
	    	<option <c:if test="${pageMaker.criteria.perPageNum == 1} ">selected</c:if> >1</option>
		    <option <c:if test="${pageMaker.criteria.perPageNum == 5} ">selected</c:if> >5</option>
		    <option <c:if test="${pageMaker.criteria.perPageNum == 10}">selected</c:if> >10</option>
		    <option <c:if test="${pageMaker.criteria.perPageNum == 15}">selected</c:if> >15</option>
		    <option <c:if test="${pageMaker.criteria.perPageNum == 20}">selected</c:if> >20</option>
		    <option <c:if test="${pageMaker.criteria.perPageNum == 20}">selected</c:if> >50</option>
		</select>
	<table class="table">
		<tr>
			<th width="20%">아이디</th>		<!-- width를 통해 가로를 지정 -->
			<th width="10%">이름</th>
			<th width="30%">이메일</th>
			<th width="10%">등급</th>
			<th width="10%">수정</th>
		</tr>
		<c:forEach var="userList" items="${userList}">	<!-- 향상된 포문처럼 items에 있는 변수 list의 값을 0번지부터 하나씩 꺼내서 board에 추가한다 -->
			<tr>
				<th>${userList.id}</th>
				<th>${userList.name}</th>
				<th>${userList.email}</th>
				<th>${userList.authority}</th>
				<th>
					<select name="userModifySelect">
						<option value="id=${userList.id}&authority=USER&page=${pageMaker.criteria.page}" <c:if test="${userList.authority eq 'USER'}">selected</c:if> >USER</option>
						<option value="id=${userList.id}&authority=ADMIN&page=${pageMaker.criteria.page}" <c:if test="${userList.authority eq 'ADMIN'}">selected</c:if> >ADMIN</option>
					</select>
				</th>
			</tr>
		</c:forEach>
	</table>
	
	<ul class="pagination" style="justify-content: center;">
	    <c:if test="${pageMaker.prev}">	<!-- 이전 버튼(boolean 값이 true면 보여준다) -->
	        <li class="page-item">
	            <a class="page-link" href="<%=request.getContextPath()%>/admin/user/list?page=${pageMaker.startPage-1}&perPageNum=${pageMaker.criteria.perPageNum}&type=${pageMaker.criteria.type}&search=${pageMaker.criteria.search}">Previous</a>
	        </li>																<!-- 현재 페이지의 스타트 페이지에서 -1을 뺀 값을 페이지로 결정 -->
	    </c:if>
	    <c:forEach begin="${pageMaker.startPage }" end="${pageMaker.endPage}" var="index">	<!-- begin/end를 통해 시작과 끝을 지정하고 반복 -->
	        <c:if test="${pageMaker.criteria.page == index}">	<!-- uri의 페이지 번호가 index와 같다면 active를 추가-->
	        <li class="page-item active">													<!-- index : 반복문의 i같은 역할로 증감연산 -->
	            <a class="page-link" href="<%=request.getContextPath()%>/admin/user/list?page=${index}&perPageNum=${pageMaker.criteria.perPageNum}&type=${pageMaker.criteria.type}&search=${pageMaker.criteria.search}">${index}</a>	<!-- 숫자를 찍는 역할 -->
	        </li>
	        </c:if>
	        <c:if test="${pageMaker.criteria.page != index}">	<!-- uri의 페이지 번호가 index와 다르다면 -->
	        <li class="page-item">															<!-- index : 반복문의 i같은 역할로 증감연산 -->
	            <a class="page-link" href="<%=request.getContextPath()%>/admin/user/list?page=${index}&perPageNum=${pageMaker.criteria.perPageNum}&type=${pageMaker.criteria.type}&search=${pageMaker.criteria.search}">${index}</a>	<!-- 숫자를 찍는 역할 -->
	        </li>
	        </c:if>
	    </c:forEach>
	    <c:if test="${pageMaker.next}">	<!-- 다음버튼 -->
	        <li class="page-item">
	            <a class="page-link" href="<%=request.getContextPath()%>/admin/user/list?page=${pageMaker.endPage+1}&perPageNum=${pageMaker.criteria.perPageNum}&type=${pageMaker.criteria.type}&search=${pageMaker.criteria.search}">Next</a>
	        </li>
	    </c:if>
	</ul>
	
	<form class="" method="get" action="<%=request.getContextPath()%>/admin/user/list">
		<select name="type" class="float-left">
			<option value="0" <c:if test="${pageMaker.criteria.type eq 0}">selected</c:if> >선택</option>
			<option value="1" <c:if test="${pageMaker.criteria.type eq 1}">selected</c:if> >아이디</option>		<!-- URI 정보대로 선택 유지-->
			<option value="2" <c:if test="${pageMaker.criteria.type eq 2}">selected</c:if> >이름</option>
			<option value="3" <c:if test="${pageMaker.criteria.type eq 3}">selected</c:if> >이메일</option>
		</select>
		<input type="text" name="search" class="float-left" value="${pageMaker.criteria.search}">
		<button type="submit" class="btn btn-outline-success float-left">검색</button>
	</form>
</body>
</html>