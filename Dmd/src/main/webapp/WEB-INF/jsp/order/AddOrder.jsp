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
<title>Add Order</title>

<style>
body {
	margin: 0;
}

div {
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

#table2 td, th {
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

#payment_card {
	background-color: rgb(246, 240, 231);
	border: 2px solid #FFD27F;
	border-radius: 10px;
	padding: 10px 150px;
	margin: 10px;
	color: #FFD27F;
	font-size: 20px;
}

#payment_card:focus {
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

.creditcard {
	background-color: orange;
	border-radius: 8px;
	width: 300px;
	height: 180px;
	margin: 20px;
	padding: 20px;
	color: white;
	text-align: left;
}

#card_info {
	float: left;
	padding: 5px;
	font-size: 13px;
}

input {
	border: 1px solid lightgrey;
	width: 50px;
	height: 30px;
	text-align: center;
} 

select {
	border: 1px solid lightgrey;
	background-color: white;
	color: grey;
	height: 30px;
}
#months, #years {
	width: 50px;
}

#banks {
	width: 80px;
}


</style>
</head>
<body>

<div id="left" align="center">
		<form:form modelAttribute="orderForm" method="post">
		 <br><br>
		  
		  <table class="n13">
		  
		  	<th colspan = "2" style = 'border: none; font-size: 20px'>결제 정보</th>
		    
		    <tr>
		      <td>Card Type:</td>
		      <td><form:select path="order.cardType" items="${creditCardTypes}" />
		        <form:errors path="order.cardType" /></td>
		    </tr>
		    <tr>
		      <td>Card Number:</td>
		      <td><form:input path="order.creditCard" /> 
		        <font color="red" size="2">* Use a fake number!</font>
		        <form:errors path="order.creditCard" /></td>
		    </tr>
		    <tr>
		      <td>Expiry Date (MM/YYYY):</td>
		      <td><form:input path="order.expiryDate" /> 
		        <form:errors path="order.expiryDate" /></td>
		    </tr>
		    <th colspan = "2" style = 'border: none; font-size: 20px'>배송 정보</th>
		    
		    <tr>
		      <td>Name:</td>
		      <td><form:input path="order.username" /> 
		        <form:errors path="order.username" /></td>
		    </tr>
		    <tr>
		      <td>Address:</td>
		      <td><form:input path="order.addr" />
		        <form:errors path="order.addr" /></td>
		    </tr>
		    <tr>
		      <td>Zipcode:</td>
		      <td><form:input path="order.zipcode" /> 
		        <form:errors path="order.zipcode" /></td>
		    </tr>
		   
		  </table>
		 
		</form:form>
	</div>
	
	<div id = "right" align = "center">
		<table id= "table3">
			<th></th>
		</table>
		
		<table id="table4">
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
					<b>${product.name}
					<br><br><br>
				</td>
			</tr>
			<tr>
				<td>결제할 상품</td>
					<td align = "right">총 1개</td>
				</tr>
			<tr>
				<td>상품 금액</td>
				<td align = "right">${product.price} 원</td>
			</tr>
			<tr>
				<td>할인 금액</td>
				<td align = "right">0 원</td>
			</tr>
			<tr style ='height: 150px; font-size: 20px'>
				<td><b>결제 금액</td>
				<td align = "right"><b>${product.price} 원</td>
			</tr>
			<tr>
				<td></td>
			</tr>
			<tr>
				<td colspan = "2" align = "center">		
					<button type="submit" name = "submit" id = "checkout">
						<a style='color: white; text-decoration: none;' href="/order/orderComplete">결제하기</a>
					</button>

				</td>
			</tr>

		</table>
		<br>
	</div>
	
</body>
</html>
