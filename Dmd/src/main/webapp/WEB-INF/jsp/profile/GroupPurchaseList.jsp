<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html lang="en-US" class="footer-sticky-1">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>m²Dm - interior Shop:</title>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.0/jquery.min.js"></script>
<link rel="stylesheet"
	href="https://unpkg.com/tailwindcss@2.2.19/dist/tailwind.min.css" />
<link
	href="https://fonts.googleapis.com/css?family=Work+Sans:200,400&display=swap"
	rel="stylesheet">
<link
	href="/css/ViewProduct.css"
	rel="stylesheet">
	
<style type="text/css" class="nm-custom-styles">

@media all and (max-width:1080px) {
	.woocommerce-product-gallery__wrapper {
		max-width: 500px;
	}
	.has-bg-color .woocommerce-product-gallery {
		background: #EEEEEE;
	}
}
</style>

<style>
 .woocommerce form .form-row .required {
	visibility: visible;
}

.woocommerce-product-gallery {
	opacity: 1 !important;
}

.btn {
	padding: 10px 60px;
	height: 45px;
	border: none;
	border-radius: 10px;
	color: white;
	font-size: 16px;
	background: #E89F71;
}

.qty-btn {
	font-size: 25px;
	font-weigth: bold;
	color: #777777;
}

.maindiv {
	margin-top:15px;
	margin-bottom:300px;
}

table {
  border-top: solid 1.5px black;
  border-collapse: collapse;
  width: 85%;
  font-size: 14px;
}

.title {
	font-weight:bold;
}
td {
  padding: 15px 40px;
  margin-left: 40px;
  border-bottom: 1px solid lightgrey;
}

b {
	margin-left: 120px;
	font-size:20px;
}
 
</style>
</head>

<body>
	<%@ include file="../common/includeTop.jsp" %>
	<br><br>
	
	<b>공동구매 품목</b>
	<div class="maindiv" align="center">
		<table>
			<c:if test="${ gpList.size() == 0}">
				<tr>구매한 공동구매 품목이 없습니다.</tr>
			</c:if>
			<c:if test="${gpList.size() != 0}">
				<tr class="title">
					<td>No</td>
					<td>상품이름</td>
					<td>가격</td>
					<!-- <td>판매자 아이디</td> -->
				</tr>
				<c:forEach var="gp" items="${gpList}" varStatus="status">
					<tr>
						<td>${status.index + 1}</td>
						<td>${gp.name}</td>
						<td>${gp.price} 원</td>
						<%-- <td>${gp.sellerID}</td> --%>
					</tr>
				</c:forEach>
			</c:if>
		</table>
	</div>
	
	<%@ include file="../common/footer.jsp" %>
	
</body>
</html>