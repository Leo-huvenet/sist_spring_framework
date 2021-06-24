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
	<strong>webapp하위폴더 include</strong><br/>
	<jsp:include page="/day0615/webapp_include.jsp"/>
</div>
<div>
	<strong>WEB-INF/하위폴더의 JSP를 직접 include</strong><br/>
	Controller를 거치지 않고 호출하기 때문에 데이터가 없다.<br/>
	<jsp:include page="/WEB-INF/views/day0615/views_include.jsp"/>	
</div>
<div>
	<strong>.do의 요청 include</strong><br/>
	Controller를 거쳐 호출하기 때문에 데이터가 있다.<br/>
	<jsp:include page="/day0615/include.do"/>	
</div>
</body>
</html>