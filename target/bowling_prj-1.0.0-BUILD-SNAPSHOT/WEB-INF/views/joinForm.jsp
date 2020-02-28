<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>+ 지공 차트 프로그램 +</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" href='<c:url value="/resources/css/style.css" />'>

<!-- jQuery CDN Import -->
<script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
<!-- 폰트어썸 -->
<script src="https://kit.fontawesome.com/d2fe288f96.js" crossorigin="anonymous"></script>
<!-- 시멘틱 UI CDN -->
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/semantic-ui/2.2.9/semantic.min.css" />
<script src="https://cdnjs.cloudflare.com/ajax/libs/semantic-ui/2.2.9/semantic.min.js"></script>
<!-- 볼링핀 동적 움직임을 위핸 css -->
<link rel="stylesheet" href='<c:url value="/resources/css/style.css" />'>
</head>
<body>
	<div class="join__wrapper">
			<div id="joinPins"></div>
		<form action="userJoin" method="post">
			<div class="join__form">
				<h2>회원 가입</h2>
				<div class="textInput join-form">
					<h4>이름</h4>
					<input type="text" name="userName" class="join-input" id="name" />
					<label for="name">사용자이름(*실명)</label>
					<spring:hasBindErrors name="userDTO">
						<c:if test="${errors.hasFieldErrors('userName')}">
							<strong>실명은 ${errors.getFieldError('userName').defaultMessage }</strong>
							<br>
						</c:if>
					</spring:hasBindErrors>
				</div>
				<div class="textInput join-form">
					<h4>아이디</h4>
					<input type="text" name="userId" class="join-input" id="id" />
					<label for="id">사용할 아이디 입력</label>
					<spring:hasBindErrors name="userDTO">
						<c:if test="${errors.hasFieldErrors('userId')}">
							<strong>아이디는 ${errors.getFieldError('userId').defaultMessage }</strong>
							<br>
						</c:if>
					</spring:hasBindErrors>
				</div>
				<div class="textInput join-form">
					<h4>비밀번호</h4>
					<input type="password" name="userPw" class="join-input" id="pw" />
					<label for="pw">사용할 비밀번호 입력</label>
					<spring:hasBindErrors name="userDTO">
						<c:if test="${errors.hasFieldErrors('userPw')}">
							<strong>비밀번호는 ${errors.getFieldError('userPw').defaultMessage }</strong>
							<br>
						</c:if>
					</spring:hasBindErrors>
				</div>
				<div class="textInput join-form">
					<h4>정보 수신용 이메일</h4>
					<input type="text" name="userEmail" class="join-input" id="email" />
					<label for="email" class="email-form">수신받을 사용자 이메일 입력</label>
					<spring:hasBindErrors name="userDTO">
						<c:if test="${errors.hasFieldErrors('userEmail')}">
							<strong>${errors.getFieldError('userEmail').defaultMessage }</strong>
							<br>
						</c:if>
					</spring:hasBindErrors>
				</div>
				<div class="joinBtn">
					<button class="btn btn-lg" type="submit">회원가입</button>
					<button type="button" class="btn btn-home" onclick="location.href='index'"
					style="margin-left: 10px;">홈으로</button>
				</div>
			</div>
		</form>
	</div>
	<script type="text/javascript" src='<c:url value="/resources/script/form.js" />'></script>
</body>
</html>