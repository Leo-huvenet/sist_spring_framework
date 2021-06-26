<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div>
<c:forEach var="ename" items="${ enameList }">
	<strong><c:out value="${ ename }"/></strong><br/>
</c:forEach>
</div>