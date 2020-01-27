<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 가입 페이지</title>
</head>
<body>
	<form action="userJoin" method="post">
	사용할 아이디 : <input type="text" name="userId"><br>
	사용할 비밀번호 : <input type="password" name="userPassWord"><br>
	<input type="submit" value="회원가입">
	</form>
</body>
</html>