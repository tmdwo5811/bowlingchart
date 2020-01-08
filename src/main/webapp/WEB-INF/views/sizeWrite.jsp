<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<a href="index">홈으로</a>
	<form action="sizeSave" method="post">
		성함 : <input type="text" name="bName"><br>
		연락처 : <input type="text" name="bPhone"><br>
		소속팀 : 
		<select>
			<option value="계양"></option>
			<option value="임학"></option>
		</select>
		<br>
		MF 사이즈 : <input type="text" name="bMsize"><br>
		RF 사이즈 : <input type="text" name="bRsize"><br>
		<input type="submit" value="입력">
	</form>
	<hr>
	<form action="makeTeam" method="post">
		팀 이름 : <input type="text" name="wTeam">
		<input type="submit" value="팀 생성">
	</form>
</body>
</html>