<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset=" UTF-8">
 <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title></title>

<!-- bootstrap -->
<link href="http://localhost/spring_mvc/common/bootstrap-3.3.2/css/bootstrap.min.css" rel="stylesheet">
<!-- jQuery CDN(Contents Delivery Network) -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>
<!-- bootstrap -->
<script src="http://localhost/spring_mvc/common/bootstrap-3.3.2/js/bootstrap.min.js"></script>
<style type="text/css">

</style>
<script type="text/javascript">

</script>
</head>
<body>
<div id = "noticeDiv">
<!-- ModelAndView에 저장된 값을 받아서 출력 -->
<ul>
	<c:if test="${ empty notice }">
		<li>공지사항이 존재하지 않습니다.</li>
	</c:if>
	<c:forEach var="notice" items="${ notice }">
		<c:set var="i" value="${ i+1 }"/>
		<li><c:out value="${ i }"/><c:out value="${ notice }"/> </li>
	</c:forEach>
</ul>
</div>
<div id="imgDiv">
	<c:forEach var="img" items="${ img }">
		<img src="http://localhost/sist/common/images//${ img }" style="width: 100px"/>
	</c:forEach>
</div>
</body>
</html>