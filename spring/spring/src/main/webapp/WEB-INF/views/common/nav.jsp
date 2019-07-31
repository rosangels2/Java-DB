<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>	<!-- c태그를 사용하기 위한 링크 -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<nav class="navbar navbar-expand-sm bg-info navbar-dark" style="position: relative;">
  <ul class="navbar-nav">
    <li class="nav-item">
      <a class="nav-link"href="<%=request.getContextPath()%>/member/modify" style="color: white">회원정보 수정</a>	
    </li>
    <li class="nav-item">
      <a class="nav-link" href="<%=request.getContextPath()%>/board/list" style="color: white">게시판</a>
    </li>
    <li class="nav-item">
      <a class="nav-link" href="https://github.com/st8324" target="blank" style="color: white">gitHub</a>	<!-- 타겟 blank = 새 탭 -->
    </li>
    <c:if test="${user ne null}">
        <li class="nav-item">
       		<div class="nav-link" style="color: black;">로그인 아이디 [ ${user.id} ] </div>
	    </li>
    </c:if>
    <c:if test="${user.authority eq 'ADMIN'}">
        <li class="nav-item">
	      <a class="nav-link" href="<%=request.getContextPath()%>/admin/user/list" style="color: white;">회원 등급 관리</a>
	    </li>
        <li class="nav-item">
	      <a class="nav-link" href="<%=request.getContextPath()%>/admin/board/list" style="color: white;">게시글 관리</a>
	    </li>
    </c:if>
    <li class="nav-item">
      <a class="nav-link nav-logout" href="<%=request.getContextPath()%>/signout" style="position: absolute;right: 0;width: 100px; color: white;">로그아웃</a>
    </li>
  </ul>
</nav>