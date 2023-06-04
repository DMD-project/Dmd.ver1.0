<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<meta charset="UTF-8">
<title>Login</title>

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

.button {
	background-color: rgb(213, 158, 115);
	border: none; 
	border-radius: 10px;
	padding: 10px 200px;
	color: white;
	font-size: 25px;
}
</style>

<div align="center">
	<form action='<c:url value="/profile/login" />' method="POST">
		<c:if test="${!empty signonForwardAction}">
     		<input type="hidden" name="forwardAction"
        		value='<c:url value="${loginForwardAction}"/>' />
    	</c:if>

		<table>
			<th>회원가입</th>
			<tr>
				<td>이름</td>
				<td>
					<form:input name="id" path="id" class="formStyle" /> 
					<form:errors path="id" />
				</td>
			</tr>
			<tr>
				<td>아이디</td>
				<td>
					<form:input type="password" path="pw" class="formStyle" /> 
					<form:errors path="pw" />
				</td>
			</tr>
	
		</table>
		<div>
			<input type="submit" value="로그인" class="button"/>
		</div>
	</form>
</div>