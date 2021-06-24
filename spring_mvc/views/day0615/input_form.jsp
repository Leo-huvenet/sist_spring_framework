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
	
</script>
</head>
<body>
<div>
	<form action="post_req.do" method="post">
		<label>닉네임</label><input type="text" name="nick">
		<label>나이</label><input type="text" name="age">
		<label>영화</label>
		<input type="checkbox" name="movie" value="크루엘라"/>크루엘라
		<input type="checkbox" name="movie" value="캐시트럭"/>캐시트럭
		<input type="checkbox" name="movie" value="아야와마녀"/>아야와마녀
		<input type="checkbox" name="movie" value="악마가시켰다"/>악마가시켰다
		<input type="submit" value="요청"/>
	</form>
</div>
</body>
</html>