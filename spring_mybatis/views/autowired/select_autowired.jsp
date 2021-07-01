<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
 <meta http-equiv="X-UA-Compatible" content="IE=edge">
 <meta name="viewport" content="width=device-width, initial-scale=1">
 <title></title>
 <!-- bootstrap -->
 <link href="http://localhost/spring_mybatis/common/bootstrap-3.3.2/css/bootstrap.min.css" rel="stylesheet">

 <!-- jQuery CDN(Contents Delivery Network) -->
 <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>
 <script src="http://localhost/spring_mybatis/common/bootstrap-3.3.2/js/bootstrap.min.js"></script>
<style type="text/css">

</style>
<script type="text/javascript">
	function deleteMsg(empno, ename) {
	  confirm(ename+"회원정보를 삭제하시겠습니까?");
	}
</script>
</head>
<body>
<div>
<c:if test="${ empty empData }">
사원정보가 존재하지 않습니다.
</c:if>
<c:forEach var = "ed" items = "${ empData }">
<div>
<table border="">
<tr>
   <td style="width:80px">사원번호 / 사원명 </td>
   <td style="width:200px"><c:out value="${ ed.empno }"/><c:out value="${ ed.ename }"/></td>
   <td style="width:80px">연봉</td>
   <td style="width:100px"><c:out value="${ ed.sal }"/></td>
</tr>
<tr>
   <td>입사일</td>
   <td colspan="3"><c:out value="${ ed.hiredate }"/></td>
</tr>
<tr>
   <td colspan ="4">
   <input type="button" value="수정" onclick="updateFrm()"/>
   <input type="button" value="삭제" onclick="deleteMsg(${ ed.empno }, ${ ed.ename })"/>
   </td>
</tr>
</table>
</div>
</c:forEach>
</div>
</body>
</html>