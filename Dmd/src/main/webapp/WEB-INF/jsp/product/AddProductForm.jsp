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
<title>Add Product Form</title>
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
<form:form modelAttribute="prodReq" method="post">
	<div id = "left" align = "center">
	
		<table>
			<th style = 'border: none; font-size: 20px'>상품 등록하기</th>
			<tr>
				<td>																	
					상품명															
					<form:input path="product.name" class="formStyle"/>
					<form:errors path="product.name"/>
				</td>
			</tr>
			<tr>
				<td>
					카테고리
					<form:select path="product.cateID" class = "formStyle" style = 'border: solid 1px; border-radius: 5px; width: 100px; color: rgb(139, 139, 139); text-align: center'>
					<form:options items="${cateCodes}" itemLabel="name" itemValue="cateCode"/>
					</form:select>
					<form:errors path="product.cateID"/>
				</td>
			</tr>
			<tr>
				<td>
					브랜드 &nbsp;&nbsp;
					<form:select path="product.brandID" class = "formStyle" style = 'border: solid 1px; border-radius: 5px; width: 100px; color: rgb(139, 139, 139); text-align: center'>
					<form:options items="${brandCodes}" itemLabel="name" itemValue="brandCode"/>
					</form:select>
					<form:errors path="product.brandID"/>
				</td>
			</tr>
			<tr>
				<td>
					상품 가격
					<form:input path="product.price" class="formStyle"/>
					<form:errors path="product.price"/>
					
				</td>
			</tr>
			<tr>
				<td>
					상품 설명
					<form:input path="product.content" class="formStyle" style = 'width: 100%'/>
					<form:errors path="product.content"/>
					<%-- <form>
						<textarea name = "content" rows = "20" cols = "50" class = "formStyle" style = 'width: 100%'></textarea>
					</form> --%>
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
		<input type="submit" value="등록하기"class="button2"/>
		
	</div>
	</form:form>
</body>
</html>