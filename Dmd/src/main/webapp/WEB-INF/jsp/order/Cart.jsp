<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<style>
img {
	height: 150px;
	width: 150px;
}
</style>
<link rel="stylesheet" href="/css/Cart.css" />
</head>
<body>
	<section class="cart">
		<div class="cart__information">
			<ul>
				<li>장바구니 상품은 최대 30일간 저장됩니다.</li>
				<li>가격, 옵션 등 정보가 변경된 경우 주문이 불가할 수 있습니다.</li>
				<li>오늘출발 상품은 판매자 설정 시점에 따라 오늘출발 여부가 변경될 수 있으니 주문 시 꼭 다시 확인해 주시기
					바랍니다.${product.name}</li>
			</ul>
		</div>
		<p>${profile.name}님의장바구니</p>
		<table class="cart__list">
			<form action='<c:url value="/shop/updateCartQuantities"/>'
				method="post">
				<thead>
					<tr>
						<td><input type="checkbox"></td>
						<td colspan="2">상품정보</td>
						<td>옵션</td>
						<td>상품금액</td>
						<td>배송비</td>
					</tr>
				</thead>
				<tbody>

					<%-- <c:forEach var="cartItem" items="${cart.cartItemList.pageList}"> --%>
					<tr class="cart__list__detail">
						<td style="width: 2%;"><input type="checkbox"></td>
						<td style="width: 13%;"><img src="${product.prodIMGUrl}"
							alt="magic mouse"></td>
						<td style="width: 27%;"><br> <br> <span
							class="cart__list__smartstore"></span>
							<p>${product.name}</p> <span class=" price">${product.price}원</span>
						</td>
						<td style="width: 27%; text-align: center;">
							<p>

								<button type="button" id="qty-minus" class="qty-btn"
									onClick="qtyMinus()">-</button>
								&nbsp;
							<form id="qtyForm">
								<input type="number" id="qtyValue" class="input-text qty text"
									step="1" min="1" max="" name="prodQty" value="1" size="4"
									readonly="readonly" pattern="[0-9]*" /> <input type="hidden"
									name="prodId" value="${product.id}" />
							</form> &nbsp;
							<button type="button" id="qty-plus" class="qty-btn"
								onClick="qtyPlus()">+</button>


						</td>
						<!-- <td style="width: 15%;"><span class="price"></span><br></td> -->
						<td>
						<form id="totalForm">
							<input type="text" value="${product.price}" readonly="readonly" id="totalValue"/>
							<input type="hidden" value="${product.price}" id="price"/>
						</form>
						</td>
						<%-- <td style="width: 15%;"><span class="price">${product.price}원</span><br> --%>
						<td style="width: 15%;">무료</td>
					</tr>

					<script>
					
															function qtyMinus() {
																
																var qty = document
																		.getElementById("qtyValue").value;
																var price = document
																.getElementById("price").value;
																var minusQty = Number(qty) - 1;
																if (minusQty <= 0) {
																	document
																			.getElementById("qtyValue").value = qty;
																} else {
																	document
																			.getElementById("qtyValue").value = minusQty;
																	document
																	.getElementById("totalValue").value = minusQty * price;
																	
													
																}
															}
															function qtyPlus() {
																var qty = document
																		.getElementById("qtyValue").value;
																var price = document
																.getElementById("price").value;	
																var plusQty = Number(qty) + 1;
																//alert(plusQty);
																document
																		.getElementById("qtyValue").value = plusQty;
																document
																.getElementById("totalValue").value = plusQty * price;
															};
														</script>
					<!-- </c:forEach> -->

				</tbody>
		</table>
		<div class="cart__mainbtns">
			<button class="cart__bigorderbtn left"
				onclick="location.href='/shop/shopMain'">쇼핑 계속하기</button>
			<button class="cart__bigorderbtn right">주문하기</button>
		</div>
	</section>
</body>
</html>