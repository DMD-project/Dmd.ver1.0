<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>m²Dm - interior Shop:</title>
<style>
#btn_group button {
	border: 1px solid #F28C28;
	background-color: rgba(0, 0, 0, 0);
	color: #F28C28;
	padding: 20px;
}

#btn_group button:hover {
	color: white;
	background-color: #FFDEAD;
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

</style>
<body>
	<p>
	<div align="center">
		로그인에 실패하였습니다.<p>
		<a href="<c:url value='/profile/relogin' />">
			<button type="button" id="relogin" class="btn">다시 로그인하기</button>
		</a>
	
	</div>
</body>
</html>