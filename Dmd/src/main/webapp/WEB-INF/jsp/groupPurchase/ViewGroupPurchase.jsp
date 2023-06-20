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

판매 상품: <c:out value="${groupPurchase.name}" /><br>
판매 가격: <c:out value="${groupPurchase.price}" /><br>
<c:out value="${groupPurchase.content}" /><br>
<br>
<br>
<c:choose>
<c:when test="${groupPurchase.salesQty <= '0'}">
	목표 달성 ! 구매 가능합니다 . <br>
	<button id="buy" onclick="location.href='<c:url value='/groupPurchase/buy'>
			<c:param name='gpId' value="${groupPurchase.id}"/>
			<c:param name='userId' value="${userSession.profile.id}"/>
			</c:url>'">구매하기</button>
</c:when>
<c:otherwise>
	<c:if test="${userSession.profile.id != null }">
		구매 성공 까지 ! <c:out value="${groupPurchase.salesQty}" /> 개<br>
		<button id="buy" onclick="location.href='<c:url value='/groupPurchase/buy'>
		<c:param name='gpId' value="${groupPurchase.id}"/>
		<c:param name='userId' value="${userSession.profile.id}"/>
		</c:url>'">구매하기</button>
	</c:if>
</c:otherwise>
</c:choose>
