<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>비밀번호 찾기 페이지</title>
</head>
<body>
	<a href="index">홈으로 돌아가기</a>
	<form action="findPw" method="post">
	ID : <input type="text" name="userId"><br>
	Email : <input type="text" name="userEmail"><br>
	<input type="submit" value="비밀번호 찾기">
	</form>
</body>
</html>