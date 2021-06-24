<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
	location.href = "http://localhost/sist/index.html";
</script>
</head>
<body>
<div>
	이름 : <c:out value="${ name }"/><br/> <!-- 세션 -->
	닉네임 : <c:out value="${ nick }"/><br/>
	나이 : <c:out value="${ age }"/><br/> <!-- 세션 -->
	<a href="http://localhost/sist/index.html">메인화면</a>
</div>
</body>
</html>