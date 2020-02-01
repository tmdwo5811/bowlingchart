<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>   
<html>
<head>
<title>+ 왕궁볼링장 +</title>
</head>
<body>
	<h1>볼링장 지공 데이터 프로그램</h1>
	<h2>접속 회원명 : ${sessionScope.userName } 회원번호 : ${sessionScope.userNo }</h2>
	<div>
		<form action="/user/list" method="get" style="display: inline">
			<input type="text" placeholder="회원 검색" name="userSearch">
			<input type="submit" value="검색">
		</form>
		<a href="index">로그아웃</a> &nbsp;&nbsp;<a href="changeUserPwForm">비밀번호 변경하기</a><br>
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
				<td>${dto.memberNo}</td>
				<td><a href="sizeView?memberNo=${dto.memberNo}">${dto.memberName}</a></td>
				<td>${dto.memberPhone }</td>
				<td>${dto.reg_date }</td>
				<td><a href="modifySizePage?memberNo=${dto.memberNo}">회원정보 수정</a></td>
				<td><a href="deleteMemberSize?memberNo=${dto.memberNo}">회원정보 삭제</a></td>
			</tr>
			</c:forEach>
					</table>
		<table>
			<tr>
				<td>
					<c:if test="${navi.curBlock > 1}">
						<a href="index?curPage=1&userSearch=${userSearch}">[ 처음 ]</a>
					</c:if> 
					<c:if test="${navi.curBlock > 1}">
						<a href="index?curPage=${navi.prevPage }&userSearch=${userSearch}">[ 이전 ]</a>
					</c:if>
					<c:forEach var="num" begin="${navi.blockBegin }" end="${navi.blockEnd }">
						<c:choose>
							<c:when test="${num == navi.curPage }">
								<span style="color:red">${num}</span>&nbsp;
							</c:when>
							<c:otherwise>
								<a href="index?curPage=${num}&userSearch=${userSearch}">${num }</a>&nbsp;
							</c:otherwise>
						</c:choose>
					</c:forEach>
					<c:if test="${navi.curBlock <= navi.totBlock }">
						<a href="index?curPage=${navi.nextPage }&userSearch=${userSearch}">[ 다음 ]</a>
					</c:if>
					<c:if test="${navi.curPage < navi.totPage }">
						<a href="index?curPage=${navi.totPage }&userSearch=${userSearch}">[ 끝 ]</a>
					</c:if>
				</td>
			</tr>
		</table>
	</div>
</body>
</html>
