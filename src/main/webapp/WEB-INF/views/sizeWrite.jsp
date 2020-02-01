<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<a href="list">홈으로</a>
	<form action="sizeSave" method="post">
		<input type="hidden" name="userNo" value="${sessionScope.userNo}">
		성함 : <input type="text" name="memberName">
		<spring:hasBindErrors name="repositoryDTO">
			<c:if test="${errors.hasFieldErrors('memberName') }">
				<strong>회원 이름은 ${errors.getFieldError('memberName').defaultMessage }</strong>
			</c:if>
		</spring:hasBindErrors>
		<br>
		연락처 : <input type="text" name="memberPhone">
		<spring:hasBindErrors name="repositoryDTO">
			<c:if test="${errors.hasFieldErrors('memberPhone') }">
				<strong>연락처는 ${errors.getFieldError('memberPhone').defaultMessage }</strong>
			</c:if>
		</spring:hasBindErrors>
		<br>
		소속팀 : 
		<select name="teamNo">
			<c:forEach items="${teamList}" var="team">
				<option value="${team.teamNo}">${team.teamName} 팀</option>
			</c:forEach>
		</select>
		<br>
		<br>
		Middle finger reverse : <input type="text" name="middleFingerReverse" placeholder="Middle finger reverse"><br>
		Ring finger reverse : <input type="text" name="ringFingerReverse" placeholder="Ring finger reverse"><br>
		Middle finger left : <input type="text" name="middleFingerLeft" placeholder="Middle finger left"><br>
		Ring finger right : <input type="text" name="ringFingerRight" placeholder="Ring finger right"><br>
		Insert 1 : <input type="text" name="insert1" placeholder="Insert 1"><br>
		Insert 2 : <input type="text" name="insert2" placeholder="Insert 2"><br>
		Middle finger forward : <input type="text" name="middleFingerForward" placeholder="Middle finger forward"><br>
		Ring finger forward : <input type="text" name="ringFingerForward" placeholder="Ring finger forward"><br>
		Span1 : <input type="text" name="span1" placeholder="Span1"><br>
		Span2 : <input type="text" name="span2" placeholder="Span2"><br>
		Thumb forward : <input type="text" name="thumbForward" placeholder="Thumb forward"><br>
		Thumb left : <input type="text" name="tumbLeft" placeholder="Thumb left"><br>
		Thumb : <input type="text" name="thumb" placeholder="Thumb"><br>
		Thumb right : <input type="text" name="thumbRight" placeholder="Thumb right"><br>
		Thumb reverse : <input type="text" name="thumbReverse" placeholder="Thumb reverse"><br>
		No.1 : <input type="text" name="no1" placeholder="No.1"><br>
		No.2 : <input type="text" name="no2" placeholder="No.2"><br>
		No.3 : <input type="text" name="no3" placeholder="No.3"><br>
		<input type="submit" value="입력">
	</form>
	<hr>
	<h3>팀 생성 기능</h3>
	<form action="makeTeam" method="post">
		팀 이름 : <input type="text" name="wTeam">
		<input type="submit" value="팀 생성">
	</form>
	<hr>
	<h3>팀 삭제 기능</h3>
	<form action="deleteTeam" method="post">
		<select name="teamNo">
			<c:forEach items="${teamList}" var="team">
				<option value="${team.teamNo}" >${team.teamName} 팀</option>
			</c:forEach>
		</select>
		<input type="submit" value="삭제">
	</form>
</body>
</html>