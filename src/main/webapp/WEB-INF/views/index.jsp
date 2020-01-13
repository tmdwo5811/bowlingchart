<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>   
<html>
<head>
<title>+ 왕궁볼링장 +</title>
</head>
<body>
	<h1>왕궁볼링장 지공 데이터 프로그램</h1>
	<div>
		<form action="userSearch" method="get" style="display: inline">
			<input type="text" placeholder="회원 검색" name="userSearch">
			<input type="submit" value="검색">
		</form>
		
		<a href="loginPage">로그인</a> <br>
		<table>
			<tr>
				<td>회원번호</td>
				<td>회원이름</td>
				<td>연락처</td>
				<td>작성/수정일</td>
				<td>수정 버튼</td>
				<td>삭제 버튼</td>
				<td><a href="sizeWrite">지공 사이즈 작성</a></td>
			</tr>
			<c:forEach items="${main}" var="dto">
			<tr>
				<td>${dto.userNo}</td>
				<td><a href="sizeView?userNo=${dto.userNo}">${dto.userName}</a></td>
				<td>${dto.phone }</td>
				<td>${dto.reg_date }</td>
				<td><a href="modifySizePage?userNo=${dto.userNo}">회원정보 수정</a></td>
				<td><a href="deleteMemberSize?userNo=${dto.userNo}">회원정보 삭제</a></td>
			</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>
