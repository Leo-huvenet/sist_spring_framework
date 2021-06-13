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
<link href="http://localhost/jsp_prj/common/bootstrap-3.3.2/css/bootstrap.min.css" rel="stylesheet">
<!-- jQuery CDN(Contents Delivery Network) -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>
<!-- bootstrap -->
<script src="http://localhost/jsp_prj/common/bootstrap-3.3.2/js/bootstrap.min.js"></script>
<style type="text/css">

</style>
<script type="text/javascript">

</script>
</head>
<body>
<div>
<c:choose>
	<c:when test="${ addMemberFlag }"></c:when>
	회원가입 성공<br/>
	<c:out value="${ param.member_id }"/>로 가입되었습니다.<br/>
	회원가입해주셔서 감사합니다.
	<c:otherwise>
	<c:out value="${ param.member_name }"></c:out>님 회원가입이 정상적으로 이뤄지지 않았습니다.<br/>
	잠시 후 다시 시도해주세요.
	</c:otherwise>
</c:choose>
</div>
</body>
</html>