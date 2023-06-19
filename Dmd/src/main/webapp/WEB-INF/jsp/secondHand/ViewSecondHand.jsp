<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<style>
button {
	padding: 10px 60px;
	height: 45px;
	border: none;
	border-radius: 10px;
	color: white;
	font-size: 16px;
	background: #E89F71;
}
</style>

<!-- <c:out value="${secondHand.id}" /><br> -->
판매 상품: <c:out value="${secondHand.name}" /><br>
판매 가격: <c:out value="${secondHand.price}" /><br>
<c:out value="${secondHand.content}" /><br>
<br>
판매자: <c:out value="${secondHand.sellerID}" />
<br>
구매자: <c:out value="${secondHand.buyerID}" />
<br>
<br>

현재 접속자: <c:out value="${userSession.profile.id}" /><br>

<c:choose>
	<c:when test="${(secondHand.sellerID eq userSession.profile.id) and (secondHand.sellerID != null)}">
		<!-- 판매자 -->
		<a href='<c:url value="/secondHand/update">
			<c:param name="id" value="${secondHand.id}" /></c:url>'>
			<button type="button" id="update">수정하기</button>
		</a>
		<p>
		<a href='<c:url value="/secondHand/delete">
			<c:param name="id" value="${secondHand.id}" /></c:url>'>
			<button type="button" id="delete">삭제하기</button>
		</a>
		<p>
	</c:when>
	<c:otherwise>
		<!-- 구매자 / 판매중 -->
		<c:if test="${fn:contains(secondHand.sellerFlag, 'n')}">
			<c:choose>
				<c:when test="${userSession.profile.id != null}">
					<a href='<c:url value="/secondHand/buy">
						<c:param name="id" value="${secondHand.id}" />
						<c:param name="buyerId" value="${userSession.profile.id}" />
						</c:url>'>
						<button type="button" id="update">구매 요청</button>
					</a>
				</c:when>
				<c:otherwise>
					<button type="button" id="update">판매중</button>
				</c:otherwise>
			</c:choose>
		</c:if>
		<!-- 구매자 / 판매 완료 -->
		<c:if test="${fn:contains(secondHand.sellerFlag, 'y')}">
			<button type="input" id="soldout">판매완료</button>
		</c:if>
	</c:otherwise>
</c:choose>
