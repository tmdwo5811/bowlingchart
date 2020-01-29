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
		성함 : ${memberSize.memberName}<br>
		연락처 : ${memberSize.memberPhone }<br>
		소속팀 : ${memberSize.teamName } 팀<br>
		<hr>
		Middle finger reverse : ${memberSize.middleFingerReverse} <br>
		Ring finger reverse : ${memberSize.ringFingerReverse}<br>
		Middle finger left : ${memberSize.middleFingerLeft}<br>
		Ring finger right : ${memberSize.ringFingerRight}<br>
		Insert 1 : ${memberSize.insert1}<br>
		Insert 2 : ${memberSize.insert2}<br>
		Middle finger forward : ${memberSize.middleFingerForward}<br>
		Ring finger forward : ${memberSize.ringFingerForward}<br>
		Span1 : ${memberSize.span1}<br>
		Span2 : ${memberSize.span2}<br>
		Thumb forward : ${memberSize.thumbForward}<br>
		Thumb left : ${memberSize.tumbLeft}<br>
		Thumb : ${memberSize.thumb}<br>
		Thumb right : ${memberSize.thumbRight}<br>
		Thumb reverse : ${memberSize.thumbReverse}<br>
		No.1 : ${memberSize.no1}<br>
		No.2 : ${memberSize.no2}<br>
		No.3 : ${memberSize.no3}<br>
		<hr>
		<h3>작성/수정일 : ${memberSize.reg_date }</h3>
</body>
</html>