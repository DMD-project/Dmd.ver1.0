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
					<c:forEach var="cartItem" items="${cart.cartItemList.pageList}">
						<tr class="cart__list__detail">
							<td style="width: 2%;"><input type="checkbox"></td>
							<td style="width: 13%;"><img
								src="https://images.unsplash.com/photo-1551431009-a802eeec77b1?ixlib=rb-1.2.1&auto=format&fit=crop&w=400&h=400&q=80"
								alt="magic mouse"></td>
							<td style="width: 27%;"></a>
								<p>육각 주사위</p> <span class=" price">4,000원 </span></td>
							<td class="cart__list__option" style="width: 27%;">
								<p>상품 주문 수량: 2개</p>
							</td>
							<td style="width: 15%;"><span class="price">8,000</span><br>
								<button class="cart__list__orderbtn">주문하기</button></td>
							<td style="width: 15%;">무료</td>
						</tr>
					</c:forEach>
				

					<c:forEach var="cartItem" items="${cart.cartItemList.pageList}">
						<tr class="cart__list__detail">
							<td style="width: 2%;"><input type="checkbox"></td>
							<td style="width: 13%;"><img
								src="https://images.unsplash.com/photo-1449247709967-d4461a6a6103?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=400&h=400&q=80"
								alt="magic mouse"></td>
							<td style="width: 27%;"></a>
								<p>탁상</p> <span class=" price">104,000원 </span></td>
							<td class="cart__list__option" style="width: 27%;">
								<p>상품 주문 수량: 1개</p>
							</td>
							<td style="width: 15%;"><span class="price">104,000</span><br>
								<button class="cart__list__orderbtn">주문하기</button></td>
							<td style="width: 15%;">무료</td>
						</tr>
					</c:forEach>


					<c:forEach var="cartItem" items="${cart.cartItemList.pageList}">
						<tr class="cart__list__detail">
							<td style="width: 2%;"><input type="checkbox"></td>
							<td style="width: 13%;"><img
								src="https://images.unsplash.com/photo-1422190441165-ec2956dc9ecc?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1600&q=80"
								alt="magic mouse"></td>
							<td style="width: 27%;"></a>
								<p>[이케아]포근한 이불 </p> <span class=" price">44,000원 </span></td>
							<td class="cart__list__option" style="width: 27%;">
								<p>상품 주문 수량: 3개</p>
							</td>
							<td style="width: 15%;"><span class="price">132,000원</span><br>
								<button class="cart__list__orderbtn">주문하기</button></td>
							<td style="width: 15%;">2500</td>
						</tr>
					</c:forEach>

					<tr>
						<td colspan="3">
						<td>금액 244,000</td>
						<td>배송비 2500</td>
						<td></td>
					</tr>

				</tbody>
				<tfoot>
					<tr>
						<td colspan="3"><input type="checkbox">
							<button class="cart__list__optionbtn">선택상품 삭제</button>
							<button class="cart__list__optionbtn">선택상품 찜</button></td>
						<td></td>
						<td></td>
						<td></td>
					</tr>
				</tfoot>
			</form>
		</table>
		<div class="cart__mainbtns">
			<button class="cart__bigorderbtn left">쇼핑 계속하기</button>
			<button class="cart__bigorderbtn right">주문하기</button>
		</div>
	</section>
</body>
</html>