<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div>
<c:if test="${ not empty param.sal }">
	연봉에 대한 조회 : <c:out value="${ param.sal }"/>
</c:if>
<table border="1">
	<thead>
	<tr>
		<th>사원번호</th><th>사원명</th><th>연봉</th><th>입사일</th>
	</tr>
	</thead>
	<tbody>
		<c:forEach var="emp" items="${ empList }">
		<tr>
			<td><c:out value="${ emp.empno }"/></td>
			<td><c:out value="${ emp.ename }"/></td>
			<td><c:out value="${ emp.sal }"/></td>
			<td><c:out value="${ emp.hiredate }"/></td>
		</tr>
		</c:forEach>
	</tbody>
</table>
</div>
