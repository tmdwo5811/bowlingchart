<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>왕궁볼링장 로그인 페이지</title>
</head>
<body>
	<form action="login" method="post">
		아이디 : <input type="text" name="aId" placeholder="아이디를 입력하세요">
		비밀번호 : <input type="password" name="aPw" placeholder="비밀번호를 입력하세요">
		<input type="submit" value="로그인" />
	</form>
	<a href="joinForm">회원 가입</a>
	<h2>${resultMessage}</h2>
</body>
</html>