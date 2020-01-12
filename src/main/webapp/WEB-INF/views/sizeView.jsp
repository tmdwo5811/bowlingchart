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
		성함 : ${memberSize.userName}<br>
		연락처 : ${memberSize.phone }<br>
		소속팀 : ${memberSize.teamName } 팀<br>
		MF 사이즈 : ${memberSize.mFsize }<br>
		RF 사이즈 : ${memberSize.rFsize }<br>
		작성/수정일 : ${memberSize.reg_date }<br>
</body>
</html>