<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>	<!-- c태그를 사용하기 위한 링크 -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<jsp:include page="/WEB-INF/views/common/header.jsp"></jsp:include>
<script src="https://code.jquery.com/jquery-3.4.1.js"></script>
</head>
<style type="text/css">
.box{
	border : 1px solid black;
}
.box div{
	font-size:30px;
}
</style>
<body>
<div class="container">         
  <table class="table">
    <thead>
      <tr>
        <th>게시글 제목</th>
        <th>작성자</th>
        <th>조회수</th>
        <th>작성일</th>
        <th>첨부파일</th>
      </tr>
    </thead>
    <tbody>
      <tr>
        <td>${board.title}</td>
        <td>${board.writer}</td>
        <td>${board.views}</td>
        <td>${board.registered}</td>
        <td><!-- getter를 호출 시 첫 글자가 대문자로 변환돼 호출되기 때문에 첫 글자를 카멜 표기법으로 입력 -->
			<c:if test="${board.fileName ne ''}">	<!-- 첨부파일이 있으면 파일명을 누를 시 다운로드 링크로 연결 -->
				<a href="<%=request.getContextPath()%>/board/download?fileName=${board.file}">${board.fileName}</a>
			</c:if>
			<c:if test="${board.fileName eq ''}">없음</c:if>	<!-- 첨부파일이 없을 경우 텍스트만 표시 -->
		</td>
	</div>
      </tr>
    </tbody>
  </table>
  <table class="table">
    <thead>
      <tr>
        <th>게시글 내용</th>
      </tr>
    </thead>
  </table>
  <div class="contents" style="padding-left: 12px; height: 300px; overflow: auto;">${board.contents}</div>
  <a href="<%=request.getContextPath()%>/board/list"> <button type="button" class="btn btn-outline-dark">게시글 목록</button> </a>
  <a href="<%=request.getContextPath()%>/board/register"> <button type="button" class="btn btn-outline-dark">게시글 등록</button> </a>
  <c:if test="${user.id eq board.writer}">
  	<a href="<%=request.getContextPath()%>/board/modify?num=${board.num}"> <button type="button" class="btn btn-outline-dark">게시글 수정</button> </a>
  	<a href="<%=request.getContextPath()%>/board/delete?num=${board.num}"> <button type="button" class="btn btn-outline-dark">게시글 삭제</button> </a>
  </c:if>
</body>
</html>