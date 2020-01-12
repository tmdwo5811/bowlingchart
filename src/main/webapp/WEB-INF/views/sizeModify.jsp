<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<a href="index">홈으로</a><br>
	<form action="modifyMemberSizeSave">
	<input type="hidden" value="${memberSize.userNo }" name="userNo">
		성함 : <input type="text" placeholder="${memberSize.userName}" name="bName" value="${memberSize.userName}"><br>
		연락처 : <input type="text" placeholder="${memberSize.phone}" name="bPhone" value="${memberSize.phone}"><br>
		소속팀 : 
		<select name="teamNo">
			<c:forEach items="${teamList}" var="team">
				<option value="${team.teamNo}" ${team.teamNo == memberSize.team_teamNo?'selected="selected"':''}>${team.teamName} 팀</option>
			</c:forEach>
		</select>
		
		MF 사이즈 : <input type="text" placeholder="${memberSize.mFsize }" value="${memberSize.mFsize }" name="bMsize"><br>
		RF 사이즈 : <input type="text" placeholder="${memberSize.rFsize }" value="${memberSize.rFsize}" name="bRsize"><br>
		작성/수정일 : ${memberSize.reg_date }<br>
		<input type="submit" value="수정하기">
	</form>
		
		
</body>
</html>