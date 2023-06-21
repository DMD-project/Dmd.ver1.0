<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
div {
	width:800px;
	height: 300px; /* div의 높이를 지정해주세요 */
	margin: 0 auto; /* 좌우 마진을 auto로 설정하여 가운데 정렬 */
}

.check-image {
	width: 70px;
	height: 70px;
	display: block;
    margin: 0 auto;
}

.order-link {
	color: orange;
	text-decoration: none;
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
	<div>
	<div>
		<!--  	<img class="check-image" src="images/or-check.png" alt="체크 표시">
 -->
		
		<table>
			<tr>
				<td colspan=2>
					<img class="check-image" src="https://i.ibb.co/DYhhg9t/or-check.png"
						alt="체크 표시">
					<h2 style="text-align: center" >고객님의 주문이 완료되었습니다.</h2>
					<p>
						주문내역 및 배송에 관한 안내는 <a class="order-link"
							href="https://example.com/order">주문조회</a>를 통하여 확인 가능합니다.
					</p>
				</td>
			</tr>
			<tr>
				<td>주문번호:</td>
				<td>00000000-00000000</td>
			</tr>
			<tr>
				<td>주문일자:</td>
				<td id="orderDate">
					<script>
						
						var date = new Date();
						document.getElementById("orderDate").innerHTML = date.getFullYear() + "/" + (date.getMonth() + 1) + "/" + date.getDate() + " " 
						    												+ date.getHours() + ":" + date.getMinutes();
						   
					</script>
				
				</td>
			</tr>
			<tr>
				<td colspan="2">
					<br><br>
					<button type="button" name = "submit" id = "checkout">
						<a style='color: white; text-decoration: none;' href="/shop/shopMain">메인으로 돌아가기</a>
					</button>

				</td>
			</tr>
			
		</table>
	</div>
	
</body>
</html>