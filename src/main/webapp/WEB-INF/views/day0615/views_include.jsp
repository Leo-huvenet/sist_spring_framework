<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div>
	/WBB-INF/views 하위폴더에 존재하는 JSP로 외부에서 URL을 사용하여 직접 호출 할 수 없다.<br/>
	xxx.do로만 호출 가능<br/>
	Controller에서 보내오는 데이터를 보여줄 수 있다.<br/>
	<c:if test="${ empty list }">
		조회된 데이터가 없습니다.
	</c:if>
	<c:forEach var="includeDomain"  items="${ list }">
		<input type="text" value="${ includeDomain.nick },${ includeDomain.age }"
		placeholder="${ includeDomain.nick }님의 데이터">
	</c:forEach>
</div>
