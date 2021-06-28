<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<link href="http://localhost/Spring_mybatis/common/bootstrap-3.3.2/css/bootstrap.min.css" rel="stylesheet">
<div>
	<form action="http://localhost/sist/select/select_menu.do">
		<input type="hidden" name="page" value="dynamic_trim">
		<strong>기준 선택</strong><br/>
		<c:forEach var="i" begin="1" end="5" step="1">
			<input type="radio" name="flag" value="${ i }"/><c:out value="${ i }"/>
		</c:forEach>
		<input type="submit" value="조회"/><br/>
	</form>
</div>
<div>
	<table class="table">
		<thead>
		<tr>
			<th>사원명</th>
		</tr>
		</thead>
		<tbody>
		<c:if test="${ empty enameList }">
			<tr>
				<td colspan="4">사원 정보가 존재하지 않습니다.</td>
			</tr>
		</c:if>
			<c:forEach var="ename" items="${ enameList }">
			<tr>
				<td><c:out value="${ ename }"/></td>
			</tr>
			</c:forEach>
		</tbody>
	</table>
</div>
