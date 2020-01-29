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
	<a href="list">홈으로</a><br>
	<form action="modifyMemberSizeSave" method="post">
	<input type="hidden" value="${memberSize.memberNo }" name="memberNo">
		성함 : <input type="text" placeholder="${memberSize.memberName}" name="memberName" value="${memberSize.memberName}"><br>
		연락처 : <input type="text" placeholder="${memberSize.memberPhone}" name="memberPhone" value="${memberSize.memberPhone}"><br>
		소속팀 : 
		<select name="teamNo">
			<c:forEach items="${teamList}" var="team">
				<option value="${team.teamNo}" ${team.teamNo == memberSize.team_teamNo?'selected="selected"':''}>${team.teamName} 팀</option>
			</c:forEach>
		</select>
		<br>
		Middle finger reverse : <input type="text" name="middleFingerReverse" placeholder="${memberSize.middleFingerReverse}" value="${memberSize.middleFingerReverse}"><br>
		Ring finger reverse : <input type="text" name="ringFingerReverse" placeholder="${memberSize.ringFingerReverse}" value="${memberSize.ringFingerReverse}"><br>
		Middle finger left : <input type="text" name="middleFingerLeft" placeholder="${memberSize.middleFingerLeft}" value="${memberSize.middleFingerLeft}"><br>
		Ring finger right : <input type="text" name="ringFingerRight" placeholder="${memberSize.ringFingerRight}" value="${memberSize.ringFingerRight}"><br>
		Insert 1 : <input type="text" name="insert1" placeholder="${memberSize.insert1}" value="${memberSize.insert1}"><br>
		Insert 2 : <input type="text" name="insert2" placeholder="${memberSize.insert2}" value="${memberSize.insert2}"><br>
		Middle finger forward : <input type="text" name="middleFingerForward" placeholder="${memberSize.middleFingerForward}" value="${memberSize.middleFingerForward}"><br>
		Ring finger forward : <input type="text" name="ringFingerForward" placeholder="${memberSize.ringFingerForward}" value="${memberSize.ringFingerForward}"><br>
		Span1 : <input type="text" name="span1" placeholder="${memberSize.span1}" value="${memberSize.span1}"><br>
		Span2 : <input type="text" name="span2" placeholder="${memberSize.span2}" value="${memberSize.span2}"><br>
		Thumb forward : <input type="text" name="thumbForward" placeholder="${memberSize.thumbForward}" value="${memberSize.thumbForward}"><br>
		Thumb left : <input type="text" name="tumbLeft" placeholder="${memberSize.tumbLeft}" value="${memberSize.tumbLeft}"><br>
		Thumb : <input type="text" name="thumb" placeholder="${memberSize.thumb}" value="${memberSize.thumb}"><br>
		Thumb right : <input type="text" name="thumbRight" placeholder="${memberSize.thumbRight}" value="${memberSize.thumbRight}"><br>
		Thumb reverse : <input type="text" name="thumbReverse" placeholder="${memberSize.thumbReverse}" value="${memberSize.thumbReverse}"><br>
		No.1 : <input type="text" name="no1" placeholder="${memberSize.no1}" value="${memberSize.no1}"><br>
		No.2 : <input type="text" name="no2" placeholder="${memberSize.no2}" value="${memberSize.no2}"><br>
		No.3 : <input type="text" name="no3" placeholder="${memberSize.no3}" value="${memberSize.no3}"><br>
		작성/수정일 : ${memberSize.reg_date }<br>
		<input type="submit" value="수정하기">
	</form>
		
		
</body>
</html>