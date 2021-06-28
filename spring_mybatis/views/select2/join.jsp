<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<link href="http://localhost/Spring_mybatis/common/bootstrap-3.3.2/css/bootstrap.min.css" rel="stylesheet">

<div>
	
</div>
<div>
	<table class = "table">
		<thead>
			<tr>
				<td style="width: 50px">번호</td>
				<td style="width: 80px">부서번호</td>
				<td style="width: 120px">부서명</td>
				<td style="width: 100px">위치</td>
				<td style="width: 80px">사원번호</td>
				<td style="width: 150px">사원명</td>
				<td style="width: 150px">연봉</td>
				<td style="width: 120px">직무</td>
				<td style="width: 170px">입사일</td>
			</tr>
		</thead>
		<tbody>
			<c:if test="${ empty listJd }">
				<tr>
					<td colspan="9" align="center">
						조회된 사원정보가 없습니다.
					</td>
				</tr>
			</c:if>
			<c:forEach var="jd" items="${ empList }">
				<c:set var="i" value="${ i + 1 }"/>
				<tr>
					<td><c:out value="${ i }"/> </td>
					<td><c:out value="${ jd.deptno}"/> </td>
					<td><c:out value="${ jd.dname }"/> </td>
					<td><c:out value="${ jd.loc }"/> </td>
					<td><c:out value="${ jd.empno }"/> </td>
					<td><c:out value="${ jd.ename }"/> </td>
					<td><c:out value="${ jd.job }"/> </td>
					<td><c:out value="${ jd.sal }"/> </td>
					<td><c:out value="${ jd.hiredate }"/> </td>				
				</tr>
			</c:forEach>			
		</tbody>
	</table>
</div>

