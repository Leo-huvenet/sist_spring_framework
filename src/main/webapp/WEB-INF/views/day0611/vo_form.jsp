<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

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
	<form action="vo_process.do" method="get">
		<input type="text" name="nick" placeholder="닉네임"/><br/>
		<input type="text" name="age" placeholder="나이"/><br/>
		<input type="checkbox" value="캐시트럭" name="movie" />캐시트럭<br/>
		<input type="checkbox" value="크루엘라" name="movie" />크루엘라<br/>
		<input type="checkbox" value="컨저링3" name="movie" />컨저링3<br/>
		<input type="checkbox" value="분노의질주" name="movie" />분노의 질주<br/>
		<input type="checkbox" value="아야와마녀" name="movie" />아야와마녀<br/>
		<input type="submit" value="요청"/><br/>	
	</form>
</div>
</body>
</html>