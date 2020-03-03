<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>+ 수정 지공 차트 프로그램 +</title>
<link rel="stylesheet" href='<c:url value="/resources/css/style.css" />'>
<meta name="viewport" content="width=device-width, initial-scale=0.9" />
<script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
<script type="text/javascript" src='<c:url value="/resources/script/dalivation.js" />'></script>
</head>
<body>
	<form action="login" method="post" name="loginForm">
		<div class="wrapper">
			<div id="pins"></div>
			<div class="form-signin">
				<h2 class="form-signin-heading">LOGIN</h2>
				<br>
				<div class="textInput">
					<input type="text" name="aId" class="form-control" id="id" />
					<label for="id">아이디를 입력하세요</label>
				</div>
				<div class="textInput">
					<input type="password" name="aPw" class="form-control" id="pw" />
					<label for="pw">비밀번호를 입력하세요</label>
				</div>
				<button class="btn btn-lg" type="button" onclick="loginFormCheck()">로그인</button>
				
	</form>
	<input class="btn btn__signup" type="button" value="회원가입" onclick="location.href='joinForm'" />
	<input class="btn btn__pwfind" type="button" value="비밀번호찾기" onclick="location.href='findPwForm'" />
			</div>
		</div>
	<script type="text/javascript" src='<c:url value="/resources/script/form.js" />'></script>
</body>
</html>