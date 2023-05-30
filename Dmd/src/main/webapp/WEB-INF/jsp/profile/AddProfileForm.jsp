<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>

<style>
body {
	margin: 0;
}

table {
	border-spacing: 10px;
	width: 600px;
}

th, td {
	border: 1px solid rgb(195, 195, 195);
	border-radius: 10px;
	padding: 15px;
	color: rgb(139, 139, 139);
}

div {
	width: 100vw;
	height: 100vh;
}

input {
	background-color: rgb(246, 240, 231);
	border: none;
}

.formStyle {
	background-color: rgb(246, 240, 231);
	border: none;
}

.btn {
	background-color: rgb(213, 158, 115);
	border: none; 
	border-radius: 10px;
	padding: 10px 200px;
	color: white;
	font-size: 25px;
}

.button2 {
	background-color: rgb(213, 158, 115);
	border: none; 
	border-radius: 10px;
	padding: 10px 200px;
	color: white;
	font-size: 25px;
}
</style>
</head>
<body>
	<div align="center">
		<form:form modelAttribute="profile" method="post">
			<table>
				<th>회원가입</th>
				<tr>
					<td>이름</td>
					<td>
						<form:input path="profile.name" class="formStyle"/>
						<form:errors path="profile.name"/>
					</td>
				</tr>
				<tr>
					<td>아이디</td>
					<td>
						<form:input path="profile.id" class="formStyle" />
						<form:errors path="profile.id"/>
					</td>
				</tr>
				<tr>
					<td>비밀번호</td>
					<td>
						<form:input path="profile.pw" class="formStyle" />
						<form:errors path="profile.pw"/>
					</td>
				</tr>
				<tr>
					<td>주소</td>
					<td>
						<form:input path="profile.addr" class="formStyle" />
						<form:errors path="profile.addr"/>
					</td>
				</tr>
				<tr>
					<td>우편번호</td>
					<td>
						<form:input path="profile.zipcode" class="formStyle" />
						<form:errors path="profile.zipcode"/>
					</td>
				</tr>
				<tr>
					<td>전화번호</td>
					<td>
						<form:input path="profile.phone" class="formStyle" />
						<form:errors path="profile.phone"/>
					</td>
				</tr>
			</table>
			
			<div>
				<br>
				<input type="submit" value="회원가입" class="button2"/>
			</div>
			
		</form:form>
	</div>
</body>
</html>





