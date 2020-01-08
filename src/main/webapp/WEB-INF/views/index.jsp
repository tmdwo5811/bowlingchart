<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>
<head>
<title>+ 왕궁볼링장 +</title>
</head>
<body>
	<h1>왕궁볼링장 지공 데이터 프로그램</h1>
	<div>
		<form action="" method="get" style="display: inline">
			<input type="text" placeholder="회원 검색">
			<input type="submit" value="검색">
		</form>
		<a href="loginPage">로그인</a> <br>
		<table>
			<tr>
				<td>회원번호</td>
				<td>회원이름</td>
				<td>연락처</td>
				<td>작성/수정일</td>
				<td><a href="sizeWrite">지공 사이즈 작성</a></td>
			</tr>
			<tr>
				<td>${login.userId}</td>
				<td>${login.userPw}</td>
				<td>${userPhone }</td>
				<td>${writeDate }</td>
			</tr>
		</table>
	</div>
</body>
</html>
