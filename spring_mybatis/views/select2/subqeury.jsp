<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<link href="http://localhost/Spring_mybatis/common/bootstrap-3.3.2/css/bootstrap.min.css" rel="stylesheet">

<div>
	전체게시물 수 : <c:out value="${ totalCnt }"/>건<br/>
	한 화면에 보여줄 게시물의 수  : <c:out value="${ pageScale }"/>건<br/>
	총 페이지 수  : <c:out value="${ totalPage }"/>장<br/>
	시작번호  : <c:out value="${ startNum }"/><br/>
	끝번호  : <c:out value="${ endNum }"/><br/>
</div>
<div>
	<table class = "table">
		<thead>
			<tr>
				<td style="width: 10px">번호</td>
				<td style="width: 10px">모델명</td>
				<td style="width: 70px">옵션</td>
				<td style="width: 10px">연식</td>
				<td style="width: 20px">입력일</td>
			</tr>
		</thead>
		<tbody>
		<c:if test="${ empty boradList }">
		<tr>
			<td colspan="5" align="center">
				조회된 차량 정보가 존재하지 않습니다.
			</td>
		</tr>
		</c:if>
			<c:forEach var="bd" items="${ boardList }">
				<c:set var="j" value="${ j + 1 }"/>
				<c:set var="i" value="${ toalCnt - (param..currentPage-1)*pageScale - j }"/>
				
				<tr>
					<td><c:out value="${ i+1 }"/> </td>
					<td><c:out value="${ bd.model }"/> </td>
					<td><c:out value="${ bd.car_option }"/> </td>
					<td><c:out value="${ bd.car_year }"/> </td>
					<td><c:out value="${ bd.hiredate }"/> </td>
				</tr>
			</c:forEach>			
		</tbody>
	</table>
</div>
<div>
	<c:forEach var="pageNum"  begin="1"  end="${ totalPage }" step="1">
		[ <a href="http://localhost/Spring_mybatis/select/select_menu.do?page=subquery&currentPage=${ pageNum }"> <c:out value="${ pageNum }"/> </a> ]
	</c:forEach>
</div>
