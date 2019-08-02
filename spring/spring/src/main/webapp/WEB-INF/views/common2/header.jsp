<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<nav class="navbar navbar-expand-sm bg-dark navbar-dark fixed-top">
  <a class="navbar-brand" href="#">Logo</a>
  <ul class="navbar-nav">
    <li class="nav-item">
      <a class="nav-link" href="https://github.com/st8324" target="_blank">github</a>
    </li>
    <li class="nav-item">
      <a class="nav-link" href="<%=request.getContextPath()%>/board/list">게시판</a>
    </li>
    <c:if test="${user.authority eq 'ADMIN' }">
	    <li class="nav-item">
	      <a class="nav-link" href="<%=request.getContextPath()%>/admin/user/list">회원관리</a>
	    </li>
	    <li class="nav-item">
	      <a class="nav-link" href="<%=request.getContextPath()%>/admin/board/list">게시판 관리</a>
	    </li>
    </c:if>
    <li class="nav-item"style="right:20px; position:absolute;">
      <a class="nav-link" href="<%=request.getContextPath()%>/signout">로그 아웃</a>
    </li>
  </ul>
</nav> 