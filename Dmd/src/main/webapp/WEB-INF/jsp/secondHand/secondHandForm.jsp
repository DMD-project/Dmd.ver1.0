<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add SecondHand</title>
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
	overflow: scroll;
}
#left {
	background-color: rgb(246, 240, 231);
	width: 55%;
	float: left;
}
#right{
	background-color: rgb(251, 248, 243);
	width: 45%;
	float: left;
}
.formStyle {
	background-color: rgb(246, 240, 231);
	border: none;
}
.button1 {
	background-color: rgb(251, 248, 243);
	border: 1px solid rgb(213, 158, 115); 
	border-radius: 10px;
	padding: 10px 30px;
	color: rgb(213, 158, 115);
	font-size: 15px;
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

	<form:form modelAttribute="secondHandForm" method="post">
		<input type="hidden" name="forwardAction"
	        		value='<c:url value="${shForwardAction}"/>' />
	<div id = "left" align = "center">
		<table>
			<th style='border:none; font-size:20px'>중고거래 상품 등록하기</th>
			<tr>
				<td>
					상품명
					<form:input path="secondHand.name" size="50" class="formStyle" />
				</td>
			</tr>
			<tr>
				<td>
					상품 가격
					<form:input path="secondHand.price" size="15" class="formStyle" /> 원
				</td>
			</tr>
			<tr>
				<td>
					상품 설명
					<form:textarea path="secondHand.content" rows="30" cols="50" class="formStyle" style='width: 100%'/>
				</td>
			</tr>
		</table>
	</div>
	
	<div id = "right" align = "center">
		<table>
			<th style = 'border: none; padding: 26px'></th>
			<tr>
				<td style = 'border: 1px solid rgb(213, 158, 115); height: 500px; vertical-align : bottom;'>
					<hr style = 'border: 1px solid rgb(213, 158, 115)'>
					<button type="button" name = "addImage" class = "button1">사진 삽입</button>
				</td>
			</tr>
		</table>
		<br>
		<button type="submit" name = "submit" class = "button2">등록하기</button>
	</div>
	</form:form>
</body>
</html>