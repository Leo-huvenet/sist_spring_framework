<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div>
	<strong>부서번호 : </strong><c:out value="${ deptInfo.deptno }"/>
	<strong>부서번호 : </strong><c:out value="${ deptInfo.dname }"/>
</div>