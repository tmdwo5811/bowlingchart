<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>+ 지공 차트 프로그램 +</title>
<link rel="stylesheet" href='<c:url value="/resources/css/style.css" />'>
<script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
</head>

<body>
	<form action="changePassword" method="post" name="changePw">
		<div class="wrapper">
			<div id="pins"></div>
			<div class="form-signin">
				<h2 class="form-signin-heading">Change Password</h2>
				<br>
				<button type="button" onclick="location.href='list'" class="btn btn-lg btn-home" style="margin-top: 0;">홈으로</button>
				<br>
				<div class="textInput">
					<input type="password" name="userPw" class="form-control" id="userPw">
					<label for="userPw">현재 비밀번호</label>
				</div>
				<div class="textInput">
					<input type="password" name="userNewPw" class="form-control" id="userNewPw">
					<label for="userNewPw">신규 비밀번호</label>
				</div>
				<br>
				<div class="textInput" style="margin-top: 30px;">
					<input type="password" class="form-control" id="userNewPwSub">
					<label for="userNewPwSub">신규 비밀번호 체크</label>
				</div>
				<button class="btn btn-lg" type="button" onclick="changeUserPw()" style="margin-top: 40px;">비밀번호 변경하기</button>
			</div>
		</div>
	</form>

	<script type="text/javascript" src='<c:url value="/resources/script/form.js" />'></script>
	<script type="text/javascript" src='<c:url value="/resources/script/dalivation.js" />'></script>

</body>

</html>