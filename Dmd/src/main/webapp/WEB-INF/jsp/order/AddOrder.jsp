<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Order</title>
<style>
body {
	margin: 0;
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

table {
	border-spacing: 10px;
	width: 500px;
}

#table1 td, th{
	border-radius: 10px;
	padding: 13px;
	color: grey;
}

#table2 td, th{
	border-radius: 10px;
	padding: 13px;
	color: grey;
}

#table3 th {
	border: none; 
	padding: 26px;
}

#table4 {
	border: 1px solid #FFD27F;
	border-radius: 10px;
	padding: 15px;
	color: grey;
}

#info {
	border: 1px solid grey;
	border-radius: 10px;
	padding: 15px;
	color: grey;
}

#payment {
	border: 1px solid grey;
	border-radius: 10px;
	padding: 15px;
	color: grey;
}

#creditcard {
	background-color: rgb(246, 240, 231);
	border: 2px solid #FFD27F;
	border-radius: 10px;
	padding: 10px 150px;
	margin: 10px;
	color: #FFD27F;
	font-size: 20px;
}

#creditcard:focus {
	background-color: #FFD27F;
	border: 2px solid #FFD27F; 
	border-radius: 10px;
	padding: 10px 150px;
	margin: 10px;
	color: white;
	font-size: 20px;
}

#other_method {
	background-color: rgb(246, 240, 231);
	border: 2px solid #FFD27F;
	border-radius: 10px;
	padding: 10px 65px;
	margin: 10px;
	color: #FFD27F;
	font-size: 20px;
}

#other_method:focus {
	background-color: #FFD27F;
	border: 2px solid #FFD27F;
	border-radius: 10px;
	padding: 10px 65px;
	margin: 10px;
	color: white;
	font-size: 20px;
}

#checkout {
	background-color: #FFD27F;
	border: none; 
	border-radius: 10px;
	padding: 10px 150px;
	color: white;
	font-size: 20px;
}

</style>
</head>
<body>
	<div id = "left" align = "center">
		<table id = "table1">
			<th colspan = "2" style = 'border: none; font-size: 20px'>결제 정보</th>
			<tr>
				<td id = "info" colspan = "2">
					<b>주문자 정보
				</td>
			</tr>
			<tr>
				<td style = 'width: 20%'>
					name 
				</td>
				<td>
					김동덕
				</td>
			</tr>
			<tr>
				<td>
					phone 
				</td>
				<td>
					010-0000-1234
				</td>
			</tr>
			<tr>
				<td>
					Address
				</td>
				<td>
					서울특별시 성북구 화랑로13길 60 (00000)
				</td>
			</tr>
		</table>
		
		<table id = "table2">
			<tr>
				<td id = "payment">
					<b>결제 방법
				</td>
			</tr>
			<tr>
				<td align = "center">
					<button type="button" name = "creditcard" id = "creditcard">신용∙체크카드</button>
					<button type="button" name = "accounttransfer" id = "other_method" style = 'font-size: 15px'>계좌이체</button>
					<button type="button" name = "deposit" id = "other_method" style = 'font-size: 15px;'>무통장 입금</button>
				</td>
			</tr>
		</table>
	</div>
	
	<div id = "right" align = "center">
		<table id= "table3">
			<th></th>
		</table>
		
		<table id = "table4">
			<tr>
				<td colspan = "2" align = "center">
					<b>상품 정보
				</td>
			</tr>
			<tr>
				<td colspan = "2" align = "center">
					<img src="https://images.unsplash.com/photo-1422190441165-ec2956dc9ecc?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1600&q=80" alt="magic mouse" style = 'width: 300px'>
                </td>
				</tr>
			<tr>
				<td colspan = "2" align = "center">
					<b>[애플] Magic Mouse [MK2E3KH/A]
					<br><br><br>
				</td>
			</tr>
			<tr>
				<td>결제할 상품</td>
					<td align = "right">총 1개</td>
				</tr>
			<tr>
				<td>상품 금액</td>
				<td align = "right">88,900 원</td>
			</tr>
			<tr>
				<td>할인 금액</td>
				<td align = "right">0 원</td>
			</tr>
			<tr style ='height: 150px; font-size: 20px'>
				<td><b>결제 금액</td>
				<td align = "right"><b>88,900 원</td>
			</tr>
			<tr>
				<td></td>
			</tr>
			<tr>
				<td colspan = "2" align = "center">		
					<button type="button" name = "addImage" id = "checkout">결제하기</button>
				</td>
			</tr>

		</table>
		<br>
	</div>
	
</body>
</html>
