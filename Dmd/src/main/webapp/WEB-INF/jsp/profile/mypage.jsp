<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="/css/mypage.css" />
</head>
<body>
	<div class="wrap">
		<div class="orangeContainer">
			<div>
				<div class="box" style="background: #BDBDBD;">
					<img class="profile"
						src="https://i.ibb.co/Wv22GXY/2023-05-16-12-35-39.png">
				</div>
				<div class="name">${profile.name}</div>
			</div>
			<div class="modify">i</div>
		</div>
		<div class="summaryContainer">
			<div class="item">
				<div class="number">354</div>
				<div>단골상점</div>
			</div>
			<div class="item">
				<div class="number">354</div>
				<div>상품후기</div>
			</div>
			<div class="item">
				<div class="number">354</div>
				<div>적립금(BLCT)</div>
			</div>
		</div>
		<div class="shippingStatusContainer">
			<div class="title">주문/배송조회</div>
			<div class="status">

				<div class="item">
					<div>
						<div class="orange number">6</div>
						<div class="text">장바구니</div>
					</div>
					<div class="icon">></div>
				</div>
				<div class="item">
					<div>
						<div class="number">0</div>
						<div class="text">결제완료</div>
					</div>
					<div class="icon">></div>
				</div>
				<div class="item">
					<div>
						<div class="orange number">1</div>
						<div class="text">배송중</div>
					</div>
					<div class="icon">></div>
				</div>
				<div class="item">
					<div>
						<div class="orange number">3</div>
						<div class="text">구매확정</div>
					</div>
				</div>

			</div>

		</div>
		<div class="listContainer">
			<a class="item" href='<c:url value="/profile/mypage/orderList"> 
			<c:param name="id" value="${profile.id}" /></c:url>'>
				<div class="text">주문 목록</div>
				<div class="right">>
				</div>
			</a> <a class="item" href='<c:url value="/profile/mypage/secondHandList"> 
			<c:param name="id" value="${profile.id}" /></c:url>'>
				<div class="text">중고거래 목록 조회</div>
				<div class="right">>
				</div>
			</a> 
			<a class="item" href='<c:url value="/profile/mypage/groupPurchaseList"> 
			<c:param name="id" value="${profile.id}" /></c:url>'>
				<div class="text">공동구매 목록 조회</div>
				<div class="right">>
				</div>
			</a> 
			<a href="#" class="item">
				<div class="text">단골상점</div>
				<div class="right">></div>
			</a> <a href="#" class="item">
				<div class="text">찜한상품</div>
				<div class="right">></div>
			</a>
		</div>
		<div class="listContainer">
			<a href="#" class="item">
				<div class="text">
					<span>내지갑</span> <span class="smallLight"> <span>|</span> <span>보유
							적립금</span>
					</span>
				</div>
				<div class="right">
					<span class="blct">175 BLCT</span> >
				</div>
			</a> <a href="#" class="item">
				<div class="text">알림</div>
				<div class="right">></div>
			</a> <a href="#" class="item">
				<div class="text">설정</div>
				<div class="right">></div>
			</a>
		</div>
		<div class="infoContainer">
			<a href="#" class="item"> <img class="info"
				src="https://i.ibb.co/KzGpv0k/notice.png"> <%-- 						src="${pageContext.request.contextPath}/images/notice.png"--%>
				<div>공지사항</div>
			</a> <a href="#" class="item"> <img class="info"
				src="https://i.ibb.co/9vn2X9T/info.png"> <%-- 				src="${pageContext.request.contextPath}/images/info.png"--%>
				<div>이용안내</div>
			</a> <a href="#" class="item"> <img class="info"
				src="https://i.ibb.co/cF9sVQs/call.png"> <%-- 				src="${pageContext.request.contextPath}/images/call.png"--%>
				<div>고객센터</div></a>
		</div>
	</div>
</body>
</html>