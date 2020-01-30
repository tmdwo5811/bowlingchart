<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 가입 페이지</title>
</head>
<body>
	<a href="index">홈으로</a>
	<form action="userJoin" method="post">
	실명 : <input type="text" name="userName">
	<spring:hasBindErrors name="userDTO">
		<c:if test="${errors.hasFieldErrors('userName')}">
			<strong>실명은 ${errors.getFieldError('userName').defaultMessage }</strong><br>
		</c:if>
	</spring:hasBindErrors>
	사용할 아이디 : <input type="text" name="userId">
	<spring:hasBindErrors name="userDTO">
		<c:if test="${errors.hasFieldErrors('userId')}">
			<strong>아이디는 ${errors.getFieldError('userId').defaultMessage }</strong><br>
		</c:if>
	</spring:hasBindErrors>
	사용할 비밀번호 : <input type="password" name="userPw">
	<spring:hasBindErrors name="userDTO">
		<c:if test="${errors.hasFieldErrors('userPw')}">
			<strong>비밀번호는 ${errors.getFieldError('userPw').defaultMessage }</strong><br>
		</c:if>
	</spring:hasBindErrors>
	정보 수신용 이메일 : <input type="text" name="userEmail">
	<spring:hasBindErrors name="userDTO">
		<c:if test="${errors.hasFieldErrors('userEmail')}">
			<strong>${errors.getFieldError('userEmail').defaultMessage }</strong><br>
		</c:if>
	</spring:hasBindErrors>
	<input type="submit" value="회원가입">
	</form>
</body>
</html>