<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/semantic-ui/2.2.9/semantic.min.css" />
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/semantic-ui/2.2.9/semantic.min.js"></script>

<!-- 로컬 CSS Import -->
	<link rel="stylesheet" type="text/css" href='<c:url value="/resources/css/sizeForm.css" />'>
</head>
<body>
	<button type="button" onclick="location.href='list'" class="ui secondary button homeButton">홈으로</button>
	<form action="sizeSave" method="post">
		<input type="hidden" name="userNo" value="${sessionScope.userNo}">

		<div class="inputDiv">
			<div class="textInput memberName">
				<input type="text" id="memberName" name="memberName"> <label
					for="memberName">회원명</label>
				<spring:hasBindErrors name="repositoryDTO">
					<c:if test="${errors.hasFieldErrors('memberName') }">
						<strong>회원 이름은
							${errors.getFieldError('memberName').defaultMessage }</strong>
					</c:if>
				</spring:hasBindErrors>
			</div>
			<div class="textInput memberPhone">
				<input type="text" id="memberPhone" name="memberPhone"> <label
					for="memberPhone">연락처</label>
				<spring:hasBindErrors name="repositoryDTO">
					<c:if test="${errors.hasFieldErrors('memberPhone') }">
						<strong>연락처는
							${errors.getFieldError('memberPhone').defaultMessage }</strong>
					</c:if>
				</spring:hasBindErrors>

			</div>
			<select class="ui dropdown teamSelect formSelectTeam" name="teamNo">
				<c:forEach items="${teamList}" var="team">
					<option value="${team.teamNo}">${team.teamName}팀</option>
				</c:forEach>
			</select>
				<div class="textInput middleFingerReverse">
					<input type="text" class="chartInput" id="middleFingerReverse"
						name="middleFingerReverse" /> <label for="middleFingerReverse">Middle
						finger reverse</label>
				</div>
				<div class="textInput ringFingerReverse">
					<input type="text" class="chartInput" id="ringFingerReverse"
						name="ringFingerReverse"> <label for="ringFingerReverse">Ring
						finger reverse</label>
				</div>
				<div class="textInput middleFingerLeft">
					<input type="text" class="chartInput" id="middleFingerLeft"
						name="middleFingerLeft"> <label for="middleFingerLeft">Middle
						finger left</label>
				</div>
				<div class="textInput ringFingerRight">
					<input type="text" class="chartInput" id="ringFingerRight"
						name="ringFingerRight"> <label for="ringFingerRight">Ring
						finger right</label>
				</div>
				<div class="textInput insert1">
					<input type="text" class="chartInput" id="insert1" name="insert1">
					<label for="insert1">Insert 1</label>
				</div>
				<div class="textInput insert2">
					<input type="text" class="chartInput" id="insert2" name="insert2">
					<label for="insert2">Insert 2</label>
				</div>
				<div class="textInput middleFingerForward">
					<input type="text" class="chartInput" id="middleFingerForward"
						name="middleFingerForward"> <label
						for="middleFingerForward">Middle finger forward</label>
				</div>
				<div class="textInput ringFingerForward">
					<input type="text" class="chartInput" id="ringFingerForward"
						name="ringFingerForward"> <label for="ringFingerForward">Ring
						finger forward</label>
				</div>
				<div class="textInput span1">
					<input type="text" name="span1" class="chartInput" id="span1">
					<label for="span1">Span1</label>
				</div>
				<div class="textInput span2">
					<input type="text" name="span2" class="chartInput" id="span2">
					<label for="span2">Span2</label>
				</div>
				<div class="textInput thumbForward">
					<input type="text" class="chartInput" id="thumbForward"
						name="thumbForward"> <label for="thumbForward">Thumb
						forward</label>
				</div>
				<div class="textInput tumbLeft">
					<input type="text" class="chartInput" id="tumbLeft" name="tumbLeft">
					<label for="tumbLeft">Thumb left</label>
				</div>
				<div class="textInput thumb">
					<input type="text" class="chartInput" id="thumb" name="thumb">
					<label for="thumb">Thumb</label>
				</div>
				<div class="textInput thumbRight">
					<input type="text" class="chartInput" id="thumbRight"
						name="thumbRight"> <label for="thumbRight">Thumb
						right</label>
				</div>
				<div class="textInput thumbReverse">
					<input type="text" class="chartInput" id="thumbReverse"
						name="thumbReverse"> <label for="thumbReverse">Thumb
						reverse</label>
				</div>
				<div class="textInput no1">
					<input type="text" class="chartInput" id="no1" name="no1">
					<label for="no1">No.1</label>
				</div>
				<div class="textInput no2">
					<input type="text" class="chartInput" id="no2" name="no2">
					<label for="no2">No.2</label>
				</div>
				<div class="textInput no3">
					<input type="text" class="chartInput" id="no3" name="no3">
					<label for="no3">No.3</label>
				</div>
		</div>
		<button class="ui primary button submitButton" type="submit">입력</button>
	</form>
	<br>
	<h3>팀 생성 기능</h3>
	<hr>
	<form action="makeTeam" method="post">
		<div class="textInput wTeam" style="">
			<input type="text" id="wTeam" name="wTeam"> <label
				for="wTeam">팀 이름</label>
		</div>
		<br> <br> <br>
		<button class="ui primary button submitButton" type="submit">팀
			생성</button>
	</form>
	<br>
	<h3>팀 삭제 기능</h3>
	<hr>
	<form action="deleteTeam" method="post">
		<select class="ui dropdown teamSelect selectTeam" name="teamNo">
			<c:forEach items="${teamList}" var="team">
					<option value="${team.teamNo}">${team.teamName}팀</option>
			</c:forEach>
		</select> <br> <br>
		<button class="ui primary button submitButton"
			style="background-color: #ff1a1a;" type="submit">삭제</button>
	</form>
	<script>
		$(".textInput input").change(function() {
			if ($(this).val() != "") {
				$(this).addClass('filled');
			} else {
				$(this).removeClass('filled');
			}
		})
		$('.selectTeam').dropdown();
		$('.formSelectTeam').dropdown();
	</script>
</body>
</html>