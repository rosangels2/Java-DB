<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>	<!-- c태그를 사용하기 위한 링크 -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<nav class="navbar navbar-expand-sm bg-info navbar-dark" style="position: relative;">
  <ul class="navbar-nav">
    <li class="nav-item active">
      <a class="nav-link"href="<%=request.getContextPath()%>/member/modify">회원정보 수정</a>	
    </li>
    <li class="nav-item">
      <a class="nav-link" href="<%=request.getContextPath()%>/board/list">게시판</a>
    </li>
    <li class="nav-item">
      <a class="nav-link nav-logout" href="<%=request.getContextPath()%>/signout" style="position: absolute;right: 0;width: 100px;">로그아웃</a>
    </li>
  </ul>
</nav>