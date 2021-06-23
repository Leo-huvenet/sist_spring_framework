<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" info=""%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>회원가입</title>
<link href="http://localhost/sinna_prj/common/css/join.css"rel="stylesheet">

<!-- bootstrap -->
<link href="http://localhost/sinna_prj/common/bootstrap-3.3.2/css/bootstrap.min.css" rel="stylesheet">

<!-- jQuery CDN(Contents Delivery Network) -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>
<!-- bootstrap -->
<script src="http://localhost/sinna_prj/common/bootstrap-3.3.2/js/bootstrap.min.js"></script>
<style type="text/css">
#container { font-family: 'Nanum Gothic', sans-serif; } 
#step_images1 { margin-right: 20px; margin-left: 20px }
#step_images2 { margin-right: 10px; margin-left: 20px }
#step_images3 { margin-right: 10px; margin-left: 30px }
#point { color: #D5B58A; font-weight: bold }
#con_header { font-weight: bold; font-size: 30px; }
.normal { font-weight: bold }

.inputBox { width: 300px; height: 40px; margin-bottom: 10px; }
.mail_inputBox { 	display: inline-block; width: 150px;  	height: 40px; margin-bottom: 10px }

</style>
<script type="text/javascript">
$(function () {
	$("#submit_btn").click(function () {
		//유효성검증
		$("#memberFrm").submit();
		// -location.href='http://localhost/sinna_prj/join/member_complete.jsp'
	});
	$("#cancel_btn").click(function () {
		location.href='http://localhost/sinna_prj/join/member_agreement.jsp'
	});
	$("#overid_btn").click(function () {
		window.open("id_dup.do?cmd=D001", "popup", "width=500, height=302, top="
			+ (window.screenTop + 300) + ",left=" + (window.screenLeft + 700))
	})

});

</script>
</head>
<body>


<div id="container">
<div id="con_header" class="txt_center">회원정보 입력</div>

	<div id="step" class="txt_center">
	 <div class="inline">
	  <img src="http://localhost/sinna_prj/common/images/step/step1.png" id="step_images1"/>
	  <span class="normal">약관동의</span>
	 </div>
	 <div class="inline">
	  <img src="http://localhost/sinna_prj/common/images/step/gold_line_step2.png" id="step_images2"/>
	  <span id="point">회원정보 입력</span>
	 </div>
	 <div class="inline">
	  <img src="http://localhost/sinna_prj/common/images/step/line_step3.png" id="step_images3"/>
	  <span class="normal">가입완료</span>
	 </div>
	</div>
	<!-- 네비게이션 끝 -->
	
	<!-- 내용 시작 -->
	<div id="contents_info">
<form action="member_info_process.jsp" method="post" name="frm" id="memberFrm">
<input type="hidden" name="cmd" value="M002">
	<div>
		<label style="padding-top: 20px">아이디<font color="#FF0000" >*</font></label>
		 <input type="text" class="form-control" class="inputBox"  style="margin-bottom: -40px"   placeholder="아이디 입력"  id="member_id" name="member_id" > 
		<div id="id_button">
			<input class="over_button" id="overid_btn" type="button" value="중복확인" style="margin-top: 50px">
		</div>
		<label style="margin-top: -100px">비밀번호<font color="#FF0000">*</font></label>
		 <input type="text" class="form-control" class="inputBox"  placeholder="비밀번호 입력" id="member_pass" name="member_pass"  >
			
		<label>비밀번호 확인<font color="#FF0000">*</font></label>
		 <input type="text" class="form-control"
			class="inputBox" placeholder="비밀번호 다시 입력 " id="member_pass" >	
			
		<label>이메일</label><br/> <input type="text" class="form-control"
			class="mail_inputBox" placeholder="이메일 입력"  id="email" name="email"> 
		<label>@</label>
		<select name="domain"
			class="mail_inputBox" class="form-control" >
			<option>naver.com</option>
			<option>daum.net</option>
			<option>gmail.com</option>
			<option>nate.com</option>
		</select><br/>
		
		<label>한글 이름<font color="#FF0000">*</font></label>
		 <input type="text" class="form-control"
			class="inputBox"  placeholder="이름 입력"  id="member_name" name="member_name" >
			
				<label>생년월일<font color="#FF0000">*</font></label>
		 <input type="text" class="form-control"
			class="inputBox"  placeholder="생년월일 입력"  id="birth" name="birth">
			
		<label>연락처</label>
		<input type="text" class="form-control" class="inputBox"  placeholder="전화번호 입력" style="margin-bottom: 40px" id="tel" name="tel">
			
	</div>
</form>
	</div>
	<!-- 내용 끝 -->
	
	<!-- 버튼 시작 -->
	<div id="btn">
		<input id="cancel_btn" type="button" value="이전">
		<input id="submit_btn" type="button" value="가입">
	</div>
	<!-- 버튼 끝 -->
</div>

</body>
</html>