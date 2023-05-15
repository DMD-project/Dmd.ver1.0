<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Product</title>
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
	<div id = "left" align = "center">
		<table>
			<th style = 'border: none; font-size: 20px'>상품 등록하기</th>
			<tr>
				<td>
					상품명
					<input type = "text" name = "title" size = "50" class = "formStyle">
				</td>
			</tr>
			<tr>
				<td>
					카테고리
					<select name = "category" class = "formStyle" style = 'border: solid 1px; border-radius: 5px; width: 100px; color: rgb(139, 139, 139); text-align: center'>
						<option>--카테고리--</option>
					</select>
				</td>
			</tr>
			<tr>
				<td>
					브랜드 &nbsp;&nbsp;
					<select name = "brand" class = "formStyle" style = 'border: solid 1px; border-radius: 5px; width: 100px; color: rgb(139, 139, 139); text-align: center'>
						<option>---브랜드---</option>
					</select>
				</td>
			</tr>
			<tr>
				<td>
					상품 가격
					<input type = "text" name = "title" size = "15" class = "formStyle"> 원
				</td>
			</tr>
			<tr>
				<td>
					상품 설명
					<form>
						<textarea name = "content" rows = "20" cols = "50" class = "formStyle" style = 'width: 100%'></textarea>
					</form>
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
	
</body>
</html>