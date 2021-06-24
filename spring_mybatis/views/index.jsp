<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset=" UTF-8">
 <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title></title>

<!-- bootstrap -->
<link href="http://localhost/spring_mybatis/common/bootstrap-3.3.2/css/bootstrap.min.css" rel="stylesheet">
<!-- jQuery CDN(Contents Delivery Network) -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>
<!-- bootstrap -->
<script src="http://localhost/spring_mybatis/common/bootstrap-3.3.2/js/bootstrap.min.js"></script>
<style type="text/css">

</style>
<script type="text/javascript">
function removeEmp( empno ){
	if( confirm(empno+"번 사원을 삭제하시겠습니까?") ){
		location.href = "remove/remove_cp_emp.do?empno="+empno;
	}
}
</script>
</head>
<body>
<div>
<ul>
	<li><a href="insert/one_value.do?data=10">기본형 데이터형의 추가(값 하나 추가)</a></li>
	<li>
		<form action="insert/cp_emp_add.do" method="post">
			<label>사원번호 :</label><input type="text" name="empno"><br/>
			<label>사원명 :</label><input type="text" name="ename"><br/>
			<label>부서번호 :</label><input type="text" name="deptno"><br/>
			<label>직무 :</label><input type="text" name="job"><br/>
			<label>연봉 :</label><input type="text" name="sal"><br/>
			<input type="submit" value="추가"/>
		</form>
	</li>
	<li>
		<form action="update/cp_emp_modify.do" method="post">
			<label>사원번호 :</label><input type="text" name="empno" readonly="readonly"
					value="${ empData.empno }"/><br/>
			<label>사원명 :</label><input type="text" name="ename" value="${ empData.ename }"/><br/>
			<label>부서번호 :</label><input type="text" name="deptno" value="${ empData.deptno }"/><br/>
			<label>직무 :</label><input type="text" name="job" value="${ empData.job }"/><br/>
			<label>연봉 :</label><input type="text" name="sal" value="${ empData.sal }"/><br/>
			<input type="submit" value="변경"/>
		</form>
	</li>
	<li>
	사원삭제<br/>
	<c:forEach var="empno" items="${ empData1 }">
		<a href="#void" onclick="removeEmp(${ empno })"><c:out value="${ empno }"/></a>
	</c:forEach>
	</li>
	<li><a href="select/select_menu.do">사원조회</a></li>
</ul>
</div>
</body>
</html>