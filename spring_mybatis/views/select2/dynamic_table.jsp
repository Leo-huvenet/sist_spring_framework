<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<link href="http://localhost/Spring_mybatis/common/bootstrap-3.3.2/css/bootstrap.min.css" rel="stylesheet">
<div>
	<form action="http://localhost/sist/select/select_menu.do">
		<input type="hidden" name="page" value="dynamicTable">
		<strong>사원정보조회</strong><br/>
		<input type="radio" name="loc" value="emp"${ param.loc eq 'emp'?"checked='checked'":"" }>본사
		<input type="radio" name="loc" value="cp_emp1"${ param.loc eq 'emp'?"checked='checked'":"" }>중국지사
		<input type="radio" name="loc" value="cp_emp2"${ param.loc eq 'emp'?"checked='checked'":"" }>미국지사
		<input type="submit" value="조회"/><br/>
	</form>
</div>
<div>
	<table border="1">
		<thead>
		<tr>
			<th>사원번호</th><th>사원명</th><th>연봉</th><th>입사일</th>
		</tr>
		</thead>
		<tbody>
		<c:if test="${ empty empList }">
			<tr>
				<td colspan="4">조회된 사원 정보가 존재하지 않습니다.</td>
			</tr>
		</c:if>
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
