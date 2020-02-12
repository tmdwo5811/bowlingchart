<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>+ 지공 차트 프로그램 +</title>
<!-- jQuery CDN Import -->
<script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
<!-- 시멘틱 UI CDN -->
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/semantic-ui/2.2.9/semantic.min.css" />
<script src="https://cdnjs.cloudflare.com/ajax/libs/semantic-ui/2.2.9/semantic.min.js"></script>

<!-- 로컬 CSS Import -->
<link rel="stylesheet" type="text/css" href='<c:url value="/resources/css/sizeForm.css" />'>
</head>
<body style="background-color:#eee;padding:30px;">
	<button type="submit" class="ui secondary button homeButton" onclick="location.href='list'">홈으로</button>
	<input type="hidden" name="userNo" value="${sessionScope.userNo}">

	<div class="inputDiv">
		<div class="textInput memberName">
			<input type="text" id="memberName" value="${memberSize.memberName }" readonly>
			<label for="memberName">회원명</label>
		</div>
		<div class="textInput memberPhone">
			<input type="text" id="memberPhone" value="${memberSize.memberPhone }" readonly>
			<label for="memberPhone">연락처</label>
		</div>
		<div class="textInput teamName">
			<input type="text" id="teamName" value="${memberSize.teamName }" readonly>
			<label for="teamName">팀 이름</label>
		</div>
		<div class="textInput regDate">
			<input type="text" id="regDate" value="${memberSize.reg_date }" readonly>
			<label for="teamName">작성/수정일</label>
		</div>
		<div class="textInput middleFingerReverse">
			<input type="text" class="chartInput" id="middleFingerReverse" value="${memberSize.middleFingerReverse} " readonly />
			<label for="middleFingerReverse">Middle finger reverse</label>
		</div>
		<div class="textInput ringFingerReverse">
			<input type="text" class="chartInput" id="ringFingerReverse" value="${memberSize.ringFingerReverse}" readonly>
			<label for="ringFingerReverse">Ring finger reverse</label>
		</div>
		<div class="textInput middleFingerLeft">
			<input type="text" class="chartInput" id="middleFingerLeft" value="${memberSize.middleFingerLeft}" readonly>
			<label for="middleFingerLeft">Middle finger left</label>
		</div>
		<div class="textInput ringFingerRight">
			<input type="text" class="chartInput" id="ringFingerRight" value="${memberSize.ringFingerRight}" readonly>
			<label for="ringFingerRight">Ring finger right</label>
		</div>
		<div class="textInput insert1">
			<input type="text" class="chartInput" id="insert1" value="${memberSize.insert1}" readonly>
			<label for="insert1">Insert 1</label>
		</div>
		<div class="textInput insert2">
			<input type="text" class="chartInput" id="insert2" value="${memberSize.insert2}" readonly>
			<label for="insert2">Insert 2</label>
		</div>
		<div class="textInput middleFingerForward">
			<input type="text" class="chartInput" id="middleFingerForward" value="${memberSize.middleFingerForward}" readonly>
			<label for="middleFingerForward">Middle finger forward</label>
		</div>
		<div class="textInput ringFingerForward">
			<input type="text" class="chartInput" id="ringFingerForward" value="${memberSize.ringFingerForward}" readonly>
			<label for="ringFingerForward">Ring finger forward</label>
		</div>
		<div class="textInput span1">
			<input type="text" class="chartInput" id="span1" value="${memberSize.span1}" readonly>
			<label for="span1">Span1</label>
		</div>
		<div class="textInput span2">
			<input type="text" class="chartInput" id="span2" value="${memberSize.span2}" readonly>
			<label for="span2">Span2</label>
		</div>
		<div class="textInput thumbForward">
			<input type="text" class="chartInput" id="thumbForward" value="${memberSize.thumbForward}" readonly>
			<label for="thumbForward">Thumb forward</label>
		</div>
		<div class="textInput tumbLeft">
			<input type="text" class="chartInput" id="tumbLeft" value="${memberSize.tumbLeft}" readonly>
			<label for="tumbLeft">Thumb left</label>
		</div>
		<div class="textInput thumb">
			<input type="text" class="chartInput" id="thumb" value="${memberSize.thumb}" readonly>
			<label for="thumb">Thumb</label>
		</div>
		<div class="textInput thumbRight">
			<input type="text" class="chartInput" id="thumbRight" value="${memberSize.thumbRight}" readonly>
			<label for="thumbRight">Thumb right</label>
		</div>
		<div class="textInput thumbReverse">
			<input type="text" class="chartInput" id="thumbReverse" value="${memberSize.thumbReverse}" readonly>
			<label for="thumbReverse">Thumb reverse</label>
		</div>
		<div class="textInput no1">
			<input type="text" class="chartInput" id="no1" value="${memberSize.no1}" readonly>
			<label for="no1">No.1</label>
		</div>
		<div class="textInput no2">
			<input type="text" class="chartInput" id="no2" value="${memberSize.no2}" readonly>
			<label for="no2">No.2</label>
		</div>
		<div class="textInput no3">
			<input type="text" class="chartInput" id="no3" value="${memberSize.no3}" readonly>
			<label for="no3">No.3</label>
		</div>
	</div>
	<script type="text/javascript" src='<c:url value="/resources/script/form.js" />'></script>
</body>
</html>