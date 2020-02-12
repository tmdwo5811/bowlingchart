<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title>+ 왕궁볼링장 +</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" href='<c:url value="/resources/css/style.css" />'>
<!-- 시멘틱 UI CDN -->
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/semantic-ui/2.2.9/semantic.min.css" />
<script src="https://cdnjs.cloudflare.com/ajax/libs/semantic-ui/2.2.9/semantic.min.js"></script>
</head>

<body>
	<div class="list__wrapper">
		<h1>볼링장 지공 데이터 프로그램</h1>
		<div>
			<form action="list" method="get" class="searchDiv">
				<input type="text" class="form-control searchForm" placeholder="회원 검색..." name="userSearch">
				<button class="btn btn-search" type="submit">검색</button>
			</form>
			<!-- <a href="index">로그아웃</a> &nbsp;&nbsp;<a href="changeUserPwForm">비밀번호 변경하기</a><br>
			 -->
			<div class="flex">
				<div class="aLink">
					<a href="index">로그아웃</a> &nbsp;&nbsp;<a href="changeUserPwForm">비밀번호 변경하기</a>
				</div>
				<div class="create">
					<a href="sizeWrite">지공 사이즈 작성하기</a>
				</div>
			</div>
			 <table class="ui purple table">
				<thead>
					<tr>
						<th>
							<font style="vertical-align: inherit;">
								<font style="vertical-align: inherit;">회원이름</font>
							</font>
						</th>
						<th>
							<font style="vertical-align: inherit;">
								<font style="vertical-align: inherit;">회원연락처</font>
							</font>
						</th>
						<th>
							<font style="vertical-align: inherit;">
								<font style="vertical-align: inherit;">작성/수정일</font>
							</font>
						</th>
						<th>
							<font style="vertical-align: inherit;">
								<font style="vertical-align: inherit;">회원정보 수정</font>
							</font>
						</th>
						<th>
							<font style="vertical-align: inherit;">
								<font style="vertical-align: inherit;">회원정보 삭제</font>
							</font>
						</th>
					</tr>
				</thead>
				<tbody>
				<c:forEach items="${main }" var="dto">
					<tr>
						<td>
							<font style="vertical-align: inherit;">
								<font style="vertical-align: inherit;"><a href="sizeView?memberNo=${dto.memberNo}">${dto.memberName}</a></font>
							</font>
						</td>
						<td>
							<font style="vertical-align: inherit;">
								<font style="vertical-align: inherit;">${dto.memberPhone }</font>
							</font>
						</td>
						<td>
							<font style="vertical-align: inherit;">
								<font style="vertical-align: inherit;">${dto.reg_date }</font>
							</font>
						</td>
						<td>
							<a href="modifySizePage?memberNo=${dto.memberNo}">수정하기</a>
						</td>
						<td>
							<a href="deleteMemberSize?memberNo=${dto.memberNo}">삭제하기</a>
						</td>
					</tr>
				</c:forEach>
				</tbody>
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
								<span style="color: red; font-weight: bold;">${num }</span>&nbsp;
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
	</div>
	<!-- wrapper -->
</body>

</html>
