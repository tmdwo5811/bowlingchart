<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>볼링공 지공 차트 데이터 입출력 프로그램</title>
<!-- jQuery CDN Import -->
<script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
<!-- 시멘틱 UI CDN -->
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/semantic-ui/2.2.9/semantic.min.css" />
<script src="https://cdnjs.cloudflare.com/ajax/libs/semantic-ui/2.2.9/semantic.min.js"></script>

<!-- 로컬 CSS Import -->
<link rel="stylesheet" type="text/css" href='<c:url value="/resources/css/sizeForm.css" />'>
</head>
<body style="background-color:#eee;padding:30px;">
	<button type="button" onclick="location.href='list'" class="ui secondary button homeButton">홈으로</button>
	<form action="modifyMemberSizeSave" method="post">
		<input type="hidden" name="userNo" value="${sessionScope.userNo}">
		<input type="hidden" name="memberNo" value="${memberSize.memberNo}">
		<div class="inputDiv">
			<div class="textInput memberName">
				<input type="text" id="memberName" name="memberName" value="${memberSize.memberName}">
				<label for="memberName">회원명</label>
				<spring:hasBindErrors name="repositoryDTO">
					<c:if test="${errors.hasFieldErrors('memberName') }">
						<strong>회원 이름은 ${errors.getFieldError('memberName').defaultMessage }</strong>
					</c:if>
				</spring:hasBindErrors>
			</div>
			<div class="textInput memberPhone">
				<input type="text" id="memberPhone" name="memberPhone" value="${memberSize.memberPhone}">
				<label for="memberPhone">연락처</label>
				<spring:hasBindErrors name="repositoryDTO">
					<c:if test="${errors.hasFieldErrors('memberPhone') }">
						<strong>연락처는 ${errors.getFieldError('memberPhone').defaultMessage }</strong>
					</c:if>
				</spring:hasBindErrors>

			</div>
			<select class="ui dropdown teamSelect formSelectTeam" name="teamNo">
				<c:forEach items="${teamList}" var="team">
					<option value="${team.teamNo}" ${team.teamNo == memberSize.team_teamNo?'selected="selected"':''}>${team.teamName}팀</option>
				</c:forEach>
			</select>
			<div class="textInput regDate">
				<input type="text" id="regDate" value="${memberSize.reg_date }" readonly>
				<label for="teamName">작성/수정일</label>
			</div>
			<div class="textInput middleFingerReverse">
				<input type="text" class="chartInput" id="middleFingerReverse" name="middleFingerReverse" value="${memberSize.middleFingerReverse}" />
				<label for="middleFingerReverse">Middle finger reverse</label>
			</div>
			<div class="textInput ringFingerReverse">
				<input type="text" class="chartInput" id="ringFingerReverse" name="ringFingerReverse" value="${memberSize.ringFingerReverse}">
				<label for="ringFingerReverse">Ring finger reverse</label>
			</div>
			<div class="textInput middleFingerLeft">
				<input type="text" class="chartInput" id="middleFingerLeft" name="middleFingerLeft" value="${memberSize.middleFingerLeft}">
				<label for="middleFingerLeft">Middle finger left</label>
			</div>
			<div class="textInput ringFingerRight">
				<input type="text" class="chartInput" id="ringFingerRight" name="ringFingerRight" value="${memberSize.ringFingerRight}">
				<label for="ringFingerRight">Ring finger right</label>
			</div>
			<div class="textInput insert1">
				<input type="text" class="chartInput" id="insert1" name="insert1" value="${memberSize.insert1}">
				<label for="insert1">Insert 1</label>
			</div>
			<div class="textInput insert2">
				<input type="text" class="chartInput" id="insert2" name="insert2" value="${memberSize.insert2}">
				<label for="insert2">Insert 2</label>
			</div>
			<div class="textInput middleFingerForward">
				<input type="text" class="chartInput" id="middleFingerForward" name="middleFingerForward" value="${memberSize.middleFingerForward}">
				<label for="middleFingerForward">Middle finger forward</label>
			</div>
			<div class="textInput ringFingerForward">
				<input type="text" class="chartInput" id="ringFingerForward" name="ringFingerForward" value="${memberSize.ringFingerForward}">
				<label for="ringFingerForward">Ring finger forward</label>
			</div>
			<div class="textInput span1">
				<input type="text" name="span1" class="chartInput" id="span1" value="${memberSize.span1}">
				<label for="span1">Span1</label>
			</div>
			<div class="textInput span2">
				<input type="text" name="span2" class="chartInput" id="span2" value="${memberSize.span2}">
				<label for="span2">Span2</label>
			</div>
			<div class="textInput thumbForward">
				<input type="text" class="chartInput" id="thumbForward" name="thumbForward" value="${memberSize.thumbForward}">
				<label for="thumbForward">Thumb forward</label>
			</div>
			<div class="textInput tumbLeft">
				<input type="text" class="chartInput" id="tumbLeft" name="tumbLeft" value="${memberSize.tumbLeft}">
				<label for="tumbLeft">Thumb left</label>
			</div>
			<div class="textInput thumb">
				<input type="text" class="chartInput" id="thumb" name="thumb" value="${memberSize.thumb}">
				<label for="thumb">Thumb</label>
			</div>
			<div class="textInput thumbRight">
				<input type="text" class="chartInput" id="thumbRight" name="thumbRight" value="${memberSize.thumbRight}">
				<label for="thumbRight">Thumb right</label>
			</div>
			<div class="textInput thumbReverse">
				<input type="text" class="chartInput" id="thumbReverse" name="thumbReverse" value="${memberSize.thumbReverse}">
				<label for="thumbReverse">Thumb reverse</label>
			</div>
			<div class="textInput no1">
				<input type="text" class="chartInput" id="no1" name="no1" value="${memberSize.no1}">
				<label for="no1">No.1</label>
			</div>
			<div class="textInput no2">
				<input type="text" class="chartInput" id="no2" name="no2" value="${memberSize.no2}">
				<label for="no2">No.2</label>
			</div>
			<div class="textInput no3">
				<input type="text" class="chartInput" id="no3" name="no3" value="${memberSize.no3}">
				<label for="no3">No.3</label>
			</div>
		</div>
		<button class="ui primary button submitButton" type="submit">수정하기</button>
	<br><br>
	</form>
	<script type="text/javascript" src='<c:url value="/resources/script/form.js" />'></script>
</body>
</html>